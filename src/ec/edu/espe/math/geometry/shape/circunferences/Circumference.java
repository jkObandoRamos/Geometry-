/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.shape.circunferences;
import ec.edu.espe.math.geometry.Shape;
/**
 *
 * @author Labs-DECC
 */
public abstract class Circumference implements Shape{
    
    protected Float radio;

    public Circumference(Float radio) {
        this.radio = radio;
    }


    public Float getRadio() {
        return radio;
    }

    public void setRadio(Float radio) {
        this.radio = radio;
    }
    
}
