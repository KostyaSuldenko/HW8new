package org.example;

class Triangle extends Shape {
    public Triangle() {
        super("Triangle");
    }

    @Override
    public void printName() {
        System.out.println("Triangle");
    }
}
