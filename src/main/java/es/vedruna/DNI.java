package es.vedruna;

public class DNI {


    //Metodo
    public static char calcularLetraDNI(int numeroDNI) {
        char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
                'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        return letrasDNI[numeroDNI % 23];
    }


    //Validaciones
    public static boolean entradaTexto(String texto) throws NumberFormatException{
        return ! "1,2,3,4,5,6,7,8,9,0".equals(texto);
    }


    public static boolean entradaVacia(String texto) throws IllegalArgumentException{
        return texto.isEmpty();
    }


}
