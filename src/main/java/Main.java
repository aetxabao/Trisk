/**
 * Clase principal del programa.
 */
public class Main {

    /**
     * Método principal del programa.
     * Crea una instancia de la demo del juego con los jugadores A, B y C y 10 vidas cada uno.
     * Luego, ejecuta el método jugar() de la instancia para simular acciones del juego.
     * @param args Argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        DemoJuego juego = new DemoJuego('A', 'B', 'C', 10);
        juego.jugar();
    }

}
