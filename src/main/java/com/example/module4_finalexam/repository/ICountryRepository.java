package com.example.module4_finalexam.repository;

import com.example.module4_finalexam.model.Country;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICountryRepository extends PagingAndSortingRepository<Country, Long> {
}
