/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Seku
 */
public class metodes {

    public String devolverTexto(String MSG_1) {
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        String text;
        text = sc.nextLine();
        return text;
    }

    public int validacioInt(boolean tipusCorrecte, Scanner sc, String MSG_1, String MSG_2) {
        int num = 0;
        do {
            System.out.println(MSG_1);
            tipusCorrecte = sc.hasNextInt();
            if (tipusCorrecte) {
                num = sc.nextInt();
            } else {
                System.out.println(MSG_2);
                sc.next();
            }
        } while (!tipusCorrecte);
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

    public void scannerClassRead(String num1, String MSG_1) {
        try {
            File file = new File("C:\\Users\\Seku\\Documents\\NetBeansProjects\\UF3\\src\\file\\", num1);
            Scanner scc = new Scanner(file);

            while (scc.hasNextLine()) {
                String data = scc.nextLine();
                System.out.println(data
                );

            }

            scc.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred: ");
            e.printStackTrace();

        }

    }

    public void bufferedWritter(String text) {
        try {
            BufferedWriter bw
                    = new BufferedWriter(new FileWriter("C:\\Users\\Seku\\Documents\\NetBeansProjects\\UF3\\src\\file\\Exercici7.txt"));
            bw.write(text);
            bw.close();
        } catch (IOException ex) {
            System.out.println("An error ocurred:");
            ex.printStackTrace();
        } finally {
            System.out.println("El fitxer s'ha creat el fitxer correctament");
        }

    }

    public void bufferedWritterTrue(String text) {
        try {
            BufferedWriter bw
                    = new BufferedWriter(new FileWriter("C:\\Users\\Seku\\Documents\\NetBeansProjects\\UF3\\src\\file\\Exercici7.txt", true));
            bw.write(text);
            bw.newLine();
            bw.close();

        } catch (IOException ex) {
            System.out.println("An error ocurred:");
            ex.printStackTrace();
        } finally {
            System.out.println("S'ha afegit el text correctament");
        }

    }

    public int retornChar(String text) {
        int numcaracters = 0;

        try {
            File file = new File("C:\\Users\\Seku\\Documents\\NetBeansProjects\\UF3\\src\\file\\", text);
            Scanner scc = new Scanner(file);

            while (scc.hasNextLine()) {
                String data = scc.nextLine();
                numcaracters = data.length() + numcaracters;
            }
            System.out.println(numcaracters);
            scc.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred: ");
            e.printStackTrace();

        }
        return numcaracters;
    }

    public void bufferedWritterTrue(int ej9, String nom, String cognom, int edad) {
        try {
            BufferedWriter bw
                    = new BufferedWriter(new FileWriter("C:\\Users\\Seku\\Documents\\NetBeansProjects\\UF3\\src\\file\\ej9.txt", true));
            String ej91, edads;
            ej91 = Integer.toString(ej9);
            edads = Integer.toString(edad);
            bw.write("id: " + ej91 + ", ");
            bw.write("nom: " + nom + ", ");
            bw.write("cognom: " + cognom + ", ");
            bw.write("edad: " + edads + ".");
            bw.newLine();
            bw.close();

        } catch (IOException ex) {
            System.out.println("An error ocurred:");
            ex.printStackTrace();
        } finally {
            System.out.println("S'ha afegit el text correctament");
        }

    }

    public static void readCSV() {
        String st;
        try {
            String csvSplitBy = ",";
            File file = new File("C:\\Users\\Seku\\Documents\\NetBeansProjects\\UF3\\src\\file\\dades.csv");
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((st = br.readLine()) != null) {
                String[] row = st.split(csvSplitBy);
                for (int i = 0; i < row.length; i++) {
                    System.out.print(row[i] + "\t");
                }
                System.out.println();

            }
        } catch (FileNotFoundException ex) {
            System.out.println("An error ocurred");
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("An error ocurred");
            ex.printStackTrace();
        }
    }
}
