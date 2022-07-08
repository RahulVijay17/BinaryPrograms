import java.util.Scanner;

public class OctaltoHexa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		String num = sc.next();
		int a = Integer.parseInt(num,8);

		System.out.println(Integer.toHexString(a));
	}

}
