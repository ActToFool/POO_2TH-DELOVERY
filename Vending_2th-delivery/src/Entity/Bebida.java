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
public abstract class Bebida extends Producto{
    private int litros;
    private float valorLitro;

    public Bebida() {
    }

    public Bebida(int litros, float valorLitro, String codigo, int UnidadesDisponibles) {
        super(codigo, UnidadesDisponibles);
        this.litros = litros;
        this.valorLitro = valorLitro;
    }

    public Bebida(int litros, float valorLitro) {
        this.litros = litros;
        this.valorLitro = valorLitro;
    }
    
    @Override
    public double calcularValor() {
        System.out.println("Soy una bebida de tipo Producto");
        return 0;
    }

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }

    public float getValorLitro() {
        return valorLitro;
    }

    public void setValorLitro(float valorLitro) {
        this.valorLitro = valorLitro;
    }
    
}