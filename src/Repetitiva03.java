import java.util.Scanner;

public class Repetitiva03 {
    public static void main(String[] args) {
        /*TODO:Calcular la potencia de un número ingresado por teclado, elevado al exponente ingresado por teclado.
           Imprimir el resultado en pantalla.*/

        Scanner scanner = new Scanner(System.in);
        double resultado = 1;
        int contador = 1;
        System.out.print("Ingrese el número base: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese el exponente: ");
        int exponente = scanner.nextInt();

        if (base == 0 && exponente == 0) {
            System.out.println("Indeterminado");
        } else {
            while (contador <= exponente) {
                resultado = resultado * base;
                contador++;
            }
            System.out.println("El resultado de elevar " + base + " al exponente " + exponente + " es:" + resultado);
        }


    }
}
