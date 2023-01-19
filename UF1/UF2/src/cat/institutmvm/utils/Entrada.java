/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.utils;

import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class Entrada {
    private static final String MSG_1="Introdueix un nombre natural";
    private static final String MSG_2="Error,ha de ser un nombre natural";
    public int validacioInt(int num){
        boolean tipusCorrecte;
        Scanner sc= new Scanner(System.in);
        System.out.println(MSG_1);
        tipusCorrecte=sc.hasNextInt();
        if(tipusCorrecte){
            num=sc.nextInt();
        }
        else{
            System.out.println(MSG_2);
            sc.next();
        }
        sc.close();
        return num;
    }
    
    public String devolverTexto(Scanner sc,String textoIntroducido){
        textoIntroducido=sc.nextLine();
        return textoIntroducido;
    }
    
    public int contarCaracteres(){
    Scanner sc= new Scanner (System.in);
    String textoIntroducido;
        textoIntroducido=sc.nextLine();
        int cantCaracteres =textoIntroducido.length();
        return cantCaracteres;
    }
    
}
