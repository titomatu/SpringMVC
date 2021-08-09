/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customvalidator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

/**
 *
 * @author titonitola-maturana
 */
@Constraint(validatedBy=CPostalMadridValidation.class) //Lógica de la 
@Target({ElementType.METHOD, ElementType.FIELD})//Aplicación en métodos y campos
@Retention(RetentionPolicy.RUNTIME)//Cuando se chequea si se cumple o no
public @interface CPostalMadrid {
    //Definir el código postal por defecto
    public String value() default "28";
    //Definir el mensaje de error
    public String message() default "El código postal debe comenzar por 28";
    //Definir los grupos
    Class<?>[] groups() default {};
    //Definir los payloads
    Class<? extends Payload>[] payload() default {};
}
