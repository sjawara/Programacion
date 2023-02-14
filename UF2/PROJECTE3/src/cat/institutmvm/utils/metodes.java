/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.utils;

import java.util.Scanner;

/**
 *
 * @author Seku
 */
public class metodes {

    public int validacioInt(boolean tipusCorrecte, Scanner sc, String MSG_1, String MSG_2) {
        int num = -1;

        System.out.println(MSG_1);
        tipusCorrecte = sc.hasNextInt();
        if (tipusCorrecte) {
            num = sc.nextInt();
        } else {
            System.out.println(MSG_2);
            sc.next();
        }

        return num;
    }

    public boolean validacioRang(int n1, int n2, int n3) {
        boolean validacio = false;
        if (n1 >= n2 && n1 <= n3) {
            validacio = true;
        } else {
            validacio = false;
        }
        return validacio;
    }

    public int contXifras(int telefon) {
        int xif = 0;
        while (telefon != 0) {
            telefon = telefon / 10;
            xif++;
        }
        return xif;
    }

    public void resultadoTabla(String LINEAS, String MSG_12, String MSG_13,
            String MSG_14, String MSG_15, String MSG_16, int numclientes, int id[], String MSG_5,
            String MSG_6, String MSG_7, String MSG_8, String MSG_33, int importe[], int telefono[], int tipo[], int edad[], int arRandom[]) {
        System.out.println("");
        System.out.println(LINEAS);
        System.out.print("|" + MSG_12 + "    |" + MSG_13 + "  |" + MSG_14 + "     |" + MSG_15 + "  |" + MSG_16 + " |" + MSG_33 + " |");
        System.out.println("");

        for (int i = 0; i < numclientes; i++) {
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
            System.out.print(importe[i] + "       |" + telefono[i] + "|" + arRandom[i] + "   |");
            System.out.println("");

        }
        System.out.println(LINEAS);

        System.out.println("");

    }

    public void resultadoFiltro(String LINEAS, String MSG_12, String MSG_13,
            String MSG_14, String MSG_15, String MSG_16, int numclientes, int id[], String MSG_5, int filtro,
            String MSG_6, String MSG_7, String MSG_8, String MSG_33, int importe[], int telefono[], int tipo[], int edad[], int arRandom[]) {
        System.out.println("");
        System.out.println(LINEAS);
        System.out.print("|" + MSG_12 + "    |" + MSG_13 + "  |" + MSG_14 + "     |" + MSG_15 + "  |" + MSG_16 + " |" + MSG_33 + " |");
        System.out.println("");

        for (int i = 0; i < numclientes; i++) {
            if (tipo[i] == filtro) {
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
                System.out.print(importe[i] + "       |" + telefono[i] + "|" + arRandom[i] + "   |");
                System.out.println("");

            }
        }
        System.out.println(LINEAS);

        System.out.println("");

    }

    public int binaryInt(String MSG_1, Scanner sc) {
        int num = 3;
        boolean sortida = false;
        boolean tipusCorrecte;
        do {//Le preguntamos si quiere filtrar los datos por tipo de cliente.
            sortida = false;
            tipusCorrecte = sc.hasNextInt();
            if (tipusCorrecte) {
                num = sc.nextInt();
                if (num == 1 || num == 0) {
                    sortida = true;
                } else {
                    System.out.println(MSG_1);
                }

            } else {
                System.out.println(MSG_1);
            }

        } while (sortida == false);//Se le pedira hasta que introduzca un 0 o un 1.
        return num;
    }

    public int random(int min, int max) {
        int num;
        num = (int) (Math.random() * (max - min + 1) + min);
        return num;
    }

    public void mergeSort(int edad[], int id[], int tipus[], int importe[], int telefono[], int arRandom[]) {
        //Con este metodo dividimos los array en partes pequeñas y los reagrupamos ordenadas por un array.
        int edadLength = edad.length;

        if (edadLength < 2) {//El caso base es que si el array es 1 o 0 ya está ordenado.
            return;
        }
        int midArray = edadLength / 2;
        int[] leftHalf = new int[midArray];//Vamos a dividir el array en dos partes
        int[] rightHalf = new int[edadLength - midArray];//No lo hacemos por la mitad por si el numero es impar.
        int[] leftHalfId = new int[midArray];
        int[] rightHalfId = new int[edadLength - midArray];
        int[] leftHalfTipus = new int[midArray];
        int[] rightHalfTipus = new int[edadLength - midArray];
        int[] leftHalfImporte = new int[midArray];
        int[] rightHalfImporte = new int[edadLength - midArray];
        int[] leftHalfTelefono = new int[midArray];
        int[] rightHalfTelefono = new int[edadLength - midArray];
        int[] leftHalfarRandom = new int[midArray];
        int[] rightHalfarRandom = new int[edadLength - midArray];

        for (int i = 0; i < midArray; i++) {
            leftHalf[i] = edad[i];//Le asignamos la mitad de los valores del array principal a uno mas pequeño.
            leftHalfId[i] = id[i];
            leftHalfTipus[i] = tipus[i];
            leftHalfImporte[i] = importe[i];
            leftHalfTelefono[i] = telefono[i];
            leftHalfarRandom[i] = arRandom[i];

        }
        for (int i = midArray; i < edadLength; i++) {
            rightHalf[i - midArray] = edad[i];
            rightHalfId[i - midArray] = id[i];
            rightHalfTipus[i - midArray] = tipus[i];
            rightHalfImporte[i - midArray] = importe[i];
            rightHalfTelefono[i - midArray] = telefono[i];
            rightHalfarRandom[i - midArray] = arRandom[i];

            //Le asignamos la otra mitad, per le restamos midArray para que quede en la posición 0.
        }

        mergeSort(leftHalf, leftHalfId, leftHalfTipus, leftHalfImporte, leftHalfTelefono, leftHalfarRandom);//Llamamos al metodo para que vaya dividiendo el array hasta llegar al caso base.
        mergeSort(rightHalf, rightHalfId, rightHalfTipus, rightHalfImporte, rightHalfTelefono, rightHalfarRandom);
        merge(edad, leftHalf, rightHalf, id, leftHalfId, rightHalfId, tipus, leftHalfTipus, rightHalfTipus,
                importe,leftHalfImporte,rightHalfImporte,telefono,leftHalfTelefono,rightHalfTelefono,
                arRandom,leftHalfarRandom,rightHalfarRandom);
        
    }

    public static void merge(int edad[], int leftHalf[], int rightHalf[], int id[], int leftHalfId[], int rightHalfId[],
            int tipus[], int leftHalfTipus[], int rightHalfTipus[], int importe[], int leftHalfImporte[], int rightHalfImporte[],
            int telefono[], int leftHalfTelefono[], int rightHalfTelefono[], int arRandom[], int leftHalfarRandom[], int rightHalfarRandom[]) {//Con este metodo lo ordenamos.

        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        int i = 0, j = 0, k = 0;//Nos van a servir para ir incrementado los miniarrays.

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {//Si el valor del miniarray i es menor o igual que el valor del mini array posicion j
                edad[k] = leftHalf[i];//Lo ponemos antes en el array grande
                id[k] = leftHalfId[i];
                tipus[k] = leftHalfTipus[i];
                importe[k] = leftHalfImporte[i];
                telefono[k] = leftHalfTelefono[i];
                arRandom[k] = leftHalfarRandom[i];
                i++;
            } else {
                edad[k] = rightHalf[j];
                id[k] = rightHalfId[j];
                tipus[k] = rightHalfTipus[j];
                importe[k] = rightHalfImporte[j];
                telefono[k] = rightHalfTelefono[j];
                arRandom[k] = rightHalfarRandom[j];
                j++;
            }
            k++;//Incrementamos la posición del array principal.
        }

        while (i < leftSize) {//Si han sobrado en el miniarray de la izquierda
            edad[k] = leftHalf[i];
            id[k] = leftHalfId[i];
            tipus[k] = leftHalfTipus[i];
            importe[k] = leftHalfImporte[i];
            telefono[k] = leftHalfTelefono[i];
            arRandom[k] = leftHalfarRandom[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            edad[k] = rightHalf[j];
            id[k] = rightHalfId[j];
            tipus[k] = rightHalfTipus[j];
            importe[k] = rightHalfImporte[j];
            telefono[k] = rightHalfTelefono[j];
            arRandom[k] = rightHalfarRandom[j];
            j++;
            k++;
        }

    }

    public int binarySearch(int arr[], int first, int last, int key) {
        if (last >= first) {
            int mid = first + (last - first) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                return binarySearch(arr, first, mid - 1, key);//search in left subarray  
            } else {
                return binarySearch(arr, mid + 1, last, key);//search in right subarray  
            }
        }
        return -1;
    }

    public int searchInt(int arRandom[], int numreg, int j, int trobat) {
        for (int i = 0; i < j; i++) {
            if (arRandom[i] == arRandom[j]) {
                trobat++;
            }
        }
        return trobat;
    }
    public void resumenEstadictico(int numclientes,int numreg,int tipo[],int importe[],int edad[],String MSG_28,
            String MSG_27,String MSG_7,String MSG_5,String MSG_6,String MSG_8,
            String MSG_30,String MSG_29,String LINEAS,String MSG_34 ){
        int tipo0 = 0, tipo1 = 0, tipo2 = 0, tipo3 = 0, totalimporte = 0,mitjana=0;
        String tipoA = "", tipoB = "", tipoC = "", tipoD = "";
    System.out.print(MSG_27 + numclientes);
             System.out.println();
             System.out.println(MSG_28);
             for (int i=0;i<numreg;i++){
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
             for(int i=0;i<numreg;i++){
                 totalimporte=totalimporte+importe[i];
             }
             System.out.print(MSG_30+totalimporte);
             System.out.println();
             for(int i=0;i<numreg;i++){
             mitjana=mitjana+edad[i];
             }
             System.out.println(MSG_34+mitjana/numclientes);
             
    
    }
}
