/**
 * Clase que almacena las estadísticas de un jugador.
 * @author TODO: AQUÍ_TU_NOMBRE
 */
public class Estadisticas {

    // region Atributos
    // TODO: 31 Atributos de la clase Estadisticas.

    // endregion

    // region registros
    // TODO: 32 Registros de la clase Estadisticas.
    /** Incrementa el contador de ataques. */
    public void registrarAtaque() {


    }
    /** Incrementa el contador de defensas. */
    public void registrarDefensa() {


    }
    /** Incrementa el contador de desplazamientos. */
    public void registrarDesplazamiento() {


    }
    // endregion

    // region sumas
    // TODO: 33 Sumas de la clase Estadisticas.
    /** Incrementa la suma de los puntos máximos de defensa obtenidos por el jugador. */
    public void sumaPuntosMaxDefensa(int puntos) {


    }

    /** Incrementa la suma de la media de los puntos de ataque obtenidos por el jugador. */
    public void sumaPuntosMedAtaque(double puntos) {


    }
    // endregion


    // region medias
    // TODO: 34 Medias de la clase Estadisticas.
    /**
     * Devuelve la media de los puntos máximos de defensa obtenidos por el jugador
     * considerando la cantidad de defensas realizadas.
     */
    public double getMediaPuntosMaxDefensa() {

        return 0;
    }

    /**
     * Devuelve la media de los puntos de ataque obtenidos por el jugador
     * considerando la cantidad de ataques realizados.
     */
    public double getMediaPuntosMedAtaque() {

        return 0;
    }
    // endregion

    /** Devuelve el valor con hasta sólo dos decimales. */
    private double twoDecimals(double value) {
        // TODO: 35 twoDecimals de la clase Estadisticas.

        return 0;
    }

    /**
     * Muestra por pantalla las estadísticas del jugador.
     */
    public void pintar() {
        System.out.println("\tAtaques: " + cntAtaques);
        System.out.println("\tDefensas: " + cntDefensas);
        System.out.println("\tDesplazamientos: " + cntDesplazamientos);
        System.out.println("\tMedia puntos máx defensa: " + getMediaPuntosMaxDefensa());
        System.out.println("\tMedia puntos ataque: " + getMediaPuntosMedAtaque());
    }

}
