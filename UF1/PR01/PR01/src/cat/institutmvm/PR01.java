/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

/**
 *
 * Sekuna Jawara
 */
public class PR01 {
//Pre: Introducen por teclado su id, su edad, el tipo de venta, el importe de la compra y el teléfono.

    private static final int MIN1 = 111;
    private static final int MAX1 = 999;
    private static final int MINEDAD = 14;
    private static final int MAXEDAD = 120;
    private static final int TIPOV = 0;
    private static final int TIPOV2 = 3;
    private static final int ICOMPRA = 100;
    private static final int TLFMIN = 111111111;
    private static final int TLFMAX = 999999999;
    private static final int NXIF=9;//Número de cifras que ha de tener el número de teléfono. 

    private static final String MSG_1 = "Introduce tú id.\n"
            + "(ha de ser un numero entero entre el  111 y el 999 (ambos incluidos).)";
    private static final String MSG_2 = "Introduce tú edad.\n"
            + "(Recuerda que has de tener entre 14 y 120 años)";
    private static final String MSG_3 = "Cual es el tipo de venta?\n"
            + "(0)Venta libre\n"
            + "(1)Pensionista\n"
            + "(2)Carnet joven\n"
            + "(3)Socio";

    private static final String MSG_4 = "Has de introducir un número que esté en el rango. ";
    private static final String MSG_5 = "V Libre";//Abreviamos la palabra para que al final del código nos quede más estético.
    private static final String MSG_6 = "Pensionista";
    private static final String MSG_7 = "C Joven";
    private static final String MSG_8 = "Socio";
    private static final String MSG_9="Introduce el importe de la compra.\n"+
"(Recuerda que el importe máximo es de 100 €)";
    private static final String MSG_10="Introduce tú número de teléfono.";
    private static final String MSG_11="Número no válido";
    private static final String MSG_12="Id";
    private static final String MSG_13="Edad";
    private static final String MSG_14="Tipo";
    private static final String MSG_15="Importe";
    private static final String MSG_16="Teléfono";
private static final String MSG_17="Programa finalizado por error en los datos.";
    public static void main(String[] args) {
        int tipus = 0, id = 0, edad = 0, importe = 0, telefono = 0, i = 0,xif=0, aux=0;
        boolean tipusCorrecte, sortida = false;
        String txttipus="";
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println(MSG_1);
            tipusCorrecte = sc.hasNextInt();//Verificamos que introduce un entero
            if (tipusCorrecte) {
                id = sc.nextInt();
                if (id > MAX1 || id < MIN1) {//Si esta fuera del intervalo se haran las siguientes acciones
                    System.out.println(MSG_4);
                    i++;
                    System.out.println("");
                } else {
                    sortida = true;//Si esta dentro del intervalo aceptamos la salida

                }

            } else {//Si no es un entero se incrementará el contador
                sc.next();
                System.out.println(MSG_4);
                i++;
                System.out.println("");
            }
            if (i == 3) {//Si ha llegado al límite de errores se acepta la salida.
                sortida = true;
            }
        } while (sortida == false);//Mientras la salida no sea aceptada con los casos anteriores.

        if (i != 3) {//Si no se ha llegado al límite de errores
            i = TIPOV;//Reiniciamos el contador
            sortida = false;//Ponemos que la salida sea falsa para que funcione el programa
            do {
                System.out.println(MSG_2);
                tipusCorrecte = sc.hasNextInt();
                if (tipusCorrecte) {
                    edad = sc.nextInt();
                    if (edad > MAXEDAD || edad < MINEDAD) {
                        System.out.println(MSG_4);
                        i++;
                        System.out.println("");
                    } else {
                        sortida = true;
                    }

                } else {
                    sc.next();
                    System.out.println(MSG_4);
                    i++;
                    System.out.println("");
                }
                if (i == 3) {
                    sortida = true;
                }
            } while (sortida == false);
        }
        if (i != 3) {
            i = TIPOV;
            sortida = false;
            System.out.println(MSG_3);
            do {
                tipusCorrecte = sc.hasNextInt();
                if (tipusCorrecte) {
                    tipus = sc.nextInt();
                    if (tipus <= TIPOV2 && tipus >= TIPOV) {//Si el numero esta dentro del rango.
                        switch (tipus) {
                            case 0:
                                txttipus = MSG_5;//Le damos valor al String para mostrarlo por pantalla al final.
                                break;
                            case 1:
                                txttipus = MSG_6;
                                break;
                            case 2:
                                txttipus = MSG_7;
                                break;
                            case 3:
                                txttipus = MSG_8;
                                break;
                        }
                        sortida = true;//Confirmamos la salida
                    } else {
                        System.out.println(MSG_4);
                        i++;
                        System.out.println("");
                    }

                } else {
                    sc.next();
                    System.out.println(MSG_4);
                    i++;
                    System.out.println("");
                }
                if (i == 3) {
                    sortida = true;
                }

            } while (sortida == false);
        }
        if (i != 3) {
            i = TIPOV;
            sortida = false;
            do {
                System.out.println(MSG_9);
                tipusCorrecte = sc.hasNextInt();
                if (tipusCorrecte) {
                    importe= sc.nextInt();
                    if (importe > ICOMPRA || importe < TIPOV) {
                        System.out.println(MSG_4);
                        i++;
                        System.out.println("");
                    } else {
                        sortida = true;
                    }

                } else {
                    sc.next();
                    System.out.println(MSG_4);
                    i++;
                    System.out.println("");
                }
                if (i == 3) {
                    sortida = true;
                }
            } while (sortida == false);
        }
                if (i != 3) {
            i = TIPOV;
            sortida = false;
            do {
                System.out.println(MSG_10);
                tipusCorrecte = sc.hasNextInt();
                if (tipusCorrecte) {
                    telefono= sc.nextInt();
                    aux=telefono;
                    while (aux!=0){
                    aux=aux /10;
                    xif=xif+1;//Calculamos el número de cifras.
                    }
                    if ((telefono > TLFMAX || telefono <TLFMIN)&& xif!=NXIF ) {//Si el número está fuera del rango y tiene un número de cifras diferentes a 9.
                        System.out.println(MSG_11);
                        i++;
                        System.out.println("");
                    } else {
                        sortida = true;
                    }

                } else {
                    sc.next();
                    System.out.println(MSG_11);
                    i++;
                    System.out.println("");
                }
                if (i == 3) {
                    sortida = true;
                }
            } while (sortida == false);
            System.out.print(MSG_12+"  "+MSG_13+"  "+MSG_14+"  "+MSG_15+"  "+MSG_16);
                    System.out.println("");
            System.out.print(id+"  "+edad+"  "+txttipus+" "+importe+"  "+ telefono);
        }
                else{
                    System.out.println(MSG_17);
                }
    }
}
//Post:Devolvemos un resumen de los valores introducidos en caso de que los introduzca correctamente
