import java.util.Scanner;

public class Arreglo07 {
    public static void main(String[] args) {

        /*TODO:  Realizar un programa para ingresar por teclado 10 números en un arreglo 
           y mostrar el número mayor y el número menor*/
        
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];
        System.out.println("**************** Debera Ingresar 10 numeros ****************");
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el "+(i+1)+"° numero: ");
            numeros[i]=scanner.nextDouble();
        }

        double mayor = numeros[0];
        double menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.print("El numero mayor es: "+mayor+" y el numero menor: " + menor);

    }
}
