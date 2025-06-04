package es.vedruna;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("********************GENERADOR DE LETRA DE DNI********************");
        System.out.println();
        System.out.print("Introduzca su DNI (sin letra): ");
        String numeros = scan.nextLine();

        int numeroDNI = Integer.parseInt(numeros);
        if (DNI.entradaNula()){
            DNI.entradaNula()
        }

        char letra = DNI.calcularLetraDNI(numeroDNI);
        System.out.println("Su letra del DNI es: " + letra);



        /*
        try{
            int numeroDNI = Integer.parseInt(numeros);
            char letra = DNI.calcularLetraDNI(numeroDNI);
        }catch (NumberFormatException e){
            System.out.println("Solo debe introducir números");
        }

         */






    }
}