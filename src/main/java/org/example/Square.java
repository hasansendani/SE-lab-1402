package org.example;

public class Square extends Rectangle{

    public Square(int i) {
        super(i, i);
    }
    @Override
    public void setLength(int i){
        super.setLength(i);
        super.setWidth(i);
    }
    @Override

    public void setWidth(int i){
        super.setLength(i);
        super.setWidth(i);
    }
}
