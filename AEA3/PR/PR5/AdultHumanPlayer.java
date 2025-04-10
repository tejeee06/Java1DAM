package AEA3.PR.PR5;

import java.util.Random;

public class AdultHumanPlayer extends HumanPlayer{
    private final int guessLength;

    public AdultHumanPlayer() {
        super(new Random().nextInt(2) + 5); 
        this.guessLength = super.guessLength; 
    }

    @Override
    public String makeGuess() {
        String guess;
        do {
            System.out.println("Escriu " + guessLength + " lletres minúscules: ");
            guess = scanner.next();
        } while (!isValidGuess(guess));
        return guess;
    }
}
