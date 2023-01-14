class Prime_Number_Java
{
	public static void main(String[] args) 
	{
		for(int n=3;n<=100;n++)
        int flag  = 0 ;
y
	    if (n==0 || n==1)
	 {
		 System.out.println("Number is not prime number :"+n);
	 }

	
		 {
		 
		for (int i=2;i<n/2 ;i++ ) 
		{
			if (n%i==0)
			{
				System.out.println("Number is not prime number :"+n);
				flag = 1;
				break;
				
			}
			
			
		}
		if (flag == 0)
		{
			System.out.println("Number is prime number:"+n);
		}
		 
		
	
	}
}
}