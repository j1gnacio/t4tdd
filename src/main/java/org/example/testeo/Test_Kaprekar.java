package org.example.testeo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// revisar : https://plus.maths.org/content/mysterious-number-6174
// basado en la operación de kaprekar se deben codificar 2 funciones:
// 1) la función kaprekarOp realizará el ordenamiento y resta descrita en el algoritmo
// 2) la función itKaprekar usará kaprekarOp y retonará cuantas iteraciones tomó llegar a la constante


import java.util.Arrays;

import static org.example.dev.Main_Kaprekar.*;

public class Test_Kaprekar{

    @Test
    public void testKaprekarOperation1() {
        // Prueba con el número 3524 (debe devolver 3087)
        Assertions.assertEquals(3087, kaprekarOp(3524));
    }
}
