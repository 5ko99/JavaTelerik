package geometry;

public class Rectangle {
 private double widht;
 private double height;
 
 	public Rectangle(double widht,double height){
 		this.widht=widht;
 		this.height=height;
 	}
 	
 	public double getArea(){
 		return this.widht*this.height;
 	}
 	
 	public void setInfo(double widht,double height){
 		this.widht=widht;
 		this.height=height;
 	}
 	
}