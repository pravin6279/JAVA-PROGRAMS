class Prime_nummber1
{
	public static void main(String[] args) 
	{   
		int n = 76;
		int flag =0;
     if (n==0 && n==1 )
       {
		   System.out.println("Number is not prime number");
       }
	else
		{
			for (int i =2;i<n/2 ;i++ )
			{
				if (n%i = 0)
				{
					System.out.println("number is not prime number");
				    flag =  1;
				     break;

				}
				
			}
			if (flag ==0)
			{
				System.out.println("Number is prime number");
			}
		}
	}
}
