public class Circle {
	int radius;
	double area;
	double pi = 3.14;
	
	void setr(int a) {
		radius = a;
	}
	double set_cal_get (int a) {
		radius = a;
		area=radius*radius*3.14;
		return area;
	}
	public static void main(String[] args) {
		Circle small = new Circle();
		Circle medium = new Circle();
		System.out.println("area="+ medium.set_cal_get(10));
	}
}
