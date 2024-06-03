import java.util.Scanner;

public class Swap1 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st value & 2nd value : ");
		a=s.nextInt();
		b=s.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.print("Swap of 1st value & 2nd value :" +a+" "+b);
	}

}
