package org.example;

import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void testArea() {
        int length = 4;
        int width = 8;
        int area = Rectangle.computeArea(length, width);
        Assert.assertEquals(32, area);
    }
}