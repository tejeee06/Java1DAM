package AEA1.AA.AA5;
import java.util.Scanner;

public class MesosAny {

    public static void main(String[]args) {

        Scanner lectorMes = new Scanner(System.in);

        System.out.println("Programa per calcular quants dies te el mes que vulgis");

        System.out.println("Introdueix el numero del mes que vulgis calcular els dies: ");
        int MesEscollit = lectorMes.nextInt();

        switch (MesEscollit)
        {
            case 2:
                System.out.println("El mes que has escollit te 28 o 29 dies");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("El teu mes nomes te 30 dies");
                break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("El teu mes nomes te 31 dies");
                break;

            default:
                System.out.println("Numero de mes introduit incorrecte");
                break;
        }
    }

}
