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
import javax.swing.SwingUtilities;

/**
 *
 * @author Seku
 */
public class Main {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws DAOException {
        
         SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Crea y muestra la primera interfaz
                Prj_GUI proyecto =new Prj_GUI();
                proyecto.setVisible(true);
            }
        });
         
       
    }
    
}