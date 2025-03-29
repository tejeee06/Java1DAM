package AEA3.PR.PR5;

import javax.print.DocFlavor.STRING;

import AEA3.recursos.lectorDades;

public class HumanPlayer extends Player {
    private static final String ABC = "abcdefghijklmnopqrstuvwxyz";
    private final int guessLength;
    private final lectorDades lector;

    public HumanPlayer(int guessLength) {
        this.guessLength = guessLength;
        this.lector = new lectorDades();
    }

    @Override
    public String makeGuees() {
        String guess;

        do {
            
        } while (condition);
    }

    public boolean isValidGuess(String guess) {
        if (guess.length() != guessLength) {
            System.out.println("Aquesta resposta no es valida");
            return false;
        }

        for (int i = 0; i < guess.length(); i++) {
            char c = guess.charAt(i);
            if (ABC.indexOf(c) == -1) {
                System.out.println("Aquesta resposta no es valida");
                return false;
            }
        }

        return true;
    }
}
