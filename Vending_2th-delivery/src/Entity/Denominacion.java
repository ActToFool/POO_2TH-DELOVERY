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
public enum Denominacion {
    MIL(1000),
    QUINIENTOS(500),
    DOSCIENTOS(200),
    CIEN(100);
    private int enNumeros;

    private Denominacion(int enNumeros) {
        this.enNumeros = enNumeros;
    }

    public int getEnNumeros() {
        return enNumeros;
    }

    public void setEnNumeros(int enNumeros) {
        this.enNumeros = enNumeros;
    }
    
}
