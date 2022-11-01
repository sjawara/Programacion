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
/*
*Nom: Seku
*Cognoms: Jawara
*INS Manuel Vázquez Montalbán
*Data d’edició: 2022/2023
*Nom del cicle formatiu: Desenvolupament d’Aplicacions Web
*Nom del mòdul: Programació
*/
public class Exercici3 {

    private static final String MSG = "Introdueix un nombre";
    private static final String MEJSI = "CORRECTE";
    private static final String MEJNO = "Aquest nombre no compleix els requisits";
    private static final String INC = "ambos inclosos";
    private static final String RES = "El residu d'aquest dos nombres es menor que 15";
    private static final String RESNO = "El residu d'aquest dos nombres es major que 15";
    private static final String SENSI = "Aquest numero es senar";
    private static final String SENNO = "Aquest nombre no es senar";
    private static final String CUADR = " Elevat al cuadrat es ";
    private static final String CUB = " Elevat al cub es ";
    private static final String MAXIM = "El maxim es ";
    private static final String MULTIPLE = " Es multiple de";

    public static void main(String[] args) {
        int num, inum;
        double num1, num2, num3;
        Scanner sc = new Scanner(System.in);

        //Exercici a
        System.out.println(MSG + " " + "negatiu");
        num = sc.nextInt();
        if (num < 0) {
            System.out.println(MEJSI);
        } else {
            System.out.println(MEJNO);
        }
        //Exercici b
        System.out.println("\n");//Fem un salt de linea
        System.out.println(MSG + " " + "mes gran que 35");
        num = sc.nextInt();
        if (num > 35) {
            System.out.println(MEJSI);
        } else {
            System.out.println(MEJNO);
        }
        //Exercici c
        System.out.println("\n");
        System.out.println(MSG + " " + "positiu i mes gran que 100");
        num = sc.nextInt();
        if (num > 100) {
            System.out.println(MEJSI);
        } else {
            System.out.println(MEJNO);
        }
        //Exercici d
        System.out.println("\n");
        System.out.println(MSG + " " + "entre -3 i el 27" + " " + INC);
        num = sc.nextInt();
        if (num >= -3 && num <= 27) {
            System.out.println(MEJSI);
        } else {
            System.out.println(MEJNO);
        }
        //Exercici e
        System.out.println("\n");
        System.out.println(MSG + " " + "que no estigui entre el 35 i el 50" + INC);
        num = sc.nextInt();
        if (num < 35 || num > 50) {
            System.out.println(MEJSI);
        } else {
            System.out.println(MEJNO);
        }
        //Exercici f
        System.out.println("\n");
        System.out.println(MSG);
        num1 = sc.nextDouble();
        System.out.println(MSG);
        num2 = sc.nextDouble();
        if ((num1 % num2) < 15) {
            System.out.println(RES);
        } else {
            System.out.println(RESNO);
        }
        //Exercici g
        System.out.println("\n");
        System.out.println(MSG);
        num = sc.nextInt();
        if (num % num != 0) {
            System.out.println(SENSI);
        } else {
            System.out.println(SENNO);
        }
        //Exercici h 
        System.out.println("\n");
        System.out.println(MSG);
        num = sc.nextInt();
        if (num % num == 0) {
            System.out.println(num + CUADR + num * num);
        } else {
            System.out.println(num + CUB + num * num * num);
        }
        //Exercici i
        System.out.println("\n");
        System.out.println(MSG);
        num1 = sc.nextDouble();
        System.out.println(MSG);
        num2 = sc.nextDouble();
        if (num1 > num2) {
            System.out.println(MAXIM + num1);
        } else {
            System.out.println(MAXIM + num2);
        }
        //exercici j
        System.out.println("\n");
        System.out.println(MSG);
        num1 = sc.nextDouble();
        System.out.println(MSG);
        num2 = sc.nextDouble();
        System.out.println(MSG);
        num3 = sc.nextDouble();
        if (num1 > num2 && num1 > num3) {
            System.out.println(MAXIM + num1);
        } else {
            if (num2 > num1 && num2 > num3) {
                System.out.println(MAXIM + num2);
            } else {
                System.out.println(MAXIM + num3);
            }
        }
        //Eercici k
        System.out.println("\n");
        System.out.println(MSG);
        num = sc.nextInt();
        System.out.println(MSG);
        inum = sc.nextInt();
        if (num / inum == 0) {
            System.out.println(inum + MULTIPLE + num);
        } else {

            System.out.println(inum + " no" + MULTIPLE + num);
        }
    }

}



