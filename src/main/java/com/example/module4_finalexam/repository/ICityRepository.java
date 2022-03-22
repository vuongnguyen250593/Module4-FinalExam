package com.example.module4_finalexam.repository;

import com.example.module4_finalexam.model.City;
import com.example.module4_finalexam.model.Country;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICityRepository extends PagingAndSortingRepository<City, Long> {
    Page<City> findAllByCityNameContaining (Pageable pageable, String name);

    Page<City> findAllByCountry (Pageable pageable, Country country);

    void deleteAllByCountry (Country country);
}
