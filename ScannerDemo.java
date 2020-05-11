import java.util.Scanner;

class ScannerDemo{
	public static void main(String[] args){

		System.out.print("What is your name? ");
		Scanner scan = new Scanner(System.in);
 		String myString = scan.nextLine();

		System.out.print("How many countries have you visited? ");
 		int myInt = scan.nextInt();

		System.out.println(myString + " has visited " + myInt + " countries.");

	}
}