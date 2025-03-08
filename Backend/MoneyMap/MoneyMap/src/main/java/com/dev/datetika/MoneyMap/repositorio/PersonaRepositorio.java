package com.dev.datetika.MoneyMap.repositorio;



import com.dev.datetika.MoneyMap.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepositorio extends JpaRepository<Persona, Long> {
}
