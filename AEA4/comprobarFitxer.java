package AEA4;

import java.io.File;

public class comprobarFitxer {
    public static void main(String[] args) {
        File temp = new File("C:/Temp");
        File Intel = new File("C:/Temp/Intel");
        File document = new File("C:/Temp/Document.txt");

        System.out.println(temp.getAbsolutePath() +" existeix ? " +temp.exists());
        mostrarEstat(Intel);
        mostrarEstat(document);
    } 

    public static void mostrarEstat(File f) {
        System.out.println(f.getAbsolutePath() +" es un fitxer ? " +f.isFile());
        System.out.println(f.getAbsolutePath() +" es una carpeta ? " +f.isDirectory());
    }
    
}
