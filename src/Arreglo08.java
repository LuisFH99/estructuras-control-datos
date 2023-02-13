import java.util.Scanner;

public class Arreglo08 {
    public static void main(String[] args) {
        /*TODO:  Realizar un programa para leer la altura de N numeroPersonas y calcular la altura media.
           Calcular cuántas numeroPersonas tienen una altura superior a la media y cuántas tienen una altura
           inferior a la media. El valor de N se pide por teclado y debe ser entero positivo.
           Usar arreglo para almacenar las alturas*/

        Scanner scanner = new Scanner(System.in);
        double sumaAlturas = 0;
        double alturaPromedio;
        int superior = 0, inferior = 0;

        System.out.print("Ingrese el número de numero personas ha registrar sus alturas: ");
        int numeroPersonas = scanner.nextInt();
        double[] alturas = new double[numeroPersonas];

        if (numeroPersonas < 0) {
            System.out.println("El numero no puede ser negativo");
            return;
        }

        System.out.println("**************** Deberá Ingresar las Alturas de las " + numeroPersonas + " Personas ****************");
        for (int i = 0; i < numeroPersonas; i++) {
            System.out.print("Ingrese la Altura de la " + (i + 1) + "° persona: ");
            alturas[i] = scanner.nextDouble();
            sumaAlturas = sumaAlturas + alturas[i];
        }
        alturaPromedio = Math.round((sumaAlturas / numeroPersonas) * 100.0) / 100.0;

        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] < alturaPromedio)
                inferior++;

            if (alturas[i] > alturaPromedio)
                superior++;
        }

        System.out.println("Resultado:\n" +
                "Altura promedio:" + alturaPromedio + "\n" +
                "Personas que tienen una altura inferior al promedio:" + inferior + "\n" +
                "Personas que tienen una altura superior al promedio:" + superior);
    }
}
