public class Repetitiva01 {
    public static void main(String[] args) {
        /*TODO: Realizar un programa que calcule la sumatoria de los 10 primeros números naturales.
           Usar while y acumulador.*/

        int suma = 0;
        int contador = 1;
        while (contador <= 10) {
            suma = suma + contador;
            contador++;
        }
        System.out.println("La suma de los 10 primeros numero es: " + suma);
    }
}
