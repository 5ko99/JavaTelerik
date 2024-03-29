package Geometry;
public class GeometryStartup {
	public static void main(String[] args){
		Circle c = new Circle(0,0,5);
		System.out.println(c.getArea());
		Square sqr = new Square(0,0,5);
		Rectangle rct=new Rectangle(0,0,6,5);
		System.out.println(sqr.getArea());
		System.out.println(rct.getArea());
		c.move(10, 5);
		System.out.printf("c("+c.getX()+","+c.getY()+")");
		System.out.println();
		System.out.println(c.toString());
		System.out.println(sqr.toString());
		Triangle t = new Triangle(0,0,3,5,4);
		System.out.println(t.getArea());
	}
}
