class Fabboncci_Series 
{
	public static void main(String[] args) 
	{
		int a = 0 ;
		int b  =  1;
		System.out.println(a);
		
		System.out.println(b);
		int count = 1;
		while(count <= 10){
			int c   =  a + b;
			System.out.println(c);
			a=b;
			b=c;
			count++;
		}
	}
}
