package com.github.JoaoBatistajrs.citiesapi.countries.resources;


import com.github.JoaoBatistajrs.citiesapi.countries.domain.Country;
import com.github.JoaoBatistajrs.citiesapi.countries.repository.CountryRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
@RequestMapping("Api/countries")
@Api(value = "API REST Seleção para países")
public class CountryResource {

    @Autowired
    private CountryRepository repository;

    @GetMapping
    @ApiOperation(value="Retorna todos os países cadastrados")
    public Page<Country> countries(Pageable page){
        return repository.findAll(page);
    }

    @GetMapping("/{id}")
    @ApiOperation(value="Retorna um dos países cadastrados de acordo com o id")
    public ResponseEntity getonecountry (@PathVariable Long id) {
        Optional<Country> optional = repository.findById(id);
        if (optional.isPresent()) {
            return ResponseEntity.ok().body(optional.get());
        } else{
            return ResponseEntity.notFound().build();
        }
    }
}
