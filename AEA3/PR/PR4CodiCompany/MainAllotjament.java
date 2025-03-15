package AEA3.PR.PR4CodiCompany;

import AEA3.recursos.lectorDades;

public class MainAllotjament {
    private lectorDades lector = new lectorDades();
    private static Allotjament[] allotjaments;
    private boolean parar = false;
    private int contador = 0;

    public static void main(String[]args) {
        MainAllotjament programa = new MainAllotjament();
        programa.omplirVector();
        programa.mostrarMenu();
    }

    public void omplirVector() {
        int mida = lector.llegirInt("Introdueix la mida del vector : ");
        allotjaments = new Allotjament[mida];
    }

    public void mostrarMenu() {
        System.out.println("Benvingut al menu de gestió de reservas !  ");
        while (!parar) {
            System.out.println("Que vols fer ? (Selecciona la tecla)");
            System.out.println();
            System.out.println("1. Afegir nou allotjament");
            System.out.println("2. Mostrar els allotjaments disponibles");
            System.out.println("3.Reservar allotjament");
            System.out.println("4.Alliberar allotjament");
            System.out.println("5.Cerca personalitzada");
            System.out.println("6.Sortir del programa");
            System.out.println();
            String opcio = lector.llegirString("Escull una opcio : ");

            if (opcio.equalsIgnoreCase("1")) {
                afegirAllotjament();
            }
        }
    }

    public void afegirAllotjament() {
        if (contador >= allotjaments.length) {
            System.out.println("Error , no es poden afegir mes allotjaments");
            return;
        }

        System.out.println();
        System.out.println("Selecciona el tipus d' allotjament que vols afegir : ");
        System.out.println("1. Habitacio Estandart");
        System.out.println("2. Apartament");
        System.out.println("3. Casa rural");
        char opcio = lector.llegirChar("Quina opcio vols escollir ? ");

        String nom;
        int capacitat;
        boolean disponible;
        switch (opcio) {
            case 1:
                nom = lector.llegirString("Nom de l'Habitacio : ");
                capacitat = lector.llegirInt("Capacitat de l'Habitacio : ");
                disponible = lector.llegirString("Disponible s/n").equalsIgnoreCase("s");
        }
    }
}
