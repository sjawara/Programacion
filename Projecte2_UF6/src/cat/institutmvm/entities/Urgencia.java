/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.entities;

import cat.institutumvm.utils.Gestio_utils;
import java.time.LocalDate;

/**
 *
 * @author Seku
 */
public class Urgencia implements Visita {
    private int nivell;
    private String motiu;
    private LocalDate data;
    private Pacient pacient;
    
    //<editor-fold defaultstate="collapsed" desc="getters">

    public int getNivell() {
        return nivell;
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

    public void setMotiu(String motiu) {
        this.motiu = motiu;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
    public void setPacient(Pacient pacient) {
        this.pacient = pacient;
    }

//</editor-fold>
    
    @Override
    public int generateTorn() {
        int torn;
        return Gestio_utils.Torn();
    }
    
}
