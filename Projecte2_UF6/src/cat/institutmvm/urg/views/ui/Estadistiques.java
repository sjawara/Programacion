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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Seku
 */
public class Estadistiques extends JFrame {
    private static final String DONES="----------------------------------------------------\n"+
                                      "   DONES                                  \n"
                                    + "----------------------------------------------------\n";
     private static final String HOMES="----------------------------------------------------\n"+
                                      "   HOMES                                  \n"
                                    + "----------------------------------------------------\n";
    private StringBuilder sb= new StringBuilder();
    private String textoFinal;
    
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
        List<Urgencia> urgencies= new ArrayList<>();
        List<Urgencia> dones=new ArrayList<>();
        List<Urgencia> homes=new ArrayList<>();
        try {
        urgencies = urgImpl.getUrgencies();
        //dones.stream().filter(e -> e.getPacient().getGenere().equals(Genere.DONE));
        dones=urgencies.stream().filter(e -> e.getPacient().getGenere()==Genere.DONE).collect(Collectors.toList());
        sb.append(DONES);
        
        Collections.sort(dones, new Comparator<Urgencia>() {
            @Override
            public int compare(Urgencia o1, Urgencia o2) {
                return o2.getPacient().getCognom().compareTo(o1.getPacient().getCognom());
            }
        });
        
        sb.append(dones.toString());
        homes=urgencies.stream().filter(e -> e.getPacient().getGenere()==Genere.HOME).collect(Collectors.toList());
        sb.append(HOMES);
        sb.append(homes.toString());
        
        var edadMin=urgencies.stream().mapToDouble(e->e.getPacient().getAge()).min();
        sb.append(String.format("L'edat mínima és de:%d\n", (int)edadMin.getAsDouble()));
        
        var edadMax = urgencies.stream().mapToDouble(e->e.getPacient().getAge()).max();
        sb.append(String.format("L'edat màxima és de:%d\n", (int)edadMax.getAsDouble()));
        
        var edadAvg = urgencies.stream().mapToDouble(e->e.getPacient().getAge()).average();
                sb.append(String.format("L'edat mitjana és de:%f\n", edadAvg.getAsDouble()));
        
        var totalUrgencies = urgencies.stream().count();
        
        sb.append(String.format("El total d'urgencies és de:%d\n", totalUrgencies));
        
        textoFinal=sb.toString();
        stats.setText(textoFinal);
        }catch(DAOException ex){
        
        }
        
        
        getContentPane().add(panel);
         this.setVisible(true);
         
    }
}
