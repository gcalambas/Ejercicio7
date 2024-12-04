/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicior7;

/**
 *
 * @author Pc
 * Ejercicio resuelto Nº 7
Hacer un algoritmo que, dados dos valores numéricos A y B, escriba un mensaje diciendo
si A es mayor, menor o igual a B.
Análisis
Datos de entrada
• Los valores de A y de B.
Datos de salida
• Un mensaje de acuerdo al valor de A y de B.
Proceso
Se compara A con B, sí:
A > B. Entonces se escribe el mensaje «A es mayor que B», si la condición es falsa se
pregunta sí:
A = B. Si ésta es verdadera se escribe el mensaje «A es igual que B», y si es falsa, por
defecto A es menor que B.
Algoritmo
INICIO
LEA: A, B
SI A > B ENTONCES
ESCRIBA: «A ES MAYOR QUE B»
SINO
SI A = B ENTONCES
ESCRIBA: «A ES IGUAL A B»
SINO
ESCRIBA: «A ES MENOR QUE B»
FIN_SI
FIN_SI
FIN_INICIO
Prueba de escritorio
Si los valores de entrada son:
A = 20
B = 25
los valores almacenados internamente serían:
A B
20 25
Salida
 */
import java.util.Scanner;
public class EjercicioR7 {

    public static void main(String[] args) {
        double a, b; // numeros enteros a y b
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingreses el valor numerico de a: ");
        a = entrada.nextDouble();
        
        System.out.println("Ingreses el valor numerico de b: ");
        b = entrada.nextDouble();
        
        if (a>b) {
            System.out.println(a + " es mayor que " + b);
        }
        else if (a==b) {
            System.out.println(a + " es igual que " + b);
        }
        else {
            System.out.println(a + " es menor que " + b);
        }
    }
}
