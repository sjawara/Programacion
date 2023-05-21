/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.impl;

import cat.institutmvm.contracts.PacientDAO;
import cat.institutmvm.entities.Pacient;
import cat.institutmvm.exceptions.DAOException;
import cat.institutumvm.utils.Gestio_utils;
import java.io.IOException;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;


/**
 *
 * @author Seku
 */
public class PacientImplDAO implements PacientDAO{

    @Override
    public  Pacient getPacientbyDNI(String DNI) throws DAOException {
        Pacient pac = null;
        try(var connection = Gestio_utils.openConnection();
        PreparedStatement sentSQL = connection.prepareStatement("Select TSI,DNI From pacient WHERE DNI=?")){
        sentSQL.setString(1,DNI);
        try(ResultSet reader = sentSQL.executeQuery()){
            if(reader.next()){
            pac = Gestio_utils.getPacient(reader);
            }
        }
        }catch(SQLException | IOException ex){
                throw new DAOException(ex);
                }
        return pac;
    }

    @Override
    public List<Pacient> getPacients() throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
