package com.bwgjoseph.springbootgroupvalidation;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class AddressController {
    @PostMapping("/address")
    public AddressDto create(@Valid @RequestBody AddressDto addressDto) {
        return addressDto;
    }
}
