class Dog extends Animal 
{
public void AnimalSound()	// method overridding
	{
		super.AnimalSound(); //call the superclas methos by usinhg supermetho keyword super();
		System.out.println("The dog Says :bow bow");
	}

}
