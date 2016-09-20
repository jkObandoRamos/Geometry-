/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.util;

/**
 *
 * @author Labs-DECC
 */
public  class PrinterUtil {
    
    public static void print(String shapeName, String shapeParameter,String shapeValue)
    {
        System.out.println(shapeParameter + " of "+  shapeName + ":" + shapeValue);
    }
}
