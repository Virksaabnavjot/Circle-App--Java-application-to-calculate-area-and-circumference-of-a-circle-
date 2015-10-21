/*
*@Author: Navjot Singh Virk @ Dublin, Ireland
*Date: 21st Oct 2015
*CircleApp.java
*The java application to calculate area and circumference of a circle
*/


import javax.swing.JOptionPane;
public class CircleApp{
public static void main (String args[]){
//Note: Area of Circle A= Pi (r * r) , Circumference = (2 * PI * r)

//declare variables
double radius;
final double PI = 3.14;
double area;
double circumference;
//declare Objects
Circle myCircle;
//create objects
myCircle= new Circle();
//input
radius = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter the radius of the circle"));
myCircle.setRadius(radius);


//process
myCircle.calculateArea();
myCircle.calculateCircumference();

//output
area = myCircle.getArea();
circumference = myCircle.getCircumference();

JOptionPane.showMessageDialog(null, "Area = " +area+ " Circumference = " +circumference);




}


}