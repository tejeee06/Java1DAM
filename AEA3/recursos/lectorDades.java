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
                lector.nextLine(); // Consumir salto de línea
            } else {
                System.out.println("Error, això no és un double");
                lector.next();
            }
        }
        return valor;
    }

    public int llegirInt(String missatge) {
        boolean intOK = false;
        int valor = 0;
        while (!intOK) {
            System.out.println(missatge);
            if(lector.hasNextInt()) {
                intOK = true;
                valor = lector.nextInt();
                lector.nextLine(); // Consumir salto de línea
            }
            else {
                System.out.println("Error, això no és un int");
                lector.next();
            }
        }
        return valor;
    }

    public float llegirFloat(String missatge) {
        boolean floatOK = false;
        float valor = 0;
        while (!floatOK) {
            System.out.println(missatge);
            if(lector.hasNextFloat()) {
                floatOK = true;
                valor = lector.nextFloat();
                lector.nextLine(); // Consumir salto de línea
            }
            else {
                System.out.println("Error, això no és un float");
                lector.next();
            }
        }
        return valor;
    }

    public char llegirChar(String missatge) {
        boolean charOK = false;
        char lletra = ' ';
        while(!charOK) {
            System.out.println(missatge);
            String entrada = lector.nextLine();
            if (entrada.length() == 1) {
                lletra = entrada.charAt(0);
                charOK = true;
            } else {
                System.out.println("Entrada no vàlida");
            }
        }
        return lletra;
    }

    public String llegirString(String missatge) {
        System.out.println(missatge);
        String valor = lector.nextLine();
        return valor;
    }
}