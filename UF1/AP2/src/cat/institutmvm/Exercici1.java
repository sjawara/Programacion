/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

/**
 *
 * @author alumne_1r
 */
//Pre: No n'hi h aprecondicio ya que el progrma s'executara sense cap dade de entrada
public class Exercici1 {

    private static final String Nom = "Seku";
    private static final String Cognom = "Jawara";
    private static final String NomCognom = "Seku \nJawara";// Gràcies a n hi haurà un salt de línia

    public static void main(String[] args) {
        int i;
        String ast = "*";//variable per fer el cuadrat y el triangle
        System.out.println(Nom);
        System.out.println(Nom + " " + Cognom);
        System.out.println(NomCognom);
        for (i = 0; i < 10; i++) {  //bucle per printar 10 columnes de 10 * y fer el cuadrat
            System.out.println("**********");
        }
        for (i = 0; i < 10; i++) { // bucle per fer el triangle
            System.out.println(ast);
            ast = ast + "*"; //afegir un * a cada linea de sota per obtenir la forma d'un triangle
        }
    }

}
/* Post:
*Imprimir: El meu nom.
*Imprimir: El meu nom i cognoms en la mateixa línia.
*Imprimir: El meu nom en una linia y el cognom en la següent.
*Imprimir: Un cuadrat de 10x10 amb asteriscs.
*Imprimir: Un triangle de base 10 amb asteriscs.
 */
