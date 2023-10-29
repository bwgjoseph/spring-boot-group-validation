package com.bwgjoseph.springbootgroupvalidation.simple;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ValidateForHomeValidator.class)
public @interface ValidateForHome {
    String message() default "{SourceTypeError}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
