/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.urg.views.ui;

import cat.institutmvm.urg.model.business.entities.Persona.Genere;
import cat.institutmvm.urg.model.business.entities.Urgencia;
import cat.institutmvm.urg.persistence.daos.impl.UrgenciaImplDAO;
import cat.institutmvm.urg.persistence.exceptions.DAOException;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Seku
 */
public class Estadistiques extends JFrame {
    UrgenciaImplDAO urgImpl = new UrgenciaImplDAO();
    public Estadistiques(){
    Toolkit screen = Toolkit.getDefaultToolkit();
        Dimension screenSize = screen.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setSize(screenWidth / 3, screenHeight / 2);//Ponemos tamaño al panel
        setLocation( 880,  215);//Ponemos localización al panel

        this.setTitle("Estadístiques|Gestió d'urgencies|Consorci de Salut");//Titulo del panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        JTextArea stats=new JTextArea();
        var scrollPane = new JScrollPane(stats);
        stats.setBounds(10, 20, 300, 300);
        scrollPane.setBounds(10, 20, 480, 370);
        panel.add(scrollPane);
        List<Urgencia> dones= new ArrayList<>();
        try {
        dones = urgImpl.getUrgencies();
        //dones.stream().filter(e -> e.getPacient().getGenere().equals(Genere.DONE));
        dones.stream().filter(e -> e.getPacient().getGenere()==(Genere.DONE));

        stats.setText(dones.toString());
        }catch(DAOException ex){
        
        }
        
        
        getContentPane().add(panel);
         this.setVisible(true);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
