class FC
{
	public static void main(String arg[])	
	{
	    // double f,c;
        double k,l;
             	    Scanner sc=new Scanner(System.in);
	    System.out.println("Choose type of conversion \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit");
                   int ch=sc.nextInt();
	    switch(ch)
	    {
	    case 1:  System.out.println("Enter temperature in Fahrenheit");
                   	  k=sc.nextDouble();
	    	  l=(f-32)*5/9;
	    	  System.out.println("Temperature in Celsius  is: "+l);
		  break;
	    case 2:  System.out.println("Enter temperature in Celsius ");
                   	  l=sc.nextDouble();
	    	  k=((9*c)/5)+32;
	    	  System.out.println("Temperature in Fahrenheit  is: "+k);
		  break;
	   default:  System.out.println("Choose valid choice");
	   }  
	} 
}