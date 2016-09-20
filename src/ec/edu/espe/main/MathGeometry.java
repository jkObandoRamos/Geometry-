/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.main;

import ec.edu.espe.math.geometry.shape.quadrilaterals.Square;
import ec.edu.espe.math.geometry.shape.quadrilaterals.Rombus;
import ec.edu.espe.math.geometry.shape.quadrilaterals.Rectangle;
import ec.edu.espe.util.GeometricsConstans;
import ec.edu.espe.util.PrinterUtil;
import ec.edu.espe.math.geometry.Shape;
/**
 *
 * @author Labs-DECC
 */
public class MathGeometry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Square cuadrado = new Square(5f);
        Rectangle rectangulo = new Rectangle(5f,7f);
        Rombus rombo = new Rombus(3f,6f,4f);
        
        Shape arreglo [] = {cuadrado,rectangulo,rombo};
        
  
 
        for(int i=0;i<arreglo.length;i++)
        {
            PrinterUtil.print(arreglo[i].getClass().getSimpleName(),GeometricsConstans.PERIMETER , arreglo[i].perimeter().toString());
            PrinterUtil.print(arreglo[i].getClass().getSimpleName(),GeometricsConstans.AREA , arreglo[i].area().toString());
        }
        
        
    }
    
}
