/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm;

import cat.institutmvm.utils.Entrada;
import java.util.Scanner;

/**
 *
 * @author Seku
 */
public class main {

    private static final String MSG_1 = "No has acertado";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /*
        int num = 0, random, i = 0, num1 = 0, num2 = 0;
        boolean tipusCorrecte = false, sortida = false,validacio;
        Scanner sc = new Scanner(System.in);
        */
        Entrada ent = new Entrada();

        /*Ejercicio 12
        random= (int)(Math.random()*1000);
         do{
        num=ent.validacioInt(num, tipusCorrecte, sc);
        sortida=(num==random)? true:false;
        if (sortida==false){
            System.out.println(MSG_1);
            i++;
        }
        if (i>=3){
        sortida=true;
        }
        }while(sortida==false);
         
        //Ejercicio 13
        num = ent.validacioInt(num, tipusCorrecte, sc);
        num1 = ent.validacioInt(num1, tipusCorrecte, sc);
        num2 = ent.validacioInt(num2, tipusCorrecte, sc);
        validacio=ent.validacioRang(num, num1, num2);
        System.out.format((num <= num2 && num >= num1) ? "%d esta dins del rang "
                + "%d i %d" : "%d no esta dins del rang %d i %d",num,num1,num2);
        */
        
        //Ejercicio 14
            int arr[] = {10,20,30,40,50};  
        int key = 50;  
        int last=arr.length-1;  
        int result = ent.binarySearch(arr, 0, last, key);
        if (result == -1)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: ");  
        
        System.out.println(result);
    }  

    }


