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
@Constraint(validatedBy = {MinimumProductValidator.class})
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidMinimumProduct {
    String message() default "Part quantity is below the set minimum inventory";
    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};
}
