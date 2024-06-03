import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
		int p,t;
		double si ,r;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter P : ");
		p=s.nextInt();
		System.out.print("Enter R : ");
		r=s.nextDouble();
		System.out.print("Enter T : ");
		t=s.nextInt();
		si=(p*r*t)/100;
		System.out.println("Simple Interset : "+si);
	}

}
