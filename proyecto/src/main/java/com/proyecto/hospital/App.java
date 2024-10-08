package com.proyecto.hospital;

import connection;
import grupo;

public class Main {
    public static void main(String[] args) {
        Connection connection = DatabaseConnection.connect.get();

        // Crear grupo con el nombre "Administradores"
        boolean creado = GrupoService.crearGrupo.apply("Administradores", connection);

        System.out.println(creado ? "Grupo creado exitosamente" : "Error al crear el grupo");
    }
}

