package com.example.geometry;

public class Circle {
    private float pi = 2.14F;
    private float radius;
    
    public Circle(float radius) {
        this.radius = radius;
    }
    
    public float calculateArea() {
        return pi * radius * radius;
    }
    public float getRadius() {
        return radius;
    }
}
