
public class car {
	String color;
	int speed;
	int gear;
	void print() {
		System.out.println(color + " " + speed + " " +gear );
	}
	public car(String a, int b, int c) {
		color = a;
		speed =b;
		gear = c;
	}
	void a() {
		if(speed<70) {
			speed +=5;
			if(speed>=70) {
				speed=70;
			}
		}
	}
	void b() {
		if(speed > 0) {
			speed-=3;
		if(speed<=0) speed = 0;
		}
	}
	
	public static void main(String[] args) {
		car red_car= new car("red",0,1);
		car blue_car= new car("blue",60,3);
		
		red_car.print();
		blue_car.print();
		
		red_car.a();
		blue_car.a();
		red_car.print();
		blue_car.print();
		
		red_car.b();
		blue_car.a();
		red_car.print();
		blue_car.print();
		
		red_car.b();
		blue_car.a();
		red_car.print();
		blue_car.print();
	}
	
}
