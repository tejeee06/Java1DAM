package AEA3.AA.AA1;
import java.util.*;

public class estrellesGuionsNumeros {

    public static void main(String[]args) {

        estrellesGuionsNumeros.output();

    }

    public static void output() {

        Scanner lector = new Scanner(System.in);

        boolean parar = false;
        
        while(!parar) {

            System.out.println("Quin es el caracter que vols introduir ? (si vols parar escriu fi)");
            String paraula = lector.nextLine();

            if (paraula.equalsIgnoreCase("fi")) {

                parar = true;

                System.out.println("Programa finalitzat");
                continue; // Utilitzem continue per si es compleix el if que ignori la resta de codi del bucle i pugi sortir

            }

            int cops = 0;
            boolean inputValid = false;

            while (!inputValid) {

                System.out.println("Quants cops vols que s'executi el teu caracter ?");
                // Agafem les dades d'entrada com un String per evitarnos problemes amb les futures interacions
                String numeroCops = lector.nextLine();

                // Fem un control d'errors eficient amb els blocs Try i Catch
                try {

                    cops = Integer.parseInt(numeroCops); // Intentem convertir el String d'abans a un Int
                    inputValid = true; // En el cas de que es pugi , canviem l'input valid a true i sortim , sino pasem al catch

                }
                catch (NumberFormatException e) { // En el cas de que no s'hagi introduit un numero (NumberFormatException) , donara el seguent error

                    System.out.println("Error , has d'introduir un numero.");

                }

            }

            for (int i = 0; i < cops; i++) {

                System.out.print(paraula);
                
            }

            System.out.println();

        }

    }

}