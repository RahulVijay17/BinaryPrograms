import java.util.Scanner;

public class BinarytoOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("input the num..");
		String num = in.nextLine();

		int a = Integer.parseInt(num,2);
		System.out.println("octal number is " + Integer.toOctalString(a)); //same as hexa
	}                                                     //toHexString(a)

}
