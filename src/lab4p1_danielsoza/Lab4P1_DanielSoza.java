package lab4p1_danielsoza;
import java.util.Scanner;

public class Lab4P1_DanielSoza {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        int op = Menu();
        while (op != 4) {
            switch (op) {
                case 1 :
                {
                    ejercicio1();
                    break;
                }
                case 2 :
                {
                    ejercicio2();
                    break;
                }
                case 3 :
                {
                    
                }
            }
            op = Menu();
        }
        
    }
    
    public static int Menu(){
        System.out.println("");
        System.out.println(" Menu");
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        System.out.println("4. Salir");
        System.out.print("Ingrese su opcion: ");
        int opcion = leer.nextInt();
        System.out.println();
        while (opcion < 0 || opcion > 4) {
            System.out.println();
            System.out.print("Opcion invalida, intente de nuevo: ");
            opcion = leer.nextInt();
        }
        return opcion;
    }
    
    public static void ejercicio1(){
        System.out.print("Ingrese la primera cadena: ");
        String contenedor = leer.next();
        System.out.println();
        System.out.print("Ingrese la segunda cadena: ");
        String contenido = leer.next();
        while (contenido.length() > contenedor.length()){
            System.out.println();
            System.out.println("El tamano de la segunda cadena no puede ser mayor que el de la primera.");
            System.out.print("Ingrese la primera cadena: ");
            contenedor = leer.next();
            System.out.println();
            System.out.print("Ingrese la segunda cadena: ");
            contenido = leer.next();
        }
    }
  
    
    public static void ejercicio2(){
        int n;
        String letra = "";
        String num = "";
        String simb = "";
        System.out.print("Ingrese una cadena: ");
        String cadena = leer.next();
        System.out.println("");
        for (int i = 0; i < cadena.length(); i++){
            n = cadena.charAt(i);
            if ((n <= 90 && n >= 65) || (n <= 122 && n >= 97)){
                letra += cadena.charAt(i);
            } else if (n >= 48 && n <= 57){
                num += cadena.charAt(i);
            } else {
                simb += cadena.charAt(i);
            }
        }
        if (letra.length() == 0) {
            System.out.println("No hay letras en la cadena");
        } else {
            System.out.println("Letras: "+ letra);
        }
        
        if (num.length() == 0) {
            System.out.println("No hay numeros en la cadena");
        } else {
            System.out.println("Letras: "+ num);
        }
                
        if (simb.length() == 0) {
            System.out.println("No hay simbolos en la cadena");
        } else {
            System.out.println("Letras: "+ simb);
        }
        
    }
    
    
    
    
}
