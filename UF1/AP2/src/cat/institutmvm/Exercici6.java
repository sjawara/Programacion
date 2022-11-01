/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

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

//Pre: Rebre 2 valors per teclat 
public class Exercici6 {

    private static final String ANY = "Escriu un any";
    private static final String MES = "Escriu un mes(en numeros)";
    private static final String MSG_1 = "31";
    private static final String MSG_2 = "30";
    private static final String MSG_3 = "28";
    private static final String MSG_4 = "29";
    private static final String ERR = "Error";//Missatge de error en el cas de que no posi un numero del 1 al 12 en el mes.

    public static void main(String[] args) {
        int nummes, numany;
        Scanner sc = new Scanner(System.in);
        System.out.println(ANY);//Demanem el any
        numany = sc.nextInt();
        System.out.println(MES);//Demanem el mes
        nummes = sc.nextInt();
        if (numany % 4 == 0 && nummes==2) {//En el cas de que compleixi les dues condicion retornara 29 ja que es febrer de un any traspas
            System.out.println(MSG_4);
            }
         else {
            switch (nummes) {
                case 1:
                    System.out.println(MSG_1);
                    break;
                case 2:
                    System.out.println(MSG_3);
                    break;
                case 3:
                    System.out.println(MSG_1);
                    break;
                case 4:
                    System.out.println(MSG_2);
                    break;
                case 5:
                    System.out.println(MSG_1);
                    break;
                case 6:
                    System.out.println(MSG_2);
                    break;
                case 7:
                    System.out.println(MSG_1);
                    break;
                case 8:
                    System.out.println(MSG_1);
                    break;
                case 9:
                    System.out.println(MSG_2);
                    break;
                case 10:
                    System.out.println(MSG_1);
                    break;
                case 11:
                    System.out.println(MSG_2);
                    break;
                case 12:
                    System.out.println(MSG_1);
                    break;
                default:
                    System.out.println(ERR);
            }
        }
// Exercici b
 System.out.println(ANY);
        numany = sc.nextInt();
        System.out.println(MES);
        nummes = sc.nextInt();
        if (numany % 4 == 0 && nummes==2) {
            System.out.println(MSG_4);
        }
        else{
        switch(nummes){
            case 1,3,5,7,8,10,12:
                System.out.println(MSG_1);
                break;
            case 4,6,9,11:
                System.out.println(MSG_2);
                break;
            case 2:
                System.out.println(MSG_3);
                break;
            default:
                System.out.println(ERR);
        }
        }
        
    }

}
//Post: Printar el el numero de dias que te un mes en un any determinat.