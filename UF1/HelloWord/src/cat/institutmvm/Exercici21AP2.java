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
public class Exercici21AP2 {

    private static final String MSG_1 = "Introdueix un nombre enter";
    private static final String MSG_2="Error";

    public static void main(String[] args) {
        int aux=0;
        boolean tipusCorrecte;
        int[] arrayInt = new int[20];
        Scanner sc= new Scanner (System.in);
        
        
        for (int i =0;i<arrayInt.length;i++){
        System.out.println(MSG_1);
        do{
            tipusCorrecte=sc.hasNextInt();
            if(tipusCorrecte){
                arrayInt[i]=sc.nextInt();
            } else {
                System.out.println(MSG_2);
                sc.next();
            }
        }while (!tipusCorrecte);
        
        for (int i=0){
        
        }
        
        
    }
    }
}
