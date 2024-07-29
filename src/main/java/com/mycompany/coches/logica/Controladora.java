
package com.mycompany.coches.logica;

import com.mycompany.coches.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void saveAuto(String modelo, String marca, String motor, String color, String placa, int cant_puertas) {
        
        Automovil auto = new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPlaca(placa);
        auto.setCant_puertas(cant_puertas);
        
        
        controlPersis.saveAuto(auto);
        
    }

    public List<Automovil> traerAutos() {
        
        return controlPersis.traerAutos();
        
    }

    public void deleteAuto(int num_auto) {
        
        controlPersis.deleteAuto(num_auto);
        
    }

    public Automovil findAuto(int num_coche) {
        
        return controlPersis.findAuto(num_coche);
        
    }

    public void editAuto(Automovil auto, String modelo, String marca, String motor, String color, String placa, int cant_puertas) {
        
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPlaca(placa);
        auto.setCant_puertas(cant_puertas);
        
        controlPersis.editAuto(auto);
        
    }
    
}
