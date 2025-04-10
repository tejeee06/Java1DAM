package AEA3.PR.PR5;

public class ChildHumanPlayer extends HumanPlayer {
    public ChildHumanPlayer() {
        super(3);
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
