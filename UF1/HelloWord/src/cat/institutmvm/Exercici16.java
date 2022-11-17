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

//pre: Rep un nombre introduit per teclat 
public class Exercici16 {
    private static final String MSG_1= "Introdueix un nombre natural";
    private static final String MSG_2= "Aquest no es un nombre natural";
    private static final String MSG_3= "El programa ha acabat, aquest es un nombre natural";
    
    
    public static void main(String[] args) {
        int num;
        int i=0;
        Scanner sc= new Scanner(System.in);
        
        System.out.println(MSG_1);
        do{
             num= sc.nextInt();
                if (num <=0){ // validem si es un nombre natural o no 
                    System.out.println(MSG_2);
                    System.out.println(""); // Espai entre lineas 
                    System.out.println(MSG_1);
                    i++; //incrementem el contador
                }
                else{
                    System.out.println(MSG_3);
                }
        }while((i<3)&&(num<=0)); //Repetira fins que el contador sigui 3 o el numero sigui natural  
    } 
}
//Post:Retorna si es un nombre natural o no en un maxim de dos intents 