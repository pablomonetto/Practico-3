package Practico3;

import java.util.Scanner;

public class Actividad_1_A {

    public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    int contador = 0;
    
    System.out.println("Ingrese frase:");
    String frase = entrada.nextLine();
    
    System.out.println("\nIngrese letra a buscar:");
    String letraStr = entrada.nextLine();
    char letra = letraStr.charAt(0);
    
    
    for( int x=0; x< frase.length(); x++)
        {
        char let = frase.charAt(x);
        if (let == letra)
            contador++;
        }
    System.out.println("\nCantidad de veces que se repite \"" + letra + "\": " +contador);
    
    
    }
    
}
