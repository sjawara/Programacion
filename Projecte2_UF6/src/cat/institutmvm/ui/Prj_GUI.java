/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.ui;

import cat.institutmvm.entities.Pacient;
import cat.institutmvm.entities.Persona;
import cat.institutmvm.entities.Persona.Genere;
import cat.institutmvm.exceptions.DAOException;
import cat.institutmvm.impl.PacientImplDAO;
import cat.institutmvm.impl.PersonaImplDAO;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author Seku
 */
public class Prj_GUI extends JFrame{
    Pacient pac;
    Persona per;
    PacientImplDAO pacImpl = new PacientImplDAO();
    PersonaImplDAO perImpl = new PersonaImplDAO();
    public Prj_GUI(){
    Toolkit screen = Toolkit.getDefaultToolkit();
    Dimension screenSize = screen.getScreenSize();
    int screenHeight = screenSize.height;
    int screenWidth = screenSize.width;
    setSize(screenWidth / 3, screenHeight / 2);//Ponemos tamaño al panel
    setLocation(screenWidth/4,screenHeight / 4);//Ponemos localización al panel
    
     this.setTitle("Gestió d'urgencies|Consorci de Salut");//Titulo del panel
     JPanel panel = new JPanel();
     panel.setLayout(null);
     Border bordeSubtitulo = BorderFactory.createTitledBorder("Dades del pacient");
     panel.setBorder(bordeSubtitulo);
     
     JLabel txtDni = new JLabel("DNI:");
     JTextField getDni=new JTextField(33);
     JButton comprovacio=new JButton("Comprovació");
     txtDni.setBounds(10,13,50, 30);
     getDni.setBounds(10, 38, 360, 20);
     comprovacio.setBounds(370, 38, 120, 19);
     panel.add(txtDni);
     panel.add(getDni);
     panel.add(comprovacio);
    
     
     JLabel nomCognoms = new JLabel("Nom y cognoms:");
     JTextField getNomCognoms = new JTextField(38);
     nomCognoms.setBounds(10, 53, 100, 20);
     getNomCognoms.setBounds(10, 73,465, 20);
     getNomCognoms.setEditable(false);
     panel.add(nomCognoms);
     panel.add(getNomCognoms);
     
     JLabel TSI = new JLabel("TSI:");
     JTextField getTSI = new JTextField(38);
     TSI.setBounds(10,83,100,30);
     getTSI.setBounds(10, 105, 465, 20);
     getTSI.setEditable(false);
     panel.add(TSI);
     panel.add(getTSI);
     
     JLabel data_naixement = new JLabel("Data naixement:");
     JTextField getData_naixement = new JTextField(38);
     getData_naixement.setEditable(false);
     data_naixement.setBounds(10, 117, 100, 30);
     getData_naixement.setBounds(10, 140, 465, 20);
     
     panel.add(data_naixement);
    panel.add(getData_naixement);
    
    
    JLabel edat = new JLabel("Edat");
    JTextField getEdat = new JTextField();
    edat.setBounds(10, 150, 100, 30);
    getEdat.setBounds(10, 175, 465, 20);
    getEdat.setEditable(false);
    panel.add(edat);
    panel.add(getEdat);
    
    JLabel gènere = new JLabel("Gènere");
    JTextField getGènere = new JTextField();
    getGènere.setEditable(false);
    gènere.setBounds(10, 185, 100, 30);
    getGènere.setBounds(10, 210, 465, 20);
    panel.add(gènere);
    panel.add(getGènere);
    
    JLabel motiu = new JLabel("Motiu de la urgència");
    JTextArea motiuVisita = new JTextArea();
    motiu.setBounds(10,220,150,30);
    motiuVisita.setBounds(10, 245, 465, 100);
    panel.add(motiu);
    panel.add(motiuVisita);
    
    JButton afegir = new JButton("1");
    JButton mostrar = new JButton("2");
    JButton estadístiques = new JButton("3");
    JButton fitxer = new JButton("4");
    
    afegir.setBounds(130, 350, 50, 30);
    mostrar.setBounds(185,350,50,30);
    estadístiques.setBounds(240,350,50,30);
    fitxer.setBounds(295,350,50,30);
    panel.add(afegir);
    panel.add(mostrar);
    panel.add(estadístiques);
    panel.add(fitxer);
    
    comprovacio.addActionListener(new ActionListener(){
        
        @Override
        public void actionPerformed(ActionEvent e) {
            String TSI;
            String dni,nom,cognom,edat;
            Genere genere;
            LocalDate birthDate;
            dni= getDni.getText();
            
            try{ 
                pac=pacImpl.getPacientbyDNI(dni);
                TSI=pac.getTSI();
                getTSI.setText(TSI);
                
                per= perImpl.getPersonabyDNI(dni);
                nom=per.getNom();
                cognom=per.getCognom();
                genere=per.getGenere();
                birthDate=per.getBirthDate();
               edat=String.valueOf(per.getAge());
                getEdat.setText(edat);
                
                getNomCognoms.setText(nom+" "+cognom);
                getData_naixement.setText(birthDate.toString());
                getGènere.setText(genere.toString());
                
                
            }catch(DAOException ex){
                System.out.println("Ha ocurrido un error");
            }
           
        }
    
    });
    
    
    
    
    getContentPane().add(panel);
    this.setVisible(true);//Ponemos que el panel se pueda ver
    this.setResizable(false);

    }
}
