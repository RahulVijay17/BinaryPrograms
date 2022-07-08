import java.util.Scanner;

public class DecimaltoBinary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // Scanner for inputs
		System.out.println("Enter decimal number: "); // Text in console...
		int a = sc.nextInt(); // Command to input integer

		System.out.println("Entered number " + a + " corresponds to binary number " + (Integer.toBinaryString(a)));
		// \n just adds a line in console (so you don't have to write "System.out.println();" for an empty line.
		// Integer.toBinaryString command converts your entered numbers into binary numbers.

		}

		}

