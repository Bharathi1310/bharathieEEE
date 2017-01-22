import java.util.Scanner;


public class guvireverse {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the string");
		String input=in.nextLine();
		StringBuffer in1=new StringBuffer(input);
		String out=in1.reverse().toString();
		System.out.println(out);
	

	}

}
