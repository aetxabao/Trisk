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
    /** Primer valor que será el mayor. */
    private int valor1;
    /** Segundo valor que será el siguiente mayor. */
    private int valor2;
    /** Tercer valor que será el menor o cero si la tirada se realiza con dos dados. */
    private int valor3;
    /** Número de dados de la tirada. Sólo se considera como valores posibles dos o tres. */
    private int numDados;
    // endregion

    /**
     * Construye una tirada de dos o tres dados cuyos valores se ordenan de mayor a menor.
     * @param numDados Número de dados de la tirada.
     */
    public Tirada(int numDados) {
        // TODO: 22 Constructor de la clase Tirada.
        this.numDados = numDados;
        Dado dado = new Dado();
        if (numDados >= 1) {
            dado.tirar();
            valor1 = dado.getValor();
        }
        if (numDados >= 2) {
            dado.tirar();
            valor2 = dado.getValor();
        }
        if (numDados == 3) {
            dado.tirar();
            valor3 = dado.getValor();
        }
        ordenarValores();
    }

    /**
     * Ordena los valores de mayor a menor.
     */
    private void ordenarValores() {
        // TODO: 23 ordenarValores de la clase Tirada.
        if (valor1 < valor2) {
            int aux = valor1;
            valor1 = valor2;
            valor2 = aux;
        }
        if (valor2 < valor3) {
            int aux = valor2;
            valor2 = valor3;
            valor3 = aux;
        }
        if (valor1 < valor2) {
            int aux = valor1;
            valor1 = valor2;
            valor2 = aux;
        }
    }

    /**
     * Devuelve el valor de un dado de la tirada.
     * @param indice Índice del dado. 1 para el mayor, 2 para el segundo mayor y 3 para el menor.
     * @return Valor del dado.
     */
    public int getValor(int indice) {
        // TODO: 24 getValor de la clase Tirada.
        if (indice == 1) {
            return valor1;
        } else if (indice == 2) {
            return valor2;
        } else {
            return valor3;
        }
    }

    /**
     * Devuelve el valor máximo de la tirada.
     * @return Valor máximo.
     */
    public int getValorMaximo() {
        // TODO: 25 getValorMaximo de la clase Tirada.
        return valor1;
    }

    /**
     * Devuelve el valor medio de la tirada, considerando el número de dados.
     * @return Valor medio.
     */
    public double getValorMedio() {
        // TODO: 26 getValorMedio de la clase Tirada.
        if (numDados == 1) {
            return valor1;
        } else if (numDados == 2) {
            return (valor1 + valor2) / 2.0;
        } else {
            return (valor1 + valor2 + valor3) / 3.0;
        }
    }

    /**
     * Devuelve el número de dados que pierden frente a los dados de otra tirada.
     * Se comparan los dos valores mayores de cada tirada, uno contra el otro, uno a uno.
     * Si el valor de la otra tirada es mayor o igual se considera que la tirada ha perdido.
     * @return Número de veces que pierden los dados de la tirada frente a los de la otra tirada: 0, 1 o 2.
     */
    public int perdidas(Tirada otra) {
        // TODO: 27 perdidas de la clase Tirada.
        int perdidas = 0;
        if (valor1 <= otra.getValor(1)) {
            perdidas++;
        }
        if (valor2 <= otra.getValor(2)) {
            perdidas++;
        }
        return perdidas;
    }

}
