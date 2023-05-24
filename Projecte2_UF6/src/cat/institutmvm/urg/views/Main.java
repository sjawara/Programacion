/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm.urg.views;

import cat.institutmvm.urg.model.business.entities.Pacient;
import cat.institutmvm.urg.model.business.entities.Urgencia;
import cat.institutmvm.urg.persistence.exceptions.DAOException;
import cat.institutmvm.urg.persistence.daos.impl.PacientImplDAO;
import cat.institutmvm.urg.persistence.daos.impl.UrgenciaImplDAO;
import cat.institutmvm.urg.views.ui.Prj_GUI;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Seku
 */
public class Main {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws DAOException {
        Prj_GUI proyecto =new Prj_GUI();
       /*
        Pacient seku = new Pacient(); 
        PacientImplDAO seku2= new PacientImplDAO();
        
        seku = seku2.getPacientbyDNI("41028576B");
        System.out.println(seku.getTSI());
     
    Urgencia urg = new Urgencia();
    urg.setData();
     System.out.println(urg.getData());

       UrgenciaImplDAO uu=new UrgenciaImplDAO();
       uu.insertUrgencia("41028576B", 0, LocalDate.now(), "Accident", 155);
        LO DE ABAJO FUNCIONA 
        List<Urgencia> uu=new ArrayList<>();
       UrgenciaImplDAO u=new UrgenciaImplDAO();
       uu=u.getUrgencies();
       var count =uu.stream().count();
        System.out.println(count);
   
       List<Urgencia> uu=new ArrayList<>();
       UrgenciaImplDAO u=new UrgenciaImplDAO();
       uu=u.getUrgencies();
        System.out.println(uu.size());
        
       //for(int i =0;i<uu.size();i++){}
       **/ 
       
    }
    
}