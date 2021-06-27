package com.github.JoaoBatistajrs.citiesapi.states.resource;



import com.github.JoaoBatistajrs.citiesapi.states.domain.State;
import com.github.JoaoBatistajrs.citiesapi.states.repository.StateRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.Optional;

@RestControllerAdvice
@RequestMapping("Api/staties")
@Api(value = "API REST Seleção para Estados do Brasil")
public class StateResource  {

    @Autowired StateRepository repository;

    @GetMapping
    @ApiOperation(value="Retorna todos os Estados cadastrados")
    public List<State> staties(){
    return repository.findAll();

    }

    @GetMapping("/{id}")
    @ApiOperation(value="Retorna um dos Estados cadastrados de acordo com o id")
    public ResponseEntity getonestate (@PathVariable Long id) {
        Optional<State> optional = repository.findById(id);
        if (optional.isPresent()) {
            return ResponseEntity.ok().body(optional.get());
        } else{
            return ResponseEntity.notFound().build();
        }
    }

}
