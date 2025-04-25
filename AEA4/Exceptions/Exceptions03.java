package AEA4.Exceptions;

public class Exceptions03 {
    public static void main(String args []) {
        String[] t ={"Hola", "Adeu", "Fins Dema"};
        try {
            System.out.println("Abans d'executar el for");
            for (int i = 0; i <= t.length; i++) {
                System.out.println("Posicio" +i +":" +t[i]);
                
            }
        } 
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("S'ha sortit dels limits");
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println("No es un string");
        }
        finally {
            System.out.println("Peti qui peti");
        }
    }
}
