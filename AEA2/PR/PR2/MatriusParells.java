package AEA2.PR.PR2;

public class MatriusParells {

    public static void main(String[] args) {
        System.out.println("MATRIU");
        System.out.println("---------------------");

        int [][] matriuParells = new int[10][10];

        for(int i = 0; i < matriuParells.length; i++) {
            for(int j = 0; j < matriuParells[i].length; j++) {
                if ( i % 2 == 0 && j % 2 ==0) {

                    matriuParells[i][j] = -1;
                } else {
                    matriuParells[i][j] = i;
                }
                System.out.println("La posició " + i + " " + j + " de la matriu matriuParells val: " + matriuParells[i][j]);
            }
            System.out.println("La fila " + i + " de la matriu matriuParells ja està tota plena");
            System.out.println();

        }

        System.out.println();
        for(int i = 0; i < matriuParells.length; i++) {
            for(int j = 0; j < matriuParells[i].length; j++) {
                System.out.print(matriuParells[i][j]+ " ");
            }
            System.out.println("   --> Fila " + i);
        }
    }
}
