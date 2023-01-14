class Type_Casting 
{
	public static void main(String[] args) 
	{ 
		double a = 65.89;
		float b = (float) a ;
		System.out.println("double : " +a );
		System.out.println("float : "+b );
		System.out.println("_________..................____________");
		
		long c  = (long) a;
	    System.out.println("double : " +a );
		System.out.println("long : "+c );
		System.out.println("_________..................____________");

		int d  = (int) a;
		 System.out.println("double : " +a );
		System.out.println("int : "+d );
		System.out.println("_________..................____________");

		short e = (short) a;
		 System.out.println("double : " +a );
		System.out.println("short : "+c );
		System.out.println("_________..................____________");

		byte f  = (byte) a;
		 System.out.println("double : " +a );
		System.out.println("byte : "+c );
		System.out.println("_________..................____________");

		String p = "10";
		double q = Double.parseDouble(p);
			System.out.println("String : " + p);
			System.out.println("double : "+ q);


	}
}
