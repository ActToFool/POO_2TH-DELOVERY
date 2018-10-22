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
public class Moneda {
    private int cantidad;
    private Denominacion denominacion;
    private int cantidadInicialDia;

    public Moneda(int cantidad, Denominacion denominacion) {
        this.cantidad = cantidad;
        this.denominacion = denominacion;
    }

    public Moneda() {
    }
    
    public void modificarCantidad(int cantidad){
        this.cantidad = this.cantidad + cantidad;
    }
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Denominacion getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(Denominacion denominacion) {
        this.denominacion = denominacion;
    }
    
    public int getCantidadInicialDia() {
        return cantidadInicialDia;
    }

    public void setCantidadInicialDia(int cantidadInicialDia) {
        this.cantidadInicialDia = cantidadInicialDia;
    }
}
