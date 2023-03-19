package Practico3;
import java.util.Scanner;

public class Actividad_1_C {
    
    public static void main(String[] args){

    Scanner entrada = new Scanner (System.in);    
    int sumatoria = 0;
    int numero;
    
    System.out.println("Ingrese una serie de numeros separados por un \"espacio\" :");
    String cadenaStrg = entrada.nextLine();
    
    System.out.println("\nIngrese valor minimo para el elemento a sumar:");
    int valor = entrada.nextInt();
    
    String [] cadenaSplt = cadenaStrg.split(" ");
    
    for(String cadenaIntg   :   cadenaSplt){
        numero = Integer.parseInt(cadenaIntg);
        if(numero > valor)
            sumatoria = sumatoria + numero;
    }

    System.out.println("\nEl valor de la suma es: " + sumatoria);
    
    }
}
