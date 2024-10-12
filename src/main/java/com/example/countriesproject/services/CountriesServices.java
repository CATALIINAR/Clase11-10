package com.example.countriesproject.services;

import com.example.countriesproject.entities.CountriesEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service

public class CountriesServices {
    private  List<CountriesEntity> paises;

    public CountriesServices(){
        paises = new ArrayList<>();
        paises.add(new CountriesEntity(UUID.randomUUID(),"Colombia","Bogota","America del Sur"));
        paises.add(new CountriesEntity(UUID.randomUUID(), "Qatar", "Doha", "Asia"));
        paises.add(new CountriesEntity(UUID.randomUUID(), "Ecuador", "Quito", "América del Sur"));
        paises.add(new CountriesEntity(UUID.randomUUID(), "Senegal", "Dakar", "África"));
        paises.add(new CountriesEntity(UUID.randomUUID(), "Países Bajos", "Ámsterdam", "Europa"));
        paises.add(new CountriesEntity(UUID.randomUUID(), "Inglaterra", "Londres", "Europa"));
        paises.add(new CountriesEntity(UUID.randomUUID(), "Estados Unidos", "Washington, D.C.", "América del Norte"));
        paises.add(new CountriesEntity(UUID.randomUUID(), "Gales", "Cardiff", "Europa"));
        paises.add(new CountriesEntity(UUID.randomUUID(), "Irán", "Teherán", "Asia"));
        paises.add(new CountriesEntity(UUID.randomUUID(), "Argentina", "Buenos Aires", "América del Sur"));
        paises.add(new CountriesEntity(UUID.randomUUID(), "Arabia Saudita", "Riad", "Asia"));
        paises.add(new CountriesEntity(UUID.randomUUID(), "México", "Ciudad de México", "América del Norte"));
        paises.add(new CountriesEntity(UUID.randomUUID(), "Polonia", "Varsovia", "Europa"));
        paises.add(new CountriesEntity(UUID.randomUUID(), "Francia", "París", "Europa"));
        paises.add(new CountriesEntity(UUID.randomUUID(), "Australia", "Canberra", "Oceanía"));
        paises.add(new CountriesEntity(UUID.randomUUID(), "Dinamarca", "Copenhague", "Europa"));
        paises.add(new CountriesEntity(UUID.randomUUID(), "Túnez", "Túnez", "África"));
        paises.add(new CountriesEntity(UUID.randomUUID(), "España", "Madrid", "Europa"));
        paises.add(new CountriesEntity(UUID.randomUUID(), "Costa Rica", "San José", "América Central"));
        paises.add(new CountriesEntity(UUID.randomUUID(), "Alemania", "Berlín", "Europa"));
        paises.add(new CountriesEntity(UUID.randomUUID(), "Japón", "Tokio", "Asia"));
        paises.add(new CountriesEntity(UUID.randomUUID(), "Bélgica", "Bruselas", "Europa"));
        paises.add(new CountriesEntity(UUID.randomUUID(), "Canadá", "Ottawa", "América del Norte"));
        paises.add(new CountriesEntity(UUID.randomUUID(), "Marruecos", "Rabat", "África"));
        paises.add(new CountriesEntity(UUID.randomUUID(), "Croacia", "Zagreb", "Europa"));
        paises.add(new CountriesEntity(UUID.randomUUID(), "Brasil", "Brasilia", "América del Sur"));
        paises.add(new CountriesEntity(UUID.randomUUID(), "Portugal", "Lisboa", "Europa"));
        paises.add(new CountriesEntity(UUID.randomUUID(), "Suiza", "Berna", "Europa"));
        paises.add(new CountriesEntity(UUID.randomUUID(), "Uruguay", "Montevideo", "América del Sur"));
        paises.add(new CountriesEntity(UUID.randomUUID(), "Corea del Sur", "Seúl", "Asia"));

    }
    public List<CountriesEntity> getAllCountries() {
        return paises;
    }

    public Optional<CountriesEntity> getCountryById(UUID id) {
        return paises.stream().filter(country -> country.getId().equals(id)).findFirst();

    }

    public List<> createCountry() {

    }
    public List<> updateCountry() {

    }
    public List<> deleteCountry() {

    }

}
