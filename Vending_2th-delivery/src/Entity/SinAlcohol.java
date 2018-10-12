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
public class SinAlcohol extends Bebida{
    private float descuento;

    public SinAlcohol() {
    }

    public SinAlcohol(float descuento, int litros, float valorLitro, String codigo, int UnidadesDisponibles) {
        super(litros, valorLitro, codigo, UnidadesDisponibles);
        this.descuento = descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public float getDescuento() {
        return descuento;
    }
    
    
}
