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
public class Ellipse extends Circumference {
    
    private Float radioTwo;

    public Ellipse(Float radioTwo, Float radio) {
        super(radio);
        this.radioTwo = radioTwo;
    }

    @Override
    public Float area() {
      return (float)(Math.PI*this.radio*this.radioTwo);  
    }

    @Override
    public Float perimeter() {
       return (float) (2*Math.PI * Math.sqrt((Math.pow(this.radio,2)+Math.pow(this.radio,2))/2));
    }
    
   
}
