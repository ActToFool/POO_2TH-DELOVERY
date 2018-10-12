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
public class Utensilio extends Adicional{
    private float precio;

    public Utensilio(float precio, String nombre, int unidadesDisponibles) {
        super(nombre, unidadesDisponibles);
        this.precio = precio;
    }

    public Utensilio(float precio) {
        this.precio = precio;
    }

    public Utensilio() {
    }
    
    @Override
    public void calcularPrecio() {
        System.out.println("Soy un utensilio de tipo Adicional");
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
}
