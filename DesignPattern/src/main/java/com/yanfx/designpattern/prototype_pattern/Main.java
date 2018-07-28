package com.yanfx.designpattern.prototype_pattern;

public class Main {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        clonedShape.draw();
        System.out.println("Shape : " + clonedShape.getType() + "\n");

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        clonedShape2.draw();
        System.out.println("Shape : " + clonedShape2.getType() + "\n");

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        clonedShape3.draw();
        System.out.println("Shape : " + clonedShape3.getType() + "n");
    }
}
