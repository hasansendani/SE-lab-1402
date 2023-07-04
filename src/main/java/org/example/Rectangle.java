package org.example;

public class Rectangle {
    private int length;
    private int width;
    public Rectangle(int i, int j) {
        length = i;
        width = j;
    }

    public int computeArea(){
        return this.length * this.width;
    }

    public void setLength(int i){
        this.length = i;
    }

    public void setWidth(int i){
        this.width = i;
    }

    public int getWidth(){
        return this.width;
    }

    public int getLength(){
        return this.length;
    }
}
