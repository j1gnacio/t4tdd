/**
 * com.example.dev Paquete de desarrollo de la solución
 */
package org.example.dev;
// -encoding UTF-8 -charset UTF-8 -docencoding UTF-8


import org.example.testeo.Test_Kaprekar;

import java.util.Arrays;

public class Main_Kaprekar {

    public static void main(String[] args){
        System.out.println("Clase Main");

    }

//aquí van sus funciones:
public static int kaprekarOp(int number) {
    String numStr = String.format("%04d", number);

    char[] digits = numStr.toCharArray();
    Arrays.sort(digits);

    String asc = new String(digits);
    String desc = new StringBuilder(asc).reverse().toString();

    int smaller = Integer.parseInt(asc);
    int larger = Integer.parseInt(desc);

    return larger - smaller;
}
    public static int itKaprekar(int number) {
        if (number < 1000 || number > 9999) {
            throw new IllegalArgumentException("El número debe ser de 4 dígitos.");
        }

        int iterations = 0;
        while (number != 6174) {
            number = kaprekarOp(number);
            iterations++;
        }
        return iterations;
    }

}
