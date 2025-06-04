package es.vedruna;

public class DNI {

    //Método


    public static char calcularLetraDNI(int numeroDNI) {
        char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
                'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        int restante = numeroDNI%23;

        return letrasDNI[restante];
    }



    //Validación
    public static boolean entradaNula(String texto) throws NullPointerException{
        if (texto.equalsIgnoreCase("null")){
            System.out.println("Error: Entrada nula");
            return true;
        }
        return false;
    }
}
