package AEA3.PR.PR4CodiCompany;

public class Apartament extends Allotjament {
    private int numHabitacions;
    private boolean teCuina;
    private static final double preuBase = 100;
    private static final double preuPerHabitacio = 10;

    public Apartament(String nom, int capacitat, boolean disponible, int numHabitacions, boolean teCuina) {
        super(nom, capacitat, disponible);
        this.numHabitacions = numHabitacions;
        this.teCuina = teCuina;
    }

    public int getNumHabitacions() {
        return numHabitacions;
    }
    public boolean getTeCuina() {
        return teCuina;
    }

    public void setNumHabitacions(int numHabitacions) {
        this.numHabitacions = numHabitacions;
    }
    public void setTeCuina(boolean teCuina) {
        this.teCuina = teCuina;
    }

    @Override
    public double calcularPreuNit() {
        return preuBase + (preuPerHabitacio * numHabitacions);
    }

    @Override
    public void mostrarInformacio() {
        System.out.println("Tipus Apartament , Nom de l'Apartament :  " +getNom() +", Capacitat de l'Apartament : " +getCapacitat() +" persones ,  Disponibilitat de l'Apartament : " +isDisponible() +", Disposa de cuina : " +getTeCuina() +", Preu de l'Apartament per nit : " +calcularPreuNit());
    }

    @Override
    public double calcularPreuReserva(int numPersones, int numDies) {
        if (numPersones > getCapacitat()) {
            return -1;
        }

        return calcularPreuNit() * numDies;
    }
    
}
