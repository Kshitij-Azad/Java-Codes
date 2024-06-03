import java.util.Scanner;
public class Days {

	public static void main(String[] args) {
		int n,y,m,d;
		Scanner s = new Scanner(System.in); 
		System.out.println("Enter number of Days :  ");
		n=s.nextInt();
		y=(n/366);
		m=(n-(y*366))/30;
		d=(n-(y*366)-(30*m)-2);
		System.out.println("Years : "+y);
		System.out.println("Months : "+m);
		System.out.println("Days : "+d);
	}

}