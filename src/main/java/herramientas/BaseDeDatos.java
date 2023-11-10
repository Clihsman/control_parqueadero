/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herramientas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Clihsman Isaac Iscala Salas
 * version 0.1
 * correo clihsman.cs@gmail.com
 * licencia este proyecto es totalmente libre puedes usar el codigó como gustes
 */
public class BaseDeDatos {
    // variables constantes
    private static final String CONTROLADOR = "jdbc:mariadb";
    private static final String HOST = "localhost";
    private static final String PUERTO = "3306";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "14503034";
    private static final String BASE_DE_DATOS = "control_parquadero";
      //-----------------
    
    private static Connection conexion;
    
    public BaseDeDatos() throws SQLException {
        if(conexion == null || conexion.isClosed()){
            conexion = DriverManager.getConnection(crearUrl());
        }
    }
    
    public Connection obtenerConexion(){
        return conexion;
    }
    
    private static String crearUrl(){
        return String.format("%s://%s:%s/%s?user=%s&password=%s", CONTROLADOR, HOST,PUERTO,BASE_DE_DATOS,USUARIO,CONTRASENA);
    }
}
