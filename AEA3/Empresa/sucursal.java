package AEA3.Empresa;

public class sucursal {
    private String nom;
    private String adresa;
    private String telefon;
    private String mail;

    public sucursal(String nom, String adresa, String telefon, String mail) {
        this.nom = nom;
        this.adresa = adresa;
        this.telefon = telefon;
        this.mail = mail;
    }
    
    public void descansa(transportista a) {}

    public void treballa(transportista a) {}

    public void altaClient(client a) {}

    public void baixaClient(client a) {}

    public void altaEncarrec(client a, transportista b, encarrec c) {}

    public void anularEncarrec(encarrec a) {}
}
