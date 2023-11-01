package com.example.apirestejemplo.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
//Inyectamos esta dependencia para especificar que trabajaremos en una clase entidad
@Entity
//Inyectamos esta dependencia para especificar el nombre de la tabla en la BD
@Table(name = "tutabla")
public class Persona
{
    //Especificamos que tendremos una llave primaria
    @Id
    //Especificamos que se autoIncrementa el ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Seleccionaremos las columnas de la tabla, para asignar el valor que debe recibir
    @Column(name = "id")
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "email")
    private String email;

    @Column(name = "edad")
    private int edad;

    @Column(name = "sexo")
    private String sexo;

    @Column(name = "clave")
    private String clave;

}
