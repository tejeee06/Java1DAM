package AEA3.PR.PR5;

import java.util.Scanner;

public class HumanPlayer extends  Player {
    private static final String ABC = "abcdefghijklmnopqrstuvwxyz";
    private final int guessLength;
    private final Scanner scanner;

    public HumanPlayer(int guessLength) {
        this.guessLength = guessLength;
        this.scanner = new Scanner(System.in);
    }

    @Override
    public String makeGuess() {
        String guess;

        do {
            System.out.println("Escriu " +guessLength +" lletres minuscules : ");
            guess = scanner.next();
        } while (!isValidGuess(guess));

        return guess;
    }

    private boolean isValidGuess(String guess) {
        if (guess.length() != guessLength) {
            System.out.println("Aquesta resposta no es valida");
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
