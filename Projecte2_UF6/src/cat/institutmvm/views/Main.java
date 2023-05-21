/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm.views;

import cat.institutmvm.entities.Pacient;
import cat.institutmvm.exceptions.DAOException;
import cat.institutmvm.impl.PacientImplDAO;
import cat.institutmvm.ui.Prj_GUI;

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
     **/
    }
}