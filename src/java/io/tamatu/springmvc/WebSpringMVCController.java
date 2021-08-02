/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.tamatu.springmvc;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author titonitola-maturana
 */
@Controller
public class WebSpringMVCController {
    
    @RequestMapping
    public String home(){
        return "index";
    }
    
    @RequestMapping("/holaestudiante")
    public String holaEstudiante(){
        return "holaEstudianteSpring";
    }
    
    @RequestMapping("/procesarhola")
    public String procesarFormulario(){
        return "respuestaHolaEstudiante";
    }
    
    @RequestMapping("/procesarModeloFormulario")
    //public String procesarModeloFormulario(HttpServletRequest request, Model  modelo){
    public String procesarModeloFormulario(@RequestParam("nombreAlumno") String nombre, Model  modelo){        
        //String nombre = request.getParameter("nombreAlumno");
        nombre += " es el mejor ingeniero!";
        
        String mensajeFinal = "¿Quién es el mejor ingeniero? " + nombre;
        
        //Agregando información al modelo
        modelo.addAttribute("mensajeClaro", mensajeFinal);
        
        return "respuestaHolaEstudiante";
    }
}
