package es.vedruna;

public class DNI {


    //Metodos
    //Este metodo sirve para calcular la letra del DNI. El usuario debe ingresar su DNI (sin letra).
    // En un array, almacenamos las 23 letras del abecedario.
    //A continuación, el programa realizará una división (con módulo) entre la cantidad de letra y devolvemos la letra correspondiente del array.
    public static char calcularLetraDNI(int numeroDNI) {
        char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
                'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        return letrasDNI[numeroDNI % 23];
    }


    //Este metodo nos permite obtener la letra de DNI.
    public static char obtenerLetraDNI(String entradaDNI) throws IllegalArgumentException {
        entradaTexto(entradaDNI);
        int numeroDNI = Integer.parseInt(entradaDNI);
        return calcularLetraDNI(numeroDNI);
    }



    //Validaciones
    //La primera validación lanza una excepción si el usuario no ingresa nada.
    //La segunda validación sirve para que el usuario solo inserte números. Lanza excepción si no lo son.
    public static void entradaTexto(String texto) throws NumberFormatException{

        if (texto.isEmpty()){
            throw new IllegalArgumentException("Error: Entrada vacia");
        }


        for (int i = 0; i < texto.length(); i++) {
            char numero = texto.charAt(i);
            if (!Character.isDigit(numero)){
                throw new NumberFormatException("Error: No se ha introducido números");
            }
        }


    }

}
