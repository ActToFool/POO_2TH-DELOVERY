/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entity.Moneda;
import Entity.Adicional;
import Entity.Alcoholica;
import Entity.Alimento;
import Entity.Producto;
import Entity.SinAlcohol;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Emanuel Álvarez
 */
public class GestionProducto {

    public Map<String, Producto> crearProductos(){
        Map<String, Producto>productos = new HashMap<>();
        ArrayList<Producto> producto_obs=new ArrayList<>();
        Map<String, Adicional> adicional_aux=new HashMap<>();
        
        //Se crean obsequios para el primer producto
        Producto o1 = new SinAlcohol(2, 1, 1000, "101", 50);
        Producto o2 = new Alcoholica(5, 1, 3000, "102", 30);
        Producto o3 = new Alimento(100, 10, "103", 0);
        return productos;
    }
    
    public ArrayList<Moneda> dineroAcumulado(){
        ArrayList<Moneda> dinero = new ArrayList<>();
        //Hay que crear las monedas
             
        return dinero;
    }
    
    //CONSTRUCTORS
    public GestionProducto() {
    }
    
}
