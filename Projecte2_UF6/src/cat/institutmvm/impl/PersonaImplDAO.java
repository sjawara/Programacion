/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.impl;

import cat.institutmvm.contracts.PersonaDAO;
import cat.institutmvm.entities.Persona;
import cat.institutmvm.exceptions.DAOException;
import cat.institutumvm.utils.Gestio_utils;
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
        try(var connection = Gestio_utils.openConnection();
                PreparedStatement sentSQL = connection.prepareStatement("Select DNI,nom,cognom,birthdate,genere From persona WHERE DNI=?")){
        sentSQL.setString(1, DNI);
        try(ResultSet reader = sentSQL.executeQuery()){
        if(reader.next())
            per = Gestio_utils.getPersona(reader);
        }
       }catch(SQLException | IOException ex){
                throw new DAOException(ex);
                }
        return per;
    }

    @Override
    public List<Persona> getPersonabyDNI() throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
