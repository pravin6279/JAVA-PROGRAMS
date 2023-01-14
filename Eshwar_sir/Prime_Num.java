import ava.util.Scanner;
class Prime_Num 
{
	public static void main(String[] args) 
	{
	Scanner sc  = new Scanner(System.in);
	System.out.println("Enter The Number :");
	int n = sc.nextInt();
	int flag  = 0;

	if(n ==0 || n == 1)
		{
			System.out.println("Number  is not prime number:"+n);
		}
		else
			{
				for (int i = 2;i<n/2 ;i++ )
				{
					if (n%i==0)
					{
						System.out.println("Number is Not prime :"+n);
						flag = 1;
						break;

					}
					
				} 
				if (flag ==0)
				{
					System.out.println("Number is Prime :"+n);
				}
				
			}
	}
}
