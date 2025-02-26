package AEA3.HerenciaSimple;

public class Wolf extends Animal {

    public Wolf() {
        int id = this.getId();
        this.setId(++id);
    }

    private void howl() {
        System.out.println("Wolf " +this.getId() + " is howling");
    }

    @Override
    public void sound() {
        howl();
    }
    
}
