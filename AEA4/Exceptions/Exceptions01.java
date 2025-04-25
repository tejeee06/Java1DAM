package AEA4.Exceptions;

public class Exceptions01 {
    public static void main(String args[]) {
        String[] t ={"Hola", "Adeu", "Fins Dema"};
        try {
            for (int i = 0; i <= t.length; i++) {
                System.out.println("Posicio" +i +":" +t[i]);
            }
        } 
        catch (Exception e) {
            System.out.println("Algo ha sortit malament");
        }
    }
}
