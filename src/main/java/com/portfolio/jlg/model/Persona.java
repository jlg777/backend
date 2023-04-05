package com.portfolio.jlg.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
//Con la annotation incorporamos automaticamente los getter y setter
@Getter @Setter 
public class Persona {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    //Generamos los atributos
    private Long id; 
    private String nombre;
    private String apellido;

    //Constructor vacio
    public Persona() {
    }

    //Constructor con atributos
    public Persona(Long id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    
    
    
    
}
