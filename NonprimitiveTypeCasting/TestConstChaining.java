class TestConstChaining 
{

TestConstChaining(){
	System.out.println("Default constructor");
}
TestConstChaining(String fname){
	
	fname=fname+"-aadhar";
	System.out.println("argument  constructor "+fname);
}
TestConstChaining(String fname,String sName){
	this(fname);
	System.out.println("argument  constructor "+fname + sName);
}
	public static void main(String[] args) 
	{
TestConstChaining obj = new TestConstChaining("Pravin","Gaikwad");
		//System.out.println("Hello World!");
	}
}
