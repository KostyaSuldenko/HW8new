package org.example;

abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Абстрактний метод для виведення назви фігури
    public abstract void printName();
}
