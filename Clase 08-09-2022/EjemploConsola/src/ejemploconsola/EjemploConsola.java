// comentario de una línea

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploconsola;

import java.util.Scanner;

public class EjemploConsola {

    public static void main(String[] args) {
        //Definir variable
        Scanner read = new Scanner(System.in);
        String nombre;
        
        System.out.println("Hello World");
        System.out.println("Ingrese su nombre");
        nombre = read.next();
        System.out.println("Bienvenido(a) " + nombre);
    }
    
}


