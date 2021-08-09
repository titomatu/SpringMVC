/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customvalidator;

/**
 *
 * @author titonitola-maturana
 */
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
public class CPostalMadridValidation implements ConstraintValidator<CPostalMadrid, String>{
    private String codigoMadrid;

    @Override
    public void initialize(CPostalMadrid constraintAnnotation) {
        codigoMadrid = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        //Value el código postal que el usuario haya ingresado
        if(value!=null)
            return value.startsWith(codigoMadrid);//Si lo llena debe empezar por 28
        else return true; //Si lo deja en null igual continue        
    }
    
}
