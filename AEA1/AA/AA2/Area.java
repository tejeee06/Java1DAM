package AEA1.AA.AA2;
import java.util.Scanner;

public class Area {

    public static void main(String[]args) {

        Scanner myAreaCalculator = new Scanner(System.in);

        System.out.println("Introdueix la base del triangle en centimetres : ");
        float base= myAreaCalculator.nextFloat();

        System.out.println("Introdueix l' alçada del trinagle en centimetres : ");
        float height= myAreaCalculator.nextFloat();

        float calcul= base * height /2;
        System.out.println("L'area del teu trinagle es de: " +calcul +"cm");

    }

}
