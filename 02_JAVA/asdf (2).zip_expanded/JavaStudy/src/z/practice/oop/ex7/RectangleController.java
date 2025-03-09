package z.practice.oop.ex7;

public class RectangleController {
	Rectangle r = new Rectangle();
	
	public String clacArea(int x, int y, int height, int width) {
		
		r = new Rectangle(x,y,height,width);
		
		int area;
		area = width * height;
		return r.toString()+"/"+ area;
	}
	
	public String calcPermeter(int x, int y, int height, int width) {
		r = new Rectangle(x,y,height,width);
		
		int permeter;
		permeter = 2*(width + height);
		
		
		return r.toString()+"/"+ permeter;
	}

}
