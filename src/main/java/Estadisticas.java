/**
 * Clase que almacena las estadísticas de un jugador.
 * @author TODO: AQUÍ_TU_NOMBRE
 */
public class Estadisticas {

    // region Atributos
    // TODO: 31 Atributos de la clase Estadisticas.
    /** Cantidad de ataques realizados por el jugador. */
    private int cntAtaques;
    /** Cantidad de defensas realizadas por el jugador. */
    private int cntDefensas;
    /** Cantidad de desplazamientos realizados por el jugador. */
    private int cntDesplazamientos;
    /** Suma de los puntos máximos de defensa obtenidos por el jugador. */
    private int sumaPuntosMaxDefensa;
    /** Suma de la media de los puntos de ataque obtenidos por el jugador. */
    private double sumaPuntosMedAtaque;
    // endregion

    // region registros
    // TODO: 32 Registros de la clase Estadisticas.
    /** Incrementa el contador de ataques. */
    public void registrarAtaque() {
        cntAtaques++;
    }
    /** Incrementa el contador de defensas. */
    public void registrarDefensa() {
        cntDefensas++;
    }
    /** Incrementa el contador de desplazamientos. */
    public void registrarDesplazamiento() {
        cntDesplazamientos++;
    }
    // endregion

    // region sumas
    // TODO: 33 Sumas de la clase Estadisticas.
    /** Incrementa la suma de los puntos máximos de defensa obtenidos por el jugador. */
    public void sumaPuntosMaxDefensa(int puntos) {
        sumaPuntosMaxDefensa += puntos;
    }

    /** Incrementa la suma de la media de los puntos de ataque obtenidos por el jugador. */
    public void sumaPuntosMedAtaque(double puntos) {
        sumaPuntosMedAtaque += puntos;
    }
    // endregion


    // region medias
    // TODO: 34 Medias de la clase Estadisticas.
    /**
     * Devuelve la media de los puntos máximos de defensa obtenidos por el jugador
     * considerando la cantidad de defensas realizadas.
     */
    public double getMediaPuntosMaxDefensa() {
        return twoDecimals(1.0 * sumaPuntosMaxDefensa / cntDefensas);
    }

    /**
     * Devuelve la media de los puntos de ataque obtenidos por el jugador
     * considerando la cantidad de ataques realizados.
     */
    public double getMediaPuntosMedAtaque() {
        return twoDecimals(sumaPuntosMedAtaque / cntAtaques);
    }
    // endregion

    /** Devuelve el valor con hasta sólo dos decimales. */
    private double twoDecimals(double value) {
        // TODO: 35 twoDecimals de la clase Estadisticas.
        return (int)(value * 100) / 100.0;
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
