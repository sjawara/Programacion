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

    private static final int EJ = 4;
    private static final String MSG_3 = "Introduce un texto";
    private static final String MSG_1 = "El texto que has escrito es el siguiente:";
    private static final String MSG_2 = "La cantidad de caracteres es:";
    private static final String MSG_4 = "Introduce el texto a buscar";
    private static final String MSG_5 = "Introduce un caracter";
    private static final String MSG_6 = "Introdueix un nombre natural";
    private static final String MSG_7 = "Error,ha de ser un nombre natural";

    public static void main(String[] args) {
        /*int num = 0, num2 = 0, num1 = 0;
        //int[] arrayEj9 = new int[EJ];
        boolean tipusCorrecte = false, validacio;
        Scanner sc = new Scanner(System.in);
        String textoIntroducido = "";
        */
        Entrada ent = new Entrada();
        /*Ejercicio 7
         num=ent.validacioInt(0, MSG_6, MSG_7, tipusCorrecte, sc);
        System.out.println(Math.abs(num));
        
        //Ejercicio 8
        num = ent.validacioInt(num, MSG_6, MSG_7, tipusCorrecte, sc);
        num2 = ent.validacioInt(num2, MSG_6, MSG_7, tipusCorrecte, sc);
        System.out.println(Math.pow(num,num2));
         */
        /*Ejercicio 9
        for(int i=0;i<EJ;i++){
            arrayEj9[i]=ent.validacioInt(num, MSG_6, MSG_7, tipusCorrecte, sc);
        }
        for(int i=1;i<EJ;i=i+2){
            System.out.println(arrayEj9[i]);
        }
         */
        //Ejercicio 10

        /*
        //Ejercicio 13
        num = ent.validacioInt(num, MSG_6, MSG_7, tipusCorrecte, sc);
        num1 = ent.validacioInt(num, MSG_6, MSG_7, tipusCorrecte, sc);
        num2 = ent.validacioInt(num, MSG_6, MSG_7, tipusCorrecte, sc);
        validacio=ent.validacioRang(num, num1, num2);
        System.out.format((num <= num2 && num >= num1) ? "%d esta dins del rang "
                + "%d i %d" : "%d no esta dins del rang %d i %d",num,num1,num2);
         */
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
        
        
        
        //Ejericicio 20
        System.out.println(MSG_3);
        textoIntroducido=sc.nextLine();
        System.out.println(MSG_5);
         char caracter=sc.next().charAt(0);
        System.out.println(MSG_5);
        char caracter2=sc.next().charAt(0);
        System.out.println(textoIntroducido.replace(caracter, caracter2));
         */
        //System.out.println(ent.fibonacci(4));
        
        int n = 3;
        ent.hanoiTower(n, 'A', 'C', 'B');
        /*
        int arr[] = {10,20,30,40,50};  
        int key = 50;  
        int last=arr.length-1;  
        int result;
        result=ent.binarySearch(arr, 0, last, key);
        
        if (result == -1){ 
            System.out.println("Element is not found!");}  
        else{
            System.out.println("Element is found at index: "+result);
                    }
        */
    }  
    }

          



