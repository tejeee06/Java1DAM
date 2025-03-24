package AEA3.PR.PR4recursivitat;

import AEA3.recursos.lectorDades;

public class sumaPrimerNnumeros {
    
    public static int sumaNumeros(int n) {
        System.out.println("1. En esta iteración n = " + n);
        if (n == 0) {
            System.out.println("2. Estoy en el caso base, n = " + n);
            return 1;
        } else {
            System.out.println("3. En esta iteración, volveré a llamar a la misma función con n = " + (n-1));
            return n + sumaNumeros(n - 1);
        }
    }

    public static void main(String[] args) {
        lectorDades lector = new lectorDades();
        int numero = lector.llegirInt("Quin numero enter vols : ");
        System.out.println("La suma de " +numero +" es " +sumaNumeros(numero));
    }
}
