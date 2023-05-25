/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.urg.model.business.entities;

import cat.institutmvm.urg.persistence.utils.GestioUtils;
import java.time.LocalDate;

/**
 *
 * @author Seku
 */
public class Urgencia implements Visita {
    public static int nivell=0;
    private String motiu;
    private LocalDate data;
    private Pacient pacient;
    private int torn;

    
    
    //<editor-fold defaultstate="collapsed" desc="getters">
    
    
    public int getNivell() {
        return nivell;
    }
    
    public String getPacientDNI(){
        return pacient.getDni();
    }

    public String getMotiu() {
        return motiu;
    }

    public LocalDate getData() {
        return data;
    }

    public Pacient getPacient() {
        return pacient;
    }
    
    
   

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="setters">
     public void setNivell(int nivell) {    
        this.nivell = nivell;
    }
     
     public int getTorn() {
        return torn;
    }

    public void setMotiu(String motiu) {
        this.motiu = motiu;
    }
    
        public void setData(LocalDate data) {
        this.data = data;
    }
        
    public void setData() {
        this.data = LocalDate.now() ;
    }
    public void setPacient(Pacient pacient) {
        this.pacient = pacient;
    }
    
    public void setTorn(int torn){
        this.torn=torn;
    }
    
    public void setTorn(){
        this.torn=generateTorn();
    }

//</editor-fold>
    
    
    public Urgencia(){}
    public Urgencia(Pacient pacient, LocalDate data, String motiu,int torn){
    this.setPacient(pacient);
    this.setData(data);
    this.setMotiu(motiu);
    this.setTorn(torn);
    }
    
  
    
      public Urgencia(Pacient pacient,String motiu){
    this.setPacient(pacient);
    this.setData();
    this.setMotiu(motiu);
    this.setTorn();
    }
    
            
    @Override
            public String toString(){
                var sb = new StringBuilder();
                sb.append(String.format("DNI:        %s %n", this.pacient.getDni()));
                sb.append(String.format("Nom:        %s %n  ", this.getPacient().getDni()));
                sb.append(String.format("Cognom:     %s %n ",this.getPacient().getCognom()));
                sb.append(String.format("Nivell:     %s %n", this.getNivell()));
                //sb.append(String.format("Data:       %d - %d - %d %n", this.getData().getYear(),this.getData().getMonth(),this.getData().getDayOfMonth()));
                sb.append(String.format("Motiu:      %s %n", this.getMotiu()));
                sb.append(String.format("Torn:         %d %n", this.getTorn()));
                return sb.toString();
            }
            
            
            @Override
    public int generateTorn() {
        return GestioUtils.Torn();
    }
    
    
}
