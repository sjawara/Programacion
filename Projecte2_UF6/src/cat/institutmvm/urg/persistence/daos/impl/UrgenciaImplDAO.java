/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.urg.persistence.daos.impl;

import cat.institutmvm.urg.persistence.daos.contracts.UrgenciaDAO;
import cat.institutmvm.urg.model.business.entities.Urgencia;
import cat.institutmvm.urg.persistence.exceptions.DAOException;
import cat.institutmvm.urg.persistence.utils.GestioUtils;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;


/**
 *
 * @author Seku
 */
public class UrgenciaImplDAO implements UrgenciaDAO{

    @Override
    public void insertUrgencia(String DNI,int nivell, LocalDate data,String motiu,int torn) throws DAOException {
        Urgencia urg = null;
        try(var connection = GestioUtils.openConnection();
                PreparedStatement sentSQL = connection.prepareStatement("INSERT INTO urgencia(DNI,nivell,data,motiu,torn) VALUES(?,?,?,?,?)")){
            //Esta hecho con una query normal porque con el procedimiento me daba error(el usuario no tiene acceso a los metadatos)
            sentSQL.setString(1, DNI);
            sentSQL.setInt(2, nivell);
            var data2=java.sql.Date.valueOf(data);
            sentSQL.setDate(3, data2);
            sentSQL.setString(4, motiu);
            sentSQL.setInt(5, torn);
            sentSQL.executeUpdate();
            
        }catch(SQLException | IOException ex){
            throw new DAOException(ex);
        }
        
    }

    @Override
    public List<Urgencia> getUrgencies() throws DAOException {
        List<Urgencia> listUrg = new ArrayList<>();
        try(var connection = GestioUtils.openConnection();
                PreparedStatement sentSQL = connection.prepareStatement("Select u.DNI, u.nivell, u.data,u.motiu,u.torn, p.nom, p.cognom, p.genere,p.birthdate From urgencia u JOIN pacient pa ON(u.DNI=pa.DNI) JOIN persona p 	ON(pa.DNI=p.DNI)")){
            try(ResultSet reader = sentSQL.executeQuery()){
            listUrg=GestioUtils.getUrgencies(reader);
            }
            
        }catch(SQLException | IOException ex){
            throw new DAOException(ex);
        }
        return listUrg;
    }
    
}
