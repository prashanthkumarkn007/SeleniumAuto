import java.util.Scanner;
public class Demo1 {

	public static void main(String[] args) 
	{
		/*
		 * System.out.println("Hello World");
		 * System.out.println("Welcome to JAVA Program");
		 */

	Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter the Age: ");
    String age = myObj.nextLine();
    System.out.println("Entered Age is: " + age);
    int NewAge = Integer.parseInt(age);
    if(NewAge>=18)
    {
    	System.out.println("Major");
    }
    else
    {
    	System.out.println("Minor");
    }
	}
}

