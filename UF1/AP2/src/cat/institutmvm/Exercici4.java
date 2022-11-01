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
//Pre: Numero entero recibido por teclado 
public class Exercici4 {

    private static final String GEN = "Enero";
    private static final String FEB = "Febrero";
    private static final String MAÇ = "Marzo";
    private static final String AB = "Abril";
    private static final String MA = "Mayo";
    private static final String JUN = "Junio";
    private static final String JUL = "Julio";
    private static final String AG = "Agosto";
    private static final String SE = "Septiembre";
    private static final String OC = "Octubre";
    private static final String NOV = "Noviembre";
    private static final String DEC = "Diciembre";
    private static final String MSG = "Introduce un numero y te dire que mes es ";
    private static final String ERR = "Error";

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG);
        num = sc.nextInt();
        if (num == 1) {
            System.out.println(GEN);
        } else {
            if (num == 2){
                System.out.println(FEB);
            } else if (num == 3) {
                System.out.println(MAÇ);
            } else if (num == 4) {
                System.out.println(AB);
            } else if (num == 5) {
                System.out.println(MA);
            } else if (num == 6) {
                System.out.println(JUN);
            } else if (num == 7) {
                System.out.println(JUL);
            } else if (num == 8) {
                System.out.println(AG);
            } else if (num == 9) {
                System.out.println(SE);
            } else if (num == 10) {
                System.out.println(OC);
            } else if (num == 11) {
                System.out.println(NOV);
            } else if (num == 12) {
                System.out.println(DEC);
            } else {
                System.out.println(ERR);
            }
        }
        //Mateix exercici amb switch case 
        System.out.println(MSG);
        num = sc.nextInt();
        switch(num){
            case 1: System.out.println(GEN);
            break;
            case 2: System.out.println(FEB);
            break;
            case 3: System.out.println(MAÇ);
            break;
            case 4: System.out.println(AB);
            break;
            case 5: System.out.println(MA);
            break;
            case 6:System.out.println(JUN);
            break;
            case 7:System.out.println(JUL);
            break;
            case 8: System.out.println(AG);
            break;
            case 9: System.out.println(SE);
            break;
            case 10: System.out.println(OC);
            break;
            case 11: System.out.println(NOV);
            break;
            case 12:System.out.println(DEC);
            break;
            default: System.out.println(ERR);
        }
    }

}
//Post: Printar el nombre del numero de mes que ha escrito