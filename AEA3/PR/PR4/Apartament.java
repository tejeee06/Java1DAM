package AEA3.PR.PR4;

public class Apartament extends Allotjament{
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
        System.out.println("Tipus : Apartament");
        System.out.println("Nom de l'Apartament : " +getNom());
        System.out.println("Capacitat de l'apartament : " +getCapacitat() +" persones");
        System.out.println("Disponibilitat de l'Apartament : " +getDisponible());
        System.out.println("Numero d' Habitacions : " +getNumHabitacions());
        System.out.println("Disposa de cuina : " +getTeCuina());
        System.out.println("Preu : " +calcularPreuNit() +"€");
    }
}
