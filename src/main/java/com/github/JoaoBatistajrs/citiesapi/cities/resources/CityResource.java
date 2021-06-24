package com.github.JoaoBatistajrs.citiesapi.cities.resources;

import com.github.JoaoBatistajrs.citiesapi.cities.domain.City;
import com.github.JoaoBatistajrs.citiesapi.cities.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Api/cities")
public class CityResource {

        @Autowired
        private CityRepository repository;


  @GetMapping
  public List<City> cities() {
      return repository.findAll();
  }

        // 2nd - Pageable
       //@GetMapping
       //public Page<City> cities(final Pageable page) {
       //return repository.findAll(page);
      //  }
    }

