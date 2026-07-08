package com.cognizant.demo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Country {

    @NotBlank(message = "Country code cannot be empty")
    @Size(min = 2, max = 2, message = "Country code must contain exactly 2 characters")
    private String code;

    @NotBlank(message = "Country name cannot be empty")
    @Size(min = 2, max = 50, message = "Country name should be between 2 and 50 characters")
    private String name;

    public Country() {
        System.out.println("Inside Country Constructor.");
    }

    public String getCode() {
        System.out.println("Inside getCode()");
        return code;
    }

    public void setCode(String code) {
        System.out.println("Inside setCode()");
        this.code = code;
    }

    public String getName() {
        System.out.println("Inside getName()");
        return name;
    }

    public void setName(String name) {
        System.out.println("Inside setName()");
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country [code=" + code + ", name=" + name + "]";
    }
}