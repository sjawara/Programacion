package cat.institutmvm;


import java.util.Scanner;

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

//Pre:rebre nomres per teclat
public class Exercici8 {

    private static final String MSG_1 = "Introdueix un nombre enter";
    private static final String MSG_2 = "Digas quants nombres vols introduir";
    


    public static void main(String[] args) {
        int num=1, num2, i=0;
        Scanner sc = new Scanner(System.in);

        while (num !=0){//Mentre el numero sigui diferent a 0
            System.out.println(MSG_1);
            num = sc.nextInt();
        }
    //Exercici b
        System.out.println(MSG_2);
        num2=sc.nextInt();
        while (i!=num2){//Fins que el contador arribar a la cuantitat que ha marcat el usuari
            System.out.println(MSG_1);
            num= sc.nextInt();
            i++;//Incrementem de 1 en 1
        }
    }
    }

//Post:Finalitzar el rpgrama cuan es compleixin els requisits