package com.github.JoaoBatistajrs.citiesapi.cities.resources;

import com.github.JoaoBatistajrs.citiesapi.cities.domain.City;
import com.github.JoaoBatistajrs.citiesapi.cities.repository.CityRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Api/cities")
@Api(value = "API REST para Seleção de cidades do Brasil")
@CrossOrigin(origins="*")
public class CityResource {

        @Autowired
        private CityRepository repository;


  @GetMapping
  @ApiOperation(value="Retorna todas as Cidades cadastradas")
  public List<City> cities() {
      return repository.findAll();
  }

    @GetMapping("/{id}")
    @ApiOperation(value="Retorna uma das Cidades cadastradas de acordo com o id")
    public ResponseEntity getonecity (@PathVariable Long id) {
        Optional<City> optional = repository.findById(id);
        if (optional.isPresent()) {
            return ResponseEntity.ok().body(optional.get());
        } else{
            return ResponseEntity.notFound().build();
        }
    }

}

