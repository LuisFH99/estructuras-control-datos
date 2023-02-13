import java.util.Scanner;


public class Repetitiva06 {
    public static void main(String[] args) {

        /*TODO: Confeccionar un programa que permita ingresar un valor del 1 al 10
           y nos muestre la tabla de multiplicar del mismo (los primeros 12 términos)
           Ejemplo: Si ingreso 3 deberá aparecer en pantalla los valores 3, 6, 9, hasta el 36. Usar FOR*/

        Scanner scanner = new Scanner(System.in);
        String resultado = "Los valores son :";
        System.out.println("Ingrese un número del 1 - 10: ");
        int numero = scanner.nextInt();
        if (numero >= 1 && numero <= 10) {
            for (int i = 1; i <= 12; i++) {
                resultado = resultado + (i * numero) + ", ";
            }
            System.out.println(resultado.substring(0, resultado.length() - 2));
        } else {
            System.out.println("El valor ingresado debe ser entre 1 - 10");
        }
    }
}
