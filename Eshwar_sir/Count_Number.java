class Count_Number 
{
	public static void main(String[] args) 
	{
		int n =  123;
		int count = 0;
		while (n>0)
		{
			count++;
			n= n/10;
		
		}
		System.out.println("Number od digit "+count);
	}
}
