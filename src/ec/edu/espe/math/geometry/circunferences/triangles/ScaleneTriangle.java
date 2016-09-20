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
public class ScaleneTriangle  extends Triangle{

    public ScaleneTriangle(float sideOne, float sideTwo, float sideThree) {
        super(sideOne, sideTwo, sideThree);
    }

          
    @Override
    public Float area() {
       float s = this.perimetre()/2;
       
       return (float)(Math.sqrt((s-this.sideOne)+(s-this.sideTwo)+(s-this.sideThree)));
    }

    @Override
    public Float perimetre() {
       return this.sideOne+this.sideTwo+this.sideThree;
    }
    
}
