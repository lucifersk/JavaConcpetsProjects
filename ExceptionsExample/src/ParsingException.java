
public class ParsingException {
	private String str = "abc";
	{
		try {
			int a = Integer.parseInt(str);
		}
		catch(Exception e)
		{
			System.out.println("The Text can not be parsed into number");
			
		}
	}
	
	// string abc can not be converted to integer thus exception raises..
	

}
