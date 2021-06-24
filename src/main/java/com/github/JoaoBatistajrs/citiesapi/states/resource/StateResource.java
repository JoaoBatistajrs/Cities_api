package com.github.JoaoBatistajrs.citiesapi.states.resource;


import com.github.JoaoBatistajrs.citiesapi.states.domain.State;
import com.github.JoaoBatistajrs.citiesapi.states.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

@RestControllerAdvice
@RequestMapping("Api/staties")
public class StateResource  {

    @Autowired StateRepository repository;

    @GetMapping
    public List<State> staties(){
    return repository.findAll();

    }

}
