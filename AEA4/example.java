package AEA4;

import java.io.File;

public class example {
    public static void main(String[] args) {
        example programa = new example();
        programa.inici();
    }

    public void inici() {
        File carpetaAbs = new File("c:/Temp");
        File fitxerAbs = new File("c:/Temp/Docuemnt.txt");
        File carpetaRel = new File("Temp");
        File fitxerRel = new File("Temp/Document.txt");

        mostrarRutes(carpetaAbs);
        mostrarRutes(fitxerAbs);
        mostrarRutes(carpetaRel);
        mostrarRutes(fitxerRel);

    }

    public void mostrarRutes(File f) {
        System.out.println("La ruta es " +f.getAbsolutePath());
        System.out.println("El seu pare es " +f.getParent());
        System.out.println("El seu nom es " +f.getName() +"\n");
    }
}
