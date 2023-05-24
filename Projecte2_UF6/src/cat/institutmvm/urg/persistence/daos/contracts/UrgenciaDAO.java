/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cat.institutmvm.urg.persistence.daos.contracts;

import cat.institutmvm.urg.model.business.entities.Urgencia;
import cat.institutmvm.urg.persistence.exceptions.DAOException;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Seku
 */
public interface UrgenciaDAO {
    void insertUrgencia(String DNI,int nivell, LocalDate data,String motiu,int torn) throws DAOException; 
    List<Urgencia> getUrgencies()throws DAOException;
}
