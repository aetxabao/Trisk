/**
 * Clase DemoJuego.
 * Sirve para simular un juego con tres jugadores en un mapa de 3x3.
 * Fija los jugadores en el mapa y simula acciones de los jugadores.
 * Al finalizar, muestra las estadísticas de los jugadores.
 */
public class DemoJuego {

    /** Jugador 1 */
    private Jugador jugador1;
    /** Jugador 2 */
    private Jugador jugador2;
    /** Jugador 3 */
    private Jugador jugador3;

    /** Mapa del juego */
    private Mapa mapa;


    /**
     * Constructor de la clase DemoJuego.
     * Inicializa los jugadores y el mapa y fija los jugadores en el mapa.
     * @param simboloJugador1 Símbolo del jugador 1.
     * @param simboloJugador2 Símbolo del jugador 2.
     * @param simboloJugador3 Símbolo del jugador 3.
     * @param vida Cantidad de vidas inicial de los jugadores.
     */
    public DemoJuego(char simboloJugador1, char simboloJugador2, char simboloJugador3, int vida) {
        jugador1 = new Jugador(simboloJugador1, vida);
        jugador2 = new Jugador(simboloJugador2, vida);
        jugador3 = new Jugador(simboloJugador3, vida);

        mapa = new Mapa();

        setJugadoresEnMapa();
    }

    /**
     * Fija los jugadores en el mapa.
     */
    private void setJugadoresEnMapa() {
        mapa.setJugador(3, 1, jugador1);
        mapa.setJugador(1, 2, jugador2);
        mapa.setJugador(3, 3, jugador3);
    }

    /**
     * Simula acciones de los jugadores.
     * Muestra el mapa al inicio y al final y 5 rondas de juego.
     * Al finalizar, muestra las estadísticas de los jugadores.
     */
    public void jugar() {
        // inicio
        System.out.println("Inicio");
        mapa.pintar();
        // ronda 1
        System.out.println("Ronda 1: Avanza al 1 jugador1");
        jugador1.avanzar(1);
        mapa.pintar();
        System.out.println("Ronda 1: Avanza al 3 jugador2");
        jugador2.avanzar(3);
        mapa.pintar();
        System.out.println("Ronda 1: Avanza al 1 jugador3");
        jugador3.avanzar(1);
        mapa.pintar();
        System.out.println("*".repeat(20));
        // ronda 2
        System.out.println("Ronda 2: Ataca jugador1 a jugador2");
        jugador1.atacar(2);
        mapa.pintar();
        System.out.println("Ronda 2: Ataca jugador2 a jugador1");
        jugador2.atacar(4);
        mapa.pintar();
        System.out.println("Ronda 2: Ataca jugador3 a jugador2");
        jugador3.atacar(4);
        mapa.pintar();
        System.out.println("*".repeat(20));
        // ronda 3
        System.out.println("Ronda 3: Ataca jugador1 a jugador2");
        jugador1.atacar(2);
        mapa.pintar();
        System.out.println("Ronda 3: Ataca jugador2 a jugador3");
        jugador2.atacar(2);
        mapa.pintar();
        System.out.println("Ronda 3: Ataca jugador3 a jugador2");
        jugador3.atacar(4);
        mapa.pintar();
        System.out.println("*".repeat(20));
        // ronda 4
        System.out.println("Ronda 4: Ataca jugador1 a jugador2");
        jugador1.atacar(2);
        mapa.pintar();
        System.out.println("Ronda 4: Avanza al 3 jugador2");
        jugador2.avanzar(3);
        mapa.pintar();
        System.out.println("Ronda 4: Avanza al 4 jugador3");
        jugador3.avanzar(4);
        mapa.pintar();
        System.out.println("*".repeat(20));
        // ronda 5
        System.out.println("Ronda 5: Ataca jugador1 a jugador3");
        jugador1.atacar(2);
        mapa.pintar();
        System.out.println("Ronda 5: Avanza al 2 jugador2");
        jugador2.avanzar(2);
        mapa.pintar();
        System.out.println("Ronda 5: Ataca jugador3 a jugador1");
        jugador3.atacar(4);
        mapa.pintar();
        System.out.println("*".repeat(20));
        // fin
        pintarEstadisticas();
    }

    /**
     * Muestra las estadísticas de los jugadores.
     */
    public void pintarEstadisticas() {
        System.out.println("Estadísticas del jugador1:");
        jugador1.getEstadisticas().pintar();
        System.out.println("Estadísticas del jugador2:");
        jugador2.getEstadisticas().pintar();
        System.out.println("Estadísticas del jugador3:");
        jugador3.getEstadisticas().pintar();
    }

}
