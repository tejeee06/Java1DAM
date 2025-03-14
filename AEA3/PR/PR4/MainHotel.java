package AEA3.PR.PR4;

import java.util.Scanner;


public class MainHotel {
    private static Allotjament[] allotjaments;
    private static int contador = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inicializarArray();
        mostrarMenu();
    }

    private static void inicializarArray() {
        System.out.print("Introdueix la mida del array d'allotjaments: ");
        int mida = Integer.parseInt(scanner.nextLine());
        allotjaments = new Allotjament[mida];
        System.out.println("Array creat per a " + mida + " allotjaments\n");
    }

    private static void mostrarMenu() {
        int opcio;
        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Afegir allotjament");
            System.out.println("2. Mostrar allotjaments disponibles");
            System.out.println("3. Reservar allotjament");
            System.out.println("4. Alliberar allotjament");
            System.out.println("5. Sortir");
            System.out.print("Selecciona una opció: ");
            opcio = Integer.parseInt(scanner.nextLine());

            switch (opcio) {
                case 1: afegirAllotjament(); break;
                case 2: mostrarDisponibles(); break;
                case 3: gestionarReserva(true); break;
                case 4: gestionarReserva(false); break;
                case 5: System.out.println("Sortint del sistema..."); break;
                default: System.out.println("Opció no vàlida!");
            }
        } while (opcio != 5);
    }

    private static void afegirAllotjament() {
        if (contador >= allotjaments.length) {
            System.out.println("L'array està ple!");
            return;
        }

        System.out.println("\nTipus d'allotjament:");
        System.out.println("1. Habitació");
        System.out.println("2. Apartament");
        System.out.println("3. Casa Rural");
        System.out.print("Selecciona: ");
        int tipus = Integer.parseInt(scanner.nextLine());

        System.out.print("Nom: ");
        String nom = scanner.nextLine();

        System.out.print("Capacitat: ");
        int capacitat = Integer.parseInt(scanner.nextLine());

        System.out.print("Disponible (s/n): ");
        boolean disponible = scanner.nextLine().equalsIgnoreCase("s");

        switch (tipus) {
            case 1:
                System.out.print("Número de llits: ");
                int llits = Integer.parseInt(scanner.nextLine());
                allotjaments[contador++] = new Habitacio(nom, capacitat, disponible, llits);
                break;

            case 2:
                System.out.print("Número d'habitacions: ");
                int habitacions = Integer.parseInt(scanner.nextLine());
                System.out.print("Te cuina (s/n): ");
                boolean cuina = scanner.nextLine().equalsIgnoreCase("s");
                allotjaments[contador++] = new Apartament(nom, capacitat, disponible, habitacions, cuina);
                break;

            case 3:
                System.out.print("Te jardí (s/n): ");
                boolean jardi = scanner.nextLine().equalsIgnoreCase("s");
                System.out.print("Te piscina (s/n): ");
                boolean piscina = scanner.nextLine().equalsIgnoreCase("s");
                allotjaments[contador++] = new CasaRural(nom, capacitat, disponible, jardi, piscina);
                break;

            default:
                System.out.println("Opció incorrecta!");
        }
        System.out.println("Allotjament afegit correctament!");
    }

    private static void mostrarDisponibles() {
        System.out.println("\n--- ALLOTJAMENTS DISPONIBLES ---");
        for (int i = 0; i < contador; i++) {
            Allotjament a = allotjaments[i];
            if (a.isDisponible()) {
                a.mostrarInformacio();
                System.out.println("-----------------------------");
            }
        }
    }

    private static void gestionarReserva(boolean reservar) {
        System.out.print("Introdueix el nom de l'allotjament: ");
        String nom = scanner.nextLine();
        boolean trobat = false;

        for (int i = 0; i < contador; i++) {
            Allotjament a = allotjaments[i];
            if (a.getNom().equalsIgnoreCase(nom)) {
                trobat = true;
                if (reservar) {
                    if (a.isDisponible()) {
                        a.reservar();
                        System.out.println("Reserva realitzada amb èxit!");
                    } else {
                        System.out.println("Error: Ja està reservat");
                    }
                } else {
                    if (!a.isDisponible()) {
                        a.alliberar();
                        System.out.println("Alliberament realitzat!");
                    } else {
                        System.out.println("Error: Ja estava disponible");
                    }
                }
                break;
            }
        }

        if (!trobat) System.out.println("No s'ha trobat l'allotjament");
    }
}
