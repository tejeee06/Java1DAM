package AEA4.ExceptionsExercicis.ContadorParaules;

import java.io.*;

import javax.imageio.IIOException;

public class contador {
    private static File arxiuEntrada = new File("AEA4/ExceptionsExercicis/ContadorParaules/entrada.txt");
    private static File arxiuSortida = new File("AEA4/ExceptionsExercicis/ContadorParaules/sortida.txt");

    public static void main(String[]args) {
        try {
            if (!arxiuEntrada.exists()) {
                throw new IOException("L'arxiu d'entrada no existeix.");
            }

            if (!arxiuEntrada.canRead()) {
                throw new IIOException("L'arxiu d'entrada no es pot llegir.");
            }

            int totalParaules = comptadorParaules();
            escriureNombre(totalParaules);

            System.out.println("Process completat amb exit!.");

        }
        catch(IOException e) {
            System.err.println("Error : " +e.getMessage());
        }
    }

    // Metode per comptar les paraules
    private static int comptadorParaules() throws IOException {
        int comptador = 0;

        try(BufferedReader reader = new BufferedReader(new FileReader(arxiuEntrada))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                // Divideixo la linea en paraules utilitzant espais i altres delimitadors
                String[] paraules = linea.trim().split("\\s+");

                //Nomes contem si la linea no esta buida
                if(!linea.trim().isEmpty()) {
                    comptador += paraules.length;
                }
            }
        }

        return comptador;
    }

    // Metode per escriure el total de paraules comptades
    private static void escriureNombre(int a) throws IOException {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(arxiuSortida))) {
            writer.write("El teu arxiu te " +a +" paraules");
        }
    }
}
