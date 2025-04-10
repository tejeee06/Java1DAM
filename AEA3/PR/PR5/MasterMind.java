package AEA3.PR.PR5;

import AEA3.recursos.lectorDades;

public class MasterMind {
  public static void main(String[] args) {
    lectorDades lector = new lectorDades();

    Player huma;
    int codeLength;
    boolean isChildMode;
    String tipusJugador = lector.llegirString("Vols ser tipus child o tipus adult? : ");
    if (tipusJugador.equalsIgnoreCase("child")) {
        huma = new ChildHumanPlayer();
        codeLength = 3; // Longitud fija para child
        isChildMode = true;
    } else if (tipusJugador.equalsIgnoreCase("adult")) {
        huma = new AdultHumanPlayer();
        codeLength = ((AdultHumanPlayer) huma).getGuessLength(); // Método nuevo para obtener longitud sin pedir entrada
        isChildMode = false;
    } else {
        System.out.println("Error, opció no vàlida, per defecte seràs adult.");
        huma = new AdultHumanPlayer();
        codeLength = ((AdultHumanPlayer) huma).getGuessLength();
        isChildMode = false;
    }

    RobotPlayer robot = new RobotPlayer(codeLength, isChildMode);
    CodeGenerator generador = new CodeGenerator(codeLength);
    Feedback feedback = new Feedback();
    String secret = generador.generateCode();

    System.out.println("Comença el joc!!! Esbrina el codi secret");
    boolean humaEncertat = false;
    boolean robotEncertat = false;
    int intentsHuma = 0;
    int intentsRobot = 0;

    while (!humaEncertat || !robotEncertat) {
        if (!humaEncertat) {
            System.out.println("El teu torn");
            String intentHuma = huma.makeGuess();
            String pistaHuma = feedback.getFeedback(secret, intentHuma);
            intentsHuma++;
            System.out.println("Intent: " + intentHuma + " Feedback: " + pistaHuma);
            if (intentHuma.equalsIgnoreCase(secret)) {
                System.out.println("Has encertat en " + intentsHuma + " intents.");
                humaEncertat = true;
            } else {
                System.out.println("Continua intentant-ho");
            }
        }

        if (!robotEncertat) {
            System.out.println("Torn del robot");
            String intentRobot = robot.makeGuess();
            String pistaRobot = feedback.getFeedback(secret, intentRobot);
            intentsRobot++;
            System.out.println("Intent del robot: " + intentRobot + " Feedback: " + pistaRobot);
            if (intentRobot.equalsIgnoreCase(secret)) {
                System.out.println("El robot ha encertat en " + intentsRobot + " intents");
                robotEncertat = true;
            } else {
                System.out.println("El robot continua intentant-ho");
                robot.updatePossibilities(intentRobot, pistaRobot);
            }
        }
      }

    // Resultats finals fora del bucle
    System.out.println("\nResultats:");
    System.out.println("Jugador: " + intentsHuma + " intents");
    System.out.println("Robot: " + intentsRobot + " intents");
    if (intentsHuma <= intentsRobot) { // En cas d'empat, guanya el humà
        System.out.println("Has guanyat!");
    }else {
        System.out.println("El robot ha guanyat!");
    }
  }

  
}