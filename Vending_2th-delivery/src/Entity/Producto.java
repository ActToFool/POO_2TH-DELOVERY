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
public abstract class Producto {
    private String codigo;
    private int UnidadesDisponibles;

    public Producto(String codigo, int UnidadesDisponibles) {
        this.codigo = codigo;
        this.UnidadesDisponibles = UnidadesDisponibles;
    }

    public Producto() {
    }
    
    public abstract double calcularValor();

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getUnidadesDisponibles() {
        return UnidadesDisponibles;
    }

    public void setUnidadesDisponibles(int UnidadesDisponibles) {
        this.UnidadesDisponibles = UnidadesDisponibles;
    }
}
