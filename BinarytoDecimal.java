import java.util.Scanner;

public class BinarytoDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner (System.in);
System.out.println("enter the binary number");
String num = in.next();
int a = Integer.parseInt(num,2);
System.out.println("the decimal number is = "+(a));
	}

}
