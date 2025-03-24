package AEA3.PR.PR4recursivitat;

import AEA3.recursos.lectorDades;

public class Potencia {
    
    public static int potencia (int n, int e) {
        if (e == 0) {
            return 1;
        } else {
            return n * potencia(n, e - 1);
        }
    }

    public static void main(String[] args) {
        lectorDades lector = new lectorDades();
        int n = lector.llegirInt("Quin numero vols : ");
        int e = lector.llegirInt("Quin numero vols elevar : ");
        System.out.println(potencia(n, e));
    }
}
