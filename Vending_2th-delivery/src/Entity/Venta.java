/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.ArrayList;

/**
 *
 * @author Emanuel Álvarez
 */
public class Venta {
    //hay que colocar el atributo de fecha
    private Producto productoVendido;
    private ArrayList<Adicional> adicionalesSeleccionados;
    private ArrayList<Moneda> pagoMonedas;

    //CONSTRUCTORS
    public Venta() {
        this.adicionalesSeleccionados = new ArrayList<>();
        this.pagoMonedas = new ArrayList<>();
        //Hay que revisar cómo se crea, porque se hace dependiendo de si es Alimento o bebida
        //this.productoVendido = new Producto();
    }

    //GETTERS AND SETTERS
    public Producto getProductoVendido() {
        return productoVendido;
    }

    public void setProductoVendido(Producto productoVendido) {
        this.productoVendido = productoVendido;
    }

    public ArrayList<Adicional> getAdicionalesSeleccionados() {
        return adicionalesSeleccionados;
    }

    public void setAdicionalesSeleccionados(ArrayList<Adicional> adicionalesSeleccionados) {
        this.adicionalesSeleccionados = adicionalesSeleccionados;
    }

    public ArrayList<Moneda> getPagoMonedas() {
        return pagoMonedas;
    }

    public void setPagoMonedas(ArrayList<Moneda> pagoMonedas) {
        this.pagoMonedas = pagoMonedas;
    }
}
