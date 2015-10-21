/*
*@ Instansible Class
*/


/*Steps required to create Instansible Class
* declare data members
* constructor - Purpose and function
* Constructors have one purpose in life: to create an instance of a class.
* This can also be called creating an object, as in:
* Example: Platypus p1 = new Platypus();
* set methods
* compute
* get methods
*/


public class Circle{

//declare data members
double radius;
final double PI = 3.14;
double area;
double circumference;

//constructor
public Circle(){
	radius = 0.0;
	area = 0.0;
	circumference = 0.0;
}

//set methods
public void setRadius(double radius){
	this.radius = radius;
}

//method to calculate area of circle
public void calculateArea(){
	area = (PI * (radius * radius));
}

public void calculateCircumference(){
	circumference = 2 * PI * radius;
}

//get methods
public double getArea(){
	return area;
}

public double getCircumference(){
    return circumference;
}


}