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
public class Exercici23 {
private static final int NOTAMIN=0;
private static final int NOTAMAX=10;
    private static final String MSG_1 = "Introdueix la nota del alumne";
    private static final String MSG_2 = "Nota no valida";
    private static final String MAPR="M.apr";
    private static final String MSUS="M.susp";
    private static final String QAPROBATS="Q.apr";
    private static final String QSUSPESOS="Q.susp";
    

    public static void main(String[] args) {
        int[] notasAlumnes = new int[8];
        int nota = 0,  qapr = 0, qsus = 0, i = 0;
        float avgsus = 0f, avgapr = 0f;
        boolean tipusCorrecte, sortida = false;
        Scanner sc = new Scanner(System.in);

        for (i = 0; i < notasAlumnes.length; i++) {
            do{
                sortida=false;
            System.out.println(MSG_1);
            tipusCorrecte=sc.hasNextInt();
            if (tipusCorrecte){
                nota=sc.nextInt();
                if (nota>NOTAMAX || nota<NOTAMIN){
                    System.out.println(MSG_2);
                }
                else {
                sortida=true;
                notasAlumnes[i]=nota;
                }
                }
            else {
                System.out.println(MSG_2);
            }
            }while (sortida==false);
        }
        for (i=0;i<notasAlumnes.length;i++){
            if (notasAlumnes[i]>=5){
            qapr++;
            }
            else{
            qsus++;
            }
        }
        for(i=0;i<notasAlumnes.length;i++){
            if (notasAlumnes[i]<5){
            avgsus=avgsus+notasAlumnes[i];
            }
            else {
            avgapr=avgapr+notasAlumnes[i];
            }
        }
        avgapr=avgapr/qapr;
        avgsus=avgsus/qsus;
        
        
        
        System.out.print(MSUS+"  "+MAPR+"  "+QSUSPESOS+"  "+QAPROBATS);
        System.out.println("");
        System.out.print(avgsus+"  "+avgapr+"  "+qsus+"  "+qapr);
        
    }

}
