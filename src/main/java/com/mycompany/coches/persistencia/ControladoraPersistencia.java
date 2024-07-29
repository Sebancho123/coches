
package com.mycompany.coches.persistencia;

import com.mycompany.coches.logica.Automovil;
import com.mycompany.coches.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
 
    AutomovilJpaController autJpa = new AutomovilJpaController();

    public void saveAuto(Automovil auto) {
        
        autJpa.create(auto);
        
    }

    public List<Automovil> traerAutos() {
        
        return autJpa.findAutomovilEntities();
        
    }

    public void deleteAuto(int num_auto) {
        
        try {
            autJpa.destroy(num_auto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public Automovil findAuto(int num_coche) {
        
        return autJpa.findAutomovil(num_coche);
        
    }

    public void editAuto(Automovil auto) {
        try {
            autJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
