package org.example;

import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void testArea() {
        int length = 4;
        int width = 8;
        Rectangle rectangle = new Rectangle(4, 8);
        int area = rectangle.computeArea();
        Assert.assertEquals(32, area);
    }

    @Test
    public void testRecSetGet() {
        Rectangle rectangle = new Rectangle(4, 8);
        rectangle.setLength(3);
        Assert.assertEquals(3, rectangle.getLength());
        rectangle.setWidth(5);
        Assert.assertEquals(5, rectangle.getWidth());

    }
    @Test
    public void testSquareArea(){
        int length = 4;
        int width = 8;
        Square square = new Square(4);
        int area = square.computeArea();
        Assert.assertEquals(16, area);
    }
    @Test
    public void testSquareSetGet() {
        Square square = new Square(4);
        square.setLength(3);
        Assert.assertEquals(3, square.getLength());
        Assert.assertEquals(3, square.getWidth());
        square.setWidth(5);
        Assert.assertEquals(5, square.getLength());
        Assert.assertEquals(5, square.getWidth());
    }
}