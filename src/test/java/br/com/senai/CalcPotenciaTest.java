package br.com.senai;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcPotenciaTest {

    @Test
    void CalcPotenciaTest() {

        CalcPotencia calculo1 = new CalcPotencia();
        double resultado = calculo1.calcularPotencia(200, 1000);

        assertEquals(20000.00, resultado);
    }

}
