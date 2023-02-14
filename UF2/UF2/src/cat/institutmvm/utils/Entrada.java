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
public class Entrada {

    public int validacioInt(int num, boolean tipusCorrecte, Scanner sc) {
        do {
            System.out.println("Introduce un numero entero.");
            tipusCorrecte = sc.hasNextInt();
            if (tipusCorrecte) {
                num = sc.nextInt();
            } else {
                System.out.println("Error,ha de ser un numero entero.");
                sc.next();
            }
        } while (!tipusCorrecte);
        return num;
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
    
}
