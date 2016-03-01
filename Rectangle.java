/*Bailey Spicer
**bes2725@email.vccs.edu
**Feb 29, 2016
**this program will prompt the user for input and calculate 
**rectangle perimeter and area */

import java.util.Scanner;

public class Rectangle
{
	public static void main(String[] args)
	{
		//create scanner
		Scanner in = new Scanner(System.in);

		//variables
		double height, width, area, perimeter;

		//user input
		System.out.println("This program will calculate the area and perimeter \n"
			+ "of a recangle for you.  To start, please enter the height: ");
		height = in.nextDouble();
		System.out.println("Thank you.  Now, enter the width: ");
		width = in.nextDouble();

		//calculations
		area = height*width;
		perimeter = 2*height + 2*width;

		System.out.println("The perimeter of your rectangle is " + perimeter
			+ ". \nThe area of your rectangle is " + area + ".");

	}
}
