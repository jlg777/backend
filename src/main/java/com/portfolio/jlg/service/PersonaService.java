
package com.portfolio.jlg.service;

import com.portfolio.jlg.model.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;




public class PersonaService implements IPersonaService{
    @Autowired 
    PersonaRepository perso;

    @Override
    public List<Persona> verPersona() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
   

    
    
}
