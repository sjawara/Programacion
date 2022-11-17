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
public class Exercici26 {

    private static final int SUMA = 3;
    private static final int RESTA = -2;
    private static final String MSG_1 = "Introduce un numero entero";
    private static final String MSG_2 = "Esto no es un numero entero";
    private static final String MSG_3 = "Los numeros introducidos son:";

    public static void main(String[] args) {
        int arrayInt[] = new int[20];
        int i = 0;
        Scanner sc = new Scanner(System.in);
        boolean tipusCorrecte;

        do {
            System.out.println(MSG_1);
            tipusCorrecte = sc.hasNextInt();
            if (tipusCorrecte) {
                arrayInt[i] = sc.nextInt();
                if (arrayInt[i] % 5 == 0) {
                    arrayInt[i] = arrayInt[i] + SUMA;
                } else {
                    if (arrayInt[i] % 3 == 0) {
                        arrayInt[i] = arrayInt[i] + RESTA;
                    }
                }
                i++;
            } else {
                System.out.println(MSG_2);
                sc.next();
            }
        } while (i < arrayInt.length);
        sc.close();
        System.out.println(MSG_3);
        for (i=0;i<arrayInt.length ;i++){
            System.out.print( arrayInt[i]+ " ");
        }
        System.out.println("");
    }
}
