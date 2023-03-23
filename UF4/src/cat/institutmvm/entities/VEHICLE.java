/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.entities;

/**
 *
 * @author alumne_1r
 */
public abstract class VEHICLE {
    private String velocidad,color;
    private boolean motor;
    public abstract void movimiento();
    
    public String getVelocidad(){
    return velocidad;
    }
    
    public void setVelocidad(String velocidad){
    this.velocidad=velocidad;
    }
    
    public String getColor(){
    return color;
    }
    
    public void setColor(String color){
    this.color=color;
    }
    
    public boolean getMotor(){
    return motor;
    }
    
    public void setMotor(boolean motor){
    this.motor=motor;
    }
    
    public VEHICLE(String velocidad,String color,boolean motor){
        velocidad=this.getVelocidad();
        color=this.getColor();
        motor=this.getMotor();
    }
    
    
    
    
}