package AEA3.PR.PR4recursivitat;

import AEA3.recursos.lectorDades;

public class InvertirParaula {

    public static String invertir(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }

        return str.charAt(str.length() - 1) + invertir(str.substring(0, str.length() -1));

    }

    public static void main(String[] args) {

        lectorDades lector = new lectorDades();
        String paraula = lector.llegirString("Introdueix la paraula que vols invertir : ");
        System.out.println(invertir(paraula));
    }
    
}
