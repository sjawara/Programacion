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
public class Exercici32 {
    private static final String MSG_1="Cual es tu consulta? \n 1.Calcular preu final (amb impostos però sense enviament). \n 2.Calcular preu final (amb impostos però sense enviament). \n 3.Mostrar quin IVA s'aplica Cost de l'enviament Mostrar quin IVA s'aplica Cost de l'enviament.";
    private static final String MSG_2="Introduce el numero de consulta";
            public static void main(String[] args) {
            int num=0;
            boolean tipusCorrecte;
            Scanner sc=new Scanner(System.in);
            
                System.out.println(MSG_1);
            
            do{
                System.out.println(MSG_2);
                tipusCorrecte=sc.hasNextInt();
                if (tipusCorrecte){
                num=sc.nextInt();
                }
                else{
                sc.next();
                }
            }while (!tipusCorrecte && (num>4 && num<0));
            
            }

}
