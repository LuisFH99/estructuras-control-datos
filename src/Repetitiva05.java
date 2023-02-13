import java.util.Scanner;

public class Repetitiva05 {
    public static void main(String[] args) {
        /*TODO: Desarrollar un programa que permita la carga de 10 valores por teclado y nos muestre
           posteriormente la suma de los valores ingresados y su promedio.Usar for*/

        Scanner scanner = new Scanner(System.in);
        double numero;
        double suma = 0;
        System.out.println("Ingresar 10 numeros");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el " + i + "° numero:");
            numero = scanner.nextDouble();
            suma = suma + numero;
        }
        System.out.println("La suma de los números es : " + suma + " y su promedio es: " + (suma / 10));
    }
}
