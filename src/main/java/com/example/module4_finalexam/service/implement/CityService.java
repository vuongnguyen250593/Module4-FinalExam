package com.example.module4_finalexam.service.implement;

import com.example.module4_finalexam.model.City;
import com.example.module4_finalexam.model.Country;
import com.example.module4_finalexam.repository.ICityRepository;
import com.example.module4_finalexam.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CityService implements ICityService {
    @Autowired
    private ICityRepository iCityRepository;

    @Override
    public Page<City> findAll(Pageable pageable) {
        return iCityRepository.findAll(pageable);
    }

    @Override
    public Optional<City> findOne(Long id) {
        return iCityRepository.findById(id);
    }

    @Override
    public City save(City city) {
        return iCityRepository.save(city);
    }

    @Override
    public void delete(Long id) {
        iCityRepository.deleteById(id);
    }

    @Override
    public Page<City> findAllByName(Pageable pageable, String name) {
        return iCityRepository.findAllByCityNameContaining(pageable, name);
    }

    @Override
    public Page<City> findAllByCountry(Pageable pageable, Country country) {
        return iCityRepository.findAllByCountry(pageable, country);
    }
}
