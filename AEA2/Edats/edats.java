package AEA2.Edats;

public class edats {

    public static void main(String[]args) {

        int edats [] = {20, 22, 18, 35, 48, 26, 87, 70};

        float mitjana , suma = 0;

        int lenght = edats.length;
        int edatPetita = edats [0];
        int edatGran = edats [0];


        for (int edat : edats) {

            suma += edat;

            if (edatPetita > edat) {

                edatPetita = edat;

            }

            if (edatGran < edat) {

                edatGran = edat;

            }

        }

        mitjana = suma / lenght;

        System.out.println("La mitjana de edat es de " +mitjana +" anys");
        System.out.println("La edat mes petita es de " +edatPetita +" anys");
        System.out.println("La edat mes gran es de " +edatGran +" anys");


    }

}
