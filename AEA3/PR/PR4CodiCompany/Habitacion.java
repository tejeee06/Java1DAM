package AEA3.PR.PR4CodiCompany;

public class Habitacion extends Allotjament {
    private int Llits;
    private static final double preuBase = 50;
    private static final double preuAdicional = 20;


    public Habitacion(String nom, int capacitat, boolean disponible, int Llits){
        super(nom, capacitat, disponible);
        this.Llits = Llits;
    }
    
    public int getLlits() {
        return Llits;
    }

    public void setLlits(int llits) {
        Llits = llits;
    }

    @Override
    public double calcularPreuNit() {
        if (Llits <= 2) {
            return preuBase;
        } else {
            return preuBase + preuAdicional * (Llits - 2);
        }
    }
    
    @Override
    public void mostrarInformacio() {
       System.out.println("Tipus Habitacio estandar , Nom de l'habitacio :  " +getNom() +", Capacitat de l'habitacio : " +getCapacitat() +" persones ,  Disponibilitat de l'habitacio : " +isDisponible() +", Numero de llits : " +getLlits() +", Preu de l'habitacio : " +calcularPreuNit() +"€" );
    }

}
