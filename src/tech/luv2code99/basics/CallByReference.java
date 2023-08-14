package tech.luv2code99.basics;

public class CallByReference {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.setLength(100);
		r1.setWidth(50);
		modify(r1);
		System.out.println(r1);
		
		Rectangle r4 = new Rectangle();
		r4.setLength(250);
		r4.setWidth(125);
		modifytruly(r4);
		System.out.println(r4);
	}
	
	public static void modify(Rectangle r2) {
		//this statement will have impact on the value of r1 unlike primitive values
		r2.setLength(200);
		r2.setWidth(100);
	}
	
	public static void modifytruly(Rectangle r3) {
		r3 = new Rectangle();
		r3.setLength(300);
		r3.setWidth(150);
	}

}

class Rectangle 
{
	private float length;
	private float width;
	
	public Rectangle() {
		
	}
	
	public Rectangle(float theLength, float theWidth) {
		this.length = theLength;
		this.width = theWidth;
	}
	
	public float getLength() {
		return this.length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + this.length + ", width=" + this.width + "]";
	}	
	
}
