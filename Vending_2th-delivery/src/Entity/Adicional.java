/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Emanuel Álvarez
 */
public abstract class Adicional {
    private String nombre;
    private int unidadesDisponibles;
    
    public abstract double calcularPrecio();

    public Adicional(String nombre, int unidadesDisponibles) {
        this.nombre = nombre;
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public Adicional() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }
    
}
