public class NextEvenNumbers 
{
    public static void main(String[] args)
    {
    	int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        System.out.println("Next two adjacent even numbers after " + num1);
        if (num1 % 2 != 0) 
        {
        	num1++;
        }
        
        for (int i = 0; i < 2; i++) 
        {
        	System.out.print(num1 + " ");
            num1 += 2;
        }
        System.out.println();
        System.out.println("Next two adjacent even numbers after " + num2);
        if (num2 % 2 != 0) 
        {
        	num2++;
        }
        
        for (int i = 0; i < 2; i++) 
        {
         	System.out.print(num2 + " ");
            num2 += 2;
        }   
     }
}

