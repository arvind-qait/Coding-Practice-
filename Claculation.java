package geometry;

import java.util.Scanner;

/** In this program we take a geometry and then take the parameter.
 * than we calculate the area. 
 **/
public class Calculation {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int figure;
		
		System.out.println("Enter the integer");
		System.out.println("For CIRCLE press 1");
		System.out.println("For RECTANGLE press 2");
		System.out.println("For SQUARE press 3");
		System.out.println("For TRIANGLE press 4");
		
		figure=Integer.parseInt(scanner.nextLine());
		
		if (figure == 1){
			
			int radius;
			double area;
			
			System.out.println("Enter the radius of circle");
			radius = Integer.parseInt(scanner.nextLine());
			area = 3.14 * (radius*radius);
			System.out.println("Area of CIRCLE is :"+area);
			
		}else if (figure == 2){
			
			int l,b;
			int area;
			
			System.out.println("Enter the length of Ractangle");
			l = Integer.parseInt(scanner.nextLine());
			System.out.println("Enter the width of ractangle ");
			b = Integer.parseInt(scanner.nextLine());
			
			area = l*b;
			
			System.out.println("Area of ractangle is :"+ area);
			
		}else if (figure == 3) {
			
			int side,area;
			
			System.out.println("Enter the side of Square");
			side = Integer.parseInt(scanner.nextLine());
			area = side*side;
			System.out.println("The area of square is :" + area);
			
		}else if (figure == 4) {
			
			int base,altitude;
			double area;
			
			System.out.println("Enter the base of Triangle ");
			base = Integer.parseInt(scanner.nextLine());
			System.out.println("Enter the altitude of Triangle ");
			altitude = Integer.parseInt(scanner.nextLine());
			
			area = 0.5 * base * altitude;
			
			System.out.println("The area of triangle is :" + area);
						
		}else {
			
			System.out.println("Enter the valid input.");
			
		}
		

	}

}
