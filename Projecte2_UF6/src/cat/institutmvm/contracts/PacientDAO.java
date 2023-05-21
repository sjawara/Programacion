/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cat.institutmvm.contracts;

import cat.institutmvm.entities.Pacient;
import cat.institutmvm.exceptions.DAOException;
import java.util.List;

/**
 *
 * @author Seku
 */
public interface PacientDAO {
    Pacient  getPacientbyDNI(String DNI) throws DAOException;
    List<Pacient> getPacients() throws DAOException;
    
    
}
