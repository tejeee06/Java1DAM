package AEA3.Empresa;

public class tipusProducte {
    private String nom;
    private int id;
    private double preu;
    private int estoc;
    private boolean esVen;

    public tipusProducte(String nom, int id, double preu, int estoc, boolean esVen) {
        this.nom = nom;
        this.id = id;
        this.preu = preu;
        this.estoc = estoc;
        this.esVen = esVen;
    }
}
