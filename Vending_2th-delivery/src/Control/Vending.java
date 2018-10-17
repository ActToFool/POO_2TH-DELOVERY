    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entity.Moneda;
import Entity.Producto;
import Entity.Venta;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author Emanuel Álvarez
 */
public class Vending {
    private GestionProducto gestion;
    private Venta ventaActual;
    private ArrayList<Venta> ventasRealizadas;
    private ArrayList<Moneda> dineroAcumulado;
    private Map<String, Producto> Catalogo;

    //CONSTRUCTOR
    public Vending() {
        this.gestion = new GestionProducto();
        this.ventaActual = new Venta();
        this.ventasRealizadas = new ArrayList<>();
        this.Catalogo = this.gestion.crearProductos();
        this.dineroAcumulado = this.gestion.dineroAcumulado();
    }

    
    //GETTERS AND SETTERS
    public GestionProducto getGestion() {
        return gestion;
    }

    public void setGestion(GestionProducto gestion) {
        this.gestion = gestion;
    }

    public Venta getVentaActual() {
        return ventaActual;
    }

    public void setVentaActual(Venta ventaActual) {
        this.ventaActual = ventaActual;
    }

    public ArrayList<Venta> getVentasRealzadas() {
        return ventasRealizadas;
    }

    public void setVentasRealzadas(ArrayList<Venta> ventasRealzadas) {
        this.ventasRealizadas = ventasRealzadas;
    }

    public ArrayList<Moneda> getDineroAcumulado() {
        return dineroAcumulado;
    }

    public void setDineroAcumulado(ArrayList<Moneda> dineroAcumulado) {
        this.dineroAcumulado = dineroAcumulado;
    }

    public ArrayList<Venta> getVentasRealizadas() {
        return ventasRealizadas;
    }

    public void setVentasRealizadas(ArrayList<Venta> ventasRealizadas) {
        this.ventasRealizadas = ventasRealizadas;
    }

    public Map<String, Producto> getCatalogo() {
        return Catalogo;
    }

    public void setCatalogo(Map<String, Producto> Catalogo) {
        this.Catalogo = Catalogo;
    }
    
}
