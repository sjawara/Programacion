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
public class Exercici10AP2 {

    private static final String MSG_1 = "Introduce un número";
    private static final String MSG_2 = "Introduce un número mayor que el primero";
    private static final String MSG_3 = "Los numeros multiples son:";

    public static void main(String[] args) {
        int num1 = 0, num2 = 0, i;
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

        do {
            System.out.println(MSG_2);
            tipusCorrecte = sc.hasNextInt();
            if (tipusCorrecte) {
                num2 = sc.nextInt();
            } else {
                System.out.println("Error");
                sc.next();
            }
        } while ((!tipusCorrecte) || (num1 > num2));

        System.out.println(MSG_3);
        i = num1;
        while (i != num2) {
            if (i % num1 == 0) {
                System.out.println(i);
                i++;
            } else {
                i++;
            }
        }
        sc.close();

    }
}
