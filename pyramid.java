package assignment;
import java.util.*;
public class pyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice;
		do {
			System.out.println("Enter a number between 5 and 25(both inclusive): ");
			int n = sc.nextInt();
			while(n<5 || n>25) {
				if(n<5) {
					System.out.println("Please enter a positive number greater than or equal to 5.");
					n = sc.nextInt();
				}
				else {
					System.out.println("Please enter a positive number smaller than or equal to 25.");
					n = sc.nextInt();
				}
				
			}
			
			for(int j=1;j<=2*n;j++) {
				if(j<=n) {
					for(int k=0;k<j;k++) {
						System.out.print("*");
					}
					System.out.println();
				}
				else {
					for(int k=0;k<n-(j-n);k++) {
						System.out.print("*");
					}
					System.out.println();
				}
					
			}
			System.out.println("Would you like to print another pyramid?(y/n)");
			choice=sc.next().toLowerCase();
		}while(choice.equals("y"));
		System.out.println("Goodbye!Have a nice day.");
	}

}
