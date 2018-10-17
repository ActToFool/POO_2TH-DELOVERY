/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Emanuel Álvarez
 */
public abstract class Producto {
    private String codigo;
    private int UnidadesDisponibles;
    private Map<String, Adicional> adicionalesProducto;
    private ArrayList<Producto> obsequios;

    //CONTRUCTORS
    public Producto(String codigo, int UnidadesDisponibles) {
        this.codigo = codigo;
        this.UnidadesDisponibles = UnidadesDisponibles;
        this.adicionalesProducto = new HashMap<>();
        this.obsequios = new ArrayList<>();
    }

    public Producto() {
        this.adicionalesProducto = new HashMap<>();
        this.obsequios = new ArrayList<>();
    }

    //GETTERS AND SETTERS
    public Map<String, Adicional> getAdicionalesProducto() {
        return adicionalesProducto;
    }

    public void setAdicionalesProducto(Map<String, Adicional> adicionalesProducto) {
        this.adicionalesProducto = adicionalesProducto;
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
