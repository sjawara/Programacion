/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm.app;

import cat.institutmvm.utils.Entrada;
import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class Main {
private static final String MSG_3="Introduce un texto";
private static final String MSG_1="El texto que has escrito es el siguiente:";
private static final String MSG_2="La cantidad de caracteres es:";
private static final String MSG_4="Introduce el texto a buscar";
private static final String MSG_5="Introduce un caracter";
    public static void main(String[] args) {
        Entrada ent = new Entrada();
        Scanner sc= new Scanner(System.in);
        String textoIntroducido="";
        
        
        /*Ejercicio 16.
        System.out.println(MSG_3);
        String textoIntroducido = ent.devolverTexto();
        System.out.println(MSG_1+textoIntroducido);
        
        //Ejercicio 17
        System.out.println(MSG_3);
        int cantCaracteres=ent.contarCaracteres();
        System.out.println(MSG_2+cantCaracteres);
        
        //Ejercicio 18
        System.out.println(MSG_3);
        textoIntroducido=ent.devolverTexto(sc, textoIntroducido);
        System.out.println(MSG_4);
        String contiene=ent.devolverTexto(sc, textoIntroducido);
        System.out.println("El texto "+(textoIntroducido.contains(contiene)?"contiene:":"no contiene: ")+ contiene);
        
        //Ejercicio 19
        */
        
        
        //Ejericicio 20
        System.out.println(MSG_3);
        textoIntroducido=sc.nextLine();
        System.out.println(MSG_5);
         char caracter=sc.next().charAt(0);
        System.out.println(MSG_5);
        char caracter2=sc.next().charAt(0);
        System.out.println(textoIntroducido.replace(caracter, caracter2));
        
        
        
        
        
    }
    
}
