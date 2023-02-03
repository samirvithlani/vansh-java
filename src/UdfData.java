
import java.util.Scanner;


public class UdfData {

	
	public static void main(String[] args) {
		
		//scanf function
		//Scanner class --> is provideing such methods which can take data from console...
		//import ->java.lang.
		//java.util.Scanner
		//we have to input from system... console...
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("enter value of a");
		a = sc.nextInt();
		System.out.println("value of a = "+a);
		
		System.out.println("enter you per");
		float per = sc.nextFloat();
		System.out.println("per = "+per);
		
		System.out.println("enter true or false");
		boolean b = sc.nextBoolean();
		System.out.println(b);
		
		
		
	}
}
