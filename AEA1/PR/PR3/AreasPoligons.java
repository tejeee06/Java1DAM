package AEA1.PR.PR3;
import java.util.Scanner;
import java.lang.Math;

public class AreasPoligons{
    public static void main(String[]args) {
        Scanner PoligonSelect = new Scanner(System.in);

        double resultat = 0;
        boolean existencia = false;

        System.out.println("Llista de poligons disponibles: Quadrat , Rectangle , Triangle , Trapezi , Rombe , Parallelogram");

        System.out.println("Introdueix el poligon el qual vulgis calcular l'area: ");
        String NomPoligon = PoligonSelect.nextLine();

        if (NomPoligon.equals("Quadrat") || NomPoligon.equals("quadrat")) {

            System.out.println("Introdueix el costat del quadrat: ");
            double cosCuadrat = PoligonSelect.nextDouble();

            resultat = Math.pow(cosCuadrat, 2);

            existencia = true;

        } else if (NomPoligon.equals("Rectangle") || NomPoligon.equals("rectangle")) {

            System.out.println("Introdueix la base del teu Rectangle: ");
            double baseRectangle = PoligonSelect.nextDouble();

            System.out.println("Introdueix l'alçada del teu rectangle: ");
            double heightRectangle = PoligonSelect.nextDouble();

            resultat = baseRectangle * heightRectangle;

            existencia = true;

        } else if (NomPoligon.equals("Triangle") || NomPoligon.equals("triangle")) {

            System.out.println("Introdueix la base del teu triangle: ");
            double baseTriangle = PoligonSelect.nextDouble();

            System.out.println("Introdueix l'alçada del teu triangle");
            double heightTriangle = PoligonSelect.nextDouble();

            resultat = baseTriangle * heightTriangle /2;

            existencia = true;

        } else if (NomPoligon.equals("Trapezi") || NomPoligon.equals("trapezi")) {

            System.out.println("Introdueix la base menor: ");
            double baseMenor = PoligonSelect.nextDouble();

            System.out.println("Introdueix la base major: ");
            double baseMajor = PoligonSelect.nextDouble();

            System.out.println("Introdueix l'alçada: ");
            double heightTrapezi = PoligonSelect.nextDouble();

            resultat = (baseMajor + baseMenor) * heightTrapezi /2;

            existencia = true;

        } else if (NomPoligon.equals("Rombe") || NomPoligon.equals("rombe")) {

            System.out.println("Introdueix la diagonal major: ");
            double diagonalMajor = PoligonSelect.nextDouble();

            System.out.println("Introdueix la diagonal menor: ");
            double diagonalMenor = PoligonSelect.nextDouble();

            resultat = diagonalMajor * diagonalMenor /2;

            existencia = true;

        } else if (NomPoligon.equals("Parallelogram") || NomPoligon.equals("parallelogram")) {

            System.out.println("Introdueix la base del teu parallelogram: ");
            double baseParallelogram = PoligonSelect.nextDouble();

            System.out.println("Introdueix l'alçada del teu parallelogram");
            double heightParallelogram = PoligonSelect.nextDouble();

            resultat = baseParallelogram * heightParallelogram;

            existencia = true;

        } else {

            System.out.println("La paraula que has introduit no es troba a la llista");
        }

        if (existencia) {

            System.out.println("L'area del teu " +NomPoligon +" es de: " +resultat +"cm");
        }



    }
}