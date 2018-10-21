package Boundary;

import Control.Vending;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**

 *
 * @author Emanuel Álvarez
 */
public class ControllerVendingTest {

    Vending vending;
    public static void main(String[] args) {
        ControllerVendingTest c=new ControllerVendingTest();
        
    }
    public String pedirCodigoProducto(){
        String parseString="";
        Scanner reader=new Scanner(System.in);
        parseString=reader.nextLine();
        return parseString;
    }
    //constructores
    public ControllerVendingTest() {
        this.vending = new Vending();
    }
    
}
