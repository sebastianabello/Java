package com.example.apirestejemplo.Controller;

import com.example.apirestejemplo.Entity.Persona;
import com.example.apirestejemplo.Service.PSIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Esta anotación nos permite envíar y recibir peticiones de nuestro programa
@RestController
//Especifica el mapeo de l URL para todas las solicitudes que llegan a este controlador
@RequestMapping("CRUDRepo")
public class PersonaController
{
    //Se utiliza para realizar la inyección de dependencias en las clases
    @Autowired
    //Este código nos ayuda a heredar o traer los métodos que se insertaron en el service/
    private PSIMPL psimpl;

    //Esta anotación nos ayudará a mapear una solicitud GET/
    //el mapeo para el GET seria: http://localhost:8080/CRUDRepo/consultarPersona
    @GetMapping
    @RequestMapping(value="consultarPersona", method = RequestMethod.GET)
    //Este método maneja la solicitud GET para consultar todas las personas insertadas
    //Y si los datos son correctos, me mostrará un código de respuesta HTTP 200/
    public ResponseEntity<?> ConsultarPersonas(){
        List<Persona> personaList = this.psimpl.consultarPersona();
        return ResponseEntity.ok(personaList);
    }

    //Este codigo nos ayudara a insertar en la BDD
    //El mapeo del post seria: http://localhost:8080/CRUDRepo/crearPersona
    @PostMapping
    @RequestMapping(value="crearPersona", method = RequestMethod.POST)
    public ResponseEntity<?> CrearPersona(@RequestBody Persona persona){
        Persona personaCrear = this.psimpl.crearPersona(persona);
        return ResponseEntity.status(HttpStatus.CREATED).body(personaCrear);
    }
    //El mapeo del PUT seria: http://localhost:8080/CRUDRepo/modificarPersona
    @PutMapping
    @RequestMapping(value="modificarPersona", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarPersona(@RequestBody Persona persona){
        Persona personaModificada = this.psimpl.modificarPersona(persona);
        return ResponseEntity.status(HttpStatus.CREATED).body(personaModificada);
    }

    //El mapeo del GET seria: http://localhost:8080/CRUDRepo/buscarPersona
    @GetMapping
    @RequestMapping(value="buscarPersona/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> BuscarPersona(@PathVariable int id){
        Persona personaBuscada = this.psimpl.buscarPersona(id);
        return ResponseEntity.ok(personaBuscada);
    }

    @DeleteMapping
    @RequestMapping(value="eliminarPersona/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarPersona(@PathVariable int id){
        this.psimpl.eliminarPersona(id);
        return ResponseEntity.ok().build();
    }
}
