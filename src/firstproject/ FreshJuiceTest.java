package firstproject;



 class Helloworld 
{
	enum juiceEnumVariable{SMALL, MEDIUM, LARGE};
	juiceEnumVariable size;
}

 public class FreshJuiceTest
{
	public static void main(String[] args[])
	{
		Helloworld juice= new Helloworld();
		juice.size= Helloworld.juiceEnumVariable.MEDIUM;
		System.out.println("SIZE:"+juice.size);
System.out.println("hi");
		
	}
}


