package greeterStuff;

public class Greeter {
	
	private String name;
	private int age;
	
	Greeter()
	{
		age = -99999;
	}
	
	Greeter(int ageX)
	{
		if(ageX >= 0)
		{
			age = ageX;
		}

	}
	
	Greeter(String nameX)
	{
		if(!nameX.isEmpty())
		{
			name = nameX;
		}
	}
	
	Greeter(String nameX, int ageX)
	{
		if((!nameX.isEmpty()) && (ageX >= 0))
		{
			name = nameX;
		}
		
	}

}
