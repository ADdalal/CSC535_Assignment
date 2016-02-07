
public class Count
{
public static void main (String [] args)
    {
	  int count = 0;
	  //this declaration for count the numbers
	  
      for (int i=1;i<=1000000; i++)
      //this loop used to go from 1 to one million
        {  
    	 if ((i%9==0 || i%13==0 || i%27==0) || i%81==0)
    	 //this condition for deciding which number is evenly divisible by 9,13,27, or 81
    		 {
    		 count++;
    		 }
         }
	   
      System.out.println("The number of numbers between 1 and 1 million that are evenly divisible by 9, 13, 27, or 81 is ");
      System.out.println(count);
    }
}
