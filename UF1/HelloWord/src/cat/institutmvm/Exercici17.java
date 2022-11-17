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
public class Exercici17 {

    private static final String MSG_1 = "Introdueix un nombre natural";
    private static final String MSG_2 = "El primer nombre es multiple del segon";
    private static final String MSG_3 = "El primer nombre no es multiple del segon";

    public static void main(String[] args) {
        int num1, num2;// Ponemos tanto num1 como num2 para almacenar y saber si son divisibles
        Scanner sc = new Scanner(System.in);

        System.out.println(MSG_1);
        num1 = sc.nextInt();
        while (num1 <= 0) {
            System.out.println(MSG_1);
            num1 = sc.nextInt();
        }
        System.out.println(MSG_1);
        num2 = sc.nextInt();
        while (num2 <= 0) {
            System.out.println(MSG_1);
            num2 = sc.nextInt();
        }
        if (num1 % num2 == 0) {
            System.out.println(MSG_2);
        } else {
            System.out.println(MSG_3);
        }
    }

}
