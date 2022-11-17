/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class Exercici11AP2 {
    private static final String MSG_1="Introduce un número";
        private static final String SUMA="La suma es ";
   
    public static void main(String[] args) {
            
           int num1 = 0, num2 = 0, i=0;
        boolean tipusCorrecte;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println(MSG_1);
            tipusCorrecte = sc.hasNextInt();
            if (tipusCorrecte) {
                num1 = sc.nextInt();
            } else {
                System.out.println("Error");
                sc.next();
            }
        } while (!tipusCorrecte);
            
        do{
            System.out.println(num2);
            num2=num2+1;
            i=i+num2;
        }while (i<=num1);
        System.out.println(SUMA+(i-num2));
        
        }
    
}
