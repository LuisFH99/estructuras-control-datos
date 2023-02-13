public class Repetitiva02 {
    public static void main(String[] args) {
        /*TODO:  Calcular el factorial del número 5. Usar while, acumulador (para producto).*/

        int factorial = 1;
        int contador = 1;
        while (contador <= 5) {
            factorial = factorial * contador;
            contador++;
        }
        System.out.println("El factorial de 5 es: " + factorial);
    }
}
