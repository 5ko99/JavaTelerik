package Geometry;

public class Rectangle extends Shape {
	public Rectangle(int x, int y,int widht,int heith) {
		super(x, y);
		this.setWidht(widht);
		this.setHeight(heith);
	}
	
	public Rectangle(int x, int y,int width) {
		super(x, y);
		this.setWidht(width);
	}
	private int widht;
	private int heith;
	//Geters and Seters
	public int getWidht() {
		return widht;
	}
	public void setWidht(int widht) {
		if(Utility.Validator.isPositive(widht)==true)
		{
			this.widht = widht;
		}
		
	}
	public int getHeight() {
		return heith;
	}
	public void setHeight(int height) {
		this.heith = height;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return widht*heith;
	}
	
	
}
