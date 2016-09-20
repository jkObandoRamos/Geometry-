/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.solid.frustrums;

import ec.edu.espe.math.geometry.shape.circunferences.Ellipse;

/**
 *
 * @author Labs-DECC
 */
public class Frustum extends Ellipse implements FrustrumSolidInterface{
    
    private Float heigth;

    public Frustum(Float heigth, Float radioTwo, Float radio) {
        super(radioTwo, radio);
        this.heigth = heigth;
    }
    
    @Override
    public Float volumen ()
    {
     //implementar operaciones
        return (float)(Math.PI*this.radio*this.heigth*(Math.pow(this.heigth,2)));
    }
}
