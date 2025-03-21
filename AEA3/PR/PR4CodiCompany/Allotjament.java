package AEA3.PR.PR4CodiCompany;

public abstract class Allotjament {
    private String nom;
    private int capacitat;
    private boolean disponible;

    public Allotjament(String nom, int capacitat, boolean disponible){
        this.nom = nom;
        this.capacitat = capacitat;
        this.disponible = disponible;
    }

    public String getNom() {
        return nom;
    }
    public int getCapacitat() {
        return capacitat;
    }
    public boolean getDisponible() {
        return disponible;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setCapacitat(int capacitat) {
        this.capacitat = capacitat;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public boolean reservar(){
        if (disponible){
            disponible = false;
            System.out.println("Reserva exitosa");
            return true;
        
        
        } else {
            System.out.println("No està disponible per reserves");
            return false;
        }   
    }

    public boolean alliberar(){
        if (!disponible){
            disponible = true;
            System.out.println("Alliberació exitosa");
            return true;
        } else {
            System.out.println("Aquest allotjament no està reservat");
            return false;
        }
    }

    public abstract double calcularPreuNit();
    public abstract void mostrarInformacio();
    public abstract double calcularPreuReserva(int numPersones, int numDies);


    public static void gestionarReserva(Allotjament[] allotjaments, int contador, String nomReserva, int numPersones, int numDies) {
        boolean exist = false;

        for (int i = 0; i < contador; i++) {
            Allotjament a = allotjaments[i];
            if (a.getNom().equalsIgnoreCase(nomReserva)) {
                exist = true;
                if (!a.isDisponible()) {
                    System.out.println("Error , l'allotjament ya esta reservat");
                    return;
                }
                if (numPersones > a.getCapacitat()) {
                    System.out.println("Error , es supera la capacitat de l'apartament");
                    return;
                }

                double preuTotal = a.calcularPreuReserva(numPersones, numDies);
                a.reservar();
                System.out.println("Preu total de la reserva " +preuTotal);
                return;

            }
        }

        if (!exist) {
            System.out.println("No s' ha trobat aquest allotjament");
        }
    }

    public static void gestionarAlliberament(Allotjament[] allotjaments, int contador, String nomAlliberament) {
        boolean exist = false;

        for (int i = 0; i < contador; i++) {
            Allotjament a = allotjaments[i];
            if(a.getNom().equalsIgnoreCase(nomAlliberament)) {
                exist = true;
                if(a.isDisponible()) {
                    System.out.println("Error , l' Allotjament no esta reservat");
                }
                else {
                    a.alliberar();
                }
                break;
            }
        }

        if(!exist) {
            System.out.println("No s' ha trobat aquest allotjament");
        }
    }
}
