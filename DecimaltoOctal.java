import java.util.Scanner;

public class DecimaltoOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new  Scanner (System.in);
		System.out.println("enter the decimal number");
		int a = input.nextInt();
		System.out.println(" the octal number "+ Integer.toOctalString(a));
		
	}

}
