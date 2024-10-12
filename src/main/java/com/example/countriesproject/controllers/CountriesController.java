package com.example.countriesproject.controllers;

import com.example.countriesproject.entities.CountriesEntity;
import com.example.countriesproject.services.CountriesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/countries")
public class CountriesController {

    private final CountriesServices countriesServices;

    @Autowired
    public CountriesController(CountriesServices countriesServices) {
        this.countriesServices = countriesServices;
    }


    //metodo que trae todos los paises
    @GetMapping
    public List<CountriesEntity> getCountries(){
        return countriesServices.getAllCountries();

    }

    //metodo que trae un solo pais por id
    @GetMapping("/{id}")
    public Optional<CountriesEntity> getCountry(@PathVariable UUID id){
        return countriesServices.getCountryById(id);

    }

    //metodo que cre un pais
    @PostMapping
    public String createCountry(){
        return "POST COUNTRY";

    }

    //metodo que actualiza un pais
    @PutMapping("/{id}")
    public String updateCountry(){
        return "PUT COUNTRY";

    }

    //metodo que elimina un pais
    @DeleteMapping("/{id}")
    public String deleteCountry(){
        return "DELETE COUNTRY";

    }
}
