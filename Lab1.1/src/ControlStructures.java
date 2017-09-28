
public class ControlStructures 
{

	public static void main(String[] args) 
	{
		primePrinter();
		fooBarBaz();
	}
	
	public static void primePrinter()
	{
		int number;
		int y;
		int z=number+1;
		
		for(number=2;y<=50;number++)
		{
			for(z;z==number/2;z++)
			{
				if(!(number%z==0))
				{
					System.out.print(number);
					
					
				}
					
			}
		}
		
	}
	
	public static void fooBarBaz()
	{
		int x;
		for(x=1;x<=500;x++)
		{
			if(x%3==0)
			{System.out.print("foo");}
			if(x%7==0)
			{System.out.print("bar");}
			if(x%10==0)
			{System.out.print("baz");}	
			if(x%3!=0 && x%7!=0 && x%10!=0)
			{System.out.print(x);}
			System.out.println();
				
		}
		
	}
}
