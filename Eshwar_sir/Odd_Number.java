import java.util.Scanner;
class Odd_Number 
{
	public static void main(String[] args) 
	{
		
    Scanner sc = new Scanner (System.in);
	System.out.println("Enter the number");
	int n  = sc.nextInt();
	int count;

	while (n>0 )
	{
		int b  = n%10;
		if (b%2 !=0)
		{
			System.out.println(b);
		}
		
	}
	
     n = n/10;
	}
}
