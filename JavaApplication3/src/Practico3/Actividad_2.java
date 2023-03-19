package Practico3;

import java.util.Scanner;

public class Actividad_2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int x, y;

        System.out.println("Ingrese una frase:");
        String frase = entrada.nextLine();

        System.out.println("Ingrese valor de desplazamiento:");               //puede desplazarse cualquier valor
        int desplazamiento = entrada.nextInt();

        System.out.println("\nLa frase resultante es:");
 
        char[] letra = frase.toCharArray();                                     //convierto la frase en un array de caracteres para realizar el desplazamiento

        if (desplazamiento != 0) {                                              //condicion en caso de que no haya desplazamiento
            for (x = 0; x < frase.length(); x++) {
                for (y = 0; y < desplazamiento; y++) {
                    if (letra[x] == ' ') {                                      //para el espacio ' ', coloco el caracter 'a' segun pide el enunciado.
                        letra[x] = 'a';
                    } else {                                                    //si bien no son necesarias todas las llaves { } estas me sirven para mantener..
                        letra[x]++;                                             //el orden del programa. Es a modo personal.
                    }
                }
            }
            String fraseNueva = String.valueOf(letra);                      //conviero el array de caracteres en un string y lo muestro
            System.out.println(fraseNueva);

        } else {
            System.out.println(frase);                                        //sentencia utilizada en caso de que no haya desplazamiento.
        }

    }
}
