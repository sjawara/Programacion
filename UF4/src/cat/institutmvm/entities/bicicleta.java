/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.entities;

/**
 *
 * @author alumne_1r
 */
public class bicicleta extends moviment{
    private String modelo;
    
    public String  getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo){
    this.modelo=modelo;
    }
    
    @Override
    public void tipusMoviment() {
        System.out.println("Rodes");
    }
    
    public bicicleta(){}
    public bicicleta(String modelo){
    modelo=this.getModelo();
    }
    
    
}
