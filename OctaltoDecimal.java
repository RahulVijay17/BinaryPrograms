import java.util.Scanner;

public class OctaltoDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner (System.in);
System.out.println("enter the octal number");
String num = in.next();
int a = Integer.parseInt(num,8);
System.out.println(a);
	}

}
