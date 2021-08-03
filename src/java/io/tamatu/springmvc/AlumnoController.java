/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.tamatu.springmvc;

import io.tamatu.springmvc.model.Alumno;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author titonitola-maturana
 */
@Controller
@RequestMapping("/alumnosapi")
public class AlumnoController {
    
    @RequestMapping("/registrarAlumno")
    public String formularioRegistrarAlumno(Model modelo){
        
        Alumno alumno = new Alumno();
        
        modelo.addAttribute("nuevoAlumno", alumno);
        
        return "registroAlumno";
    }
    
    @RequestMapping("/registroAlumnoConfirmado")
    public String registroAlumnoConfirmado(@ModelAttribute("nuevoAlumno") Alumno alumno){
        return "registroConfirmadoAlumno";
    }
}
