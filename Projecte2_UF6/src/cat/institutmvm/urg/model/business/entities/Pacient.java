/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.urg.model.business.entities;

import java.time.LocalDate;

/**
 *
 * @author Seku
 */
public class Pacient extends Persona{
    private String TSI;
    

    
    public String getTSI() {
        return TSI;
    }

    public void setTSI(String TSI) {
        this.TSI = TSI;
    }
    
    public Pacient(){};
    public Pacient(String dni, String nom, String cognom,LocalDate birthday,Genere genere ,String TSI){
    super(dni,nom,cognom, birthday,genere);
    this.setTSI(TSI);
    };
    
    
    public Pacient(String dni, String TSI){
    this(dni,"NULL","NULL",LocalDate.parse("2004-11-19"),Genere.NULL,TSI);
    }
    
   public Pacient(String DNI){
   this.setDni(DNI);
   }
    
}
