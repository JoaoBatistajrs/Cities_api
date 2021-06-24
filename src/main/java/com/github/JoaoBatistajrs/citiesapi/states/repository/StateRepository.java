package com.github.JoaoBatistajrs.citiesapi.states.repository;

import com.github.JoaoBatistajrs.citiesapi.states.domain.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
