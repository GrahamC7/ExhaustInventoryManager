package com.graham.exhaust.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 *
 *
 *
 */
@Constraint(validatedBy = {MaximumProductValidator.class})
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidMaximumProduct {
    String message() default "Part quantity exceeds the set maximum inventory";
    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};
}
