/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorio;

/**
 *
 * @author Pc
 * @param <T>
 */
public interface Repositorio<T> {
    public T obtener(Integer id);
    public T[] obtenerTodos();
    public int guardar(T dato);
    public int actualizar(T dato, Integer id);
    public int eliminar(Integer id);
}
