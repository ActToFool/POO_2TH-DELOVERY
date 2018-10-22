/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entity.Adicional;
import Entity.Denominacion;
import Entity.Moneda;
import Entity.Producto;
import Entity.Venta;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class VendingTest {
    Vending prueba;
    public VendingTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        prueba = new Vending();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of crearNuevaVenta method, of class Vending.
     */
    @Test
    public void testCrearNuevaVenta() {
        System.out.println("crearNuevaVenta");
        boolean expResult = true;
        boolean result = prueba.crearNuevaVenta();
        assertEquals(expResult, result);
    }
    @Test
    public void testNoValidoCrearNuevaVenta() {
        System.out.println("crearNuevaVenta");
        boolean expResult = false;
        boolean result = prueba.crearNuevaVenta();
        assertNotEquals(expResult, result);
    }
    /**
     * Test of monedasExistentes method, of class Vending.
     */
    @Test
    public void testMonedasExistentes() {
        System.out.println("monedasExistentes");
        int denominacion = 100;
        int expResult = 20;
        int result = prueba.monedasExistentes(denominacion);
        assertEquals(expResult, result);
    }
    @Test
    public void testNoValidoMonedasExistentes() {
        System.out.println("monedasExistentes");
        int denominacion = 100;
        int expResult = 21;
        int result = prueba.monedasExistentes(denominacion);
        assertNotEquals(expResult, result);
    }
    

    /**
     * Test of buscarMonedaDenominacion method, of class Vending.
     */
    @Test
    public void testBuscarMonedaDenominacion() {
        System.out.println("buscarMonedaDenominacion");
        int denominacion = 100;
        Moneda expResult = prueba.getDineroAcumulado().get(0);//la posicion uno son las monedas  de 100
        Moneda result = prueba.buscarMonedaDenominacion(denominacion);
        assertSame(expResult, result);
    }
    /**
     * Test of buscarMonedaDenominacion method, of class Vending.
     */
    @Test
    public void testNoValidoBuscarMonedaDenominacion(){
        System.out.println("buscarMonedaDenominacion");
        int denominacion = 100;
        Moneda expResult = prueba.getDineroAcumulado().get(1);
        Moneda result = prueba.buscarMonedaDenominacion(denominacion);
        assertNotSame(expResult, result);
    }
    
    /**
     * Test of validarDenominacion method, of class Vending.
     */
    @Test
    public void testValidarDenominacion() {
        System.out.println("validarDenominacion");
        int denominacion = 100;
        Denominacion expResult = prueba.getDineroAcumulado().get(0).getDenominacion();
        Denominacion result = prueba.validarDenominacion(denominacion);
        assertSame(expResult, result);
    }
    @Test
    public void testNoValidoValidarDenominacion() {
        System.out.println("validarDenominacion");
        int denominacion = 700;
        Denominacion expResult = prueba.getDineroAcumulado().get(0).getDenominacion();
        Denominacion result = prueba.validarDenominacion(denominacion);
        assertNotSame(expResult, result);
    }

    /**
     * Test of venderProducto method, of class Vending.
     */
    @Test
    public void testVenderProducto() {
        System.out.println("venderProducto");
        String codigo = "1A";
        ArrayList<String> adicionales=new ArrayList<>();
        adicionales.add("A1");
        adicionales.add("A1");
        ArrayList<Integer> monedas = new ArrayList<>();
        monedas.add(100);
        ArrayList<Moneda> expResult =new ArrayList<>();
        expResult.add(new Moneda(1, Denominacion.CIEN));
        ArrayList<Moneda> result = prueba.venderProducto(codigo, adicionales, monedas);
        System.out.println("venderProducto"+"\n"+result.get(0).getDenominacion().getEnNumeros()+"\n"+expResult.get(0).getDenominacion().getEnNumeros());
        //no pudimos hacerlo con listas así que imprimimos la denominacion
        //y luego comparamos la cantidad
        assertEquals(expResult.get(0).getCantidad(), result.get(0).getCantidad());
    }
    @Test
    public void testNoValidoVenderProducto() {
        System.out.println("venderProducto");
        String codigo = "XA";
        ArrayList<String> adicionales=new ArrayList<>();
        adicionales.add("A1");
        adicionales.add("A1");
        ArrayList<Integer> monedas = new ArrayList<>();
        monedas.add(100);
        ArrayList<Moneda> expResult =new ArrayList<>();
        expResult.add(new Moneda(1, Denominacion.CIEN));
        ArrayList<Moneda> result = prueba.venderProducto(codigo, adicionales, monedas);
        System.out.println("venderProducto"+"\n"+result.get(0).getCantidad()+"\n"+expResult.get(0).getCantidad());
        //no pudimos hacerlo con listas así que lo imprimimos
        assertEquals(expResult.get(0).getCantidad(), result.get(0).getCantidad());
    }

    /**
     * Test of castVueltasMoneda method, of class Vending.
     */
    @Test
    public void testCastVueltasMoneda() {
        System.out.println("castVueltasMoneda");
        ArrayList<Integer> monedas = new ArrayList<>();
        monedas.add(100);
        ArrayList<Moneda> expResult = new ArrayList<>();
        expResult.add(new Moneda(1, Denominacion.CIEN));
        ArrayList<Moneda> result = prueba.castVueltasMoneda(monedas);
        System.out.println("expResult cantidad: "+expResult.get(0).getCantidad());
        System.out.println("result cantidad: "+result.get(0).getCantidad());
        assertSame(expResult.get(0).getDenominacion(), result.get(0).getDenominacion());
    }
    @Test
    public void testNoValidoCastVueltasMoneda() {
        System.out.println("castVueltasMoneda");
        ArrayList<Integer> monedas = new ArrayList<>();
        monedas.add(700);
        ArrayList<Moneda> expResult = new ArrayList<>();
        expResult.add(new Moneda(1, Denominacion.CIEN));
        ArrayList<Moneda> result = prueba.castVueltasMoneda(monedas);
        assertNull(result.get(0).getDenominacion());
    }

    /**
     * Test of validarMonedas method, of class Vending.
     */
    @Test
    public void testValidarMonedas() {
        System.out.println("validarMonedas");
        String codigo = "1A";
        ArrayList<String> adicionales=new ArrayList<>();
        adicionales.add("A1");
        adicionales.add("A1");
        ArrayList<Integer> monedas = new ArrayList<>();
        monedas.add(100);
        prueba.venderProducto("1A",adicionales,monedas);
        int result =-500;//porque el valor del producto es mayor
        int expResult=prueba.validarMonedas();
        assertEquals(result, expResult);
    }
    @Test
    public void testNoValidoValidarMonedas() {
        System.out.println("validarMonedas");
        String codigo = "1A";
        ArrayList<String> adicionales=new ArrayList<>();
        adicionales.add("A1");
        adicionales.add("A1");
        ArrayList<Integer> monedas = new ArrayList<>();
        monedas.add(100);
        prueba.venderProducto("1A",adicionales,monedas);
        int result =-400;
        int expResult=prueba.validarMonedas();
        assertNotEquals(result, expResult);
    }
    /*
    /**
     * Test of buscarAdicionales method, of class Vending.
     */
    @Test
    public void testBuscarAdicionales() {
        System.out.println("buscarAdicionales");
        ArrayList<String> adicionales=new ArrayList<>();
        adicionales.add("X1");
        adicionales.add("Y1");
        HashMap<String, Adicional> expResult = new HashMap<>();
        HashMap<String, Adicional> result = prueba.buscarAdicionales(adicionales);
        assertEquals(expResult.isEmpty(), result.isEmpty());
    }

    /**
     * Test of devolverRestante method, of class Vending.
     */
    @Test
    public void testDevolverRestante() {
        System.out.println("devolverRestante");
        Vending instance = new Vending();
        ArrayList<Moneda> expResult = null;
        ArrayList<Moneda> result = instance.devolverRestante();
        assertEquals(expResult, result);
    }
}
