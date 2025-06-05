package es.vedruna;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
public class DNITest {

    @Test(expected = IllegalArgumentException.class)
    public void LetraDNITextoVacio() {
        System.out.println("DNI: Texto Vacio");
        DNI.entradaTexto("");
    }

    @Test(expected = NumberFormatException.class)
    public void LetraDNILetras() {
        System.out.println("Validación: Test sin Números");
        DNI.entradaTexto("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    }


    @Test
    public void LetraDNINumeros() {
        System.out.println("Validación: Test con Números");
        DNI.entradaTexto("0123456789");
    }


}