public class DataTypeHomeTask {

	public static void main(String[] args) {
		// Create a variable a = 2345 and b = 5432
		// Calculate  sum (s) and product (p) of the numbers.
		{
			int a = 2345;
			int b = 5432;
			System.out.println("s == " + (a + b));
			System.out.println("p == " + (a * b));
		}

		// Create two variables a = 3 and b = 4.
		// a and b are sides of the right triangle.
		// Calculate square (s), hypotenuse (h) and perimeter (p).
		// Print results to the standard output.
		// Tip: Math.sqrt(x) returns the square root of the x.
		{
			double a = 3;
			double b = 4;
			double h;
			double h2;
			h2 = b*b-a*a;
			h = Math.sqrt(h2);
			System.out.println("h == " + (h));
			System.out.println("p == " + (h+a+b));
		}

		// Create a variable a = 12752041.
		// Check if a can be divided by 3571 and write result of the check into
		// variable b.
		{
			long a = 12752041;
			System.out.println("b == " + (a));
		}

		// Create a variable a = 'A'.
		// Convert a to a number an put the value into variable b.
		{		
		}
	}

}
