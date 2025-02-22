package AEA3.recursos;
import java.util.Scanner;
public class lectorDades {
    private Scanner lector = new Scanner(System.in);

    public double llegirDouble(String missatge) {
        boolean doubleOK = false;
        double valor = 0;
        while (!doubleOK) {
            System.out.println(missatge);
            if (lector.hasNextDouble()) {
                doubleOK = true;
                valor = lector.nextDouble();
            }
            else {
                System.out.println("Error , aixo no es un double");
                lector.next();
            }
        }

        return valor;
    }

    public int llegirInt(String missatge) {
        boolean intOK = false;
        int valor = 0;
        System.out.println(missatge);
        while (!intOK) {
            if(lector.hasNextInt()) {
                intOK = true;
                valor = lector.nextInt();
            }
            else {
                System.out.println("Error , aixo no es un Int");
                lector.next();
            }
        }
        return valor;
    }

    public float llegirFloat(String missatge) {
        boolean floatOK = false;
        float valor = 0;
        System.out.println(missatge);
        while (!floatOK) {
            if(lector.hasNextFloat()) {
                floatOK = true;
                valor = lector.nextFloat();
            }
            else {
                System.out.println("Error, aixo no es un float");
                lector.next();
            }
        }
        return valor;
    }

    public char llegirChar(String missatge) {
        boolean charOK = false;
        char lletra = 'o';

        System.out.println(missatge);
        while(!charOK) {
            String entrada = lector.next();

            if (entrada.length() == 1) {
                lletra = entrada.charAt(0);
                charOK = true;
            }
            else {
                System.out.println("Entrada no valida");
                lector.next();
            }
        }
        
        return lletra;
    }
}
