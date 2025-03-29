package AEA3.PR.PR5;

public class Feedback {
    public static final char TOT_CORRECTE = 'O';
    public static final char MALA_POSICIO = 'X';
    public static final char INCORRECTE = '-';

    public String getFeedback(String secret, String guess) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < secret.length(); i++) {
            char secretChar = secret.charAt(i);
            char guessChar = guess.charAt(i);

            if (secretChar == guessChar) {
                res.append(TOT_CORRECTE);
            }
            else if (secret.indexOf(guess) != -1) {
                res.append(MALA_POSICIO);
            }
            else {
                res.append(INCORRECTE);
            }
            
        }

        return res.toString();
    }
}
