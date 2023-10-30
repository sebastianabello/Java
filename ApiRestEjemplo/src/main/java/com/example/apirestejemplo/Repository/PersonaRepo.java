package com.example.apirestejemplo.Repository;

import com.example.apirestejemplo.Entity.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepo extends CrudRepository<Persona,Integer>
{

}
