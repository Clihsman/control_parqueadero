import modelo.Cliente;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import repositorio.ClienteRepositorio;

/**
 *
 * @author Pc
 */

public class TestClientes 
{
    @Test
    public void testClientes(){
        testGuardarCliente();
        testBuscarCliente();
        testActualizarCliente();
        testEliminarCliente();
    }
    
    @Test
    public void testGuardarCliente(){
        Cliente clienteCreado = new Cliente(502, "Nombres Prueba", "Apellidos Prueba", (long)123456789, "correo_prueba@prueba.com", "122 456 7890");
        ClienteRepositorio clienteRepositorio = new ClienteRepositorio();
        int datos_actualizados = clienteRepositorio.guardar(clienteCreado);
        Assert.assertEquals(1, datos_actualizados);
    }
   
    @Test
    public void testBuscarCliente(){
        Cliente clienteEsperado = new Cliente(502, "Nombres Prueba", "Apellidos Prueba", (long)123456789, "correo_prueba@prueba.com", "122 456 7890");
        ClienteRepositorio clienteRepositorio = new ClienteRepositorio();
        Cliente clienteObtenido = clienteRepositorio.obtener(clienteEsperado.getCodigo());
        Assert.assertEquals(clienteEsperado.getCodigo(),clienteObtenido.getCodigo());
    }
    
    @Test
    public void testActualizarCliente(){
        Cliente clienteActualizar = new Cliente(502, "Nombres Prueba Actualizado", "Apellidos Prueba Actializado", (long)123456789, "correo_prueba@prueba.com", "122 456 7890");
        ClienteRepositorio clienteRepositorio = new ClienteRepositorio();
        int datos_actualizados = clienteRepositorio.actualizar(clienteActualizar,clienteActualizar.getCodigo());
        Assert.assertEquals(1, datos_actualizados);
    }
    
    @Test
    public void testEliminarCliente(){
        Cliente clienteEliminar = new Cliente(502, "Nombres Prueba", "Apellidos Prueba", (long)123456789, "correo_prueba@prueba.com", "122 456 7890");
        ClienteRepositorio clienteRepositorio = new ClienteRepositorio();
        int datos_actualizados = clienteRepositorio.eliminar(clienteEliminar.getCodigo());
        Assert.assertEquals(1, datos_actualizados);
    }
}
