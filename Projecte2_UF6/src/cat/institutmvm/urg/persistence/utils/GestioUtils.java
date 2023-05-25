/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.urg.persistence.utils;

import cat.institutmvm.urg.model.business.entities.Pacient;
import cat.institutmvm.urg.model.business.entities.Persona;
import cat.institutmvm.urg.model.business.entities.Persona.Genere;
import cat.institutmvm.urg.model.business.entities.Urgencia;
import cat.institutmvm.urg.persistence.exceptions.DAOException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 *
 * @author Seku
 *  mysql-sjawara.alwaysdata.net
 */
public class GestioUtils {
    
    
        public static Connection openConnection() throws SQLException, IOException {
        Properties props = new Properties();
        props.load(new FileReader("config/jdbc.properties"));
        return DriverManager.getConnection(props.getProperty("mysql.url"),
                                           props.getProperty("mysql.username"),
                                           props.getProperty("mysql.password"));
    }
    
    public static Pacient getPacient(ResultSet reader) throws SQLException{
    Pacient p = new Pacient(reader.getString("DNI"),reader.getString("TSI"));
    return p;
    }
    
    public static Persona getPersona(ResultSet reader) throws SQLException{
       Persona pe = new Persona(reader.getString("DNI"),reader.getString("nom"),reader.getString("cognom"),reader.getDate("birthdate").toLocalDate(),Genere.valueOf(reader.getString("genere")));

    return pe;
    }
    
    public static List <Urgencia> getUrgencies(ResultSet reader) throws DAOException{
         List<Urgencia> urgencias = new ArrayList<>();
        try{
            while (reader.next()){
                String genere = reader.getString("genere");
                Genere genere2 = Genere.valueOf(genere);
                LocalDate birthday2 = reader.getDate("birthdate").toLocalDate();
          Pacient pac = new Pacient(reader.getString("DNI"),reader.getString("nom"),reader.getString("cognom"),genere2,birthday2);
          
          Urgencia urg = new Urgencia(pac,reader.getDate("data").toLocalDate(),reader.getString("motiu"),reader.getInt("torn") );
          LocalDate hoy=  LocalDate.now();
          LocalDate dataUrg = reader.getDate("data").toLocalDate();
          if(dataUrg.equals(hoy)){   
          urgencias.add(urg);
          }
            }
        }catch(SQLException ex){
        
        } 
        return urgencias;
    }
    
        
    public static int Torn() {
        return (int) (Math.random()*(50000-0)+0);
    }
    
}
