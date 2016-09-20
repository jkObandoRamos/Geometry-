/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.solid.cyllinders;

import ec.edu.espe.math.geometry.shape.circunferences.Circumference;

/**
 *
 * @author Labs-DECC
 */
public class Cyllinder extends Circumference implements CyllinderSolidInterface {

    private Float height;

    public Cyllinder(Float heigt, Float radio) {
        super(radio);
        this.height = heigt;
    }
  

    @Override
    public Float area() {
    return (float)(2 * Math.PI*this.radio*(this.radio+ this.height));
    }
    

    @Override
    public Float perimeter() {
        return null;
    }

    @Override
    public Float volumen() {
        return (float)(Math.PI*Math.pow(this.radio,2)*this.height);
    }
    // implementar las operaciones 
}
