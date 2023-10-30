package com.example.apirestejemplo.Service;

import com.example.apirestejemplo.Entity.Persona;
import java.util.List;

//Vamos a crear los metodos para realizar las peticiones en el CRUD
public interface PersonaService
{
    //La coleccion list nos ayuda a crear una lista de datos (Peticion GET)
    public List<Persona> consultarPersona();

    //Aqui se realiza el metodo para realizar las peticiones de POST
    public Persona crearPersona(Persona persona);

    //Aqui realizaremos el metodo para realizar la peticion PUT.
    public Persona modificarPersona(Persona persona);

    //Aqui se realizar el metodo para raalizar busqueda de datos de usuario
    public Persona buscarPersona(int id);

    //Aqui se realizar el metodo para raalizar la peticion de DELETE
    public void eliminarPersona(int id);


}
