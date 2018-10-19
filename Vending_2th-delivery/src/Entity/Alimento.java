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
public class Alimento extends Producto{
    private int gramos;
    private float valorGramos;

    public Alimento() {
    }

    public Alimento(int gramos, float valorGramos, String codigo, int UnidadesDisponibles, Map<String, Adicional> adicionalesProducto, ArrayList<Producto> obsequios) {
        super(codigo, UnidadesDisponibles, adicionalesProducto, obsequios);
        this.gramos = gramos;
        this.valorGramos = valorGramos;
    }

    public Alimento(int gramos, float valorGramos, String codigo, int UnidadesDisponibles) {
        super(codigo, UnidadesDisponibles);
        this.gramos = gramos;
        this.valorGramos = valorGramos;
    }
    
    public Alimento(int gramos, float valorGramos) {
        this.gramos = gramos;
        this.valorGramos = valorGramos;
    }
    

    @Override
    public double calcularValor() {
        System.out.println("soy Alimento de tipo Producto");
        return 0;
    }

    public int getGramos() {
        return gramos;
    }

    public void setGramos(int gramos) {
        this.gramos = gramos;
    }

    public float getValorGramos() {
        return valorGramos;
    }

    public void setValorGramos(float valorGramos) {
        this.valorGramos = valorGramos;
    }
    
    
}
