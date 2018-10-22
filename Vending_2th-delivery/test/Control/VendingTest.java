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
        Vending instance = new Vending();
        boolean expResult = false;
        boolean result = instance.crearNuevaVenta();
        assertEquals(expResult, result);
    }

    /**
     * Test of monedasExistentes method, of class Vending.
     */
    @Test
    public void testMonedasExistentes() {
        System.out.println("monedasExistentes");
        int denominacion = 0;
        Vending instance = new Vending();
        int expResult = 0;
        int result = instance.monedasExistentes(denominacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarMonedaDenominacion method, of class Vending.
     */
    @Test
    public void testBuscarMonedaDenominacion() {
        System.out.println("buscarMonedaDenominacion");
        int denominacion = 0;
        Vending instance = new Vending();
        Moneda expResult = null;
        Moneda result = instance.buscarMonedaDenominacion(denominacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarDenominacion method, of class Vending.
     */
    @Test
    public void testValidarDenominacion() {
        System.out.println("validarDenominacion");
        int denominacion = 0;
        Vending instance = new Vending();
        Denominacion expResult = null;
        Denominacion result = instance.validarDenominacion(denominacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of venderProducto method, of class Vending.
     */
    @Test
    public void testVenderProducto() {
        System.out.println("venderProducto");
        String codigo = "";
        ArrayList<String> adicionales = null;
        ArrayList<Integer> monedas = null;
        Vending instance = new Vending();
        ArrayList<Moneda> expResult = null;
        ArrayList<Moneda> result = instance.venderProducto(codigo, adicionales, monedas);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of castVueltasMoneda method, of class Vending.
     */
    @Test
    public void testCastVueltasMoneda() {
        System.out.println("castVueltasMoneda");
        ArrayList<Integer> monedas = null;
        Vending instance = new Vending();
        ArrayList<Moneda> expResult = null;
        ArrayList<Moneda> result = instance.castVueltasMoneda(monedas);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarMonedas method, of class Vending.
     */
    @Test
    public void testValidarMonedas() {
        System.out.println("validarMonedas");
        Vending instance = new Vending();
        int expResult = 0;
        int result = instance.validarMonedas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarAdicionales method, of class Vending.
     */
    @Test
    public void testBuscarAdicionales() {
        System.out.println("buscarAdicionales");
        ArrayList<String> adiciones = null;
        Vending instance = new Vending();
        HashMap<String, Adicional> expResult = null;
        HashMap<String, Adicional> result = instance.buscarAdicionales(adiciones);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGestion method, of class Vending.
     */
    @Test
    public void testGetGestion() {
        System.out.println("getGestion");
        Vending instance = new Vending();
        GestionProducto expResult = null;
        GestionProducto result = instance.getGestion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGestion method, of class Vending.
     */
    @Test
    public void testSetGestion() {
        System.out.println("setGestion");
        GestionProducto gestion = null;
        Vending instance = new Vending();
        instance.setGestion(gestion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVentaActual method, of class Vending.
     */
    @Test
    public void testGetVentaActual() {
        System.out.println("getVentaActual");
        Vending instance = new Vending();
        Venta expResult = null;
        Venta result = instance.getVentaActual();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVentaActual method, of class Vending.
     */
    @Test
    public void testSetVentaActual() {
        System.out.println("setVentaActual");
        Venta ventaActual = null;
        Vending instance = new Vending();
        instance.setVentaActual(ventaActual);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVentasRealzadas method, of class Vending.
     */
    @Test
    public void testGetVentasRealzadas() {
        System.out.println("getVentasRealzadas");
        Vending instance = new Vending();
        ArrayList<Venta> expResult = null;
        ArrayList<Venta> result = instance.getVentasRealzadas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVentasRealzadas method, of class Vending.
     */
    @Test
    public void testSetVentasRealzadas() {
        System.out.println("setVentasRealzadas");
        ArrayList<Venta> ventasRealzadas = null;
        Vending instance = new Vending();
        instance.setVentasRealzadas(ventasRealzadas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDineroAcumulado method, of class Vending.
     */
    @Test
    public void testGetDineroAcumulado() {
        System.out.println("getDineroAcumulado");
        Vending instance = new Vending();
        ArrayList<Moneda> expResult = null;
        ArrayList<Moneda> result = instance.getDineroAcumulado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDineroAcumulado method, of class Vending.
     */
    @Test
    public void testSetDineroAcumulado() {
        System.out.println("setDineroAcumulado");
        ArrayList<Moneda> dineroAcumulado = null;
        Vending instance = new Vending();
        instance.setDineroAcumulado(dineroAcumulado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVentasRealizadas method, of class Vending.
     */
    @Test
    public void testGetVentasRealizadas() {
        System.out.println("getVentasRealizadas");
        Vending instance = new Vending();
        ArrayList<Venta> expResult = null;
        ArrayList<Venta> result = instance.getVentasRealizadas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVentasRealizadas method, of class Vending.
     */
    @Test
    public void testSetVentasRealizadas() {
        System.out.println("setVentasRealizadas");
        ArrayList<Venta> ventasRealizadas = null;
        Vending instance = new Vending();
        instance.setVentasRealizadas(ventasRealizadas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCatalogo method, of class Vending.
     */
    @Test
    public void testGetCatalogo() {
        System.out.println("getCatalogo");
        Vending instance = new Vending();
        HashMap<String, Producto> expResult = null;
        HashMap<String, Producto> result = instance.getCatalogo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCatalogo method, of class Vending.
     */
    @Test
    public void testSetCatalogo() {
        System.out.println("setCatalogo");
        HashMap<String, Producto> Catalogo = null;
        Vending instance = new Vending();
        instance.setCatalogo(Catalogo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
