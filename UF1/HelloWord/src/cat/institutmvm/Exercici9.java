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
public class Exercici9 {

    private static final String MSG_1 = "Introdueix un numero entre el 5 y el 50";
    private static final String MSG_2 = "Aquest nombre esta dins de l'interval";
    private static final String MSG_3 = "Aquest nombre no esta dins de l'interval";

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println(MSG_1);
        num = sc.nextInt();
        if (num>5 && num <50) {
            System.out.println(MSG_2);
        }
        else {
            System.out.println(MSG_3);
        }
    }
}
