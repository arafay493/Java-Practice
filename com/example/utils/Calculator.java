package com.example.utils;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;

public class Calculator {
    // Circle areaCircle = new Circle(25);
    // Rectangle areaRectangle = new Rectangle(25 , 15);
    
    // public double calculateArea() {
    //     return Math.PI * Math.pow(areaCircle.getRadius(), 2);
    // }

    // public double calculateRectangleArea(){
    //     return areaRectangle.getLength() * areaRectangle.getWidth();
    // }
    
    public static void main(String[] args) {
        // Calculator calculator = new Calculator();
        // float C_area = (float) calculator.calculateArea();
        // float R_area = (float) calculator.calculateRectangleArea();

        //! OR
        Circle areaCircle = new Circle(25);
        Rectangle areaRectangle = new Rectangle(25 , 15);
        float C_area = (float) areaCircle.calculateArea();
        float R_area = (float) areaRectangle.getArea();
        System.out.println("Area of circle: " + C_area);
        System.out.println("Area of rectangle: " + R_area);
    }
}
