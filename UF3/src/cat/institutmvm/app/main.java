/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm.app;

import cat.institutmvm.utils.metodes;
import static cat.institutmvm.utils.metodes.readCSV;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Seku
 */
public class main {

    private static final String MSG_1 = "Introduce un texto";
    private static final String MSG_2 = "Que deseas realizar? \n"
            + "0.Llegir fitxer\n"
            + "1.Guardar text en fitxer\n"
            + "2.Afegir text en fitxer\n"
            + "3.Comptar longitud del document";
    private static final String MSG_3 = "Introduce un número naatural.";
    private static final String MSG_4 = "Error ha de ser un número natural.";
    private static final String MSG_5 = "Error, no esta dentro del rango.";

    public static void main(String[] args) {
        int num;
        boolean tipusCorrecte = false, sortida = false;
        Scanner sc = new Scanner(System.in);
        metodes met = new metodes();
        /*Ejercicio 1
       
        try {
            File file = new File("C:\\Users\\Seku\\Documents\\NetBeansProjects\\UF3\\src\\file\\texto.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data
                );

            }

            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred: ");
            e.printStackTrace();

        }
        
         //Exercici 3
        int numcaracters=0;
        try {
            File file = new File("C:\\Users\\Seku\\Documents\\NetBeansProjects\\UF3\\src\\file\\Exercici3.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                numcaracters+=data.length();
            }
            System.out.println(numcaracters);
            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred: ");
            e.printStackTrace();

        }
         
        //Exercici 5
        String text =met.devolverTexto();
        try{
            BufferedWriter bw =
                    new BufferedWriter(new FileWriter("C:\\Users\\Seku\\Documents\\NetBeansProjects\\UF3\\src\\file\\Exercici5.txt"));
                   bw.write(text);
                   bw.close();
        }catch(IOException ex){
            System.out.println("An error ocurred:");
            ex.printStackTrace();
        }
        finally{
            System.out.println("El fitxer s'ha creat el fitxer correctament");
        }
         
        //Exercici 6
        String text6;
        text6 = met.devolverTexto(MSG_1);

        try {
            BufferedWriter bw
                    = new BufferedWriter(new FileWriter("C:\\Users\\Seku\\Documents\\NetBeansProjects\\UF3\\src\\file\\Exercici6.txt", true));
            bw.write(text6);
            bw.newLine();
            bw.close();
            
        }catch(IOException ex){
            System.out.println("An error ocurred:");
            ex.printStackTrace();
        }
        finally{
            System.out.println("S'ha afegit el text correctament");
        }
         
        //Exercici 7
        int numEx7 = 0;
        do {
            numEx7 = met.validacioInt(tipusCorrecte, sc, MSG_3, MSG_4);
            sortida = met.validacioRang(numEx7, 0, 3);
            if (sortida == false) {
                System.out.println(MSG_5);
            }
        } while (sortida == false);
        switch (numEx7) {
            case 0:
                System.out.println("Introduce el documento que quieres leer");
                String textEj7;
                textEj7 = met.devolverTexto(MSG_1);
                met.scannerClassRead(textEj7, MSG_1);
                break;
            case 1:
                String text = met.devolverTexto(MSG_1);
                met.bufferedWritter(text);
                break;
            case 2:
                String text6;
                text6 = met.devolverTexto(MSG_1);
                met.bufferedWritterTrue(text6);
                break;
            case 3:
                System.out.println("De que documento quieres saber la cantidad de caracteres?");
                String Ej7CantCar;
                Ej7CantCar = met.devolverTexto(MSG_1);
                met.retornChar(Ej7CantCar);
                break;
        }
        
        //Exercici 9
        int ej9,edadEj9;
        ej9=met.validacioInt(tipusCorrecte, sc, MSG_3, MSG_4);
        String nom,cognom;
        nom=met.devolverTexto(MSG_1);
        cognom=met.devolverTexto(MSG_1);
        edadEj9=met.validacioInt(tipusCorrecte, sc, MSG_3, MSG_4);
        met.bufferedWritterTrue(ej9, nom, cognom, edadEj9);
        */
        //Exercici 10
        readCSV();
        //Ejercicio 11
        
    }

}
