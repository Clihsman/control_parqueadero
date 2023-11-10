/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Pc
 */
public class Cliente {
    // Variables
    private Integer codigo;
    private String nombres;
    private String apellidos;
    private Long documento;
    private String correo;
    private String telefono;
    //************
    
    // Contructores
    public Cliente(){}
    
    public Cliente(Integer codigo, String nombres, String apellidos, Long documento, String correo, String telefono){
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.documento = documento;
        this.correo = correo;
        this.telefono = telefono;
    }
    //************
    
    // GET
    public Integer getCodigo(){
        return codigo;
    }
    
    public String getNombres(){
        return nombres;
    }
    
    public String getApellidos(){
        return apellidos;
    }
    
    public Long getDocumento(){
        return documento;
    }
    
    public String getCorreo(){
        return correo;
    }
    
    public String getTelefono(){
        return telefono;
    }
    //************
    
    // SET
    public void setCodigo(Integer codigo){
        this.codigo = codigo;
    }

    public void setNombres(String nombres){
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    public void setDocumento(Long documento){
        this.documento = documento;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    
    public Object[] convertirEnArray(){
        return new Object[]{codigo, nombres, apellidos, documento, correo, telefono};
    }
    //************
}
