package cat.institutmvm;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

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

//Rebem valors per teclat
public class Exercici9 {
        private static final String MSG_1 = "La mitjana es ";
        private static final String MSG_2 = "Introdueix un nombre";

 
        public static void main(String[] args) {
            int num, i=1,avg=0;//Inicialitzem la variable i =1 ja que demanem un nombre fora del bucle
            Scanner sc =new Scanner(System.in);
            System.out.println(MSG_2);    
        num =sc.nextInt();//Li donem valor a num abans de iniciar el bus
        while (num !=0){ 
            avg=avg+num;
            i=i+1;
            System.out.println(MSG_2);
            num=sc.nextInt();
            
        }
            System.out.println(MSG_1+" "+avg/i);//Printem la mitjana 
        }
    
}
//Post:Printem la mitana