package com.example.apirestejemplo.Service;


import com.example.apirestejemplo.Entity.Persona;
import com.example.apirestejemplo.Repository.PersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//Esta inyeccion indica que permite especificar que este es un servicio que le da a la accion
@Service
public class PSIMPL implements PersonaService
{
    @Autowired
    private PersonaRepo repo;

    @Override
    public List<Persona> consultarPersona() {
        return (List<Persona>) this.repo.findAll();
    }

    @Override
    public Persona crearPersona(Persona persona) {
        persona.setEmail(persona.getEmail());
        return this.repo.save(persona);
    }

    @Override
    public Persona modificarPersona(Persona persona) {
        return this.repo.save(persona);
    }

    @Override
    public Persona buscarPersona(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public void eliminarPersona(int id) {
        this.repo.deleteById(id);
    }
}
