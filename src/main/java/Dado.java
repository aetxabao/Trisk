/**
 * Clase Dado que representa un dado de 6 caras.
 * Hay que tirar el dado para obtener un valor aleatorio entre 1 y 6.
 * Este valor se consulta con el método getValor().
 * @author TODO: AQUÍ_TU_NOMBRE
 */
public class Dado {

    // region Atributos
    // TODO: 11 Atributos la clase Dado.
    /** Valor del dado */
    private int valor;
    // endregion

    /**
     * Constructor de la clase Dado.
     * Inicializa el valor del dado a un valor aleatorio del 1 al 6.
     */
    public Dado() {
        // TODO: 12 Constructor la clase Dado.
        this.valor = (int) (Math.random() * 6) + 1;
    }

    /**
     * Devuelve el valor del dado.
     * @return Valor del dado.
     */
    public int getValor() {
        // TODO: 13 getValor de la clase Dado.
        return this.valor;
    }

    /**
     * Tira el dado para obtener un valor aleatorio entre 1 y 6.
     */
    public void tirar() {
        // TODO: 14 tirar de la clase Dado.
        this.valor = (int) (Math.random() * 6) + 1;
    }

}
