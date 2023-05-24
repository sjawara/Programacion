/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.urg.model.business.entities;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Seku
 */
public class Persona {
    //<editor-fold defaultstate="collapsed" desc="State">
    public static enum Genere{
    HOME,DONE,NULL;
    }
    private String dni, nom, cognom;
    private LocalDate birthDate;
    private  Genere genere;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="getters">

    public String getDni() {
        return dni;
    }

    public String getNom() {
        return nom;
    }

    public String getCognom() {
        return cognom;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Genere getGenere() {
        return genere;
    }
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="setters">
     public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }
    
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructor">
    public Persona(){}
    public Persona(String dni, String nom, String cognom){
    this.setDni(dni);
    this.setNom(nom);
    this.setCognom(cognom);
    }
    public Persona(String dni, String nom, String cognom, LocalDate birthDate, Genere genere){
    this.setDni(dni);
    this.setNom(nom);
    this.setCognom(cognom);
    this.setBirthDate(birthDate);
    this.setGenere(genere);
    
    
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="behavior">
        public int getAge() {
        var period = Period.between(this.getBirthDate(), LocalDate.now());
        return period.getYears();
    }
//</editor-fold>
}
