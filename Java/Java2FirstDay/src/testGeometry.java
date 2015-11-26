import geometry.*;
public class testGeometry {
	public static void main(String[] args){
		Point3d a = new Point3d(0.0,0.0,0.0);
		Point3d b = new Point3d(1,1,1);
		System.out.println(a.calcDistance(b));
		
		Rectangle c = new Rectangle(5,5);
		System.out.println(c.getArea());
		c.setInfo(5, 10);
		System.out.println(c.getArea());
		Square d = new Square(5);
		System.out.println(d.getArea());
	}
}