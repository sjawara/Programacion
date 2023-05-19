/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.ui;

import java.awt.Dimension;
import java.awt.Toolkit;
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
     JButton comprovació=new JButton("Comprovació");
     txtDni.setBounds(10,13,50, 30);
     getDni.setBounds(10, 38, 360, 20);
     comprovació.setBounds(370, 38, 120, 19);
     panel.add(txtDni);
     panel.add(getDni);
     panel.add(comprovació);
    
     
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
    
    afegir.setBounds(50, WIDTH, WIDTH, HEIGHT);
    
    
    getContentPane().add(panel);
    this.setVisible(true);//Ponemos que el panel se pueda ver
    this.setResizable(false);

    }
}
