package org.sabello.java.jdbc;

import org.sabello.java.jdbc.model.Producto;
import org.sabello.java.jdbc.repository.ProductoRepositorioImpl;
import org.sabello.java.jdbc.repository.Repositorio;
import org.sabello.java.jdbc.util.ConexionBaseDatos;
import java.util.Date;

import java.sql.*;

public class EjermploJdbc {
    public static void main(String[] args) {

        try (Connection conn = ConexionBaseDatos.getInstace()) {

            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
            System.out.println("================LISTAR=================");
            repositorio.listar().forEach(System.out::println);
            System.out.println("==============Por id===============");
            System.out.println(repositorio.porId(1L));

            System.out.println("==============Guardar===============");
            Producto producto = new Producto();
            producto.setNombre("Producto 1");
            producto.setPrecio(100);
            producto.setFechaRegistro(new Date());
            repositorio.guardar(producto);
            System.out.println("==============Producto guardado con exito===============");
            repositorio.listar().forEach(System.out::println);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
