package Ranking;

public class Jugador {
    private String nomJugador;
    private int puntuacion;

    public Jugador(String nomJugador, int puntuacion) {
        this.nomJugador = nomJugador;
        this.puntuacion = puntuacion;
    }

    public String getNomJugador() {
        return nomJugador;
    }

    public void setNomJugador(String nomJugador) {
        this.nomJugador = nomJugador;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
}
