    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entity.Adicional;
import Entity.Alimento;
import Entity.Bebida;
import Entity.Denominacion;
import Entity.Moneda;
import Entity.Producto;
import Entity.Venta;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
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
    private HashMap<String, Producto> catalogo;

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
    
    //Funcion del punto 4(Parte de el producto)
    public boolean venderProducto(String codigo,ArrayList<String> adicionales, ArrayList<Integer> monedas){
        Producto buscar = buscarEnCatalogo(codigo);
        if(buscar!=null){
            this.ventaActual.setProductoVendido(buscar);
            HashMap<String, Adicional> respuestaAd = buscarAdicionales(adicionales);
            if(respuestaAd!=null){
                boolean validarObs = this.validarObsequios(buscar);
                if(validarObs){
                    this.ventaActual.setAdicionalesSeleccionados(respuestaAd);
                    buscar.setAdicionalesProducto(respuestaAd);
                    this.actualizarExistencias();
                    this.actualizarMonedas();
                    return true;
                }
            }
        }
        return false;
    }
    private Producto buscarEnCatalogo(String codigo){//4.1 validar que el producto exista
        return this.catalogo.get(codigo);
    }
    /*private boolean validarAdicionales(Producto p){//4.1.1 Valida los adicionales(que exista al menos 1)
        int cont=0;
        for (Adicional not : p.getAdicionalesProducto().values()) {
            if(not.getUnidadesDisponibles()>0){
                cont++;
            }
        }
        if(cont==p.getAdicionalesProducto().size()){
            return true;
        }
        return false;
    }*/
    private boolean validarObsequios(Producto p){//valida que hallan producto y los obsequios de este
        if(p.getUnidadesDisponibles()<1){
            return false;//en esta misma funcion validamos que hallan unidades del producto
        }else{
            for (Producto not : p.getObsequios()) {
               if(not.getUnidadesDisponibles()>0){
                   return true;//si hay al menos un obsequio ya se puede realizar la venta
               } 
            }
            return false;
        }
    }
    public HashMap<String,Adicional> buscarAdicionales(ArrayList<String> adiciones){
        HashMap<String,Adicional> aux_adicionales=new HashMap<>();
        Producto p=this.ventaActual.getProductoVendido();
        for (Map.Entry<String,Adicional> entry : p.getAdicionalesProducto().entrySet()) {
            for (String adicion : adiciones) {
                if(adicion.equals(entry.getValue().getNombre())){
                    aux_adicionales.put(entry.getKey(), entry.getValue());
                }
            }
        }
        if(aux_adicionales.size()==adiciones.size()){
            return aux_adicionales;
        }
        return null;
    }
    private int pago(){
        int pago_total=0;
        for (Moneda not : this.ventaActual.getPagoMonedas()) {
            pago_total=pago_total+(not.getCantidad()*not.getDenominacion().getEnNumeros());
        }
        return pago_total;
    }
    private boolean actualizarExistencias(){
        Producto p=this.buscarEnCatalogo(this.ventaActual.getProductoVendido().getCodigo());
        p.setUnidadesDisponibles((p.getUnidadesDisponibles())-1);
        for (Producto obsequio : p.getObsequios()) {
            if(obsequio==this.ventaActual.getProductoVendido().getObsequios().get(0)){
                obsequio.setUnidadesDisponibles(obsequio.getUnidadesDisponibles()-1);
                return true;
            }
        }
        return false;
    }
    private void actualizarMonedas(){
        for (Moneda pagoMoneda : this.ventaActual.getPagoMonedas()) {
            for (Moneda moneda : this.dineroAcumulado) {
                if(pagoMoneda==moneda){
                    moneda.setCantidad(moneda.getCantidad()+pagoMoneda.getCantidad());
                }
            }
        }
    }
    private double precioProducto(){
        Producto p=this.ventaActual.getProductoVendido();
        return p.calcularValor();
    }
    private double precioAdicionales(){
        return 0;
    }
    private double precioTotalProducto(){
        return 0;
    }
    
    //DEVOLVER RESTANTE
    public ArrayList<Moneda> devolverRestante(){
        ArrayList<Moneda> monedaADevolver = new ArrayList<>();
        int vueltos = this.pago();
        if(vueltos > 0){
            int iter = (this.dineroAcumulado.size() - 1);
            while(vueltos > 0){
                Moneda actual = this.dineroAcumulado.get(iter);
                Moneda mon = new Moneda();
                mon.setDenominacion(actual.getDenominacion());
                mon.setCantidad(vueltos / actual.getDenominacion().getEnNumeros());
                if((mon.getCantidad() > 0) && (actual.getCantidad() >= mon.getCantidad() )){
                    monedaADevolver.add(mon);
                    //se deben eliminar las monedas de la relacion pagoMonedas,
                    //pero, al esta ya estar modificada en dinero acumulado sólo
                    //usaremos la relacion dineroAcumulado
                    this.buscarMonedaDenominacion(iter)
                }
            }
            System.out.println("fff");
        }
        return monedaADevolver;
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

    public HashMap<String, Producto> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(HashMap<String, Producto> Catalogo) {
        this.catalogo = Catalogo;
    }
    
}
