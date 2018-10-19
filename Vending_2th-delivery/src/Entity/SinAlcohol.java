/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author Emanuel Álvarez
 */
public class SinAlcohol extends Bebida{
    private float descuento;

    public SinAlcohol() {
    }

    public SinAlcohol(float descuento, int litros, float valorLitro, String codigo, int UnidadesDisponibles) {
        super(litros, valorLitro, codigo, UnidadesDisponibles);
        this.descuento = descuento;
    }

    public SinAlcohol(float descuento, int litros, float valorLitro, String codigo, int UnidadesDisponibles, Map<String, Adicional> adicionalesProducto, ArrayList<Producto> obsequios) {
        super(litros, valorLitro, codigo, UnidadesDisponibles, adicionalesProducto, obsequios);
        this.descuento = descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public float getDescuento() {
        return descuento;
    }
    
    
}
