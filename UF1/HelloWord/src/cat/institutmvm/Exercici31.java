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
public class Exercici31 {

    private static final String MSG_1 = "Introdueix un nombre:";
    private static final String MSG_2 = "Aquest nombre te aquesta cuantitat de xifres: ";
    private static final int XIF = 10;

    public static void main(String[] args) {

        int num1 = 0, i = 0;
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
            num1 = num1 / XIF;
            i++;
        } while (num1 != 0);
        System.out.println(MSG_2 + i);
    }
}
