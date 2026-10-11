package test1230;

public class Circle {
	static int count;
	int r,no;
	
	double area() {
		return r*r*Math.PI;
	}
	
	double length() {
		return 2*Math.PI*r;
	}
	
	void scale(double m) {
		r += r*m;
	}
	
	public String toString() {
		return no+"번원: 반지름:"+r+", 넓이:"+area()+", 둘레:"+ length();
	}
}
