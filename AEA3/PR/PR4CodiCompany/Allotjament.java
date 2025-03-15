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
            System.out.println("Aquest allotjament no està reservat!!");
            return false;
        }
    }

    public abstract double calcularPreuNit();
    public abstract void mostrarInformacio();
}
