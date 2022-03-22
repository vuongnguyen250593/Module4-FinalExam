package com.example.module4_finalexam.service;

import com.example.module4_finalexam.model.Country;

import java.util.Optional;

public interface ICountryService {
    Iterable<Country> findAll();

    Optional<Country> findOne(Long id);

    Country save(Country country);

    void delete(Long id);
}
