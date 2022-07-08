import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first binary number :");
		String num1 = scan.next();
		System.out.println("Enter the second binary number :");
		String num2 = scan.next();
		int a = Integer.parseInt(num1,2);
		int b = Integer.parseInt(num2,2);
		int mul = a*b;
		System.out.println("The binary result is :"+Integer.toBinaryString(mul));
}
}