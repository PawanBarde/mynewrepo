
import java.util.Scanner;

public class Myclass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: " );
		int a = sc.nextInt();
		
		for(int i=(a-1); i>=1; i--) {
			a = (a * i); 
		}
		
		System.out.println("factorial is: " + a );

	}

}