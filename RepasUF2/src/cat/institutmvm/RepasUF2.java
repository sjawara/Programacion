/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm;

import cat.institutmvm.utils.Metodes;
import java.util.Scanner;

/**
 *
 * @author Seku
 */
public class RepasUF2 {
    private static final String MSG_1="ERROR, HA DE SER UN NUMERO ENTERO";
    private static final String MSG_2="INTRODUCE UN NUMERO ENTERO";
    private static final String MSG_3="ERROR HA DE SER UN NUMERO NATURAL";
    private static final String MSG_4="LA POTENCIA ES:";
    private static final String MSG_5="INTRODUCE UN TEXTO";
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String text="as";
        int num1=0, num2=0;
        double pot=0;
        boolean sortida=false;
        char ch ,ch2;
        Metodes met = new Metodes();
        Scanner sc = new Scanner(System.in);
        //Exercici 1
        /*
        do{
        num1=met.isInt(num1,MSG_2 ,MSG_1);
        sortida=met.isNatural(num1,MSG_3);
        }while (sortida==false);
         do{
        num2=met.isInt(num1,MSG_2 ,MSG_1);
        sortida=met.isNatural(num1,MSG_3);
        }while (sortida==false);
         
        pot=met.potencia(num1, num2);
        System.out.println(MSG_4+pot);
        */
        //Exercici 2
        //a
        /*
        System.out.println(MSG_5);
        text=sc.nextLine();
       // text=met.convert(text);
        System.out.println(text);
           */ /*
        //b
        
         num1=met.isInt(num1, MSG_2, MSG_1);
         num2=met.isInt(num2, MSG_2, MSG_1);
         text=met.subString(text, num1, num2);
         System.out.println(text);
        
         //c
         System.out.println("Introdueix un caracter");
         ch=sc.next().charAt(0);
         System.out.println("Introdueix un caracter");
         ch2=sc.next().charAt(0);
         
         System.out.println(text.replace(ch, ch2));
         
         String text2="ss";
         
         text.concat(text2);
         */
         //exercici 3
         int num5=-40;
         System.out.println(Math.abs(num5));
         
         String texto = "El texto contiene",cont="texto";
         if(texto.contains(cont)){
             System.out.println("si");
         }else{
             System.out.println("no");
         }
         //exercici4
         int num9=20;
         if(num9>=0 && num9<=20){
             System.out.println("so");
         }else{
             System.out.println("no");
         }
                 
    }
    
}
