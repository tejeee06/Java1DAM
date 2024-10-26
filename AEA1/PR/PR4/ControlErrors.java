package AEA1.PR.PR4;
import java.util.Scanner;

public class ControlErrors {

    public static void main(String[]args) {

        Scanner lectorPreu = new Scanner(System.in);

        System.out.println("Introdueix el preu que hagis pagat en euros : ");
        double PreuIntroduit = lectorPreu.nextDouble();

        double Descompte = 8;
        double CompraMinima = 100;
        double DescompteMaxim = 10;

        if (PreuIntroduit > 0) {

            if (PreuIntroduit >= CompraMinima) {

                double DescompteFet = PreuIntroduit * Descompte /100;

                if (DescompteFet > DescompteMaxim) {

                    DescompteFet = DescompteMaxim;
                }

                PreuIntroduit = PreuIntroduit - DescompteFet;
            }

            System.out.println("El valor final de la teva compra es de: " +PreuIntroduit +" euros");


        } else {

            System.out.println("El valor que has introduit no es valid");
        }

    }
}
