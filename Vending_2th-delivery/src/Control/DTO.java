/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entity.Venta;
import Entity.Adicional;
import Entity.Alcoholica;
import Entity.Alimento;
import Entity.Bebida;
import Entity.Producto;
import Entity.SinAlcohol;
import Entity.Sustancia;
import Entity.Utensilio;
import Entity.VentaRetornoDTO;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author brian
 */
public class DTO {

    private int TotalVentasDia;
    private ArrayList<Venta> productoVendidoDia;
    private HashMap<String, Producto> NoVendidos;
    private int cuadreCaja;

    public int generarValorVentasDia(ArrayList<Venta> ventasRealizadas) {
        Producto auxProducto;
        Venta auxVenta;
        int acum = 0;
        for (Venta not : ventasRealizadas) {
            auxProducto = not.getProductoVendido();
            for (Adicional value : auxProducto.getAdicionalesProducto().values()) {
                if (value instanceof Utensilio) {
                    acum += (auxProducto.calcularValor() + value.calcularPrecio());
                }
                if (value instanceof Sustancia) {
                    acum += (auxProducto.calcularValor() + ((Sustancia) value).calcularPrecio((int) auxProducto.calcularValor()));
                }
            }

        }
        return acum;
    }

    public HashMap<String, VentaRetornoDTO> generarListaProductos(ArrayList<Venta> ventasRealizadas, HashMap<String, Producto> catalogo) {
        HashMap<String, VentaRetornoDTO> ProductosRetorno = new HashMap<>();
        VentaRetornoDTO auxRetornoDTO = new VentaRetornoDTO();
        Sustancia auxSustancia = new Sustancia();
        Utensilio auxUtensilio = new Utensilio();

        for (String not : catalogo.keySet()) { //llave    
            Producto p = catalogo.get(not);      //values de catalogo
            for (Venta not2 : ventasRealizadas) {
                boolean containsKey = ProductosRetorno.containsKey(not);
                if (!containsKey) {

                    auxRetornoDTO.setCodigo(p.getCodigo());

                    int ventasrealizadasporproductodia = p.getUnidadesDisponibles() - not2.getProductoVendido().getUnidadesDisponibles();
                    auxRetornoDTO.setVentasRealizadas(ventasrealizadasporproductodia);
                    if (p instanceof Alimento) {
                        auxRetornoDTO.setTipoProducto("Alimento");
                    }
                    if (p instanceof Bebida) {
                        auxRetornoDTO.setTipoProducto("Bebida");
                    }
                    
                    for (Adicional not3 : auxRetornoDTO.getListaAdicional()){
                        if (not3 instanceof Sustancia){
                            auxSustancia.setNombre(not3.getNombre());
                            auxRetornoDTO.listaAdicional.add(auxSustancia);
                            
                        }
                        if (not3 instanceof Utensilio){
                            auxUtensilio.setNombre(not3.getNombre());
                            auxRetornoDTO.listaAdicional.add(auxUtensilio);
                        }
                        
                       
                       
                    }

                }
                ProductosRetorno.put(not, auxRetornoDTO);
            }
        }
        return ProductosRetorno;
    }
    
    public HashMap<String, Producto> generarListaObsequios(HashMap<String, Producto> catalogo){
       HashMap<String,Producto> RetornoObsequios = new HashMap<>();
       Alcoholica auxAlcoholica = new Alcoholica();
       SinAlcohol auxSinAlcohol = new SinAlcohol();
       Alimento auxAlimento = new Alimento();
       for (String not : catalogo.keySet()) { //llave    
            Producto p = catalogo.get(not);      //values de catalogo
            for(Producto i: p.getObsequios()){
                if (i instanceof Alcoholica){
                    auxAlcoholica.setUnidadesDisponibles(i.getUnidadesDisponibles());
                    RetornoObsequios.put(i.getCodigo(), auxAlcoholica);
                }
                if (i instanceof SinAlcohol){
                    auxSinAlcohol.setUnidadesDisponibles(i.getUnidadesDisponibles());
                    RetornoObsequios.put(i.getCodigo(), auxSinAlcohol);
                }
                
                if (i instanceof Alimento){
                    auxAlimento.setUnidadesDisponibles(i.getUnidadesDisponibles());
                    RetornoObsequios.put(i.getCodigo(), auxAlimento);
                }
                
            }
       }
        return RetornoObsequios;
    }
}
