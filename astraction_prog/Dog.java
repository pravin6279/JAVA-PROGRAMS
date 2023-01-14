 class Dog extends Animal 
{
	
   public void leave()
	{
		System.out.println("In dog");
	}
  public void demo()
	{
	  super.demo();
		System.out.println("Dog leaves in forest");
	}
}
