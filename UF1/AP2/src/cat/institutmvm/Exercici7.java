package cat.institutmvm;

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
public class Exercici7 {

    private static final String MSG = "\n";// fem un salt de linea

    public static void main(String[] args) {
        int num = 0;
        //Exercici a
        while (num != 11) {// Diferent a 11 ja que sino arribaria fins al 9
            System.out.println(num);
            num = num + 1;//Incrementem de 1 en 1
        }
        //Exercici b
        System.out.println(MSG);//Fem un salt de linea 
        num = 0;//restablim la variable num per que no inicialitzi on ha finalitzat en el exercici anterior
        while (num != 101) {// Diferent a 101 ja que sino arribaria fins al 99
            System.out.println(num);
            num = num + 1;//Incrementem de 1 en 1
        }
        //Exercici c
        System.out.println(MSG);//Fem un salt de linea 
        num = 0;//restablim la variable num per que no inicialitzi on ha finalitzat en el exercici anterior
        while (num != 102) {// Diferent a 102 ja que sino arribaria fins al 98
            System.out.println(num);
            num = num + 2;//Incrementem de 2 en 2
        }
        //Exercici d
        System.out.println(MSG);//Fem un salt de linea 
        num = 100;//restablim la variable num per que no inicialitzi on ha finalitzat en el exercici anterior
        while (num != -1) {// Diferent a -1 ja que sino arribaria fins al 1
            System.out.println(num);
            num = num - 1;//Restem de dos en dos 
        }
    }
}
/*Post
Printar els 10 primers números començant pel 0.
Pintar els 100 primers números començant pel 0.
Printar els 100 primers números parells començant pel 0.
Printar els números del 0 al 100 en ordre descendent.
*/