package org.sabello.pooclasesabstractas.form;

import org.sabello.pooclasesabstractas.form.elementos.ElementoForm;
import org.sabello.pooclasesabstractas.form.elementos.InputForm;
import org.sabello.pooclasesabstractas.form.elementos.SelectForm;
import org.sabello.pooclasesabstractas.form.elementos.TextareaForm;
import org.sabello.pooclasesabstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

        InputForm username = new InputForm("Username");
        InputForm password = new InputForm("clave","password");
        InputForm email= new InputForm("email", "email");
        InputForm edad = new InputForm("edad","number");

        TextareaForm experiecia = new TextareaForm("exp", 5,9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        Opcion java = new Opcion("1", "Java");
        lenguaje.addOpcion(java)
        .addOpcion(new Opcion("2","Python"))
        .addOpcion(new Opcion("3","JavaScript"))
        .addOpcion(new Opcion("4","TypeScript"))
        .addOpcion(new Opcion("5","PHP"));

        username.setValor("sebastian.abello");
        password.setValor("abc123");
        email.setValor("juanse@gmail.com");
        edad.setValor("19");
        experiecia.setValor("...Mas de 10 años de experiencia...");
        java.setSelected(true);

        List<ElementoForm> elementos = Arrays.asList(username,
                password,
                email,
                edad,
                experiecia,
                lenguaje);

        elementos.forEach(e -> {
            System.out.println(e.dibujarHTML());
            System.out.println("<br>");
        });


    }
}
