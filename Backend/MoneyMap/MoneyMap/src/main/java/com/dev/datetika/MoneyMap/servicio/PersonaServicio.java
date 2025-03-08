package com.dev.datetika.MoneyMap.servicio;


import com.dev.datetika.MoneyMap.model.Persona;
import com.dev.datetika.MoneyMap.repositorio.PersonaRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServicio {

    private final PersonaRepositorio personaRepositorio;

    public PersonaServicio(PersonaRepositorio personaRepositorio) {
        this.personaRepositorio = personaRepositorio;
    }

    // Obtener todas las personas
    public List<Persona> obtenerTodas() {
        return personaRepositorio.findAll();
    }

    // Guardar una persona
    public Persona guardar(Persona persona) {
        return personaRepositorio.save(persona);
    }

    // Obtener persona por ID
    public Optional<Persona> obtenerPorId(Long id) {
        return personaRepositorio.findById(id);
    }

    // Eliminar persona por ID
    public void eliminar(Long id) {
        personaRepositorio.deleteById(id);
    }
}
