package AEA3.AreesFuncionsModuls;

import java.util.*;

import AEA3.recursos.modulArees;
import AEA3.recursos.modulErrors;

public class areesFuncions {
       public static void main(String[]args) {
        double resultat = 0;
        Scanner lector = new Scanner(System.in);
        String poligon = "default";
        boolean continuar = true;

        modulErrors comprobador = new modulErrors();
        modulArees calculador = new modulArees();

        while (continuar) {
            boolean poligonExist = true;
            System.out.println("Llista de poligons disponibles : Quadrat, Rectangle, Triangle, Trapezi, Rombe, Parallelogram i Cercle. Escriu fi per sortir");
            System.out.println("Quin poligon vols escollir ? ");
            poligon = lector.nextLine();

            if(poligon.equalsIgnoreCase("quadrat")) {
                double costat = 0;

                costat = comprobador.comprobarDouble("Introdueix el costat del teu quadrat : ");
                resultat = calculador.calcularCuadrat(costat);
            }
            else if (poligon.equalsIgnoreCase("rectangle")) {
                double base = 0;
                double altura = 0;

                base = comprobador.comprobarDouble("Introdueix la base del rectangle : ");
                altura = comprobador.comprobarDouble("Introdueix la altura del rectangle : ");
                resultat = calculador.calcularRectangle(altura, base);
            }
            else if (poligon.equalsIgnoreCase("triangle")) {
                double base = 0;
                double altura = 0;

                base = comprobador.comprobarDouble("Introdueix la base del triangle : ");
                altura = comprobador.comprobarDouble("Introdueix la altura del triangle : ");
                resultat = calculador.calcularTriangle(altura, base);
            }
            else if (poligon.equalsIgnoreCase("Trapezi")) {
                double baseMajor = 0;
                double baseMenor = 0;
                double altura = 0;

                baseMajor = comprobador.comprobarDouble("Introdueix la base major del teu trapezi : ");
                baseMenor = comprobador.comprobarDouble("Introdueix la base menor del teu trapezi : ");
                altura = comprobador.comprobarDouble("Introdueix la altura del teu trapezi");
                resultat = calculador.calcularTrapezi(baseMajor, baseMenor, altura);
            }
            else if (poligon.equalsIgnoreCase("Rombe")) {
                double diagonalMajor = 0;
                double diagonalMenor = 0;

                diagonalMajor = comprobador.comprobarDouble("Introdueix la digonal major del teu rombe :");
                diagonalMenor = comprobador.comprobarDouble("Introdueix la diagonal menor del teu rombe : ");
                resultat = calculador.rombe(diagonalMajor, diagonalMenor);
            }
            else if (poligon.equalsIgnoreCase("Parallelogram")) {
                double base = 0;
                double altura = 0;

                base = comprobador.comprobarDouble("Introdueix la base del teu parallelogram");
                altura = comprobador.comprobarDouble("Introdueix la altura del teu parallelogram ");
                resultat = calculador.calcularRectangle(altura, base);
            }
            else if (poligon.equalsIgnoreCase("cercle")) {
                double radi = 0;

                radi = comprobador.comprobarDouble("Introdeuix el radi del teu cercle : ");
                resultat = calculador.cercle(radi);
            }
            else if (poligon.equalsIgnoreCase("fi")) {
                System.out.println("Adeu.");
                continuar = false;
                continue;
            }
            else {
                poligonExist = false;
            }

            if (!poligonExist) {
                System.out.println("Poligon no reconegut");
                System.out.println();
            }
            else {
                System.out.println("L' area del teu " +poligon +" es de " +resultat +"cm");
            } 
        }
    }
}
