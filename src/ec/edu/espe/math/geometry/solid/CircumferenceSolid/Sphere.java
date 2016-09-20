/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.solid.CircumferenceSolid;

import ec.edu.espe.math.geometry.shape.circunferences.Circumference;

/**
 *
 * @author Labs-DECC
 */
public class Sphere extends Circumference implements CircumferenceSolidInterface {

    private Float hight;

    public Sphere(Float higth, Float radio) {
        super(radio);
        this.hight = higth;
    }
    public Sphere(Float radio) {
        super(radio);
    }

    @Override
    public Float area() {
        return (float)(2*Math.PI*this.radio*(this.radio+ this.hight));
    }

    @Override
    public Float perimeter() {
       return null;
    }

    @Override
    public Float volumen() {
      return (float)((4/3)*(Math.PI)*Math.pow(this.radio,3));
    }
    
    
    
    
}
