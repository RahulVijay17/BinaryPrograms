import java.util.Scanner;

public class HexatoDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Print hexadecimal number to convert: ");
		String hexadecimal = input.next();

		int num = Integer.parseInt(hexadecimal, 16);
		String a = Integer.toString(num);

		System.out.println("Equal: " + a);
	}

}
