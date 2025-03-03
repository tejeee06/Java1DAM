package AEA3.HerenciaMultinivell;

public class Maruti800 extends Maruti {
    public Maruti800() {
        System.out.println("Maruti model: 800");
    }

    @Override
    public void speed() {
        System.out.println("Max: 80Kmh");
    }

    public static void main(String[]args) {
        Maruti800 obj = new Maruti800();
        obj.vehicleType();
        obj.brand();
        obj.speed();
    }
}
