package AEA3.PR.PR5;

import java.util.Scanner;

public abstract class HumanPlayer extends  Player {
    protected static final String ABC = "abcdefghijklmnopqrstuvwxyz";
    protected final int guessLength;
    protected final Scanner scanner;

    public HumanPlayer(int guessLength) {
        this.guessLength = guessLength;
        this.scanner = new Scanner(System.in);
    }

    @Override
    public abstract String makeGuess();

    // Nuevo método para obtener la longitud sin pedir entrada
    public int getGuessLength() {
        return guessLength;
    }

    protected boolean isValidGuess(String guess) {
        if (guess.length() != guessLength) {
            System.out.println("Aquesta resposta no és vàlida");
            return false; // Añadimos el return faltante
        }

        for (int i = 0; i < guess.length(); i++) {
            char c = guess.charAt(i);
            if (ABC.indexOf(c) == -1) {
                System.out.println("Aquesta resposta no és vàlida");
                return false;
            }
        }
        return true;
    }
}
