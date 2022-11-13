/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

/**
 *
 * @author Alum
 */
public class PR01 {    
//Pre: Introducen por teclado su id, su edad, el tipo de venta, el importe de la compra y el teléfono.
    
    private static final int MIN1=111;
    private static final int MAX1=999;
    private static final int MINEDAD=14;
    private static final int MAXEDAD=120;
    private static final int TIPOV=0;
    private static final int TIPOV2=3;
    private static final int ICOMPRA=100;
    private static final int TLFMIN=111111111;
    private static final int TLFMAX=999999999;
    
     private static final String MSG_1="Introduce tú id.\n"
             + "(ha de ser un numero entero entre el  111 y el 999 (ambos incluidos).)";
     private static final String MSG_2="Introduce tú edad.\n"
             + "(Recuerda que has de tener entre 14 y 120 años)";
     private static final String MSG_3="Cual es el tipo de venta?\n"
             + "(0)Venta libre\n"
             + "(1)Pensionista"
             + "(2)Carnet joven"
             + "(3)Socio";
     
     private static final String MSG_4="Has de introducir un número que esté en el rango. ";
     
    public static void main(String[] args) {
        int tipus, id=0, edad=0, importe=0, telefono=0,i=0;
        boolean tipusCorrecte;
        Scanner sc=new Scanner(System.in);
        
        do{
            System.out.println(MSG_1);
            tipusCorrecte=sc.hasNextInt();
            if (tipusCorrecte){
                id=sc.nextInt();
                if (id>MAX1 || id<MIN1){
                    System.out.println(MSG_4);
                    i++;
                    System.out.println("");
                }
                
            }
            else {
            sc.next();
            System.out.println(MSG_4);
            i++;
                System.out.println("");
            }
        }while(!tipusCorrecte && i<3 &&(id>MAX1&&id<MIN1));
        
        if(i!=3){
            i=TIPOV;
            do{
            System.out.println(MSG_2);
            tipusCorrecte=sc.hasNextInt();
            if (tipusCorrecte){
                edad=sc.nextInt();
                if (edad>MAXEDAD || edad<MINEDAD){
                    System.out.println(MSG_4);
                    i++;
                    System.out.println("");
                }
                
            }
            else {
            sc.next();
            System.out.println(MSG_4);
            i++;
                System.out.println("");
            }
        }while(!tipusCorrecte && i<3 &&(id>MAXEDAD&&id<MINEDAD));
        }
        if(i!=3){
            i=TIPOV;
        
        }
        
    }
    
}
    

