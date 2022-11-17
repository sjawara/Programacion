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
public class Exercici15AP2 {

    private static final String MSG_1 = "Introdueix un nombre enter";
    private static final String MSG_2 = "Ha de ser un nombre enter";

    public static void main(String[] args) {
        int num1 = 0, num2 = 0, num3 = 0, suma=0;
        boolean tipusCorrecte, sortida = false;
        Scanner sc = new Scanner(System.in);

        do {
            sortida = false;
            System.out.println(MSG_1);
            tipusCorrecte = sc.hasNextInt();
            if (tipusCorrecte) {
                num1 = sc.nextInt();
                sortida = true;

            } else {
                System.out.println(MSG_2);
            }
        } while (sortida == false);

        do {
            sortida = false;
            System.out.println(MSG_1);
            tipusCorrecte = sc.hasNextInt();
            if (tipusCorrecte) {
                num2 = sc.nextInt();
                sortida = true;

            } else {
                System.out.println(MSG_2);
            }
        } while (sortida == false);

        do {
            sortida = false;
            System.out.println(MSG_1);
            tipusCorrecte = sc.hasNextInt();
            if (tipusCorrecte) {
                num3 = sc.nextInt();
                sortida = true;

            } else {
                System.out.println(MSG_2);
            }
        } while (sortida == false);

        suma=num1+num2+num3;
        if (num1==num2&&num1==num3){
            suma=suma*3;
        }
        System.out.println(suma);
    }
}
