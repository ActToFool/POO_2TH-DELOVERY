/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Emanuel Álvarez
 */
public class Venta {
    //hay que colocar el atributo de fecha
    private Producto productoVendido;
    private HashMap<String,Adicional> adicionalesSeleccionados;
    private ArrayList<Moneda> pagoMonedas;
    private LocalDate FechaHora;
    //METODOS
    public Moneda buscarMonedaDenominacionVenta(int denominacion){
        for (Moneda not : pagoMonedas) {
            if(not.getDenominacion().getEnNumeros()==denominacion){
                return not;
            }
        }
        return null;
    }
    //CONSTRUCTORS
    public Venta() {
        this.adicionalesSeleccionados = new HashMap<>();
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

    public HashMap<String,Adicional> getAdicionalesSeleccionados() {
        return adicionalesSeleccionados;
    }

    public void setAdicionalesSeleccionados(HashMap<String,Adicional> adicionalesSeleccionados) {
        this.adicionalesSeleccionados = adicionalesSeleccionados;
    }

    public ArrayList<Moneda> getPagoMonedas() {
        return pagoMonedas;
    }

    public void setPagoMonedas(ArrayList<Moneda> pagoMonedas) {
        this.pagoMonedas = pagoMonedas;
    }

    public LocalDate getFechaHora() {
        return FechaHora;
    }

    public void setFechaHora(LocalDate FechaHora) {
        this.FechaHora = FechaHora;
    }

    
}
