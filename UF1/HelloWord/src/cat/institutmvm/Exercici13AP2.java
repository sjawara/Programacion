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
public class Exercici13AP2 {

    private static final int ZERO = 0;
    private static final String MSG_1 = "Este es nuestro menú  \n"
            + "1.sumar\n"
            + "2.restar\n"
            + "3.multiplicar\n"
            + "4.dividir";
    private static final String MSG_2 = "Escoge una opción";
    private static final String MSG_3 = "Tiene que ser una opción de las que hay en nuestro menú";
    private static final String MSG_4 = "Escribe un número entero";
    private static final String MSG_5 = "La suma de estos dos números es";
    private static final String MSG_6 = "La resta de estos dos números es";
    private static final String MSG_7 = "La multiplicación de estos dos números es";
    private static final String MSG_8 = "La división de estos dos números es";
    private static final String MSG_9 = "Si quiere continuar, introduzca un 0, si no escriba cualquier otro carácter.";
    private static final String MSG_10 = "Has de introducir un número entero";

    public static void main(String[] args) {
        int opcion = 0, num2 = 0, num3 = 0, aux=0;
        boolean valorCorrecte;
        Scanner sc = new Scanner(System.in);

        System.out.println(MSG_1);
        do {
            System.out.println(MSG_2);
            do {
                valorCorrecte = sc.hasNextInt();
                if (valorCorrecte) {
                    opcion = sc.nextInt();
                    if (opcion < 1 || opcion > 4) {
                        System.out.println(MSG_3);
                    }

                } else {
                    sc.next();
                    System.out.println(MSG_3);
                }
            } while (!valorCorrecte && (opcion < 1 || opcion > 4));

            switch (opcion) {
                case 1:
                    do {
                        System.out.println(MSG_4);
                        valorCorrecte = sc.hasNextInt();
                        if (valorCorrecte) {
                            num2 = sc.nextInt();
                        } else {
                            sc.next();
                        }
                    } while (!valorCorrecte);

                    do {
                        System.out.println(MSG_4);
                        valorCorrecte = sc.hasNextInt();
                        if (valorCorrecte) {
                            num3 = sc.nextInt();
                        } else {
                            sc.next();
                        }
                    } while (!valorCorrecte);

                    System.out.println(MSG_5 + (num2 + num3));
                    break;

                case 2:
                    do {
                        System.out.println(MSG_4);
                        valorCorrecte = sc.hasNextInt();
                        if (valorCorrecte) {
                            num2 = sc.nextInt();
                        } else {
                            sc.next();
                        }
                    } while (!valorCorrecte);

                    do {
                        System.out.println(MSG_4);
                        valorCorrecte = sc.hasNextInt();
                        if (valorCorrecte) {
                            num3 = sc.nextInt();
                        } else {
                            sc.next();
                        }
                    } while (!valorCorrecte);

                    System.out.println(MSG_6 + (num2 - num3));
                    break;
                case 3:
                    do {
                        System.out.println(MSG_4);
                        valorCorrecte = sc.hasNextInt();
                        if (valorCorrecte) {
                            num2 = sc.nextInt();
                        } else {
                            sc.next();
                        }
                    } while (!valorCorrecte);

                    do {
                        System.out.println(MSG_4);
                        valorCorrecte = sc.hasNextInt();
                        if (valorCorrecte) {
                            num3 = sc.nextInt();
                        } else {
                            sc.next();
                        }
                    } while (!valorCorrecte);

                    System.out.println(MSG_7 + (num2 * num3));
                    break;
                case 4:
                    do {
                        System.out.println(MSG_4);
                        valorCorrecte = sc.hasNextInt();
                        if (valorCorrecte) {
                            num2 = sc.nextInt();
                        } else {
                            sc.next();
                        }
                    } while (!valorCorrecte);

                    do {
                        System.out.println(MSG_4);
                        valorCorrecte = sc.hasNextInt();
                        if (valorCorrecte) {
                            num3 = sc.nextInt();
                        } else {
                            sc.next();
                        }
                    } while (!valorCorrecte);
                    if (num3<num2){
                    aux=num2;
                    num2=num3;
                    num3=aux;
                    }

                    System.out.println(MSG_8 + (num2 / num3));
                    break;
            }
            do {
                System.out.println(MSG_9);
                valorCorrecte = sc.hasNextInt();
                if (valorCorrecte) {
                    opcion = sc.nextInt();
                } else {
                    sc.next();
                    System.out.println(MSG_10);
                }
            } while (!valorCorrecte);

        } while (opcion != 0);
    }

}
