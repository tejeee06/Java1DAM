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
            System.out.println("3. Reservar allotjament");
            System.out.println("4. Alliberar allotjament");
            System.out.println("5. Cerca personalitzada");
            System.out.println("6. Sortir del programa");
            System.out.println();
            String opcio = lector.llegirString("Escull una opcio : ");

            switch (opcio) {
                case "1":
                    afegirAllotjament();
                    System.out.println();
                    break;
                case "2":
                    mostrarDisponibles();
                    System.out.println();
                    break;
                case "3":
                    gestionarReserva();
                    System.out.println();
                    break;
                case "4":
                    gestionarAlliberaments();
                    System.out.println();
                    break;
                case "5":
                    cercaPersonalitzada();
                    System.out.println();
                    break;
                case "6":
                    System.out.println("Sortint del programa....");
                    System.out.println("Adeu fins un altre.");
                    parar = true;
                    break;
                default :
                    System.out.println("Error , opcio no reconeguda");
                    break;
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
        System.out.println();
        char opcio = lector.llegirChar("Quina opcio vols escollir ? ");

        String nom;
        int capacitat;
        boolean disponible;
        switch (opcio) {
            case '1':
                nom = lector.llegirString("Nom de l'Habitacio : ");
                capacitat = lector.llegirInt("Capacitat de l'Habitacio : ");
                disponible = lector.llegirString("Disponible s/n").equalsIgnoreCase("s");
                int llits = lector.llegirInt("Llits de l'habitacio : ");
                allotjaments[contador++] = new Habitacion(nom, capacitat, disponible, llits);
                System.out.println("Allotjament afegit correctament");
                break;
            case '2':
                nom = lector.llegirString("Nom de l' Apartament : ");
                capacitat = lector.llegirInt("Capacitat de l' Apartament : ");
                disponible = lector.llegirString("Disponible s/n").equalsIgnoreCase("s");
                int numHabitacions = lector.llegirInt("Habitacions de l'apartament : ");
                boolean teCuina = lector.llegirString("Disposa de cuina s/n").equalsIgnoreCase("s");
                allotjaments[contador++] = new Apartament(nom, capacitat, disponible, numHabitacions, teCuina);
                System.out.println("Allotjament afegit correctament");
                break;
            case '3':
                nom = lector.llegirString("Nom de la casa rural : ");
                capacitat = lector.llegirInt("Capacitat de la casa rural : ");
                disponible = lector.llegirString("Disponible s/n").equalsIgnoreCase("s");
                boolean teJardi = lector.llegirString("Disposa de Jardi s/n").equalsIgnoreCase("s");
                boolean tePiscina = lector.llegirString("Disposa de Piscina s/n").equalsIgnoreCase("s");
                allotjaments[contador++] = new Casa(nom, capacitat, disponible, teJardi, tePiscina);
                System.out.println("Allotjament afegit correctament");
                break;
            default:
                System.out.println("Error , opcio no reconeguda");
                break;
        }
    }

    public void mostrarDisponibles() {
        if (contador == 0) {
            System.out.println("Error , no hi han apartaments registrats");
            return;
        }

        boolean hiHaDisponibles = false;
        for (int i = 0; i < contador; i++) {
            Allotjament a = allotjaments[i];
            if (a.isDisponible()) {
                hiHaDisponibles = true;
                a.mostrarInformacio();
                System.out.println();
            }
        }

        if(!hiHaDisponibles) {
            System.out.println("Error , en aquest moment no hi han apartaments disponibles.");
        }
    }

    public void gestionarReserva() {
        String nomReserva = lector.llegirString("Introdueix el nom de l'Allotjament a reservar");
        boolean exist = false;
        for (int i = 0; i < contador; i++) {
            if (allotjaments[i].getNom().equalsIgnoreCase(nomReserva)) {
                exist = true;
                if (allotjaments[i].isDisponible()) {
                    allotjaments[i].reservar();
                }
                else {
                    System.out.println("L' allotjament ya esta reservat.");
                }

                break;
            }
        }

        if (!exist) {
            System.out.println("No s'ha trobat aquest allotjament.");
        }
    }

    public void gestionarAlliberaments() {
        String nomAlliberament = lector.llegirString("Introdueix el nom de l'Allotjament a alliberar : ");
        boolean exist = false;
        for (int i = 0; i < contador; i++) {
            if (allotjaments[i].getNom().equalsIgnoreCase(nomAlliberament)) {
                exist = true;
                if (allotjaments[i].isDisponible()) {
                    System.out.println("L' allotjament no esta reservat");
                }
                else {
                    allotjaments[i].alliberar();
                }

                break;
            }
        }

        if (!exist) {
            System.out.println("No s'ha trobat l'allotjament");
        }
    }

    public void cercaPersonalitzada() {
        System.out.println("Opcions de la cerca personalitzada : ");
        System.out.println("1. Cercar per preu maxim : ");
        System.out.println("2. Cercar per caracteristiques : ");
        System.out.println();
        String opcio = lector.llegirString("Escull una opcio : ");
        boolean exist = false;

        switch (opcio) {
            case "1":
                double preuMax = lector.llegirDouble("Introdueixi el preu maxim que es vol gastar : ");
                System.out.println("Resultats de la recerca");
                for (int i = 0; i < contador; i++) {
                    Allotjament a = allotjaments[i];
                    if (a.isDisponible() && a.calcularPreuNit() <= preuMax) {
                        System.out.println("Allotjament " +a.getNom() +" amb preu de : " +a.calcularPreuNit());
                        exist = true;
                    }
                }

                if (!exist) {
                    System.out.println("No s'han trobat allotjaments amb les caracteristiques especificades");
                }
                break;
            case "2":
                System.out.println("Filtra per : ");
                System.out.println("Cuina (Opcio nomes disponible per Apartaments)");
                System.out.println("Jardi o Piscina (Opcio nomes disponible per a Cases Rurals)");
                System.out.println();
                String subOpcio = lector.llegirString("Escolleix una opcio : ");

                if (subOpcio.equalsIgnoreCase("Cuina")) {
                    boolean trobatCuina = false;

                    for (int i = 0; i < contador; i++) {
                        Allotjament a = allotjaments[i];

                        if (a instanceof Apartament) {
                            Apartament apt = (Apartament) a;

                            if (apt.isDisponible() && apt.getTeCuina()) {
                                trobatCuina = true;
                                apt.mostrarInformacio();
                                System.out.println();
                            }
                        }
                    }

                    if (!trobatCuina) {
                        System.out.println("No s'ha trobat un apartament amb aquestes caracteristiques");
                    }
                }
                else if (subOpcio.equalsIgnoreCase("Jardi") || subOpcio.equalsIgnoreCase("Piscina")) {
                    boolean trobatCasa = false;

                    for (int i = 0; i < contador; i++) {
                        Allotjament a = allotjaments[i];
                        if (a instanceof Casa) {
                            Casa casa = (Casa) a;

                            if (casa.isDisponible() && (casa.getTeJardi() || casa.getTePiscina())) {
                                trobatCasa = true;
                                casa.mostrarInformacio();
                                System.out.println();
                            }
                        }
                    }

                    if (!trobatCasa) {
                        System.out.println("No s'ha trobat una casa amb aquestes caracteristiques");
                    }
                }
                else {
                    System.out.println("Error , opcio no reconeguda");
                }
                
                break;
            default:
                System.out.println("Error , opcio no reconeguda");
                break;
        }
    }
}
