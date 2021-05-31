package firstproject;



public class Helloworld 
{
	enum juiceEnumVariable{SMALL, MEDIUM, LARGE};
	juiceEnumVariable size;
}

 class FreshJuiceTest
{
	public static void main(String[] args[])
	{
		Helloworld juice= new Helloworld();
		juice.size= Helloworld.juiceEnumVariable.MEDIUM;
		System.out.println("SIZE:"+juice.size);
System.out.println("hi");
		
	}
}


