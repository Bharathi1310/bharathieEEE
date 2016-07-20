# bharathieEEE
import java.util.Scanner;
public class Natural {
public static void main(String[] args) {
	int i = 0;
	int sum=0;
	Scanner in=new Scanner(System.in);
	System.out.println("enter the integer:");
	int N=in.nextInt();
	while(i<N)
	{
		sum=sum+i;
		i++;
	}System.out.print("sum : " +sum);
	}

}
