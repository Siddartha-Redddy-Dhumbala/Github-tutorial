import java.util.Scanner;
public class ODDOREVEN {

	
	public static void main(String args[]){
	    Scanner scan=new Scanner(System.in); //create a scanner object for input
	System.out.print("Enter the integer number: ");
	int num=scan.nextInt();//get input from the user for num
	switch(num%2){//this will return either 0 or 1
	case 0:
	    System.out.println(num+" is a Even number");
	    break;
	case 1:
	    System.out.println(num+" is a Odd number");
	}
	}
}
