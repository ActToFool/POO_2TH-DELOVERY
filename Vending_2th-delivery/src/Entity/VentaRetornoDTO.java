/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.ArrayList;

/**
 *
 * @author brian
 */
public class VentaRetornoDTO {
    private String codigo;
    private String tipoProducto;
    private int VentasRealizadas=0;
    public ArrayList<Adicional> listaAdicional = new ArrayList();

    public VentaRetornoDTO() {
    }

    public VentaRetornoDTO(String codigo, String tipoProducto, int VentasRealizadas) {
        this.codigo = codigo;
        this.tipoProducto = tipoProducto;
        this.VentasRealizadas = VentasRealizadas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getVentasRealizadas() {
        return VentasRealizadas;
    }

    public void setVentasRealizadas(int VentasRealizadas) {
        this.VentasRealizadas = VentasRealizadas;
    }

    public ArrayList<Adicional> getListaAdicional() {
        return listaAdicional;
    }

    public void setListaAdicional(ArrayList<Adicional> listaAdicional) {
        this.listaAdicional = listaAdicional;
    }
    
}
