package AEA3.PR.PR5;

public class MasterMind {
   private static final int CODE_LENGTH = 3;

   public static void main(String[] args) {
       CodeGenerator generador = new CodeGenerator(CODE_LENGTH);
       Player jugador = new HumanPlayer(CODE_LENGTH);
       Feedback feedback = new Feedback();
       String secret = generador.generateCode();
       boolean encertat = false;

       while (!encertat) {
           String intent = jugador.makeGuess();
           String pista = feedback.getFeedback(secret, intent);

           System.out.println("La resposta es " +pista);
           if (intent.equals(secret)) {
               System.out.println("Has encertat !!.");
               encertat = true;
           }
           else {
               System.out.println("Continua intentant-ho.");
           }
       }
   }
}
