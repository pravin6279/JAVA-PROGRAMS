class Prime_1 
{
	public static void main(String[] args) 
	{
		int  n = 3;
		int flag = 0 ;
		if (n==0 || n==1)
		{
			System.out.println("Number is not prime :"+n);
		}
		else{
		for (int i=2;i<n/2 ;i++ )
		{
			if (n%i==0)
			{
				System.out.println("Number is not prime : "+n);
				flag = 1;
					break;
			}
		}
		
        if (flag ==0)
        {
			System.out.println("Nunber is prime : "+n);
        }
	}
	}
}
