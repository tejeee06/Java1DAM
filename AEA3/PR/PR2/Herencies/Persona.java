package AEA3.PR.PR2.Herencies;

public class Persona {
    private int id;
    private int edat;
    private String nom;
    private String cognom;
    private String adreca;

    public Persona(int id, int edat, String nom, String cognom, String adreca) {
        this.id = id;
        this.edat = edat;
        this.nom = nom;
        this.cognom = cognom;
        this.adreca = adreca;
    }
    public Persona(int id, int edat, String nom, String cognom) {
        this.id = id;
        this.edat = edat;
        this.nom = nom;
        this.cognom = cognom;
    }

    public int getId() {
        return id;
    }
    public int getEdat() {
        return edat;
    }
    public String getNom() {
        return nom;
    }
    public String getCognoms() {
        return  cognom;
    }
    public String getAdreca() {
        return adreca;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setEdat(int edat) {
        this.edat = edat;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setCognom(String cognom) {
        this.cognom = cognom;
    }
    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }

    public void presentar() {
        System.out.println("Dades de la persona : ");
        System.out.println("Id : " +getId());
        System.out.println("Edat : " +getEdat());
        System.out.println("Nom : " +getNom());
        System.out.println("Cognoms : " +getCognoms());
        System.out.println("Adreça : " +getAdreca());
    }
}
