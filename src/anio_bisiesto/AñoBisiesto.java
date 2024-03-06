package anio_bisiesto;

import java.util.Scanner;

public class AñoBisiesto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un año");
        int año = entrada.nextInt();

        if (esBisiesto(año)) {
            System.out.println(año + " es un año bisiesto");
        } else {
            System.out.println(año + " no es un año bisiesto");
        }
    }

    public static boolean esBisiesto(int año) {
        return año % 400 == 0 || año % 4 == 0 && !(año % 100 == 0);
    }

}
