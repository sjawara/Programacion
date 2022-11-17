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
public class Exercici22 {
    private static final String MSG_1="Introdueix un nombre natural";
    private static final String MSG_2="Ha de ser un nombre natural";
        public static void main(String[] args) {
            int num=0,modulo=0,binario=0;
            boolean tipusCorrecte, sortida=false;
            Scanner sc=new Scanner (System.in);
            
            do{
            System.out.println(MSG_1);
            tipusCorrecte=sc.hasNextInt();
            if (tipusCorrecte){
                num=sc.nextInt();
                if (num<0){
                    System.out.println(MSG_2);
                }
                else {
                sortida=true;
                
                }
            }
            else {
                System.out.println(MSG_2);
            }
            }while (sortida==false);
            
            
            while (num>0){
               modulo=(num%2);
               binario=modulo + binario;
               num=num/2;
            }
            System.out.println(binario);
        }
}
