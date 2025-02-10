package AEA3.recursos;
import java.util.*;

import AEA3.AreesFuncionsModuls.areesFuncions;

public class modulAritmetics {

    public double trobarMaximVectorDouble(double[] arreglo) {
        double numeroGran = arreglo[0];
        for (int i = 0; i < arreglo.length; i++) {
           
            if(numeroGran < arreglo[i]) {
                numeroGran = arreglo[i];
            }
        }

        return numeroGran;
    }
    
    public double trobarMinimVectorDouble(double[]arreglo) {
        double numeroPetit = arreglo[0];
        for (int i = 0; i < arreglo.length; i++) {
            if (numeroPetit > arreglo[i]) {
                numeroPetit = arreglo[i];
            }
        }
        return numeroPetit;
    }

    public double trobarMitjanaVectorDouble(double[] arreglo) {
        int longitud = arreglo.length;
        double sumatori = 0;
        double mitjana = 0;
        for (int i = 0; i < arreglo.length; i++) {
            sumatori = sumatori + arreglo[i];
        }
        mitjana = sumatori / longitud;
        return mitjana;
    }
}
