package com.bwgjoseph.springbootgroupvalidation.conditional;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Repeatable(Conditionals.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {ConditionalValidator.class})
public @interface Conditional {

    String message() default "This field is required lalal.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    String selected();
    String[] required();
    String[] values();
}