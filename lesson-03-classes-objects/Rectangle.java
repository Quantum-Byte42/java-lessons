class Rectangle {

	double a;
	double b;
	
	Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
	}

	double square() {
		return a * b;
	}

	double perimeter() {
		// TODO: calculate and return perimeter (see "square" method above as
		// example)
		return (a+b)*2;
	}

	void show() {
		System.out.println("Rectangle " + a + "x" + b);
		System.out.println("square: " + square());
		System.out.println("perimeter: " + perimeter());
	}

	public static void main (String[] args) {
		// TODO: create new rectangle (see LightBulb.java as example)
		Rectangle rectangle = new Rectangle(10, 12);
		// TODO: call the "show" method of the rectangle (see LightBulb.java as example)
		rectangle.show();
	}

}
