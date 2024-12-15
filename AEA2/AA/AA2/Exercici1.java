package AEA2.AA.AA2;
import java.util.*;

public class Exercici1 {

    public static void main(String[]args) {

        int[][] matrix = new int[5][5];

        Random random = new Random();
        
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = random.nextInt(101);

            }

        }

        System.out.println("La matriu aleatoria s'ha generat correctamnet , la matriu es la seguent : ");

        System.out.println();
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] +" ");

            }

            System.out.println();

        }

        System.out.println();
        System.out.println("La mitjana de la matriu es de  : " +calcularMitjana(matrix));

        trobarGranRepeticions(matrix);

        System.out.println("Els numeros primers de la matriu son : ");
        mostrarPrimers(matrix);

        System.out.println();
        System.out.println("Els nombres parells de la matriu son : ");
        numerosParells(matrix);

        int[] suma = sumaDiagonals(matrix);
        System.out.println("La suma de la primera diagonal es : " +suma[0]);
        System.out.println("La suma de la segona diagonal es : " +suma[1]);
        
        System.out.println("La suma de la ultima fila de la matriu es : " + sumaUltimaFila(matrix));
        
    }

    // Funcio per trobar la mitjana de la matriu
    public static double calcularMitjana(int[][] matrix) {

        int sumatori = 0;
        int cops = 0;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j <matrix[i].length; j++) {

                sumatori = sumatori + matrix[i][j];
                cops ++;

            }

        }
        System.out.println();
        return (double) sumatori / cops;

    }

    // Funcio per trobar el numero mes gran i quants cops es repeteix a la matrix
    public static void trobarGranRepeticions(int[][] matrix) {

        int numeroGran = matrix[0][0];
        int repeticions = 0;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] > numeroGran) {

                    numeroGran = matrix[i][j];
                    repeticions = 1;

                }
                else if (matrix[i][j] == numeroGran) {

                    repeticions ++;

                }
            }
        }

        System.out.println("El numero mes gran es : " +numeroGran +" , la cantitat de cops que es repeteix es de " +repeticions +" cop/s");
        System.out.println();

    }

    // Funcions per comprobar si hi han numeros primers a la matriu
    public static boolean esPrimer(int numero) {

        if (numero < 2) {

            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            // Si la residu es 0 , significa que I pot dividir-se per el numero , llavorens numero no es primer
            if (numero % i == 0) {

                return false;
            }
        }
        return true;
    }

    public static void mostrarPrimers(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (esPrimer(matrix[i][j])) {

                    System.out.print(matrix[i][j] +" ");

                }

            }

        }

        System.out.println();
    }

    // Funcio per trobar els numeros parells de la matriu
    
    public static void numerosParells(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] % 2 == 0) {

                    System.out.print(matrix[i][j] +" ");
                }
            }
        }

        System.out.println();
    }

    // Funcio per sumar les dos diagonals de la matriu
    public static int[] sumaDiagonals(int[][] matrix) {

        int sumaDiagonal1 = 0;
        int sumadiagonal2 = 0;

        for (int i = 0; i < matrix.length; i++) {

            sumaDiagonal1 = sumaDiagonal1 + matrix[i][i];
            sumadiagonal2 = sumadiagonal2 + matrix[i][matrix.length - 1 - i];

        }

        System.out.println();
        return new int[] {sumaDiagonal1, sumadiagonal2};

    }
    
    // Funcio per fer la suma de la utlima fila de la matrix
    public static int sumaUltimaFila(int[][] matrix) {

        int suma = 0;

        for (int i = 0; i < matrix[matrix.length - 1].length; i++ ) {

            suma = suma + matrix[matrix.length - 1][i];

        }

        System.out.println();
        return suma;

    }
}
