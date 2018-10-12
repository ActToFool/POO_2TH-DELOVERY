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
public class Alcoholica extends Bebida{
    private float impuesto;

    public float getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(float impuesto) {
        this.impuesto = impuesto;
    }

    public Alcoholica() {
    }

    public Alcoholica(float impuesto, int litros, float valorLitro, String codigo, int UnidadesDisponibles) {
        super(litros, valorLitro, codigo, UnidadesDisponibles);
        this.impuesto = impuesto;
    }
}
