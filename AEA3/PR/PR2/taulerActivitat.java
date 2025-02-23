package AEA3.PR.PR2;


public class taulerActivitat {
    private char[][] tauler;
    
    public taulerActivitat(int mida) {
        tauler = new char[mida][mida];
        for(int i = 0; i < tauler.length; i++) {
            for(int j = 0; j < tauler[i].length; j++) {
                tauler[i][j] = '-';
            }
        }
    }
    
    public void mostrarTauler() {
        for(int i = 0; i < tauler.length; i++) {
            for(int j = 0; j < tauler[i].length; j++) {
                System.out.print(tauler[i][j]);
            }
            System.out.println();
        }
    }

    public void marcarCasella(int fila , int columna, char jugador) {
       if (fila >= 0 && fila < tauler.length && columna >= 0 && columna < tauler.length) {
           if(tauler[fila][columna] == '-') {
              tauler[fila][columna] = jugador;
            }
       }
    }

    public char mostrarCasella(int fila, int columna) {

        return tauler[fila][columna];
    }

    public boolean comprobarValid(int fila, int columna) {
        if (fila < 0 || fila >= tauler.length || columna < 0 || columna >= tauler.length) {
            System.out.println("Posicio fora dels limits");
            return false;
        }

        if (mostrarCasella(fila, columna) != '-') {
            System.out.println("La casella esta ocupada");
            System.out.println();
            return false;
        }

        return true;
    }

    public boolean comprobarGuanyador(char jugador) {
      for (int i = 0; i < tauler.length; i++) {
            boolean filaCompleta = true;
            for (int j = 0; j < tauler[i].length; j++) {
                if (tauler[i][j] != jugador) {
                    filaCompleta = false;
                }

            }

            if (filaCompleta) {
                return true;
            }
        }

        for (int j = 0; j < tauler.length; j++) {
            boolean columnaCompleta = true;
            for (int i = 0; i < tauler.length; i++) {
                if (tauler[i][j] != jugador) {
                    columnaCompleta = false;
                }
            }

            if (columnaCompleta) {
                return true;
            }
        }

        boolean diagonal1 = true;
        for (int i = 0; i < tauler.length; i++) {
            if (tauler[i][i] != jugador) {
                diagonal1 = false;
            }
        }

        if (diagonal1) {
            return true;
        }

        boolean diagonal2 = true;
        for (int i = 0; i < tauler.length; i++) {
            int j = tauler.length - 1 - i;
            if (tauler[i][j] != jugador) {
                diagonal2 = false;
            }
        }

        if (diagonal2) {
            return true;
        }

        return false;
    }

    public boolean comprobarTaulerPle() {
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler[i].length; j++) {
                if(tauler[i][j] == '-') {
                    return false;
                } 
            }
        }
        return true;
    }
}
