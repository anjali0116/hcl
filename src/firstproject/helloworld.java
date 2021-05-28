package firstproject;



public class helloworld 
{
	enum juiceEnumVariable{SMALL, MEDIUM, LARGE};
	juiceEnumVariable size;
}

 class FreshJuiceTest
{
	public static void main(String[] args[])
	{
		helloworld juice= new helloworld();
		juice.size= helloworld.juiceEnumVariable.MEDIUM;
		System.out.println("SIZE:"+juice.size);
System.out.println("hi");
		
	}
}


