package es.vedruna;

public class DNI {


    //Metodo
    //Este metodo sirve para calcular la letra del DNI. El usuario debe ingresar su DNI (sin letra).
    // En un array, almacenamos las 23 letras del abecedario.
    //A continuación, el programa realizará una división (con módulo) entre la cantidad de letra y devolvemos la letra correspondiente del array.
    public static char calcularLetraDNI(int numeroDNI) {
        char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
                'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        return letrasDNI[numeroDNI % 23];
    }


    //Validaciones
    //Esta validación sirve para que el usuario solo inserte números.
    //Lanza excepción si no son números.
    public static boolean entradaTexto(String texto) throws NumberFormatException{
        return ! "1,2,3,4,5,6,7,8,9,0".equals(texto);
    }


    //Esta validación lanza una excepción si el usuario no ingresa nada.
    public static boolean entradaVacia(String texto) throws IllegalArgumentException{
        return texto.isEmpty();
    }


}
