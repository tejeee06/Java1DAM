package AEA3.AA.AA1;
import java.util.*;

public class estrellesGuionsNumeros {

    public static void main(String[]args) {

        estrellesGuionsNumeros programa = new estrellesGuionsNumeros();
        programa.inici();

    }

    public void inici() {

        Scanner lector = new Scanner(System.in);
        boolean parar = false;
        String condicio = "";

        while (!parar) {

            System.out.println("Escriu fi si vols finalitzar el programa , escriu continuar si vols continuar");
            condicio = lector.nextLine();
            if (condicio.equalsIgnoreCase("fi")) {
                System.out.println("Programa finalitzat");
                parar = true;
                continue;
            }
            else if (condicio.equalsIgnoreCase("continuar")) {
                char caracter = 'a';
                boolean charOk = false;
                int cops = 0;
                boolean copsOk = false;

                while (!charOk) {
                    System.out.println("Introdueix el caracter que vulgis imprimir : ");
                    if (lector.hasNext()) {
                        String input = lector.next();
                        if (input.length() == 1) {
                            caracter = input.charAt(0);
                            charOk = true;
                        }
                        else {
                            System.out.println("Opcio no reconeguda , introdueix un caracter");
                        }
                    }
                }

                while (!copsOk) {
                    System.out.println("Introdueix els cops que vols que s'executi el teu caracter : ");
                    if (lector.hasNextInt()) {
                        cops = lector.nextInt();
                        copsOk = true;
                    }
                    else {
                        System.out.println("Numero no reconegut");
                        lector.next();
                    }
                }

                for (int i = 0; i < cops; i++) {
                    System.out.print(caracter +" ");
                }
                System.out.println();
            }
            else {
                System.out.println("Opció no reconeguda");
            }      
        }
    }

}