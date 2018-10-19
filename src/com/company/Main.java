package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce un numero entre 0 y 9.999");
        int numero = escaner.nextInt();

        //Cuando he ido a hacerlo, directamente puse lo que hicimos en la tarea 1,

        // int numero = 12;
        // System.out.println(numero.length()); pero me ha dado error y directamente he pensado, claro el lenght es valido con la cadena String
        // Por tanto, he buscado en google como convertir caracteres numericos enteros a cadena y lo he hecho con:

        String numeroIntroducido = Integer.toString(numero);

        // Ahora mediante if y el caracter || (El simbolo || se obtiene pulsando alt + !)

        // Si el numero es menor de 0 o mayor de 9999, nos imprime el mensaje de que esta fuera del rango
        if (numero<0||numero>9999) {
            System.out.println("El número que has introducido esta fuera del rango (0-9,999)");
        }
        // Si el numero esta entre 0 y 9999 (ambos incluidos), nos dirá el numero de cifras que tienes el numero, mediante el length ya que ahora
        // si lo podemos usar al haber convertido el entero en cadena string

           else if (numero>=0||numero<=9999) {
            System.out.println("Has introducido el número " + numero + " y tiene " + numeroIntroducido.length() + " cifras ");
        }





    }


}

