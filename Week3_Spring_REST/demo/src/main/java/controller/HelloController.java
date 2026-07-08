package com.cognizant.demo.controller;

import com.cognizant.demo.Country;
import com.cognizant.demo.service.CountryService;
import com.cognizant.demo.service.exception.CountryNotFoundException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!!";
    }

    @GetMapping("/country")
    public Country getCountry() {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        return context.getBean("in", Country.class);
    }

    @GetMapping("/countries/{code}")
    public Country getCountryByCode(@PathVariable String code)
            throws CountryNotFoundException {
        return countryService.getCountry(code);
    }

    @GetMapping("/countrysearch")
    public Country searchCountry(@RequestParam String code)
            throws CountryNotFoundException {
        return countryService.getCountry(code);
    }

    @PostMapping("/countries")
    public Country addCountry(@Valid @RequestBody Country country) {
        return country;
    }
}