package controlador;

import java.awt.event.ActionEvent;
import java.util.Objects;
import javax.swing.JOptionPane;
import modelo.Cliente;
import repositorio.ClienteRepositorio;
import vista.VentanaNuevoCliente;

/**
 * @author Clihsman Isaac Iscala Salas
 * version 0.1
 * correo clihsman.cs@gmail.com
 * licencia este proyecto es totalmente libre puedes usar el codigó como gustes
 */
public class NuevoClienteController {
    // variables constantes
    public static final Integer MODO_NUEVO = 0;
    public static final Integer MODO_EDICION = 1;
    //-----------------
    
    // variables privadas
    private final VentanaNuevoCliente vista;
    private final ClienteRepositorio modelo;
    private Integer modo_ventana;
    //-----------------
    
    // contructor
    public NuevoClienteController(VentanaNuevoCliente vista, ClienteRepositorio modelo){
        this.vista = vista;   
        this.modelo = modelo;
        cargarEventos();
    }
    //-----------------
    
    // metodos publicas
    public void iniciar(Cliente cliente, Integer modo){
         esteblecerCliente(cliente);
         modo_ventana = modo;
         if(modo_ventana.equals(MODO_EDICION)) {
             vista.setTitle("Editar cliente");
             vista.setVisible(true);
         }
         if(modo_ventana.equals(MODO_NUEVO)) {
             vista.setTitle("Nuevo cliente");
              vista.tbCodigo.setText(String.format("%05d", modelo.obtenerIDCliente()));
              vista.tbNombres.requestFocus();
              vista.setVisible(true);
         }
    }
    //-----------------
    
    // metodos privadas
    private void cargarEventos(){
        vista.btGuardar.addActionListener(this::btGuardar_click);
        vista.btCancelar.addActionListener(this::btCancelar_click);
    }
    
    private void esteblecerCliente(Cliente cliente){
        if(cliente == null) return;
        vista.tbCodigo.setText(String.format("%05d", cliente.getCodigo()));
        vista.tbNombres.setText(cliente.getNombres());
        vista.tbApellidos.setText(cliente.getApellidos());
        vista.tbDocumento.setText(cliente.getDocumento().toString());
        vista.tbCorreo.setText(cliente.getCorreo());
        vista.tbTelefono.setText(cliente.getTelefono());       
    }
    //-----------------
    
    // evetos
    private void btGuardar_click(ActionEvent e){
        if(Objects.equals(modo_ventana, MODO_EDICION)){
            Integer codigo = Integer.valueOf(vista.tbCodigo.getText());
            String nombres = vista.tbNombres.getText();
            String apellidos = vista.tbApellidos.getText();
            Long documento = Long.valueOf(vista.tbDocumento.getText());
            String correo = vista.tbCorreo.getText();
            String telefono = vista.tbTelefono.getText();
            Cliente cliente = new Cliente(codigo, nombres, apellidos, documento, correo, telefono);
            modelo.actualizar(cliente, codigo);
            JOptionPane.showMessageDialog(vista, "Cliente editado correctamente :)", "Control Paqueader", JOptionPane.QUESTION_MESSAGE);
            vista.setVisible(false);
            vista.dispose();
        }
        if(Objects.equals(modo_ventana, MODO_NUEVO)){
            Integer codigo = Integer.valueOf(vista.tbCodigo.getText());
            String nombres = vista.tbNombres.getText();
            String apellidos = vista.tbApellidos.getText();
            Long documento = Long.valueOf(vista.tbDocumento.getText());
            String correo = vista.tbCorreo.getText();
            String telefono = vista.tbTelefono.getText();
            Cliente cliente = new Cliente(codigo, nombres, apellidos, documento, correo, telefono);
            modelo.guardar(cliente);
            JOptionPane.showMessageDialog(vista, "Cliente guardado correctamente :)", "Control Paqueader", JOptionPane.QUESTION_MESSAGE);
            vista.setVisible(false);
            vista.dispose();
        }
    }
     
    private void btCancelar_click(ActionEvent e){
        int dialogButton = JOptionPane.showConfirmDialog(vista, "¿Desea cancelar el formulario?", "Control Paqueadero", JOptionPane.YES_NO_OPTION);
        if(dialogButton == JOptionPane.YES_OPTION){
             vista.setVisible(false);
             vista.dispose();
        }   
    }
    //-----------------
}
