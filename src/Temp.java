import java.util.Scanner;
public class Temp {
	public static void main(String[] args) {
		double c,f;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter F to get C : ");
		f=s.nextInt();
		c=5*(f-32)/9;
		System.out.println("Celsius : "+c);
	}
}
