class FahrenheittoCelsius
{
	public static void main(String arg[])	
	{
	    double x,y;
             	    Scanner sc=new Scanner(System.in);	   	 
	    System.out.println("Enter temperature in Fahrenheit:");
                   x=sc.nextDouble(); 
	    System.out.println("Celsius temperature is: "+celsius(x));		  	  	     
	} 
	static double celsius(double f)
	{	
	return  (f-32)*5/9;
	}
}