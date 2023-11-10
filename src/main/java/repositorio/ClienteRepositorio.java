/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorio;

import herramientas.BaseDeDatos;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cliente;

/**
 *
 * @author Pc
 */
public class ClienteRepositorio implements Repositorio<Cliente>{

    @Override
    public Cliente obtener(Integer id) {
        Cliente cliente = null;
        
        try {
            final BaseDeDatos baseDeDatos = new BaseDeDatos();
            final String consultaString = "call obtener_cliente(?)";
            try(final Connection conexion = baseDeDatos.obtenerConexion();
                   final PreparedStatement consulta = conexion.prepareStatement(consultaString))
            {
                consulta.setInt(1, id);
                
                try(final ResultSet lector = consulta.executeQuery()){
                        if(lector.next()){
                            final Integer codigo = lector.getInt(1);
                            final String nombres = lector.getString(2);
                            final String apellidos = lector.getString(3);
                            final Long documento = lector.getLong(4);
                            final String correo = lector.getString(5);
                            final String telefono = lector.getString(6);
                            cliente = new Cliente(codigo, nombres, apellidos, documento, correo, telefono);
                        }
                }
                
               conexion.commit();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cliente;
    }

    @Override
    public Cliente[] obtenerTodos() {
        Cliente[] clientesArray;
        List<Cliente> listaClientes = new ArrayList<>();
        
        try {
            final BaseDeDatos baseDeDatos = new BaseDeDatos();
            final String consultaString = "call obtener_lista_clientes()";
            try(final Connection conexion = baseDeDatos.obtenerConexion();
                   final Statement consulta = conexion.createStatement())
            {                
                try(final ResultSet lector = consulta.executeQuery(consultaString)){
                        while(lector.next()){
                            final Integer codigo = lector.getInt(1);
                            final String nombres = lector.getString(2);
                            final String apellidos = lector.getString(3);
                            final Long documento = lector.getLong(4);
                            final String correo = lector.getString(5);
                            final String telefono = lector.getString(6);
                            Cliente cliente = new Cliente(codigo, nombres, apellidos, documento, correo, telefono);
                            listaClientes.add(cliente);
                        }
                }
                
               conexion.commit();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        clientesArray = new Cliente[listaClientes.size()];
        for(int i  = 0;i < listaClientes.size(); i++){
            clientesArray[i] = listaClientes.get(i);
        }
        
        return clientesArray;
    }

    @Override
    public int guardar(final Cliente cliente) {
        int datos_actualizados = -1;
        try {
            final BaseDeDatos baseDeDatos = new BaseDeDatos();
            final String consultaString = "call crear_cliente(?,?,?,?,?,?)";
            try(final Connection conexion = baseDeDatos.obtenerConexion();
                   final PreparedStatement consulta = conexion.prepareStatement(consultaString))
            {
               consulta.setInt(1, cliente.getCodigo());
               consulta.setString(2, cliente.getNombres());
               consulta.setString(3, cliente.getApellidos());
               consulta.setLong(4, cliente.getDocumento());
               consulta.setString(5, cliente.getCorreo());
               consulta.setString(6, cliente.getTelefono());
               datos_actualizados = consulta.executeUpdate();
               conexion.commit();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datos_actualizados;
    }

    @Override
    public int actualizar(Cliente cliente, Integer id) {
        int datos_actualizados = -1;
          try {
            final BaseDeDatos baseDeDatos = new BaseDeDatos();
            final String consultaString = "call actualizar_cliente(?,?,?,?,?,?)";
            try(final Connection conexion = baseDeDatos.obtenerConexion();
                   final PreparedStatement consulta = conexion.prepareStatement(consultaString))
            {
               consulta.setInt(1, id);
               consulta.setString(2, cliente.getNombres());
               consulta.setString(3, cliente.getApellidos());
               consulta.setLong(4, cliente.getDocumento());
               consulta.setString(5, cliente.getCorreo());
               consulta.setString(6, cliente.getTelefono());
               datos_actualizados = consulta.executeUpdate();
               conexion.commit();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datos_actualizados;
    }

    @Override
    public int eliminar(Integer id) {
        int datos_actualizados = -1;
         try {
            final BaseDeDatos baseDeDatos = new BaseDeDatos();
            final String consultaString = "call eliminar_cliente(?)";
            try(final Connection conexion = baseDeDatos.obtenerConexion();
                   final PreparedStatement consulta = conexion.prepareStatement(consultaString))
            {
               consulta.setInt(1, id);
               datos_actualizados = consulta.executeUpdate();
               conexion.commit();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datos_actualizados;
    }
    
    public int obtenerIDCliente(){
        int id = -1;
        
        try {
            final BaseDeDatos baseDeDatos = new BaseDeDatos();
            final String consultaString = "call obtener_id_cliente()";
            try(final Connection conexion = baseDeDatos.obtenerConexion();
                   final Statement consulta = conexion.createStatement())
            {
                try(final ResultSet lector = consulta.executeQuery(consultaString)){
                        if(lector.next()){
                            id = lector.getInt(1);
                        }
                }
                
               conexion.commit();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return id;
    }
    
}
