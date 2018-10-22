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

    public Alcoholica(float impuesto, int litros, float valorLitro, String codigo, int UnidadesDisponibles, Map<String, Adicional> adicionalesProducto, ArrayList<Producto> obsequios) {
        super(litros, valorLitro, codigo, UnidadesDisponibles, adicionalesProducto, obsequios);
        this.impuesto = impuesto;
    }

    public Alcoholica(float impuesto, int litros, float valorLitro, String codigo, int UnidadesDisponibles) {
        super(litros, valorLitro, codigo, UnidadesDisponibles);
        this.impuesto = impuesto;
    }

    @Override
    public double calcularValor() {
        return (super.getLitros()*super.getValorLitro())*(this.impuesto+1);
    }
}
