/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

/**
 *
 * @author Alum
 */
/*
*Nom: Seku
*Cognoms: Jawara
*INS Manuel Vázquez Montalbán
*Data d’edició: 2022/2023
*Nom del cicle formatiu: Desenvolupament d’Aplicacions Web
*Nom del mòdul: Programació
 */

//Pre:Receive a number by keyboard
public class Exercici5 {

    private static final String MSG = "Write a year and I will tell you if it is a leapyear or not";
    private static final String MSG_1 = "This year is leap year";
    private static final String MSG_2 = "This year is not a leap ";

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        
        System.out.println(MSG);
        num=sc.nextInt();
        if (num%4==0){ //Calculation to know if a year is a leap year 
            System.out.println(MSG_1);
        }
        else{
            System.out.println(MSG_2);
        }
    }

}
//Post:Show on screen if it is a leap year or not