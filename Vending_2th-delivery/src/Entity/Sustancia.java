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
public class Sustancia extends Adicional{
    private float porcentaje;

    public Sustancia(float porcenaje, String nombre, int unidadesDisponibles) {
        super(nombre, unidadesDisponibles);
        this.porcentaje = porcenaje;
    }

    public Sustancia(float porcenaje) {
        this.porcentaje = porcenaje;
    }

    public Sustancia() {
    }

    public float getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(float porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double calcularPrecio(){
        return this.porcentaje;
    }
    public double calcularPrecio(int precio){
        return precio*(this.porcentaje+1);
    }
}
