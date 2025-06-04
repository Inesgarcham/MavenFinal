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

            if (DNI.entradaVacia(numeros)){
                throw new IllegalArgumentException("Error, Entrada vacia");
            }

            if (DNI.entradaTexto(numeros)){
                throw new NumberFormatException("Error: No se ha introducido números");
            }

            int numeroDNI = Integer.parseInt(numeros);
            char letra = DNI.calcularLetraDNI(numeroDNI);
            System.out.println("Su letra del DNI es: " + letra);

        }catch (NumberFormatException e){
            System.out.println("Error: No se ha introducido números");
        }catch (IllegalArgumentException e){
            System.out.println("Error: Entrada vacia");
        }


    }
}