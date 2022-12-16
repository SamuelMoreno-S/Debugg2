package ejerciciosDebug;

import java.util.Scanner;

/*Programa que calcula el factorial de un numero introducido por el usuario:
 * Recuerda, factorial de 5, 5! = 5*4*3*2*1 * 
 */
public class d4debugFactorial {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int num, num2, fact;
        Scanner sc = new Scanner(System.in);
        System.out.print("Entra numero a calcular factorial: ");
        num = sc.nextInt();
        fact = 1;
        num2 = 1;
        while (num2 <= num) {

            fact = fact * num2;
            num2++;
        }
        System.out.print("El factorial de " + num + " es " + fact);

    }

}
