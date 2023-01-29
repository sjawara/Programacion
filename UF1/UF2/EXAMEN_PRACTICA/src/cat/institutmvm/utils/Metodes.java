/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.utils;

import java.util.Scanner;

/**
 *
 * @author Seku
 */
public class Metodes {
    public String retornText(Scanner sc,String text){
        System.out.println("Introduce un texto");
        text=sc.nextLine();
        return text;
    }
    
   public char retornCaracter(Scanner sc){
       char caracter;
       System.out.println("Introduce un caracter");
       caracter=sc.next().charAt(0);
       return caracter;
   }
    
   public int validacioInt(Scanner sc,int num,boolean tipusCorrecte){
       do{
           System.out.println("Introdueix un nombre natural");
           tipusCorrecte=sc.hasNextInt();
           if(tipusCorrecte){
           num=sc.nextInt();
           }else{
               System.out.println("Ha de ser un nombre natural");
               sc.next();
           }
       }while(!tipusCorrecte);
       return num;
       }
   public boolean trobarValor(int array[],int num){
       boolean trobat=false;
       for(int i=0;i<array.length;i++){
       if(array[i]==num){
       trobat= true;
       }
       }
          return trobat;

   }
   }
