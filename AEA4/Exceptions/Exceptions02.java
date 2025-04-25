package AEA4.Exceptions;

public class Exceptions02 {
    public static void main(String args[]) {
        String[] t ={"Hola", "Adeu", "Fins Dema"};
        try {
            System.out.println("Abans d'executar el for");
            for (int i = 0; i <= t.length; i++) {
                System.out.println("Posicio" +i +":" +t[i]);
                
            }
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Algo ha sortit malament");
        }
        finally {
            System.out.println("Despres d'executar el for");
            System.out.println("Final del programa");
        }
    }
}
