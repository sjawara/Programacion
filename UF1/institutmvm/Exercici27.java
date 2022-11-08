
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Alum
 */
public class Exercici27 {

    private static final String MSG_1 = "Introdueix un nombre enter";
    private static final String MSG_2 = "Aixo no es un nombre enter";
    private static final String MSG_3 = "Les posicions senars son;";

    public static void main(String[] args) {
        int arrayInt[] = new int[20];
        int i = 0;
        boolean tipusCorrecte;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println(MSG_1);
            tipusCorrecte = sc.hasNextInt();
            if (tipusCorrecte) {
                arrayInt[i] = sc.nextInt();
                i++;
            } else {
                System.out.println(MSG_2);
                sc.next();
            }
        } while (i < arrayInt.length);

        System.out.println(MSG_3);
        for (i = 1; i < arrayInt.length;i=i+2) {
            System.out.println(arrayInt[i]);
        }

    }

}
