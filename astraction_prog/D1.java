abstract class D1 
{    
	abstract public void Drive();

	 public void play()
	{
		System.out.println("Abhay is palying");
	}
	public static void main(String[] args) 
	{
		D1 obj  = new D1();
		//obj.Drive();
		obj.play();
		// complie time error 
		

	}
}
