package es.vedruna;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
public class DNITest {

    @Test
    public void LetraDNITextoVacio() {
        System.out.println("DNI: Texto Vacio");
        String entrada = "";
        boolean esperado = true;
        assertEquals(esperado, DNI.entradaVacia(entrada));
    }

    @Test
    public void LetraDNITextoNulo() {
        System.out.println("Validación: Test Nulo");
        assertTrue(DNI.entradaTexto("null"));
        assertTrue(DNI.entradaTexto("NULL"));
    }


}