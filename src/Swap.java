import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		int a,b;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st value & 2nd value : ");
		a=s.nextInt();
		b=s.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print("Swap of 1st value & 2nd value :" +a+" "+b);
	}

}
