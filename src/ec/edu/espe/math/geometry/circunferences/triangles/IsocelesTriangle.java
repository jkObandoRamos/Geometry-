/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.circunferences.triangles;

/**
 *
 * @author Labs-DECC
 */
public class IsocelesTriangle extends RigthAngleTriangle {

    public IsocelesTriangle(Float base, Float heigth, float sideOne, float sideTwo, float sideThree) {
        super(base, heigth, sideOne, sideTwo, sideThree);
    }
    
    
     @Override
    public Float perimetre() {
       return (this.getBase()+(this.getSideOne()*2));
    }
    
}
