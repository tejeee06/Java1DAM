package AEA3.PR.PR4CodiCompany;

public class Casa extends Allotjament {
    private boolean teJardi;
    private boolean tePiscina;
    private static final double preuBase = 150;
    private static final double preuPiscina = 50;

    public Casa(String nom, int capacitat, boolean disponible, boolean teJardi, boolean tePiscina) {
        super(nom, capacitat, disponible);
        this.teJardi = teJardi;
        this.tePiscina = tePiscina;
    }

    public boolean getTeJardi() {
        return teJardi;
    }
    public boolean getTePiscina() {
        return tePiscina;
    }

    public void setTeJardi(boolean teJardi) {
        this.teJardi = teJardi;
    }
    public void setTePiscina(boolean tePiscina) {
        this.tePiscina = tePiscina;
    }

    @Override
    public double calcularPreuNit() {
        double preu = preuBase;
        if (tePiscina) {
            preu = preuBase + preuPiscina;
        }
        return preu;
    }

    @Override
    public void mostrarInformacio() {
        System.out.println("Casa Rural :  Nom de la casa : " +getNom() +", Capacitat de la casa : " +getCapacitat() +" persones, Disponibilitat de la casa : " +getCapacitat() +", Disposa de Jardi : " +getTeJardi() +", Disposa de Piscina : " +getTePiscina());
    }
}
