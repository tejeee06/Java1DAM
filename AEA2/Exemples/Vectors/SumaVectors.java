package AEA2.Exemples.Vectors;

public class SumaVectors {

    public static void main(String[]args) {

        int [] vec1 = {10,20,30,40,50};
        int [] vec2 = {100,200,300,400,500};

        for (int i = 0; i < vec1.length; i++) {

            int resultat = vec1[i] + vec2[i];

            System.out.println(resultat);

        }
    }
}
