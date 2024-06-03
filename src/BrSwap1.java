import java.io.*;
public class BrSwap1 {

	public static void main(String[] args) throws IOException 
	{
		int a,b,c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter value of a : ");
		a=Integer.parseInt(br.readLine());
		System.out.println("Enter value of b : ");
		b=Integer.parseInt(br.readLine());
		c=a;
		a=b;
		b=c;
		System.out.println("Swap value of a : "+a);
		System.out.println("Swap value of b : "+b);
	}

}
