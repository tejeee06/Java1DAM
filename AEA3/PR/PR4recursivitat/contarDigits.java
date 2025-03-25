package AEA3.PR.PR4recursivitat;

import AEA3.recursos.lectorDades;

public class contarDigits {
    
    public static int contarDigits(int n) {
        if (n < 10) {
            return 1;
        }

        return 1 + contarDigits(n / 10);
    }

    public static void main(String[] args) {
        lectorDades lector = new lectorDades();
        int numero = lector.llegirInt("Introdueix el numero que vulgis comptar els digits : ");
        System.out.println("El teu numero te : " +contarDigits(numero) +" digits");
    }
}
