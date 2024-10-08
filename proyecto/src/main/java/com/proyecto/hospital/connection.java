package com.proyecto.hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.function.Supplier;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/mi_base_datos";
    private static final String USER = "usuario";
    private static final String PASSWORD = "contraseña";
 
    public static Supplier<Connection> connect = () -> {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("Error de conexión a la base de datos", e);
        }
    };
}

