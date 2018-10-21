    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entity.Denominacion;
import Entity.Moneda;
import Entity.Producto;
import Entity.Venta;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
    private Map<String, Producto> catalogo;

    //CONSTRUCTOR
    public Vending() {
        this.gestion = new GestionProducto();
        this.ventaActual = new Venta();
        this.ventasRealizadas = new ArrayList<>();
        this.catalogo = this.gestion.crearProductos();
        this.dineroAcumulado = this.gestion.dineroAcumulado();
    }
    //Funcion del punto 2
    public boolean crearNuevaVenta() {
        if (this.catalogo.isEmpty()) {
            return false;
        } else {
            this.ventaActual = new Venta();
            this.ventaActual.setFechaHora(LocalDate.now());
            this.ventasRealizadas.add(this.ventaActual);
            return true;
        }
    }
    //Funcion del punto 3
    public int monedasExistentes(int denominacion) {
        Moneda aux;
        Denominacion den;
        den=this.validarDenominacion(denominacion);
        if (den!=null) {
            aux = this.ventaActual.buscarMonedaDenominacionVenta(denominacion);//se busca en la venta actual
            if (aux != null) {
                aux.setCantidad(aux.getCantidad() + 1);//acá se modifican las monedas de la venta actual
            } else{
                Moneda m = new Moneda(1, den);
                this.ventaActual.getPagoMonedas().add(m);//si no la encuentra la agrega a la venta actual
            }
            aux = this.buscarMonedaDenominacion(denominacion);//acá reutilizamos la variable
            return aux.getCantidad();
        } else {
            return -1;
        }
    }
    public Moneda buscarMonedaDenominacion(int denominacion){
        for (Moneda not : this.dineroAcumulado) {
            return not;
        }
        return null;
    }
    public Denominacion validarDenominacion(int denominacion){
        for (Denominacion e : Denominacion.values()){
            if(e.getEnNumeros()==denominacion){
                return e;
            }
        }
        return null;
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
        return catalogo;
    }

    public void setCatalogo(Map<String, Producto> Catalogo) {
        this.catalogo = Catalogo;
    }
    
}
