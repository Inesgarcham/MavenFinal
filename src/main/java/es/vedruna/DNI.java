package es.vedruna;

public class DNI {

    //Método

    public static char calcularLetraDNI(int numeroDNI) {
        char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
                'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        return letrasDNI[numeroDNI % 23];
    }



    //Validación
    public static boolean entradaNula(String texto) throws NullPointerException{
        if (texto.equalsIgnoreCase(null)){
            return true;
        }
        return false;
    }


    public static boolean entradaVacia(String texto) throws IllegalArgumentException{
        if (texto.equals(" ") || texto.equals("")){
            return true;
        }
        return false;
    }


}
