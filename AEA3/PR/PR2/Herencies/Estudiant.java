package AEA3.PR.PR2.Herencies;

public class Estudiant extends Persona{
    private String curs;
    private String assignatures;
    private String escola;
    private int notes;

    public Estudiant(int id, int edat, String nom, String cognom, String curs, String assignatures, String escola, int notes) {
        super(id, edat, nom, cognom);
        this.curs = curs;
        this.assignatures = assignatures;
        this.escola = escola;
        this.notes = notes;
    }

    public String getCurs() {
        return curs;
    }
    public String getAssignatures() {
        return assignatures;
    }
    public String getEscola() {
        return escola;
    }
    public int getNotes() {
        return notes;
    }

    public void setCurs(String curs) {
        this.curs = curs;
    }
    public void setAssignatures(String assignatures) {
        this.assignatures = assignatures;
    }
    public void setEscola(String escola) {
        this.escola = escola;
    }
    public void setNotes(int notes) {
        this.notes = notes;
    }

    @Override
    public void presentar() {
        super.presentar();
        System.out.println();
        System.out.println("Dades de l' estudiant : ");
        System.out.println("Curs : " +getCurs());
        System.out.println("Assignatures : " +getAssignatures());
        System.out.println("Escola : " +getEscola());
        System.out.println("Notes : " +getNotes());
    }
}
