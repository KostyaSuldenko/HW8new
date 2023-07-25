package org.example;

class Circle extends Shape {
    public Circle() {
        super("Circle");
    }

    @Override
    public void printName() {
        System.out.println("Circle");
    }
}
