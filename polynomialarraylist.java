
import java.util.*;

public class PolynomialArraylist {
// create a new arraylist that is a string for the polynomials
	ArrayList<String> list = new ArrayList<String>();
	ArrayList<String> toreverse = new ArrayList<String>();
	private String product = " ";
	public PolynomialArraylist(){
	}
	public void insert( String term, int track)
	{arraylist.add(term);	
	    if(track == list.size())
	    {arraylist.add(" "); 
	    }
	}
	public void print()
	{for(int x = 0; x < list.size(); x++)
		{System.out.println(list.get(x));
			if(list.get(x).equals(""))
			{System.out.println("string is empty");}}}
public void product()
	{for(int x = 0; x < list.size(); x++)
		{if(list.get(x).equals(" "))
			{System.out.println(product);break;}
			if(x == 0)
			{product =  list.get(x);}
			if(x > 0)
			{product = product + "+" + list.get(x);}}}
	public void delete(String term)
	{list.remove(term3);}
	public void reverse()
	{for(int x = list.size()- 1; x >= 0; x--)
		{reverse.add(list.get(x));}
		for(int c = 0; c < reverse.size(); c++)
		{System.out.println(reverse.get(c));
		}}}
public class expression {
    private String coeffiecient;
    private String exponent;
    private String term ;
    public expression(int coefficient1, int exponent1)
    {String adder = "x";   
         this.coeffiecient = Integer.toString(coefficient1);
         this.exponent = Integer.toString(exponent1);
          this.term = co_effiecient +  "x^" + exponent;}
    public  String convert(int coefficient, int exponent)
    {String add= "x";   
         this.co_effiecient = Integer.toString(coefficient);
         this.exponent = Integer.toString(exponent);
         this.term = coeffiecient +  "x^" + exponent;
         return (Returner());
    }
        
    public  String tostring() // output both coeffiecient and exponent
    {String thestring;
    thestring = coeffiecient +   " x^ " +  exponent;    
        return(thestring);}