/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm.app;

import cat.institutmvm.utils.metodes;
import java.util.Scanner;

/**
 *
 * @author Seku
 */
public class main {

    //Pre: Introducen por teclado su id, su edad, el tipo de venta, el importe de la compra y el teléfono.
    private static final int MIN1 = 111;
    private static final int ERRENTE = -1;
    private static final int MAX1 = 999;
    private static final int MINEDAD = 14;
    private static final int MAXEDAD = 120;
    private static final int TIPOV = 0;
    private static final int TIPOV2 = 3;
    private static final int ICOMPRA = 1000;
    private static final int TLFMIN = 111111111;
    private static final int TLFMAX = 999999999;
    private static final int NXIF = 9;//Número de cifras que ha de tener el número de teléfono. 
    private static final int MAXRANDOM = 5000;

    private static final String MSG_1 = "Introduce tú id.\n"
            + "(ha de ser un número entero entre el  111 y el 999 ambos incluidos.)";
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
    private static final String MSG_9 = "Introduce el importe de la compra.\n"
            + "(Recuerda que el importe máximo es de 1000 €)";
    private static final String MSG_10 = "Introduce tú número de teléfono.";
    private static final String MSG_11 = "Número no válido.";
    private static final String MSG_12 = "Id";
    private static final String MSG_13 = "Edad";
    private static final String MSG_14 = "Tipo";
    private static final String MSG_15 = "Importe";
    private static final String MSG_16 = "Teléfono";
    private static final String MSG_17 = "Ha excedido el límite de errores.";
    private static final String MSG_18 = "Cuantos registros desea introducir.";
    private static final String MSG_19 = "Error, ha de ser un entero mayor que 0.";
    private static final String MSG_20 = "¿Desea introducir un nuevo registro de cliente?\n 0=si/ 1=no";
    private static final String MSG_21 = "Error, ha de ser un número entre el 0 y el 1.";
    private static final String MSG_22 = "Quieres consultar el tipo de cliente?\n(1=si, 0=no)";
    private static final String MSG_23 = "Que tipo de cliente?";
    private static final String MSG_24 = "Error ha de ser un número entero.";
    private static final String MSG_25 = "Error, ha de ser un número entre el 0 y el 3.";
    private static final String MSG_26 = "Quieres ver un resumen estadístico de los datos?\n (1=si, 0=no)";
    private static final String MSG_27 = "Número de clientes introducidos: ";
    private static final String MSG_28 = "Número de clientes por tipo:";
    private static final String MSG_29 = "Histograma de número de clientes por tipo:";
    private static final String LINEAS = "----------------------------------------------------";
    private static final String MSG_30 = "Importe total acumulado: ";
    private static final String MSG_31 = "El número ha de ser mayor a 0";
    private static final String MSG_32 = "Error ha de ser un numero entero";
    private static final String MSG_33 = "Random";
    private static final String MSG_34 = "la media de edad es:";

    public static void main(String[] args) {
        metodes met = new metodes();
        int tipuss, idd, edadd , importee , telefonoo, i,
                xif, numreg = 0, finpr, j = 0, filt,
                numclientes = 0, resEst, trobat;
        boolean tipusCorrecte = false, sortida = false, endprog = false, valRang , repetir = false;
        Scanner sc = new Scanner(System.in);

        do {
            numreg = met.validacioInt(tipusCorrecte, sc, MSG_18, MSG_32);
            if (numreg > 0) {
                sortida = true;
            } else {
                System.out.println(MSG_19);
            }
        } while (sortida == false);
        int[] id = new int[numreg];
        int[] edad = new int[numreg];
        int[] tipo = new int[numreg];
        int[] importe = new int[numreg];
        int[] telefono = new int[numreg];
        int[] arRandom = new int[numreg];

        do {
            i = TIPOV;
            sortida = false;
            do {
                idd = met.validacioInt(tipusCorrecte, sc, MSG_1, MSG_32);
                valRang = met.validacioRang(idd, MIN1, MAX1);
                if (idd != ERRENTE) {//Si el número es -1 quiere decir que no ha introducido un entero.
                    if (valRang == true) {
                        sortida = true;
                        id[j] = idd;
                    } else {
                        System.out.println(MSG_4);
                        i++;
                        sortida = false;
                        System.out.println();//Para que sea más visual el error y que ha de introducir otro número.
                    }
                    if (i == TIPOV2) {
                        sortida = true;
                    }
                } else {
                    i++;
                }
            } while (sortida == false);

            if (i != TIPOV2) {
                //Si no se ha llegado al límite de errores
                i = TIPOV;//Reiniciamos el contador
                sortida = false;//Ponemos que la salida sea falsa para que funcione el programa
                do {
                    edadd = met.validacioInt(tipusCorrecte, sc, MSG_2, MSG_32);
                    valRang = met.validacioRang(edadd, MINEDAD, MAXEDAD);
                    if (edadd != ERRENTE) {
                        if (valRang == true) {
                            sortida = true;
                            edad[j] = edadd;
                        } else {
                            System.out.println(MSG_4);
                            i++;
                            System.out.println();
                        }
                        if (i == TIPOV2) {
                            sortida = true;
                        }
                    } else {
                        i++;
                    }
                } while (sortida == false);

                if (i != TIPOV2) {
                    /*
                      Introducimos el if dentro de otro, ya que si en uno llega al
                      máximo de errores en uno no le dejará hacer ninguno más.
                     */
                    i = TIPOV;
                    sortida = false;
                    do {
                        tipuss = met.validacioInt(tipusCorrecte, sc, MSG_3, MSG_32);
                        valRang = met.validacioRang(tipuss, TIPOV, TIPOV2);
                        if (tipuss != ERRENTE) {
                            if (valRang == true) {
                                sortida = true;
                                tipo[j] = tipuss;
                            } else {
                                System.out.println(MSG_4);
                                i++;
                                System.out.println();
                            }
                            if (i == TIPOV2) {
                                sortida = true;
                            }
                        } else {
                            i++;
                        }
                    } while (sortida == false);

                    if (i != TIPOV2) {
                        i = TIPOV;
                        sortida = false;
                        do {
                            importee = met.validacioInt(tipusCorrecte, sc, MSG_9, MSG_32);
                            valRang = met.validacioRang(importee, TIPOV, ICOMPRA);
                            if (importee != ERRENTE) {
                                if (valRang == true) {
                                    sortida = true;
                                    importe[j] = importee;
                                } else {
                                    System.out.println(MSG_4);
                                    i++;
                                    System.out.println();
                                }
                                if (i == TIPOV2) {
                                    sortida = true;
                                }
                            } else {
                                i++;
                            }
                        } while (sortida == false);

                        if (i != TIPOV2) {
                            i = TIPOV;
                            sortida = false;
                            do {
                                telefonoo = met.validacioInt(tipusCorrecte, sc, MSG_10, MSG_32);
                                valRang = met.validacioRang(telefonoo, TLFMIN, TLFMAX);
                                if (telefonoo != ERRENTE) {
                                    xif = met.contXifras(telefonoo);
                                    if (valRang == true && xif == NXIF) {//Si el numero tiene 9 cifras hara lo siguiente.
                                        sortida = true;
                                        telefono[j] = telefonoo;
                                    } else {
                                        System.out.println(MSG_4);
                                        i++;
                                        System.out.println();
                                    }
                                    if (i == TIPOV2) {
                                        sortida = true;
                                    }
                                } else {
                                    i++;
                                }
                            } while (sortida == false);
                        }
                    }
                }
            } else {
                System.out.println(MSG_17);
                do {//Preguntamos al usuario si quiere introducir un nuevo registro.
                    System.out.println(MSG_20);
                    finpr = met.binaryInt(MSG_21, sc);
                    if (finpr == 1) {
                        endprog = true;
                        sortida = true;
                    } else {
                        sortida = true;//quiere decir que esta en el rango.
                        endprog = false;//quiere decir que desea realizar otro registro.
                        repetir = true;
                        j--;//Le restamos uno ya que luego se lo sumaremos y se quedara en el mismo número de registro.

                    }

                } while (sortida == false);
            }

            if (j == numreg - 1) {//Si ha llegado al número de usuarios que queria introducir.
                endprog = true;
            }
            do {
                arRandom[j] = met.random(TIPOV, MAXRANDOM);
                System.out.println(arRandom[j]);
                trobat = 0;
                trobat = met.searchInt(arRandom, numreg, j, trobat);//Comprobamos si se repite o no
            } while (trobat > 0);
            if (repetir == true) {
                /*Si desea introducir un nuevo registro restarem uno a los contadores
                para acto seguido incrementarlo y que sea en la misma posición,
                lo hago en esta parte de codigo para que no influya en el numero random generado al registro
                anterior
                 */
                j--;
                numclientes--;
            }
            j++;
            numclientes++;//contamos el número de clientes, ya que puede ser diferente de el número de registros deseados a introducido al principio.

        } while (endprog == false);
        met.resultadoTabla(LINEAS, MSG_12, MSG_13, MSG_14, MSG_15, MSG_16, numclientes, id, MSG_5, MSG_6, MSG_7, MSG_8, MSG_33, importe, telefono, tipo, edad, arRandom);
        System.out.println(MSG_22);
        filt = met.binaryInt(MSG_21, sc);
        if(filt==1){
            met.mergeSort(edad, id, tipo, importe, telefono, arRandom);
            do{
            filt=met.validacioInt(tipusCorrecte, sc, MSG_23, MSG_24);
            valRang=met.validacioRang(filt, TIPOV, TIPOV2);
            if(valRang==true){
            met.resultadoFiltro(LINEAS, MSG_12, MSG_13, MSG_14, MSG_15, MSG_16, numclientes, id, MSG_5, filt, MSG_6, MSG_7, MSG_8, MSG_33, importe, telefono, tipo, edad, arRandom);
            }
            }while(valRang!=true);
        }
        System.out.println(MSG_26);
        resEst=met.binaryInt(MSG_21, sc);
        if(resEst==1){
            met.resumenEstadictico(numclientes, numreg, tipo, importe, edad, MSG_28, MSG_27, MSG_7, MSG_5, MSG_6, MSG_8, MSG_30, MSG_29, LINEAS, MSG_34);
        }
        
    }
}
