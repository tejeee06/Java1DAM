package AEA4;

import java.io.File;
import java.util.Scanner;

public class obrirFitxer {
    public static void main(String[] args) {
       try{
            File f = new File("Document.txt");
            Scanner lector = new Scanner(f);
            System.out.println("Fitxer obert correctament");
       }
       catch(Exception e) {
            System.out.println("Exception : " +e);
       }
    }
}
