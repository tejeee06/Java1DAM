package AEA3.PR.PR5;

import javax.print.DocFlavor.STRING;

public class MasterMind {
    private final int codeLength = 3;
    private final CodeGenerator codeGenerator;
    private final Player player;
    private final Feedback feedback;

    public MasterMind() {
        this.codeGenerator = new codeGenerator(codeLength);
        this.player = new HumanPlayer(codeLength);
        this.feedback = new Feedback();
    }

    public static void main(String[] args) {
        String secret = codeGenerator.generateCode();
        boolean guessed = false;

        while (!guessed) {
            String guess = player.makeGuees();
            String feedbackString = feedback.getFeedback(secret, guess);

            System.out.println("La resposta es : " +feedbackString);
            if (guess.equals(secret)) {
                System.out.println("Has encertat ! ");
                guessed = true;
            }
            else {
                System.out.println("Continua intentant - ho");
            }
        }
    }
}
