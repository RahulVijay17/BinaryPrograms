import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan =new Scanner (System.in);
System.out.println("enter the first binary number");
String num1 = scan.next();
System.out.println("enter the second binary number");
String num2 = scan.next();
int a = Integer.parseInt(num1,2);
int b = Integer.parseInt(num2,2);
int sum = a+b;
System.out.println("the addition of two binary numbers = "+ Integer.toBinaryString(sum));

	}
}
