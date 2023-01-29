/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutumvm;

import cat.institutmvm.utils.Metodes;
import java.util.Scanner;

/**
 *
 * @author Seku
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodes met = new Metodes();
        int min = 0, max = 200;
        Scanner sc = new Scanner(System.in);
        boolean tipusCorrecte=false,trobat;
        /*
        String text=met.retornText(sc);
        System.out.println(text);
   
        text=met.retornText(sc);
        char car1=met.retornCaracter(sc);
        char car2=met.retornCaracter(sc);
        text=text.replace(car1, car2);
        System.out.println(text);
        
        String text="",textBuscar="" ;
        text= met.retornText(sc,text);
        textBuscar=met.retornText(sc, textBuscar);
        boolean contiene=(text.contains(textBuscar))?true:false;
        if(text.contains(textBuscar)){
            System.out.println("Trobat");
        }else{
            System.out.println("No trobat");
        }
        
        String text="";
        text=met.retornText(sc, text);
        System.out.println(text.length());
        */
        int[] array= new int[10];
        for(int i=0;i<array.length;i++){
        array[i]=(int)(Math.random()*(max-min+1)+min);
        }
        int num=met.validacioInt(sc, max, tipusCorrecte);
        trobat=met.trobarValor(array, num);
        System.out.println(trobat);

    }
}
