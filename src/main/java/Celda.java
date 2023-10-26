/**
 * Clase que representa una celda del mapa de juego.
 * Una celda puede tener hasta cuatro celdas vecinas, una en cada punto cardinal.
 * El 1 se corresponde con el norte, el 2 con el este, el 3 con el sur y el 4 con el oeste,
 * según el sentido de las agujas del reloj.
 * En una celda puede haber un jugador o no.
 * @author TODO: AQUÍ_TU_NOMBRE
 */
public class Celda {

    // region Constantes
    // TODO: 51 Constantes de la clase Celda.
    private final int NORTE = 1;
    private final int ESTE = 2;
    private final int SUR = 3;
    private final int OESTE = 4;
    // endregion

    // region Atributos
    // TODO: 52 Atributos de la clase Celda.
    /** Celda vecina al norte. */
    private Celda vecino1;
    /** Celda vecina al este. */
    private Celda vecino2;
    /** Celda vecina al sur. */
    private Celda vecino3;
    /** Celda vecina al oeste. */
    private Celda vecino4;
    /** Jugador que se encuentra en la celda o null si no hay ninguno. */
    private Jugador jugador;
    // endregion


    // region Getters y setters
    // TODO: 53 setJugador y getJugador de la clase Celda.
    /** Método que fija el jugador en la celda. */
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    /** Método que devuelve el jugador que está en la celda. */
    public Jugador getJugador() {
        return jugador;
    }

    /**
     * Método que fija en la orientacion indicada la celda vecina correspondiente.
     * @param orientacion Orientación de la celda vecina correspondiente a los puntos cardinales.
     * @param vecino Celda vecina que se va a fijar en la orientación indicada.
     */
    public void setVecino(int orientacion, Celda vecino) {
        // TODO: 54 setVecino de la clase Celda.
        switch (orientacion){
            case NORTE:
                vecino1 = vecino;
                break;
            case ESTE:
                vecino2 = vecino;
                break;
            case SUR:
                vecino3 = vecino;
                break;
            case OESTE:
                vecino4 = vecino;
                break;
        }
    }

    /**
     * Método que devuelve la celda vecina correspondiente a la orientación indicada.
     * @param orientacion Orientación de la celda vecina correspondiente a los puntos cardinales.
     * @return Celda vecina correspondiente a la orientación indicada o null si no existe.
     */
    public Celda getVecino(int orientacion) {
        // TODO: 55 getVecino de la clase Celda.
        switch (orientacion){
            case NORTE:
                return vecino1;
            case ESTE:
                return vecino2;
            case SUR:
                return vecino3;
            case OESTE:
                return vecino4;
        }
        return null;
    }

    // endregion

    /**
     * Método que comprueba si existe celda vecina en la orientación indicada.
     * @param orientacion Orientación de la celda vecina correspondiente a los puntos cardinales.
     * @return true si existe celda vecina en la orientación indicada, false en caso contrario.
     */
    public boolean existeVecino(int orientacion) {
        // TODO: 56 existeVecino de la clase Celda.
        return getVecino(orientacion) != null;
    }

    /**
     * Método que comprueba si hay un jugador en la celda.
     * @return true si hay un jugador en la celda, false en caso contrario.
     */
    public boolean hayJugador() {
        // TODO: 57 hayJugador 1 de la clase Celda.
        return jugador != null;
    }

    /**
     * Método que comprueba si hay un jugador en la celda vecina correspondiente a la orientación indicada.
     * @param orientacion Orientación de la celda vecina correspondiente a los puntos cardinales.
     * @return true si hay un jugador en la celda vecina, false en caso contrario.
     */
    public boolean hayJugador(int orientacion) {
        // TODO: 58 hayJugador 2 de la clase Celda.
        Celda vecino = getVecino(orientacion);
        if (vecino != null) {
            return vecino.hayJugador();
        }
        return false;
    }

    /**
     * Método que devuelve la representación textual de la celda.
     * Si no hay jugador en la celda devuelve tres espacios en blanco: "   "
     * Si hay jugador en la celda devuelve el símbolo del jugador y su vida en tres caracteres.
     * Por ejemplo, si tiene 10 vidas y su símbolo es la X: "X10"
     * Por ejemplo, si tiene 9 vidas y su símbolo es la X: " X9"
     * La representación textual siempre ocupa tres caracteres.
     * @return Representación textual de la celda ej. "   ", " X0", " X1", " X2", ..., "X10", "X11", "X12", ...
     */
    public String toString() {
        // TODO: 59 toString de la clase Celda.
        if (jugador == null) {
            return "   ";
        }
        if (jugador.getVida() < 10) {
            return " " + jugador.getSimbolo() + jugador.getVida();
        }
        return "" + jugador.getSimbolo() + jugador.getVida();
    }

}
