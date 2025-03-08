package com.dev.datetika.MoneyMap.controlador;

import com.dev.datetika.MoneyMap.model.Persona;
import com.dev.datetika.MoneyMap.servicio.PersonaServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaControlador {

    private final PersonaServicio personaServicio;

    public PersonaControlador(PersonaServicio personaServicio) {
        this.personaServicio = personaServicio;
    }

    @GetMapping
    public List<Persona> listarPersonas() {
        return personaServicio.obtenerTodas();
    }

    @PostMapping
    public Persona crearPersona(@RequestBody Persona persona) {
        return personaServicio.guardar(persona);
    }
}
