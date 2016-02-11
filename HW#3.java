
public class Count
{
public static void main (String [] args)
    {
	    String x = "Diomond";
	    printVowels(x);
        printConsonants(x);
    }
//this method takes a String and String as a parameter 
//and print all the vowels contained in that String one character per line.
static void printVowels (String x)
    { 
	 for(int i=0; i< x.length();i++)
	   {
		 if(x.charAt(i)=='a'|| x.charAt(i)=='e' || x.charAt(i)=='i' || x.charAt(i)=='o' || x.charAt(i)=='u' )
				System.out.println(x.charAt(i));
	   }
	}
//this method takes a String as a parameter 
//and print all the consonants contained in that String one character per line.
static void printConsonants(String x)
    { 
 for(int i=0; i< x.length();i++)
       {
	 if(x.charAt(i)=='a'|| x.charAt(i)=='e' || x.charAt(i)=='i' || x.charAt(i)=='o' || x.charAt(i)=='u' )
			continue;
		else
		   
			System.out.println(x.charAt(i));
		 
       }
    }

static void processExpression(String x)
    {
     //"integer [[+-*/] integer]*]" 
	}


//this method a String as a parameter 
//and print all the numeric digits contained in that String one character per line.
//static void printDigits(String x)
//{ 
//for(int i=0; i< x.length();i++)
//{
//	 if(x.charAt(i)== x.contains("[0-9]+"))
	
//			System.out.println(x.charAt(i));
//}
//}
}

