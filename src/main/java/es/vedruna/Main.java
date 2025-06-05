package es.vedruna;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("********************GENERADOR DE LETRA DE DNI********************");
        System.out.println();
        System.out.print("Introduzca su DNI (sin letra): ");
        String numeros = scan.nextLine();


        try {
            char letra = DNI.obtenerLetraDNI(numeros);
            System.out.println("Su letra del DNI es: " + letra);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}