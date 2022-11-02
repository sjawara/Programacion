
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alum
 */
public class Optimizacion_marko {

    private static final String MSG_1 = "Introdueix un any: ";
    private static final String MSG_2 = "Es un any de trespàs";
    private static final String MSG_3 = "No es un any de trespàs";

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println(MSG_1);
        num = sc.nextInt();

        if (num % 4 == 0 ) {
            System.out.println(MSG_2);
        } else {
            System.out.println(MSG_3);
        }
    }

}
