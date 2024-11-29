package AEA2.PR.PR2;

public class MatriuCanvi {

    public static void main(String[]args) {

        int [][] matriu = new int[10][10];

        for(int i = 0; i < matriu.length; i++) {
            for(int j = 0; j < matriu[i].length; j++) {

                if ( i % 2 == 0 && j % 2 ==0) {

                    matriu[i][j] = 1;

                } else if (i % 2 == 0 && j % 2 == 1) {
                    
                    matriu[i][j] = 2;
                    
                } else if (i % 2 == 1 && j % 2 == 0) {

                    matriu[i][j] = 3;
                    
                } else if (i % 2 == 1 && j % 2 == 1) {

                    matriu[i][j] = 4;

                }

                System.out.println("La posició " + i + " " + j + " de la matriu matriuParells val: " + matriu[i][j]);
            }

            System.out.println();

        }

    }
}
