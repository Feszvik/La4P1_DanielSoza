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
                    ejercicio3();
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
        int contl = 0;
        int contn = 0;
        int conts = 0;
        int sumn = 0;
        double suml = 0;
        double sums = 0;
        String letra = "";
        String num = "";
        String simb = "";
        leer.nextLine();
        System.out.print("Ingrese una cadena: ");
        String cadena = leer.nextLine();
        System.out.println("");
        int espacio = 0;
        for (int i = 0; i < cadena.length(); i++){
            n = cadena.charAt(i);
            if (n == 32){
                espacio++;
            }
        }
        if (espacio == cadena.length()){
            cadena = "";
        }
        while (cadena.length() < 1){
            espacio = 0;
            System.out.print("La cadena no puede estar vacia, ingrese nuevamente: ");
            cadena = leer.nextLine();
            for (int i = 0; i < cadena.length(); i++){
                n = cadena.charAt(i);
                if (n == 32){
                    espacio++;
                }
            }
            if (espacio == cadena.length()){
                cadena = "";
            }
        }
        System.out.println("");
        for (int i = 0; i < cadena.length(); i++){
            n = cadena.charAt(i);
            int numero = Character.getNumericValue(n);
            if ((n <= 90 && n >= 65) || (n <= 122 && n >= 97)){
                letra += cadena.charAt(i);
                contl += 1;
                suml += n;
            } else if (n >= 48 && n <= 57){
                num += cadena.charAt(i);
                contn += 1;
                sumn += numero;
            } else {
                simb += cadena.charAt(i);
                conts += 1;
                sums += n;
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
        
        System.out.println("");
        System.out.println("Total letras: "+ contl);
        System.out.println("Total numeros: "+ contn);
        System.out.println("Total simbolos: "+ conts);
        System.out.println("Suma de los digitos: "+ sumn);
        
        System.out.println("");
        System.out.println("Promedio ASCII de las letras: "+ (suml/contl));
        System.out.println("Promedio ASCII de los simbolos: "+ (sums/conts));
        System.out.println("");
        
        System.out.println("Codigos ASCII");
        for (int i = 0; i < cadena.length(); i++) {
            char l = cadena.charAt(i);
            n = cadena.charAt(i);
            if ((n <= 90 && n >= 65) || (n <= 122 && n >= 97)){
                System.out.println(l +" -> "+ n +" (Letra)");
            } else if (n >= 48 && n <= 57){
                System.out.println(l +" -> "+ n +" (Numero)");
            } else {
                System.out.println(l +" -> "+ n +" (Simbolo)");
            }
        }
    }
    
    public static void ejercicio3(){
        leer.nextLine();
        System.out.print("Ingrese una palabra: ");
        String palabra = leer.nextLine().toLowerCase();
        String alreves= "";
        System.out.println("");
        int espacio = 0;
        for (int i = 0; i < palabra.length(); i++){
            int n = palabra.charAt(i);
            if (n == 32){
                espacio++;
            }
        }
        if (espacio == palabra.length()){
            palabra = "";
        }
        while (palabra.length() <= 1 ){
            espacio = 0;
            System.out.print("La cadena no puede estar vacia, ingrese nuevamente: ");
            palabra = leer.nextLine();
            for (int i = 0; i < palabra.length(); i++){
                int n = palabra.charAt(i);
                if (n == 32){
                    espacio++;
                }
            }
            if (espacio == palabra.length()){
                palabra = "";
            }
        }
        for ( int i=0; i<palabra.length();i++){
            alreves+=palabra.charAt(palabra.length()-1-i);
        }
        System.out.println(alreves);
        if (alreves.equals(palabra)){
            System.out.println("La palabra "+ palabra +" es un palindromo");
        } else {
            System.out.println("la palabra "+ palabra +" no es un palindromo");
        }
    }
}