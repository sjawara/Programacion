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
    
    Scanner sc = new Scanner(System.in);
    //Exercici 1
    public int isInt(int num,String MSG_1,String MSG_2){
    boolean tipusCorrecte = false;
    do{
        System.out.println(MSG_1);
    tipusCorrecte=sc.hasNextInt();
    if(tipusCorrecte){
            num=sc.nextInt();
    }else{
        System.out.println(MSG_2);
        sc.next();
    }
    }while (tipusCorrecte==false);
    return num;
    }
    
    public boolean isNatural(int num,String MSG_3){
    boolean sortida;
    if(num>0){
    sortida=true;
    }else{
    sortida=false;
    System.out.println(MSG_3);
    }
    return sortida;
    
    }
    public double potencia(int num1, int num2){
        //return Math.pow((double)(num1), (double)(num2));
        return Math.pow(num1,num2);
    }
    
    //Exercici 2
    public String convert(String text){
    text = text.toUpperCase();
    return text;
    }
    
    public String subString(String texto, int num1, int num2){
    return texto.substring(num1, num2+1);
    }
}
