package com.example.demo.learning;



class Rectangle {
    protected int width;
    protected int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

class Square extends Rectangle {
    public Square(int sideLength) {
        super(sideLength, sideLength);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width); //  Forces height to match width, breaking LSP
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);  // Forces width to match height, breaking LSP
    }
}

public class Liskovs {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
        System.out.println("Rectangle Width: " + rect.getWidth() + ", Height: " + rect.getHeight());

        Square square = new Square(5);
        System.out.println("Square Width: " + square.getWidth() + ", Height: " + square.getHeight());

        square.setWidth(10);
        System.out.println("Square Width (after change): " + square.getWidth() + ", Height: " + square.getHeight()); // Height also changes

        Rectangle squareAsRectangle = new Square(5);
        squareAsRectangle.setWidth(10);
        System.out.println("Square as Rectangle Width (after change): " + squareAsRectangle.getWidth() + ", Height: " + squareAsRectangle.getHeight());
    }
}
