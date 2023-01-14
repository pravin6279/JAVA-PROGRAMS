class Driver 
{
	public static void main(String[] args) 
	{
				
		Maharashtra obj = new Maharashtra();
		obj.localfestival();//upcasting compiler do automatically, the process of converting referance of subclass to super class we need to create obj for child class
	    obj.nationalfestival();
		obj.festival();
	 //downcsting india to country
	   India obj2  = obj;
	   obj2.nationalfestival();
	 
	   obj2.festival();
	   //downcasting to only country


	}
}
