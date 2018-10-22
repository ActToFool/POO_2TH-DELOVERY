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
import Entity.Bebida;
import Entity.Denominacion;
import Entity.Producto;
import Entity.SinAlcohol;
import Entity.Sustancia;
import Entity.Utensilio;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Emanuel Álvarez
 */
public class GestionProducto {

    public HashMap<String, Producto> crearProductos(){
        HashMap<String, Producto>productos = new HashMap<>();
        ArrayList<Producto> producto_obs=new ArrayList<>();
        HashMap<String, Adicional> adicional_aux=new HashMap<>();
        //Se crean obsequios para el primer producto
        Producto o1 = new SinAlcohol(0, 1, 0, "101", 12);
        Producto o2 = new Alcoholica(0, 1, 0, "102", 12);
        Producto o3 = new Alimento(100, 0, "103", 12);
        //Se enlazan los obsequios
        producto_obs.add(o1);
        producto_obs.add(o2);
        producto_obs.add(o3);
        //Se crean adicionales
        Utensilio a1=new Utensilio(50,"Bolsa", 12);
        Utensilio a2=new Utensilio(50,"Servilleta",12);
        Utensilio a3=new Utensilio(1200,"Galleta",12);
        Sustancia s1=new Sustancia(20, "Sal", 6);
        Sustancia s2=new Sustancia(20, "Ají", 6);
        Sustancia s3=new Sustancia(20, "Pimienta", 6);
        //Se enlazan los adicionales
        adicional_aux.put("A1", a1);
        adicional_aux.put("A2", a2);
        adicional_aux.put("A3", a3);
        adicional_aux.put("A4", s1);
        adicional_aux.put("A5", s2);
        adicional_aux.put("A6", s3);
        //Se le enlazan los obsequios y adicionales al producto
        Producto p1=new Alimento(250, 2,"11A" , 12, adicional_aux, producto_obs);
        productos.put("1A", p1);
                
        //PRODUCTO 2
        
        ArrayList<Producto> producto_obs1=new ArrayList<>();
        HashMap<String, Adicional> adicional_aux1=new HashMap<>();
        //Se crean obsequios para el primer producto
        Producto o11 = new SinAlcohol(0, 1, 0, "111", 12);
        Producto o21 = new Alcoholica(0, 1, 0, "112", 12);
        Producto o31 = new Alimento(500, 0, "113", 12);
        //Se enlazan los obsequios
        producto_obs1.add(o11);
        producto_obs1.add(o21);
        producto_obs1.add(o31);
        //Se crean adicionales
        Utensilio a11=new Utensilio(50,"Bolsa", 12);
        Utensilio a21=new Utensilio(50,"Servilleta",12);
        Utensilio a31=new Utensilio(1200,"Galleta",12);
        Sustancia s11=new Sustancia(20, "Sal", 6);
        Sustancia s21=new Sustancia(20, "Ají", 6);
        Sustancia s31=new Sustancia(20, "Pimienta", 6);
        //Se enlazan los adicionales
        adicional_aux1.put("B1", a11);
        adicional_aux1.put("B2", a21);
        adicional_aux1.put("B3", a31);
        adicional_aux1.put("B4", s11);
        adicional_aux1.put("B5", s21);
        adicional_aux1.put("B6", s31);
        //Se le enlazan los obsequios y adicionales al producto
        Producto p2=new Alimento(300, 3,"12A" , 12, adicional_aux1, producto_obs1);
        productos.put("2A", p2);
        
        //PRODUCTO 3

        ArrayList<Producto> producto_obs2=new ArrayList<>();
        HashMap<String, Adicional> adicional_aux2=new HashMap<>();
        //Se crean obsequios para el primer producto
        Producto o12 = new SinAlcohol(0, 1, 0, "121", 12);
        Producto o22 = new Alcoholica(0, 1, 0, "122", 12);
        Producto o32 = new Alimento(30, 0, "123", 12);
        //Se enlazan los obsequios
        producto_obs2.add(o12);
        producto_obs2.add(o22);
        producto_obs2.add(o32);
        //Se crean adicionales
        Utensilio a12=new Utensilio(50,"Bolsa", 12);
        Utensilio a22=new Utensilio(50,"Servilleta",12);
        Utensilio a32=new Utensilio(1200,"Galleta",12);
        Sustancia s12=new Sustancia(20, "Sal", 6);
        Sustancia s22=new Sustancia(20, "Ají", 6);
        Sustancia s32=new Sustancia(20, "Pimienta", 6);
        //Se enlazan los adicionales
        adicional_aux2.put("C1", a11);
        adicional_aux2.put("C2", a21);
        adicional_aux2.put("C3", a31);
        adicional_aux2.put("C4", s11);
        adicional_aux2.put("C5", s21);
        adicional_aux2.put("C6", s31);
        //Se le enlazan los obsequios y adicionales al producto
        Producto p3=new Alimento(560, 4,"13A" , 12, adicional_aux2, producto_obs2);
        productos.put("3A", p3);
        
        //PRODUCTO 4
        
        ArrayList<Producto> producto_obs3=new ArrayList<>();
        HashMap<String, Adicional> adicional_aux3=new HashMap<>();
        //Se crean obsequios para el primer producto
        Producto o13 = new SinAlcohol(0, 1, 0, "131", 12);
        Producto o23 = new Alcoholica(0, 1, 0, "132", 12);
        Producto o33 = new Alimento(30, 0, "133", 12);
        
        //Se enlazan los obsequios
        producto_obs3.add(o13);
        producto_obs3.add(o23);
        producto_obs3.add(o33);
        //Se crean adicionales
        Utensilio a13=new Utensilio(50,"Mezclador", 12);
        Utensilio a23=new Utensilio(200,"Vaso",12);
        Utensilio a33=new Utensilio(800,"Copa",12);
        Sustancia s13=new Sustancia(1, "Limón", 6);
        Sustancia s23=new Sustancia(2, "Sal", 6);
        Sustancia s33=new Sustancia(20, "Ginger", 6);
        //Se enlazan los adicionales
        adicional_aux3.put("D1", a11);
        adicional_aux3.put("D2", a21);
        adicional_aux3.put("D3", a31);
        adicional_aux3.put("D4", s11);
        adicional_aux3.put("D5", s21);
        adicional_aux3.put("D6", s31);
        //Se le enlazan los obsequios y adicionales al producto
        Producto p4=new Alcoholica(30, 1,25000 , "14A",12, adicional_aux3, producto_obs3);
        productos.put("4A", p4);
        
        //PRODUCTO 4
        
        ArrayList<Producto> producto_obs4=new ArrayList<>();
        HashMap<String, Adicional> adicional_aux4=new HashMap<>();
        //Se crean obsequios para el primer producto
        Producto o14 = new SinAlcohol(0, 1, 0, "141", 12);
        Producto o24 = new Alcoholica(0, 1, 0, "142", 12);
        Producto o34 = new Alimento(80, 0, "143", 12);
        
        //Se enlazan los obsequios
        producto_obs4.add(o14);
        producto_obs4.add(o24);
        producto_obs4.add(o34);
        //Se crean adicionales
        Utensilio a14=new Utensilio(50,"Mezclador", 12);
        Utensilio a24=new Utensilio(200,"Vaso",12);
        Utensilio a34=new Utensilio(800,"Copa",12);
        Sustancia s14=new Sustancia(1, "Limón", 6);
        Sustancia s24=new Sustancia(2, "Sal", 6);
        Sustancia s34=new Sustancia(20, "Ginger", 6);
        //Se enlazan los adicionales
        adicional_aux4.put("E1", a11);
        adicional_aux4.put("E2", a21);
        adicional_aux4.put("E3", a31);
        adicional_aux4.put("E4", s11);
        adicional_aux4.put("E5", s21);
        adicional_aux4.put("E6", s31);
        //Se le enlazan los obsequios y adicionales al producto
        Producto p5=new SinAlcohol(15, 1,25000 , "15A",12, adicional_aux4, producto_obs4);
        productos.put("5A", p5);
        return productos;
    }
    
    public ArrayList<Moneda> dineroAcumulado(){
        ArrayList<Moneda> creada=new ArrayList<>();
        //Hay que crear las monedas
        Moneda m1=new Moneda(20,Denominacion.CIEN);
        Moneda m2=new Moneda(20,Denominacion.DOSCIENTOS);
        Moneda m3=new Moneda(20,Denominacion.QUINIENTOS);
        Moneda m4=new Moneda(20,Denominacion.MIL);
        //CREAMOS LA LISTA QUE VAMOS A RETORNAR Y AGREGAMOS LAS MONEDAS
        creada.add(m1);
        creada.add(m2);
        creada.add(m3);
        creada.add(m4);
        return creada;
    }
    
    //CONSTRUCTORS
    public GestionProducto() {
    }
    
}
