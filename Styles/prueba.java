import java.util.Scanner;

public class prueba {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arreglo = new int[3];

        arreglo[0] = 25;
        arreglo[1] = 18;
        arreglo[2] = 14;

        // System.out.println(arreglo[0] + " " + arreglo[1] + " " + arreglo[2]);

        int i = 1;

        while (i < arreglo.length) {

            System.out.println("Ingrese un número: ");
            int numero = sc.nextInt();

            if (numero <= 0) {
                System.out.println("El número debe ser mayor a 0");
            } else {
                arreglo[i] = numero;
            }

            i++;
        }

    }

}