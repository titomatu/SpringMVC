/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.tamatu.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
