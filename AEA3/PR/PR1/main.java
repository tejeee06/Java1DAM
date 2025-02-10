package AEA3.PR.PR1;

import AEA3.recursos.lectorDades;
import AEA3.recursos.modulAritmetics;
import AEA3.recursos.modulErrors;

public class main {
    public static void main(String[]args) {
        lectorDades lector = new lectorDades();
        modulAritmetics calculador = new modulAritmetics();
        modulErrors comprobador = new modulErrors();
        double[] array = new double [5];

        for(int i = 0; i < array.length; i++) {
            double temporal = 0;
            System.out.println("Quina es la " +(i + 1) +" nota que vols introduir ? ");
            temporal = lector.llegirDouble("Introdueix la nota : ");
            array[i] = comprobador.doubleEntre0i10(temporal);
            
        }

        double notaMaxima = calculador.trobarMaximVectorDouble(array);
        double notaMinima = calculador.trobarMinimVectorDouble(array);
        double mitjana = calculador.trobarMitjanaVectorDouble(array);
        System.out.println("La nota mes gran es " +notaMaxima);
        System.out.println("La nota mes petita es " +notaMinima);
        System.out.println("La nota mitjana es " +mitjana);
    }
}
