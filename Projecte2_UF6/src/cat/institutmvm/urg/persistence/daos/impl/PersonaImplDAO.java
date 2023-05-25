/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.urg.persistence.daos.impl;

import cat.institutmvm.urg.persistence.daos.contracts.PersonaDAO;
import cat.institutmvm.urg.model.business.entities.Persona;
import cat.institutmvm.urg.persistence.exceptions.DAOException;
import cat.institutmvm.urg.persistence.utils.GestioUtils;
import java.io.IOException;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author Seku
 */
public class PersonaImplDAO implements PersonaDAO{

    @Override
    public Persona getPersonabyDNI(String DNI) throws DAOException {
        Persona per = null;
        try(var connection = GestioUtils.openConnection();
                PreparedStatement sentSQL = connection.prepareStatement("Select DNI,nom,cognom,birthdate,genere From persona WHERE DNI=?")){
        sentSQL.setString(1, DNI);
        try(ResultSet reader = sentSQL.executeQuery()){
        if(reader.next())
            per = GestioUtils.getPersona(reader);
        }
       }catch(SQLException | IOException ex){
                throw new DAOException(ex);
                }
        return per;
    }

  
    
}
