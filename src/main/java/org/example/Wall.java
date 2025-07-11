package org.example;

public class Wall {
    double width;
    double height;
    public  Wall (double width, double height){
        this.width=width;
        this.height=height;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double newWidth){
        if(newWidth<0){
            width=0;
        }else{
            width=newWidth;
        }
    }
    public void setHeight(double newHeight){
        if(newHeight<0){
            height=0;
        }else{
            height=newHeight;
        }
    }
    public double getArea(){
        return height*width;
    }
}
