package AEA3.PR.PR4;

public class Habitacio extends Allotjament {
    private int numLlits;
    private static final double preuBase = 50;
    private static final double preuAdicional = 20;

    public Habitacio(String nom, int capacitat, boolean disponible, int numLlits) {
        super(nom, capacitat, disponible);
        this.numLlits = numLlits;
    }

    public int getNumLlits() {
        return numLlits;
    }
    public void setNumLlits(int numLlits) {
        this.numLlits = numLlits;
    }

    @Override
    public double calcularPreuNit() {
        if (numLlits <= 2) {
            return preuBase;
        } else {
            return preuBase + preuAdicional * (numLlits - 2);
        }
    }

    @Override
    public void mostrarInformacio() {
        System.out.println("Tipus : Habitació Estandar");
        System.out.println("Nom de l' habitació : " +getNom());
        System.out.println("Capacitat de l' habitació : " +getCapacitat() +" persones");
        System.out.println("Disponibilitat de l' habitació : " +isDisponible());
        System.out.println("Numero de llits de l' habitació : " +getNumLlits());
        System.out.println("Preu de la habitacio : " +calcularPreuNit() +"€");
    }
}
