
package com.portfolio.jlg.Controller;
//Con la annotation GetMapping se importa esta dependencia o libreria
import com.portfolio.jlg.model.Persona;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
//Con la annotation .PathVariable se importa esta dependencia o libreria
import org.springframework.web.bind.annotation.PathVariable;
//
import org.springframework.web.bind.annotation.RequestParam;
//Con la annotation restcontroller se importa esta dependencia o libreria
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    
    //Probamos el metodo Get
    @GetMapping ("/hola")
    public String decirHola (){
    return "Hola mundo";
    }
    
    //Probamos el metodo Get con parametros
    @GetMapping ("/hola/{nombre}")
    public String decirHola (@PathVariable String nombre){
    return "Hola mundo" + nombre;
    }
    
    @GetMapping ("/chau")
    public String decirChau (@RequestParam String nombre){
    return"chau mundo" + nombre;
    }
    
    
    
  //List<Persona>listaPersonas = new Arraylist();
    
    

    
    
}
