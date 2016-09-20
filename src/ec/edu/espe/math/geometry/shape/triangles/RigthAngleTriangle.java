/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.shape.triangles;

import java.util.Objects;

/**
 *
 * @author Labs-DECC
 */
public class RigthAngleTriangle extends Triangle {
    
    private Float base;
    private Float heigth;

    public RigthAngleTriangle(Float base, Float heigth, float sideOne, float sideTwo, float sideThree) {
        super(sideOne, sideTwo, sideThree);
        this.base = base;
        this.heigth = heigth;
    }

    public Float getBase() {
        return base;
    }

    public void setBase(Float base) {
        this.base = base;
    }

    public Float getHeigth() {
        return heigth;
    }

    public void setHeigth(Float heigth) {
        this.heigth = heigth;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.base);
        hash = 23 * hash + Objects.hashCode(this.heigth);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RigthAngleTriangle other = (RigthAngleTriangle) obj;
        if (!Objects.equals(this.base, other.base)) {
            return false;
        }
        if (!Objects.equals(this.heigth, other.heigth)) {
            return false;
        }
        return true;
    }

    @Override
    public Float area() {
        return (this.base * this.heigth)/2;
    }

    @Override
    public Float perimeter() {
        return(float)(this.base+this.heigth+ Math.sqrt(Math.pow(this.base, 2)+Math.pow(this.heigth, 2)));
    }
    
    
}
