package com.codewithharry.shape;
class CyBio{
float radius;
float height;
double area;
double volume;
public void setradius(float r){
radius=r;
}
public void setheight(float h){
height=h;
}
public void surfacearea(){
area = 2*Math.PI*radius*height;
System.out.println("area of shape is "+area);
}
public void volume(){
volume = Math.PI*radius*radius*height;
System.out.println("volume of shape is "+volume);
}
}
public class Cylinder extends CyBio{
@Override
public void surfacearea(){
area = 2*Math.PI*radius*height;
System.out.println("area of Cylinder is "+area);
}
@Override
public void volume(){
volume = Math.PI*radius*radius*height;
System.out.println("volume of Cylinder is "+volume);
}
public static void main(String[] args){
}
}