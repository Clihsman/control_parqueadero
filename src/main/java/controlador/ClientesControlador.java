package controlador;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelo.Cliente;
import repositorio.ClienteRepositorio;
import vista.PanelClientes;
import vista.VentanaNuevoCliente;

/**
 * @author Clihsman Isaac Iscala Salas
 * version 0.1
 * correo clihsman.cs@gmail.com
 * licencia este proyecto es totalmente libre puedes usar el codigó como gustes
 */
public class ClientesControlador {
    // variables privadas
    private final PanelClientes vista;
    private final ClienteRepositorio modelo;
    //-----------------
    
    // constructor
    public ClientesControlador(PanelClientes vista, ClienteRepositorio modelo){
        this.vista = vista;   
        this.modelo = modelo;
        cargarEventos();
        cargarDatos();
    }
    //-----------------
    
    // metodos publicos
    public void iniciar(JPanel padre){
         padre.removeAll();
         Dimension size = padre.getSize();
         vista.setSize(size.width,size.height);
         vista.setLocation(0, 0);
         padre.add(vista, BorderLayout.CENTER);
         padre.revalidate();
         padre.repaint();
    }
    //-----------------
    
    // metodos privados
    private void cargarDatos(){
        Cliente[] clientes = modelo.obtenerTodos();
        vista.tableClientesModel.setRowCount(0);
        for(Cliente cliente : clientes){
          Object[] clienteArray = cliente.convertirEnArray();
          clienteArray[0] = String.format("%05d", (Integer)clienteArray[0]);
          vista.tableClientesModel.addRow(clienteArray);
        }
    }
    
    private void cargarEventos(){
        vista.btNuevo.addActionListener(this::btNuevo_click);
        vista.btEditar.addActionListener(this::btEditar_click);
        vista.btEliminar.addActionListener(this::btEliminar_click);
    }
    
    private Cliente obtenerClieneSelecionado(){
        int rowIndex = vista.tbClientes.getSelectedRow();
        Cliente cliente = null;
        
        if(rowIndex != -1){       
              String codigo = (String)vista.tableClientesModel.getValueAt(rowIndex, 0);
              String nombres = (String)vista.tableClientesModel.getValueAt(rowIndex, 1);
              String apellidos = (String)vista.tableClientesModel.getValueAt(rowIndex,2);
              Long documento = (Long)vista.tableClientesModel.getValueAt(rowIndex, 3);
              String correo = (String)vista.tableClientesModel.getValueAt(rowIndex, 4);
              String telefono = (String)vista.tableClientesModel.getValueAt(rowIndex, 5);
              cliente = new Cliente(Integer.valueOf(codigo), nombres, apellidos, documento, correo, telefono);
        }
        else{
             JOptionPane.showMessageDialog(null, "Debe selecionar un cliente", "Control Paqueadero", JOptionPane.INFORMATION_MESSAGE);
        }
        
        return cliente;
    }
    //-----------------
    
    // eventos
    private void btNuevo_click(ActionEvent e){
        final VentanaNuevoCliente ventanaNuevoCliente = new VentanaNuevoCliente();       
        NuevoClienteController clienteController = new NuevoClienteController(ventanaNuevoCliente, modelo);
        clienteController.iniciar(null, NuevoClienteController.MODO_NUEVO);
        cargarDatos();
    }
    
    private void btEditar_click(ActionEvent e){
        Cliente cliente = obtenerClieneSelecionado();
        if(cliente != null){
            final VentanaNuevoCliente ventanaNuevoCliente = new VentanaNuevoCliente();  
            NuevoClienteController clienteController = new NuevoClienteController(ventanaNuevoCliente, modelo);
            clienteController.iniciar(cliente, NuevoClienteController.MODO_EDICION);
            cargarDatos();
        }
    }
    
    private void btEliminar_click(ActionEvent e){
        Cliente cliente = obtenerClieneSelecionado();
        if(cliente != null){
            int dialogButton = JOptionPane.showConfirmDialog(vista, "¿Desea eliminar el cliente?", "Control Paqueadero", JOptionPane.YES_NO_OPTION);
            if(dialogButton == JOptionPane.YES_OPTION){
                modelo.eliminar(cliente.getCodigo());
                vista.tableClientesModel.removeRow(vista.tbClientes.getSelectedRow());
                JOptionPane.showMessageDialog(vista, "Cliente eliminado correctamente :)", "Control Paqueader", JOptionPane.QUESTION_MESSAGE);
            }   
        }
    }
    //-----------------


}
