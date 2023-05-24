/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cat.institutmvm.urg.persistence.daos.contracts;

import cat.institutmvm.urg.model.business.entities.Pacient;
import cat.institutmvm.urg.persistence.exceptions.DAOException;
import java.util.List;

/**
 *
 * @author Seku
 */
public interface PacientDAO {
    Pacient  getPacientbyDNI(String DNI) throws DAOException;
    List<Pacient> getPacients() throws DAOException;
    
    
}
