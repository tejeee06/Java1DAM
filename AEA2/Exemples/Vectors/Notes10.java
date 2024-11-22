package AEA2.Exemples.Vectors;

public class Notes10 {

    public static void main(String[]args) {

        int[] notes = {5, 2, 3, 10, 3, 4};

        boolean exist = false;
        int i = 0;

        while (i < notes.length && !exist) {

            int nota = notes[i];
            System.out.println(nota);

            if (nota == 10) {

                exist = true;

            }

            i++;

        }

        if (exist) {

            System.out.println("S' ha trobat un 10");

        } else {

            System.out.println("No s'ha trobat un 10");

        }

    }

}
