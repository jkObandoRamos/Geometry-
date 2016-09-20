/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.solid.Cones;

import ec.edu.espe.math.geometry.shape.circunferences.Circumference;

/**
 *
 * @author Labs-DECC
 */
public class Cone extends Circumference implements ConeSolidInterface{
    
    private Float side;
    private Float height;

    public Cone(Float side, Float height, Float radio) {
        super(radio);
        this.side = side;
        this.height = height;
    }

    @Override
    public Float area() {
       return (float)Math.PI*this.radio*(this.side+this.radio);
    }

    @Override
    public Float perimeter() {
        return null;
    }

    @Override
    public Float volumen() {
        return (float)(1/3*Math.PI*Math.pow(this.radio,3)*this.height);
    }
    
    //implementar operaciones
    
    
    
    
}
