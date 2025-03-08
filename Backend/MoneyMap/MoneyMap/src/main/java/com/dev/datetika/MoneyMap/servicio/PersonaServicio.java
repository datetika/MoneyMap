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


    public List<Persona> obtenerTodas() {
        return personaRepositorio.findAll();
    }


    public Persona guardar(Persona persona) {
        return personaRepositorio.save(persona);
    }


    public Optional<Persona> obtenerPorId(Long id) {
        return personaRepositorio.findById(id);
    }


    public void eliminar(Long id) {
        personaRepositorio.deleteById(id);
    }
}
