import java.util.Scanner;

public class OctaltoBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new  Scanner ( System.in);
System.out.println("enter rhe decimal number ");
String num= in.next();
int a = Integer.parseInt(num,8);
System.out.println("the binary number is = "+ Integer.toBinaryString(a));
	}

}
