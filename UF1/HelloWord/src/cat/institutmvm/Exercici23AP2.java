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
public class Exercici23AP2 {

    private static final int MIN = 0;
    private static final int NUMP = 3;
    private static final int EDMAX=118;
    private static final String MSG_1 = "Introduce tu edad.";
    private static final String MSG_2 = "Introduce tu sexo";
    private static final String MSG_3 = "Introduce tu salario.";
    private static final String MSG_4 = "Ets becari";
    private static final String MSG_5 = "ERROR: Data no valido";
    private static final String MSG_6 = "Pasamos al siguiente alumno";
    private static final String ID="id";
    private static final String ED="EDAD";
    private static final String SE="SEXE";
    private static final String SA="SALARI";
    private static final String BE="BECARI";

    public static void main(String[] args) {
        int[] edat = new int[NUMP];
        char[] sexe = new char[NUMP];
        double[] salari = new double[NUMP];
        boolean[] becari = new boolean[NUMP];
        boolean sortida, tipusCorrecte, beca;
        char letra;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < NUMP; i++) {//Bucle per fer a cada persona 
            do {
                sortida = false;
                System.out.println(MSG_1);
                tipusCorrecte = sc.hasNextInt();
                if (tipusCorrecte) {
                    edat[i] = sc.nextInt();
                    if (edat[i] < MIN || edat[i]>EDMAX) {//nadie puede tener menos de 0 años
                        System.out.println(MSG_5);
                    } else {
                        sortida = true;
                    }

                } else {
                    sc.next();
                    System.out.println(MSG_5);
                }

            } while (sortida == false);

            do {
                sortida = false;
                System.out.println(MSG_2);
                letra = sc.next().charAt(MIN);
                if (letra == 'D' || letra == 'H' || letra == 'd' || letra == 'h') {
                    sexe[i] = letra;
                    sortida = true;
                } else {
                    System.out.println(MSG_5);
                }
            } while (sortida == false);

            do {
                sortida = false;
                System.out.println(MSG_3);
                tipusCorrecte = sc.hasNextDouble();
                if (tipusCorrecte) {
                    salari[i] = sc.nextDouble();
                    if (salari[i] < 0) {//nadie puede cobrar menos de 0€
                        System.out.println(MSG_5);
                    } else {
                        sortida = true;
                    }

                } else {
                    sc.next();
                    System.out.println(MSG_5);
                }
            } while (sortida == false);

            do {
                sortida = false;
                System.out.println(MSG_4);
                beca = sc.hasNextBoolean();
                if (beca) {
                    becari[i] = beca;
                    sortida = true;
                } else {
                    System.out.println(MSG_5);
                    sc.next();
                }
            } while (sortida == false);
            if(i<NUMP){
                System.out.println(MSG_6);
            }
            sc.next();
            System.out.println();
        }
        
                    System.out.print(ID+"|"+ED+"|"+SE+"|"+SA+"|"+BE+"|");
                    System.out.println();
        for(int i=0;i<NUMP;i++){
            System.out.println(i+"  |"+edat[i]+"  |"+sexe[i]+"  |"+salari[i]+"|"+becari[i]+"|");
            System.out.println();
        }
    }

}
