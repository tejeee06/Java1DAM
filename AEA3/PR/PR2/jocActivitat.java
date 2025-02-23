package AEA3.PR.PR2;

import AEA3.recursos.lectorDades;

public class jocActivitat {
    private lectorDades lector;
    private taulerActivitat tauler;
    private char jugador;
    private boolean partida;
    private int fila;
    private int columna;
    private boolean jugadorOK = false;

    public jocActivitat() {
        this.lector = new lectorDades();
        int fic = lector.llegirInt("Introdueix la mida del tauler");
        this.tauler = new taulerActivitat(fic);

        while(!jugadorOK) {
           char temp = lector.llegirChar("Introdueix quin jugador vol començar (x o) : ");

           if (temp == 'x' || temp == 'o') {
                this.jugador = temp;
                jugadorOK = true;
           }
           else {
                System.out.println("Error has d'introduir (x o)");
                System.out.println();
           }
        }

        this.partida = true;
    }

    public void iniciarJoc() {
        System.out.println("Tic Tac Toe");
        System.out.println();
        while (partida) {
            tauler.mostrarTauler();
            boolean jugadaValida = false;

            while (!jugadaValida) {
                fila = lector.llegirInt("Introdueix la fila : ");
                columna = lector.llegirInt("Introdueix la columna : ");

                if (tauler.comprobarValid(fila, columna)) {
                    jugadaValida = true;
                }
                else {
                    System.out.println("Torna a provar ");
                    System.out.println();
                    tauler.mostrarTauler();
                    System.out.println();
                }
            }

            tauler.marcarCasella(fila, columna, jugador);

           if (tauler.comprobarGuanyador(jugador)) {
                System.out.println("Guanyador jugador " +jugador);
                tauler.mostrarTauler();
                partida = false;
                continue;
           }
           
           if (tauler.comprobarTaulerPle()) {
                System.out.println("Empat");
                tauler.mostrarTauler();
                partida = false;
                continue;
           }

           canviarTorn(jugador);
        }
    }

    public void canviarTorn(char jugador) {
        this.jugador = (this.jugador == 'x') ? 'o' : 'x';
    }

}
