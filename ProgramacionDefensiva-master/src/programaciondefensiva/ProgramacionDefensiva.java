/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaciondefensiva;

import java.util.Scanner;

/**
 *
 * @author amand
 */
public class ProgramacionDefensiva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        char opcion;
        System.out.println("Ingrese un numero:");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese un numero:");
        int num2 = scanner.nextInt();
        System.out.println("Ingrese la opcion de lo que desea: ");
        System.out.println("A. Suma");
        System.out.println("B. Resta");
        System.out.println("C. Multiplicacion");
        System.out.println("D. Division");
        opcion = scanner.next().toUpperCase().charAt(0);
        System.out.println("El resultado de la operacion solicitada es:");
        switch(opcion)
        {
            case 'A':
                System.out.print(Ejercicio1.suma(num1, num2));
                break;
                
            case 'B':
                System.out.println(Ejercicio1.resta(num1, num2));
                break;
            case 'C':
                System.out.println(Ejercicio1.multiplicacion(num1, num2));
                break;
            case 'D':
                System.out.println(Ejercicio1.division(num1, num2));
                break;
            default:
                System.out.println("La opcion seleccionada no esta disponible");
                break;
                
        }
        
       // Ejercicio2.juego();
    }
    
}
