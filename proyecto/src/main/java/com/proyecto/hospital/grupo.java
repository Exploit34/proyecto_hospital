package com.proyecto.hospital;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.function.BiFunction;

public class GrupoService {

    public static BiFunction<String, Connection, Boolean> crearGrupo = (nombre, connection) -> {
        String sql = "INSERT INTO grupo (nombre) VALUES (?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, nombre);
            return statement.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    };
}

