/**
 * Clase que representa a un jugador.
 * Los jugadores se representan con un símbolo y tienen una cantidad de vidas,
 * se ubican en una celda y tienen estadísticas.
 * @author TODO: AQUÍ_TU_NOMBRE
 */
public class Jugador {

    // region Atributos
    // TODO: 41 Atributos de la clase Jugador.
    /** Símbolo que representa al jugador en el tablero. */
    private char simbolo;
    /** Cantidad de vidas del jugador. */
    private int vida;
    /** Celda en la que se encuentra el jugador. */
    private Celda celda;
    /** Estadísticas del jugador. */
    private Estadisticas estadisticas;
    // endregion

    /**
     * Constructor de la clase Jugador.
     * @param simbolo Símbolo que representa al jugador en el tablero.
     * @param vida Cantidad de vidas inicial del jugador.
     */
    public Jugador(char simbolo, int vida) {
        // TODO: 42 Constructor de la clase Jugador.
        this.simbolo = simbolo;
        this.vida = vida;
        this.celda = null;
        this.estadisticas = new Estadisticas();
    }

    // region Getters y setters
    public char getSimbolo() {
        return simbolo;
    }

    public int getVida() {
        return vida;
    }

    public Estadisticas getEstadisticas() {
        return estadisticas;
    }

    public Celda getCelda() {
        return celda;
    }

    public void setCelda(Celda celda) {
        this.celda = celda;
    }
    // endregion

    /**
     * Método que resta vidas al jugador.
     * @param cuantas Cantidad de vidas a restar.
     */
    public void descontarVidas(int cuantas) {
        // TODO: 43 descontarVidas de la clase Jugador.
        vida -= cuantas;
    }

    /**
     * Método que mueve al jugador en la dirección indicada.
     * Si la celda no existe o ya hay un jugador en ella, el jugador no se mueve.
     * Si se mueve el jugador, la celda en la que estaba el jugador ya no lo referenciará pero
     * sí la celda a la que se mueve. La referencia a la celda del jugador se actualiza.
     * Se registran las estadísticas de desplazamiento del jugador.
     * @param orientacion Dirección en la que mover al jugador.
     * @return true si el jugador se pudo mover, false en caso contrario.
     */
    public boolean avanzar(int orientacion) {
        // TODO: 44 avanzar de la clase Jugador.
        if (celda.hayJugador(orientacion)) {
            return false;
        }
        Celda vecino = celda.getVecino(orientacion);
        if (vecino == null) {
            return false;
        }
        celda.setJugador(null);
        vecino.setJugador(this);
        celda = vecino;
        estadisticas.registrarDesplazamiento();
        return true;
    }

    /**
     * Método que ataca a un jugador en la dirección indicada.
     * Si no hay un jugador en la dirección indicada, el jugador no ataca.
     * Se realiza una tirada de tres dados para el jugador y una tirada de dos dados para el vecino atacado.
     * Se calculan las pérdidas de cada jugador y se restan las vidas correspondientes.
     * La suma de las pérdidas de ambos jugadores es 2.
     * Se registran las estadísticas de ataque y defensa de ambos jugadores respectivamente:
     * número de ataques y defensas, y suma de la media de puntos de ataque y del valor máximo de defensa.
     * @param orientacion Dirección en la que atacar.
     * @return true si el jugador pudo atacar, false en caso contrario.
     */
    public boolean atacar(int orientacion) {
        // TODO: 45 atacar de la clase Jugador.
        if (!celda.hayJugador(orientacion)) {
            return false;
        }
        Celda vecino = celda.getVecino(orientacion);
        if (vecino == null) {
            return false;
        }
        Jugador jugadorVecino = vecino.getJugador();

        Tirada tiradaJugador = new Tirada(3);
        Tirada tiradaVecino = new Tirada(2);

        int perdidasJugador = tiradaJugador.perdidas(tiradaVecino);
        int perdidasVecino = 2 - perdidasJugador;

        this.descontarVidas(perdidasJugador);
        jugadorVecino.descontarVidas(perdidasVecino);

        estadisticas.registrarAtaque();
        estadisticas.sumaPuntosMedAtaque(tiradaJugador.getValorMedio());

        jugadorVecino.getEstadisticas().registrarDefensa();
        jugadorVecino.getEstadisticas().sumaPuntosMaxDefensa(tiradaVecino.getValorMaximo());

        return true;
    }

}
