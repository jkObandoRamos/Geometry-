/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.shape.circunferences;

/**
 *
 * @author Labs-DECC
 */
public class Circle extends Circumference {

    public Circle(Float radio) {
        super(radio);
    }

    @Override
    public Float area() {
       return (float)(Math.PI * Math.pow(radio,2));
    }

    @Override
    public Float perimeter() {
        return (float)(2*Math.PI *radio);
    }
    
    


    
    
    
}
