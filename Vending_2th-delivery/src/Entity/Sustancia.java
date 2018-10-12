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
    private float porcenaje;

    public Sustancia(float porcenaje, String nombre, int unidadesDisponibles) {
        super(nombre, unidadesDisponibles);
        this.porcenaje = porcenaje;
    }

    public Sustancia(float porcenaje) {
        this.porcenaje = porcenaje;
    }

    

    @Override
    public void calcularPrecio() {
        System.out.println("Soy una sustancia de tipo Adicional");
    }

    public Sustancia() {
    }

    public float getPorcenaje() {
        return porcenaje;
    }

    public void setPorcenaje(float porcenaje) {
        this.porcenaje = porcenaje;
    }
}
