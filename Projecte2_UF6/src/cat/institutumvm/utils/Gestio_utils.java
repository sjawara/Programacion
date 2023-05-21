/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutumvm.utils;

import cat.institutmvm.entities.Pacient;
import cat.institutmvm.entities.Persona;
import cat.institutmvm.entities.Persona.Genere;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Seku
 *  mysql-sjawara.alwaysdata.net
 */
public class Gestio_utils {
    
    private static String url = "jdbc:mysql://mysql-sjawara.alwaysdata.net/sjawara_gestiourgencies";
    private static String server = "jdbc:mysql://mysql-sjawara.alwaysdata.net/";
    private static String bbdd = "sjawara_gestiourgencies";
    private static String user = "sjawara_2";
    private static String password = "usuari123";
    
    
    public static Connection openConnection() throws SQLException, IOException{
    Properties props = new Properties();
    props.load(new FileReader("config/gstU.properties"));
    /**
    return DriverManager.getConnection(props.getProperty("url"),
            props.getProperty("user"),
            props.getProperty("password")
            );
**/
    return DriverManager.getConnection(server+bbdd, user, password);
    }
    
    public static Pacient getPacient(ResultSet reader) throws SQLException{
    Pacient p = new Pacient(reader.getString("DNI"),reader.getString("TSI"));
    return p;
    }
    
    public static Persona getPersona(ResultSet reader) throws SQLException{
       Persona pe = new Persona(reader.getString("DNI"),reader.getString("nom"),reader.getString("cognom"),reader.getDate("birthdate").toLocalDate(),Genere.valueOf(reader.getString("genere")));

        //Persona pe = new Persona(reader.getString("DNI"),reader.getString("nom"),reader.getString("cognom"),reader.getDate("birthdate").toLocalDate(),reader.getString("genere"));
    return pe;
    }
    
    
    public static int Torn() {
        return (int) (Math.random()*(50000-0)+0);
    }
    
}
