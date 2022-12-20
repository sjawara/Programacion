/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

/**
 *
 * @author Seku Jawara
 */
public class PR02 {

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
    private static final int NXIF = 9;//Número de cifras que ha de tener el número de teléfono. 

    private static final String MSG_1 = "Introduce tú id.\n"
            + "(ha de ser un número entero entre el  111 y el 999 (ambos incluidos).)";
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
            + "(Recuerda que el importe máximo es de 100 €)";
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
    private static final String LINEAS = "-------------------------------------------";
    private static final String MSG_30 = "Importe total acumulado: ";

    public static void main(String[] args) {
        int tipuss = 0, idd = 0, edadd = 0, importee = 0, telefonoo = 0, i = 0, 
                xif = 0, aux = 0, numreg = 0, finpr, j = 0, filt=9, filtro=9,
                numclientes=0, resest=8, tipo0=0, tipo1=0, tipo2=0, tipo3=0, totalimporte=0;
        boolean tipusCorrecte, sortida = false, endprog = false;
        String tipoA = "", tipoB="",tipoC="",tipoD="";
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println(MSG_18);
            tipusCorrecte = sc.hasNextInt();
            if (tipusCorrecte) {
                numreg = sc.nextInt();
                if (numreg > 0) {
                    sortida = true;
                } else {
                    System.out.println(MSG_19);
                    System.out.println("");
                }
            } else {
                sc.next();
                System.out.println(MSG_19);
                System.out.println("");
            }
        } while (sortida == false);

        int[] id = new int[numreg];
        int[] tipo = new int[numreg];
        int[] edad = new int[numreg];
        int[] importe = new int[numreg];
        int[] telefono = new int[numreg];
        do {
            do {
                sortida = false;
                System.out.println(MSG_1);
                tipusCorrecte = sc.hasNextInt();//Verificamos que introduce un entero
                if (tipusCorrecte) {
                    idd = sc.nextInt();//si es un entero le damos valor a una variable y más tarde a la posición del arraiz.
                    if (idd > MAX1 || idd < MIN1) {//Si esta fuera del intervalo se haran las siguientes acciones
                        System.out.println(MSG_4);
                        i++;
                        System.out.println("");
                    } else {
                        sortida = true;//Si esta dentro del intervalo aceptamos la salida
                        id[j] = idd;//Una vez el número es correcto le damos valor a la posición del arraiz para así printarlo más tarde.
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
                        edadd = sc.nextInt();
                        if (edadd > MAXEDAD || edadd < MINEDAD) {
                            System.out.println(MSG_4);
                            i++;
                            System.out.println("");
                        } else {
                            edad[j] = edadd;
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
                        tipuss = sc.nextInt();
                        if (tipuss <= TIPOV2 && tipuss >= TIPOV) {//Si el numero esta dentro del rango.
                            tipo[j] = tipuss;
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
                        importee = sc.nextInt();
                        if (importee > ICOMPRA || importee < TIPOV) {
                            System.out.println(MSG_4);
                            i++;
                            System.out.println("");
                        } else {
                            importe[j] = importee;
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
                        telefonoo = sc.nextInt();
                        aux = telefonoo;
                        while (aux != 0) {
                            aux = aux / 10;
                            xif = xif + 1;//Calculamos el número de cifras.
                        }
                        if ((telefonoo > TLFMAX || telefonoo < TLFMIN) && xif != NXIF) {//Si el número está fuera del rango y tiene un número de cifras diferentes a 9.
                            System.out.println(MSG_11);
                            i++;
                            System.out.println("");
                        } else {
                            sortida = true;
                            telefono[j] = telefonoo;
                        }

                    } else {
                        sc.next();
                        System.out.println(MSG_11);
                        i++;
                        System.out.println("");
                    }

                } while (sortida == false);

            } else {
                i = TIPOV;
                System.out.println(MSG_17);
                do {
                    sortida = false;
                    System.out.println(MSG_20);
                    tipusCorrecte = sc.hasNextInt();
                    if (tipusCorrecte) {
                        finpr = sc.nextInt();
                        if (finpr == 1) {
                            endprog = true;
                            sortida = true;
                        } else {
                            if (finpr == 0) {
                                sortida = true;
                                endprog = false;
                            } else {
                                System.out.println(MSG_21);
                                sc.next();
                            }
                        }
                    }
                } while (sortida == false);
            }
            if (j == numreg - 1) {
                endprog = true;
            }
            j++;
            numclientes++;//contamos el número de clientes, ya que puede ser diferente de el número de registros introducido al principio.
        } while (endprog == false);

        System.out.println("");
        System.out.println(LINEAS);
        System.out.print("|" + MSG_12 + "    |" + MSG_13 + "  |" + MSG_14 + "     |" + MSG_15 + "  |" + MSG_16 + " |");
        System.out.println("");

        for (i = 0; i < numreg; i++) {
            System.out.println(LINEAS);
            System.out.print("|" + id[i] + "   |" + edad[i] + "   |");
            switch (tipo[i]) {
                case 0:
                    System.out.print(MSG_5 + "   |");
                    break;
                case 1:
                    System.out.print(MSG_6 + "|");
                    break;
                case 2:
                    System.out.print(MSG_7 + "   |");
                    break;
                case 3:
                    System.out.print(MSG_8 + "     |");
                    break;
            }
            System.out.print(importe[i] + "       |" + telefono[i] + "|");
            System.out.println("");

        }
           System.out.println(LINEAS);

        System.out.println("");
        System.out.println(MSG_22);
        sortida = false;
        do {//Le preguntamos si quiere filtrar los datos por tipo de cliente.
            sortida=false;
            tipusCorrecte = sc.hasNextInt();
            if (tipusCorrecte) {
                filt = sc.nextInt();
                if (filt == 1 || filt == 0) {
                    sortida = true;
                } else {
                    System.out.println(MSG_21);
                }

            } else {
                System.out.println(MSG_24);
            }

        } while (sortida == false);//Se le pedira hasta que introduzca un 0 o un 1.

        if (filt == 1) {//Si quiere que se filtren los arraiz ordenados por edad.
            for (i = 0; i < numreg - 1; i++) {
                for (j = i + 1; j < numreg; j++) {//Ordenamos los arraiz por edad.
                    if (edad[i] > edad[j]) {
                        aux = edad[i];
                        edad[i] = edad[j];
                        edad[j] = aux;

                        aux = id[i];
                        id[i] = id[j];
                        id[j] = aux;

                        aux = importe[i];
                        importe[i] = importe[j];
                        importe[j] = aux;

                        aux = telefono[i];
                        telefono[i] = telefono[j];
                        telefono[j] = aux;

                        aux = tipo[i];
                        tipo[i] = tipo[j];
                        tipo[j] = aux;

                    }
                }
            }
            sortida = false;
            do {//Introducirá números hasta que alguno esté entre el 0 y el 3.
                sortida =false;
                System.out.println(MSG_23);
                tipusCorrecte = sc.hasNextInt();
                if (tipusCorrecte) {
                    filtro = sc.nextInt();
                    if (filtro >= 0 && filtro <= 3) {
                        sortida = true;
                    } else {
                        System.out.println(MSG_25);
                    }

                } else {
                    System.out.println(MSG_24);
                }

            } while (sortida == false);

            System.out.println("");
        System.out.println(LINEAS);
        System.out.print("|" + MSG_12 + "    |" + MSG_13 + "  |" + MSG_14 + "     |" + MSG_15 + "  |" + MSG_16 + " |");
        System.out.println("");
            for (i = 0; i < numreg; i++) {
                if (tipo[i] == filtro) {//Solo printaremos los que sean del tipo que haya pedido el usuario.
                    System.out.println(LINEAS);
            System.out.print("|" + id[i] + "   |" + edad[i] + "   |");
            switch (tipo[i]) {//Utilizamos el switch-case para printar el nombre del tipo de venta
                case 0:
                    System.out.print(MSG_5 + "   |");
                    break;
                case 1:
                    System.out.print(MSG_6 + "|");
                    break;
                case 2:
                    System.out.print(MSG_7 + "   |");
                    break;
                case 3:
                    System.out.print(MSG_8 + "     |");
                    break;
            }
            System.out.print(importe[i] + "       |" + telefono[i] + "|");
            System.out.println("");

                }

            }
                    System.out.println(LINEAS);

        }
        
        System.out.println(MSG_26);
         do{
             sortida=false;
             
            tipusCorrecte = sc.hasNextInt();
            if (tipusCorrecte) {
                resest = sc.nextInt();
                if (resest == 1 || resest == 0) {
                    sortida = true;
                } else {
                    System.out.println(MSG_21);
                }

            } else {
                System.out.println(MSG_24);
            }

        } while (sortida == false);//Se le pedira hasta que introduzca un 0 o un 1.
         if (resest==1){
             System.out.print(MSG_27 + numclientes);
             System.out.println();
             System.out.println(MSG_28);
             for (i=0;i<numreg;i++){
                 switch(tipo[i]){
                     case 0: tipo0++; 
                     tipoA=tipoA + "*";
                     break;
                     case 1:tipo1++;
                     tipoB=tipoB+"*";
                     break;
                     case 2: tipo2++;
                     tipoC=tipoC+"*";
                     break;
                     case 3: tipo3++;
                     tipoD=tipoD+"*";
                     break;
                 }
             }
             System.out.print(MSG_5+": "+tipo0);
             System.out.println();
             System.out.print(MSG_6+": "+tipo1);
             System.out.println();
             System.out.print(MSG_7+": "+tipo2);
             System.out.println();
             System.out.print(MSG_8+": "+tipo3);
             System.out.println();
             System.out.println(MSG_29);
             System.out.println(LINEAS);
             System.out.print(MSG_5+": "+tipoA);
             System.out.println();
             System.out.print(MSG_6+": "+tipoB);
             System.out.println();
             System.out.print(MSG_7+": "+tipoC);
             System.out.println();
             System.out.print(MSG_8+": "+tipoD);
             System.out.println();
             for(i=0;i<numreg;i++){
                 totalimporte=totalimporte+importe[i];
             }
             System.out.print(MSG_30+totalimporte);
             System.out.println();
             
         
         }

    }

}
