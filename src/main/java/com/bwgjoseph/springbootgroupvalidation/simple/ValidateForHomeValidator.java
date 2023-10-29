package com.bwgjoseph.springbootgroupvalidation.simple;

import com.bwgjoseph.springbootgroupvalidation.AddressDto;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidateForHomeValidator implements ConstraintValidator<ValidateForHome, AddressDto>{
    private String message;

    @Override
    public void initialize(ValidateForHome constraintAnnotation) {
        this.message = constraintAnnotation.message();
    }

    @Override
    public boolean isValid(AddressDto value, ConstraintValidatorContext context) {
        boolean valid = true;
        // if not home, then no need to further evaluate
        if (value.type().equalsIgnoreCase("office")) return valid;
        // if home, check if ownership is blank
        if (value.ownership() == null || value.ownership().isBlank()) {
            context.buildConstraintViolationWithTemplate(this.message).addPropertyNode("ownership").addConstraintViolation();
            valid = false;
        }

        return valid;
    }

}
