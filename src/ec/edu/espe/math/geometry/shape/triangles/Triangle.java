/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.shape.triangles;
import ec.edu.espe.math.geometry.Shape;
/**
 *
 * @author Labs-DECC
 */
public abstract class  Triangle implements Shape
{
 
  protected float sideOne;
  protected float sideTwo;
  protected float sideThree;

    public Triangle(float sideOne, float sideTwo, float sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    public float getSideOne() {
        return sideOne;
    }

    public void setSideOne(float sideOne) {
        this.sideOne = sideOne;
    }

    public float getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(float sideTwo) {
        this.sideTwo = sideTwo;
    }

    
    public float getSideThree() {
        return sideThree;
    }

    public void setSideThree(float sideThree) {
        this.sideThree = sideThree;
    }

  
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Float.floatToIntBits(this.sideOne);
        hash = 23 * hash + Float.floatToIntBits(this.sideTwo);
        hash = 23 * hash + Float.floatToIntBits(this.sideThree);
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
        final Triangle other = (Triangle) obj;
        if (Float.floatToIntBits(this.sideOne) != Float.floatToIntBits(other.sideOne)) {
            return false;
        }
        if (Float.floatToIntBits(this.sideTwo) != Float.floatToIntBits(other.sideTwo)) {
            return false;
        }
        if (Float.floatToIntBits(this.sideThree) != Float.floatToIntBits(other.sideThree)) {
            return false;
        }
        return true;
    }
  

  
  
}
