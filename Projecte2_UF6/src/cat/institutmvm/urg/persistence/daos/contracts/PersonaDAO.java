/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cat.institutmvm.urg.persistence.daos.contracts;

import cat.institutmvm.urg.model.business.entities.Persona;
import cat.institutmvm.urg.persistence.exceptions.DAOException;
import java.util.List;

/**
 *
 * @author Seku
 */
public interface PersonaDAO {
    Persona getPersonabyDNI(String DNI) throws DAOException; 
    List<Persona> getPersonabyDNI() throws DAOException;

}
