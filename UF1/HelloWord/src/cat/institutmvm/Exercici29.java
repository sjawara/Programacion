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
public class Exercici29 {
     private static final String MSG_1="Introdueix un nombre entre l'1 i el 9. ";
    private static final String MSG_2="Això no és unnombre entre l'1 i el 9.";
        public static void main(String[] args) {
        int arrayInt[] = new int[20];
        int i = 0,num=0;
        boolean tipusCorrecte;
        Scanner sc = new Scanner(System.in);

            
            do {        int i=0;

            System.out.println(MSG_1);
            tipusCorrecte = sc.hasNextInt();
            if (tipusCorrecte){
                num=sc.nextInt();
                if (num>=1 && num<=9) {
                arrayInt[i] = num;
                i++;
                }
                else{
                     System.out.println(MSG_2);  
                        }
            
            } else {
                System.out.println(MSG_2);
                sc.next();
            }
        } while (i < arrayInt.length);
            System.out.println("");
         for (i=0;i<arrayInt.length;i++){
             System.out.print(arrayInt[i]+" ");
         }
            System.out.println("");
         for(i=arrayInt.length-1;i>=0;i=i-1){
             System.out.print(arrayInt[i]+" ");
         }
         sc.close();

        }

    
    
}
