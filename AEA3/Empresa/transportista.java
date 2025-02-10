package AEA3.Empresa;

public class transportista {
    private String nom;
    private String telefon;
    private String numLlicencia;

    public transportista(String nom, String telefon, String numLlicencia) {
        this.nom = nom;
        this.telefon = telefon;
        this.numLlicencia = numLlicencia;
    }

    public void assignarEncarrec(encarrec a) {}

    public void anularEncarrec(encarrec a) {}
}
