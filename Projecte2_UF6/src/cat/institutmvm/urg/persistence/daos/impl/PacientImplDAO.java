/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.urg.persistence.daos.impl;

import cat.institutmvm.urg.persistence.daos.contracts.PacientDAO;
import cat.institutmvm.urg.model.business.entities.Pacient;
import cat.institutmvm.urg.persistence.exceptions.DAOException;
import cat.institutmvm.urg.persistence.utils.GestioUtils;
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
        try(var connection = GestioUtils.openConnection();
        PreparedStatement sentSQL = connection.prepareStatement("Select TSI,DNI From pacient WHERE DNI=?")){
        sentSQL.setString(1,DNI);
        try(ResultSet reader = sentSQL.executeQuery()){
            if(reader.next()){
            pac = GestioUtils.getPacient(reader);
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
