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
    private ArrayList<Venta> ventasRealzadas;
    private Moneda dineroAcumulado;
    private Map<String, Producto> Catalogo;
}
