package com.example.countriesproject.entities;

import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class CountriesEntity {
    private UUID id;
    private String countryName;
    private String countryCapital;
    private String countryRegion;

}
