import java.util.Scanner;

public class Repetitiva04 {
    public static void main(String[] args) {

        /*TODO: Escribir un programa que solicite la carga de números por teclado.
           Finalizar la carga de valores cuando se ingrese el valor 0. Obtener el promedio
           de los números ingresados. No considerar el 0 en el cálculo del promedio.*/

        Scanner scanner = new Scanner(System.in);
        double suma = 0;
        double numero;
        int contador = 0;

        do {
            System.out.println("Ingrese un número. Para finalizar ingrese el 0:");
            numero = scanner.nextDouble();
            suma = suma + numero;
            if (numero != 0)
                contador++;
        } while (numero != 0);

        if (contador != 0) {
            System.out.println("El promedio de los valores ingresados es:" + (suma / contador));
        } else {
            System.out.println("No ingreso ningun numero");
        }
    }
}
