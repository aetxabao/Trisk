/**
 * Clase que representa el mapa de juego que consta de 9 celdas
 * organizadas en 3 filas y 3 columnas.
 * @author TODO: AQUÍ_TU_NOMBRE
 */
public class Mapa {

    // region Atributos
    public Celda celda11, celda12, celda13;
    public Celda celda21, celda22, celda23;
    public Celda celda31, celda32, celda33;
    // endregion

    /**
     * Constructor de la clase Mapa.
     * Instancia las celdas y fija las celdas vecinas.
     */
    public Mapa() {
        instanciarCeldas();
        setVecinos();
    }

    /**
     * Instancia todas las celdas.
     */
    private void instanciarCeldas() {
        celda11 = new Celda();
        celda12 = new Celda();
        celda13 = new Celda();
        celda21 = new Celda();
        celda22 = new Celda();
        celda23 = new Celda();
        celda31 = new Celda();
        celda32 = new Celda();
        celda33 = new Celda();
    }

    /**
     * Fija cuáles son las celdas vecinas de cada una de las celdas.
     */
    private void setVecinos() {
        setCeldasVecinas(celda11, null, celda12, celda21, null);
        setCeldasVecinas(celda12, null, celda13, celda22, celda11);
        setCeldasVecinas(celda13, null, null, celda23, celda12);

        setCeldasVecinas(celda21, celda11, celda22, celda31, null);
        setCeldasVecinas(celda22, celda12, celda23, celda32, celda21);
        setCeldasVecinas(celda23, celda13, null, celda33, celda22);

        setCeldasVecinas(celda31, celda21, celda32, null, null);
        setCeldasVecinas(celda32, celda22, celda33, null, celda31);
        setCeldasVecinas(celda33, celda23, null, null, celda32);
    }

    /**
     * Fija las celdas vecinas de una celda.
     * @param celda Celda a la que se le van a fijar las celdas vecinas.
     * @param vecino1 Celda vecina al norte.
     * @param vecino2 Celda vecina al este.
     * @param vecino3 Celda vecina al sur.
     * @param vecino4 Celda vecina al oeste.
     */
    private void setCeldasVecinas(Celda celda, Celda vecino1, Celda vecino2, Celda vecino3, Celda vecino4) {
        celda.setVecino(1, vecino1);
        celda.setVecino(2, vecino2);
        celda.setVecino(3, vecino3);
        celda.setVecino(4, vecino4);
    }

    /**
     * Fija el jugador en la celda indicada y al jugador le indica la celda en la que está.
     * La referencia es doble, el jugador debe tener una referencia a la celda y la celda una referencia al jugador.
     * Utiliza el método getNumCelda para obtener un valor del 1 al 9
     * en base al valor de la fila y la columna cuyos valores van del 1 al 3.
     * @param fila Fila del 1 al 3.
     * @param columna Columna del 1 al 3.
     * @param jugador Referencia del jugador que se va a fijar en la celda.
     */
    public void setJugador(int fila, int columna, Jugador jugador) {
        // TODO: 61 setJugador de la clase Mapa.

    }

    /**
     * Devuelve el número de celda correspondiente a la fila y columna indicadas del 1 al 9
     * @param fila Fila del 1 al 3.
     * @param columna Columna del 1 al 3.
     * @return Número de celda del 1 al 9.
     */
    private int getNumCelda(int fila, int columna) {
        return (fila - 1) * 3 + columna;
    }

    /**
     * Pinta el mapa de 3x3 con la representación de cada celda.
     */
    public void pintar() {
        System.out.println("    1     2     3");
        System.out.println(" +-----+-----+-----+");
        System.out.println("1| " + celda11 + " | " + celda12 + " | " + celda13 + " |");
        System.out.println(" +-----+-----+-----+");
        System.out.println("2| " + celda21 + " | " + celda22 + " | " + celda23 + " |");
        System.out.println(" +-----+-----+-----+");
        System.out.println("3| " + celda31 + " | " + celda32 + " | " + celda33 + " |");
        System.out.println(" +-----+-----+-----+");
    }

}
