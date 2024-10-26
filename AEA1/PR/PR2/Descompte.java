package AEA1.PR.PR2;
import java.util.Scanner;

public class Descompte {

    public static void main(String[]args) {

        Scanner myDescompte = new Scanner(System.in);
        System.out.println("Quin es el preu que has pagat en euros? ");
        float preu= myDescompte.nextFloat();


        if(preu > 95) {
            float descompteFet= preu * 15 /100;

            preu = preu - descompteFet;


        }

        System.out.println("El preu final a pagar es es de: " +preu +  "euros");
    }

}
