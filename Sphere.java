package com.codewithharry.shape;
public class Sphere extends CyBio{
@Override
public void surfacearea(){
area = (4)*Math.PI*radius*radius;
System.out.println("area of sphere is "+area);
}
@Override
public void volume(){
volume = (4/3)*Math.PI*radius*radius*radius;
System.out.println("volume of sphere is "+volume);
}
public static void main(String[] args){
}
}
