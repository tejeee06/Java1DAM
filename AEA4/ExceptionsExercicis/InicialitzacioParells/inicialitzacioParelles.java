package AEA4.ExceptionsExercicis.InicialitzacioParells;

public class inicialitzacioParelles {
    
    public static void main(String[]args) {
        final int midaVector = 100;

        try {
            int[] numPars = new int[midaVector];
            iniciarVector(numPars);
            imprimirVector(numPars);
        } catch (IllegalArgumentException e) {
            System.err.println("Error en la execucio : " +e.getMessage());
        } catch (Exception e) {
            System.err.println("Error insesperat : " +e.getMessage());
        }
    }

    public static void iniciarVector(int[] vector) throws IllegalArgumentException {
        if(vector == null) {
            throw new IllegalArgumentException("El vector no pot ser nul");
        }

        try {
            for (int i =0; i < vector.length; i++) {
                vector[i] = i * 2;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Error : " +e.getMessage());
        }
    }

    public static void imprimirVector(int[] vector) throws IllegalArgumentException {
        if(vector == null) {
            throw new IllegalArgumentException("El vector no pot ser nul.");
        }

        try {
            for (int num : vector) {
                System.out.println(num);
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Error : " +e.getMessage());
        }
    }
}
