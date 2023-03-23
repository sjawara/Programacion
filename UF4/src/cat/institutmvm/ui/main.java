/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm.ui;

import cat.institutmvm.entities.bicicleta;
import cat.institutmvm.entities.cat;

/**
 *
 * @author alumne_1r
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Exercici 5
        cat michi=new cat("michi","guui","pienso",12);
        michi.play();
        
        bicicleta mibici=new bicicleta();
        mibici.tipusMoviment();
        mibici.slep();
    }
    
}
