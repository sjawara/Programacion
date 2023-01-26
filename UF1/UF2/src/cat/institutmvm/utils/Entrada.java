/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.utils;

import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class Entrada {

    public int validacioInt(int num, String MSG_6, String MSG_7, boolean tipusCorrecte, Scanner sc) {
        do {
            System.out.println(MSG_6);
            tipusCorrecte = sc.hasNextInt();
            if (tipusCorrecte) {
                num = sc.nextInt();
            } else {
                System.out.println(MSG_7);
                sc.next();
            }
        } while (!tipusCorrecte);
        return num;
    }

    public String devolverTexto(Scanner sc, String textoIntroducido) {
        textoIntroducido = sc.nextLine();
        return textoIntroducido;
    }

    public int contarCaracteres(Scanner sc) {

        String textoIntroducido;
        textoIntroducido = sc.nextLine();
        int cantCaracteres = textoIntroducido.length();
        return cantCaracteres;
    }

    public boolean validacioRang(int num, int num1, int num2) {
        int aux;
        boolean validacio;
        if (num1 > num2) {
            aux = num2;
            num2 = num1;
            num1 = aux;
        }
        validacio = (num <= num2 && num >= num1) ? true : false;
        return validacio;
    }

    public int fibonacci(int num) {
        //condició base
        if (num == 0 || num == 1) {
            return num;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }

    public void hanoiTower(int n, char from_disc, char to_disc, char aux) {
        if (n == 1) {
            System.out.format("Mou el disc 1 des de %c fins a %c\n", from_disc, to_disc);
        } else {
            hanoiTower(n - 1, from_disc, aux, to_disc);
            System.out.format("Mou el disc %d des de %c fins a %c\n", n, from_disc, to_disc);
            hanoiTower(n - 1, aux, to_disc, from_disc);
        }
    }

    public  int binarySearch(int arr[], int first, int last, int key) {
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
}
