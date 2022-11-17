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
public class Exercici12AP2 {
    private static final String MSG_1="Introduce un numero" ;
    private static final String MSG_2="Las decenas son " ;
    private static final int DEC=10;
    public static void main(String[] args) {
         int num1 = 0;
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
        
        System.out.println(MSG_2+(num1/DEC));
    }
}
        
    

