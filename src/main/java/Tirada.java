/**
 * Clase que representa una tirada de dados.
 * La tirada se construye con un número de dados de 2 a 3
 * cuyos valores se ordenan de mayor a menor.
 * Cuando se consulta un dado el índice 1 corresponde al mayor valor.
 * La media de los valores dependerá del número de dados
 * Cuando una tirada se compara con otra se considera que
 * la otra tirada solo compite con dos valores,
 * se comparan los dos valores mayores de cada tirada,
 * uno a uno, el mayor valor de la tirada con el mayor valor de la otra,
 * y el segundo mayor valor de la tirada con el segundo mayor valor de la otra.
 * Si el valor de la otra tirada es mayor o igual se considera que la tirada ha perdido.
 * Puede perder 0, 1 o 2 veces dependiendo de
 * si los dos valores de la tirada son mayores que los de la otra tirada.
 * @author TODO: AQUÍ_TU_NOMBRE
 */
public class Tirada {

    // region Atributos
    // TODO: 21 Atributos de la clase Tirada.

    // endregion

    /**
     * Construye una tirada de dos o tres dados cuyos valores se ordenan de mayor a menor.
     * @param numDados Número de dados de la tirada.
     */
    public Tirada(int numDados) {
        // TODO: 22 Constructor de la clase Tirada.

        ordenarValores();
    }

    /**
     * Ordena los valores de mayor a menor.
     */
    private void ordenarValores() {
        // TODO: 23 ordenarValores de la clase Tirada.

    }

    /**
     * Devuelve el valor de un dado de la tirada.
     * @param indice Índice del dado. 1 para el mayor, 2 para el segundo mayor y 3 para el menor.
     * @return Valor del dado.
     */
    public int getValor(int indice) {
        // TODO: 24 getValor de la clase Tirada.

        return 0;
    }

    /**
     * Devuelve el valor máximo de la tirada.
     * @return Valor máximo.
     */
    public int getValorMaximo() {
        // TODO: 25 getValorMaximo de la clase Tirada.

        return 0;
    }

    /**
     * Devuelve el valor medio de la tirada, considerando el número de dados.
     * @return Valor medio.
     */
    public double getValorMedio() {
        // TODO: 26 getValorMedio de la clase Tirada.

        return 0;
    }

    /**
     * Devuelve el número de dados que pierden frente a los dados de otra tirada.
     * Se comparan los dos valores mayores de cada tirada, uno contra el otro, uno a uno.
     * Si el valor de la otra tirada es mayor o igual se considera que la tirada ha perdido.
     * @return Número de veces que pierden los dados de la tirada frente a los de la otra tirada: 0, 1 o 2.
     */
    public int perdidas(Tirada otra) {

        return 0;
    }

}
