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
public class EXERCICI10 {
    private static final String MSG_1 ="Introdueix un nombre del 1 al 100";
    private static final String MSG_2 ="El programa a acabat";
        
            public static void main(String[] args) {
                int num;
                int  i = 1;
                Scanner sc = new Scanner(System.in);
                
                System.out.println(MSG_1);
                num = sc.nextInt();
                while ((i<3)||(num>0 && num<100)) {
                    System.out.println(MSG_1);
                    num = sc.nextInt();
                    i++;
                }
                System.out.println(MSG_2);
                
            
        }
}
