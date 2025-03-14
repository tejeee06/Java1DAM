package AEA3.PR.PR4;

public abstract class Allotjament {
  private String nom;
  private boolean disponible;
  private int capacitat;

  public Allotjament(String nom, int capacitat, boolean disponible) {
    this.nom = nom;
    this.capacitat = capacitat;
    this.disponible = disponible;
  }

  public String getNom() {
    return nom;
  }
  public boolean getDisponible(){
    return disponible;
  }
  public int getCapacitat() {
    return capacitat;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }
  public void setDisponible(boolean disponible) {
    this.disponible = disponible;
  }
  public void setCapacitat(int capacitat) {
    this.capacitat = capacitat;
  }

  public abstract double calcularPreuNit();
  public abstract void mostrarInformacio();

  public void reservar() {
    disponible = false;
  }

  public void alliberar() {
    disponible = true;
  }

  public boolean isDisponible() {
    return getDisponible();
  }
}
