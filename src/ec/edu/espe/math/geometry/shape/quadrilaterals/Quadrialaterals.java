/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.shape.quadrilaterals;
import ec.edu.espe.math.geometry.Shape;
/**
 *
 * @author Labs-DECC
 */
public abstract class Quadrialaterals implements Shape
{
   
      protected Float side;

    public Quadrialaterals(Float side) {
        this.side = side;
    }
    
}
