import java.util.ArrayList;

class Driver3 
{
	
 

	public static void main(String[] args){ 
		ArrayList obj = new ArrayList();
		ArrayList obj2 = new ArrayList();
		obj.add(1);
		obj.add(2);
		obj.add(5);
		obj.add(8);
		obj.add(true);
		obj.add('a');
		obj.add(3,"Pravin");
		
		
		obj2.add(4);
		obj2.add(7);
		obj2.add(43);
		obj2.add('G');
		//obj2.get(3);
		System.out.println(obj.addAll(obj2));
		System.out.println(obj);
}
}