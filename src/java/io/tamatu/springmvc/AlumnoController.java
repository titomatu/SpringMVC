/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.tamatu.springmvc;

import io.tamatu.springmvc.model.Alumno;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.annotation.InitBinder;

/**
 *
 * @author titonitola-maturana
 */
@Controller
@RequestMapping("/alumnosapi")
public class AlumnoController {
    
    @InitBinder
    public void miBinder(WebDataBinder binder){
        StringTrimmerEditor editor = new StringTrimmerEditor(true);
        
        binder.registerCustomEditor(String.class, editor);
        
    }
    
    @RequestMapping("/registrarAlumno")
    public String formularioRegistrarAlumno(Model modelo){
        
        Alumno alumno = new Alumno();
        
        modelo.addAttribute("nuevoAlumno", alumno);
        
        return "registroAlumno";
    }
    
    @RequestMapping("/registroAlumnoConfirmado")
    public String registroAlumnoConfirmado(@Valid @ModelAttribute("nuevoAlumno") Alumno alumno,
                                            BindingResult resultadoValidacion){
        
        if(resultadoValidacion.hasErrors()){
            return "registroAlumno";
        }
        
        return "registroConfirmadoAlumno";
    }
}
