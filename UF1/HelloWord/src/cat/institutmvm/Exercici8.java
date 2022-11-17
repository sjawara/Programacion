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
public class Exercici8 {
   private static final String MSG_1 = "Introdueix un nombre ";
   private static final String MSG_2 = "Aquest es un nombre natural";
   private static final String MSG_3 = "Aquest no es un nombre natural";
   
   public static void main(String[] args) {
       int num;
       Scanner sc = new Scanner( System.in);
       System.out.println(MSG_1);
       num= sc.nextInt();
       if (num>0){
           System.out.println(MSG_2);
       }
       else {
           System.out.println(MSG_3);
       }
   }
}
