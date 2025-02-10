package AEA3.recursos;
import java.util.*;


public class modulErrors {
    Scanner lector = new Scanner(System.in);

    public double comprobarDouble(String missatge) {
        boolean doubleOK = false;
        double valor = 0;

        while (!doubleOK) {
            System.out.println(missatge);
            if(lector.hasNextDouble()) {
                valor = lector.nextDouble();
                doubleOK = true;
            }
            else {
                System.out.println("Error , aixo no es un doble ");
                lector.next();
            }
        }

        return valor;
    }

    public int comprobarInt(String missatge) {
        boolean intOK = false;
        int valor = 0;

        while (!intOK) {
            System.out.println(missatge);
            if(lector.hasNextInt()) {
                valor = lector.nextInt();
                intOK = true;
            }
            else {
                System.out.println("Error , aixo no es un Int");
                lector.next();
            }
        }

        return valor;
    }

    public float comprobarFloat(String missatge) {
        boolean floatOK = false;
        float valor = 0;

        while (!floatOK) {
            if(lector.hasNextFloat()) {
                valor = lector.nextFloat();
                floatOK = true;
            }
            else {
                System.out.println("Error , aixo no es un float");
                lector.next();
            }
        }

        return valor;
    }

    public String comprobarString(String missatge) {
        boolean StringOK = false;
        String valor = "default";

        while (!StringOK) {
            if(lector.hasNextLine()) {
                valor = lector.nextLine();
                StringOK = true;
            }
            else {
                System.out.println("Error , aixo no es un String");
                lector.next();
            }
        }

        return valor;
    }

    public double doubleEntre0i10(double a) {
        boolean valorOK = false;

        while(!valorOK) {
            if (a >= 0 && a <= 10) {
                valorOK = true;
            }
            else {
               a = comprobarDouble("Error el rang de la nota es irreal , si us plau inmtrodueix una nota del 0 al 10 : ");
            }
        }
        return a;
    }
}
