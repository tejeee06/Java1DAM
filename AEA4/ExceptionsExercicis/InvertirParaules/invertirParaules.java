package AEA4.ExceptionsExercicis.InvertirParaules;

import java.io.*;

public class invertirParaules {
    private static File arxiuEntrada = new File("AEA4/ExceptionsExercicis/InvertirParaules/entrada.txt");
    private static File arxiuSortida = new File("AEA4/ExceptionsExercicis/InvertirParaules/sortida.txt");

    public static void main(String[] args) {
        try {
            if (!arxiuEntrada.exists()) {
                throw new IOException("L'arxiu d'entrada no existeix.");
            }

            if (!arxiuEntrada.canRead()) {
                throw new IOException("L'arxiu d'entrada no es llegible");
            }

            processarArxiu();
            System.out.println("Process completat amb exit!");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static void processarArxiu() throws IOException {
        StringBuilder contingutInvertit = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(arxiuEntrada))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String lineaInvertida = invertirLinea(linea);
                contingutInvertit.append(lineaInvertida).append(System.lineSeparator());
            }
        }

        escriureContingut(contingutInvertit.toString());
    }

    private static String invertirLinea(String linea) {
        if (linea.trim().isEmpty()) {
            return "";
        }

        String[] paraules = linea.trim().split("\\s+");
        StringBuilder lineaInvertida = new StringBuilder();

        for (int i = paraules.length - 1; i >= 0; i--) {
            // Invertir els caracters de cada paraula
            String paraulaInvertida = new StringBuilder(paraules[i]).reverse().toString();
            lineaInvertida.append(paraulaInvertida);

            if (i > 0) {
                lineaInvertida.append(" ");
            }
        }

        return lineaInvertida.toString();
    }

    private static void escriureContingut(String contingut) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arxiuSortida))) {
            writer.write(contingut);
        }
    }
}
