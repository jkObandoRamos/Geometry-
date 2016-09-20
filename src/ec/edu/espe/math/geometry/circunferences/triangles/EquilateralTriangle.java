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
public class EquilateralTriangle extends Triangle{
    
    private float sideGeneral;

    public EquilateralTriangle(float sideGeneral, float sideOne, float sideTwo, float sideThree) {
        super(sideOne, sideTwo, sideThree);
        this.sideGeneral = sideGeneral;
    }

    public float getSideGeneral() {
        return sideGeneral;
    }

    public void setSideGeneral(float sideGeneral) {
        this.sideGeneral = sideGeneral;
    }




    @Override
    public Float area() {
        return (float)(Math.sqrt(3/4)*Math.pow(this.sideGeneral,2));
    }

    @Override
    public Float perimetre() {
        return this.sideGeneral*3;
    }


    
    
    
    
}
