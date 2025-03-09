package z.practice.oop.ex7;

public class CircleController {
	Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {
		c = new Circle(x,y,radius);
		
		double area;
		area = radius *radius* 3.140592;
		return "넓이 : " + c.toString()+"/"+area;
	}
	
	public String calcCircum(int x, int y, int radius) {
		c = new Circle(x,y, radius);
		
		double circum;
		circum = 2*radius* 3.140592;
		
		
	return "둘레 : " +c.toString()+"/"+circum;
	}

}
