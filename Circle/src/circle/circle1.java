/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package circle;

/**
 *
 * @author Deepan
 */
public class circle1 {
    
    private double radius=10;
    private final double pi=Math.PI;

    public double getRadius() {
        return radius;
    }

    public circle1(double radius) {
        this.radius = radius;
    }
    
    
    
    public double getArea(){
        return radius*radius*pi;
    }
    
    
}
