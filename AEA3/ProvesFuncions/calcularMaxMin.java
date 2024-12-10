package AEA3.ProvesFuncions;

public class calcularMaxMin {

    public static void main(String[]args) {

        int a = 4;
        int b = 5;
        int c = 9;

        calcularGran(a, b, c);

        int petit = calcularPetit(a, b, c);

        System.out.println("El numero mes petit es el numero " +petit);

    }

    public static void calcularGran(int num1, int num2, int num3) {

        if (num1 > num2 && num1 > num3) {

            System.out.println("El numero " +num1  +" es el mes gran de tots.");

        } 
        else if (num2 > num1 && num2 > num3) {

            System.out.println("El numero " +num2 +" es el mes gran de tots");

        } 
        else {

            System.out.println("El numero " +num3 +" es el mes gran de tots");

        }
    }

    public static int calcularPetit(int num1, int num2, int num3) {

        if (num1 < num2 && num1 <num3) {

            return num1;

        } else if (num2 < num1 && num2 < num3) {

            return num2;

        } else {
            
            return num3;

        }
        
    }
    
}
