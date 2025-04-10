package AEA3.PR.PR5;

import java.util.*;

public class RobotPlayer extends Player {
    private static final String ABC = "abcdefghijklmnopqrstuvwxyz";
    private final int codeLength;
    private List<String> posibilitats;
    private final Feedback feedback;
    private boolean primerIntent;
    private final String alfabet;

    public RobotPlayer(int codeLength, boolean isChildMode) {
        this.codeLength = codeLength;
        this.feedback = new Feedback();
        this.posibilitats = generarAllPosibilitats(codeLength, ABC);
        this.primerIntent = true;
        this.alfabet = isChildMode ? "abcde" : "abcdefghijklmnopqrstuvwxyz";
    }

    // Metode per generar les possibilitats
    private List<String> generarAllPosibilitats(int length, String alfabet) {
        List<String> possibilitats = new ArrayList<>();

        if (length == 3) { // Per paraules del child utilitzare bucles anidads
            for (char c1 : alfabet.toCharArray()) {
                for (char c2 : alfabet.toCharArray()) {
                    for (char c3 : alfabet.toCharArray()) {
                        possibilitats.add("" +c1 +c2 +c3);
                    }
                }
            }
        } else { // Per les paraules del adult utilitzare recursivitat
            generarAjuda("", length, alfabet, possibilitats);
        }

        return possibilitats;
    }

    // Metode recursiu per les longituds de 5 o 6 paraules
    private void generarAjuda(String actual, int length, String alfabet, List<String> possibilitats) {
        if (actual.length() == length) {
            possibilitats.add(actual);
            return;
        }

        for (char c: alfabet.toCharArray()) {
            generarAjuda(actual + c, length, alfabet, possibilitats);
        }
    }

    // Metode per actualitzar l'intent bassat en el Feedback
    public void updatePossibilities(String guess, String feedbackReal) {
        List<String> newPossibilities = new ArrayList<>();

        for (String possible : posibilitats) {
            String simulatedFeedback = feedback.getFeedback(possible, guess);
            if (simulatedFeedback.equals(feedbackReal)) {
                newPossibilities.add(possible);
            }

        }
        posibilitats = newPossibilities;
        primerIntent = false;
    }

    // Generem un conjunt reduit dels possibles millors candidats (Millor Optimitzacio)
    private List<String> generarCandidats() {
        List<String> candidats = new ArrayList<>();
        int numCandidats = Math.min(100, (int) Math.pow(alfabet.length(), codeLength));
        
        for (int i = 0; i < numCandidats; i++) {
            StringBuilder codi = new StringBuilder();
            int temp = i;
            for (int j = 0; j < codeLength; j++) {
                int index = temp % alfabet.length(); 
                codi.append(alfabet.charAt(index));
                temp /= alfabet.length();
            }
            candidats.add(codi.toString());
        }
        
        // Añadimos algunos códigos de las posibilidades actuales
        candidats.addAll(posibilitats.subList(0, Math.min(10, posibilitats.size())));
        return candidats;
    }

    @Override
    public String makeGuess() {
        if (posibilitats.isEmpty()) {
            throw new IllegalStateException("S han acabat les possibilitats");
        }

        // Punt de partida amb les primeres lletres de l'alfabet
        if (primerIntent) {
            StringBuilder initialGuess = new StringBuilder();

            for ( int i = 0; i < codeLength; i++) {
                initialGuess.append(alfabet.charAt(i % alfabet.length()));
            }

            return initialGuess.toString();
        }

        // Estrategia MinMax : intent que realitza el maxim de possibilitats restants
        String millorIntent = null;
        int menorMaxim = Integer.MAX_VALUE;

        List<String> candidats = (posibilitats.size() < 10) ? posibilitats : generarCandidats(); // Considerem tots els codis possibles
        for (String candidat : candidats) {
            // Utilitzem un Mapa per saber cuantes possibilitats quedan per a cada Feedback
            Map<String, Integer> feedbackCounts = new HashMap<>();
            for (String possible : posibilitats) {
                String feedbackPossibilitats = feedback.getFeedback(possible, candidat);
                feedbackCounts.put(feedbackPossibilitats, feedbackCounts.getOrDefault(feedbackPossibilitats, 0) +1);
            }
            
            // Nem ajustant la cantitat per anar eliminant els maxims codis possibles
            int maximPossibilitats = feedbackCounts.values().stream().mapToInt(Integer:: intValue).max().orElse(0);
            if (maximPossibilitats < menorMaxim) {
                menorMaxim = maximPossibilitats;
                millorIntent = candidat;
            }
        }

        return millorIntent != null ? millorIntent : posibilitats.get(0);
    }
}
