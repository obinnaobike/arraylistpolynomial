package external.Term;

package external.Term;

import java.util.*;

public class PolynomialArraylist {
// create a new arraylist that is a string for the polynomials
	ArrayList<String> list = new ArrayList<String>();
	ArrayList<String> toreverse = new ArrayList<String>();
	private String product = " ";
	
	
	
	public PolynomialArraylist()
	
	{
		
		
	    
	}
	
	public void insert( String term, int track)
	{
		
		
		list.add(term);
		
	
	    
	    if(track == list.size())
	    {
	    	list.add(" "); 
	    }
	    
	
	}
	public void print()
	{
		for(int x = 0; x < list.size(); x++)
		{
			System.out.println(list.get(x));
			if(list.get(x).equals(""))
			{
				System.out.println("string is empty");
			}
		}
	}
		public void product()
	{
		for(int x = 0; x < list.size(); x++)
		{
			if(list.get(x).equals(" "))
			{
				System.out.println(product);
				break;
			}
			
			
			if(x == 0)
			{    
				product =  list.get(x); 
			}
			if(x > 0)
			{	
				product = product + "+" + list.get(x); 
			}
			
			
			
		}
		
	}
	
	public void delete(String term3)
	{
		
				
				list.remove(term3);
			
	}
	
	public void reverse()
	{
		
		
		
		for(int x = list.size()- 1; x >= 0; x--)
		{
			
			toreverse.add(list.get(x));
			
		}
	
		for(int c = 0; c < toreverse.size(); c++)
		{
			System.out.println(toreverse.get(c));
		} 
		
	}
	
		
}


public class Term {

    private String co_effiecient;
    private String exponent;
    private String term ;
    
    /*
     * convert  to term
     */
    
    public Term(int coefficient1, int exponent1)
    {
        String to_add = "x";
        
         this.co_effiecient = Integer.toString(coefficient1);
         this.exponent = Integer.toString(exponent1);
        
          
          this.term = co_effiecient +  "x^" + exponent;
        
            
    }
    
    /*
     * convert  to term
     */
    public  String converter(int coefficient2, int exponent2)
    {
    
        String to_add1 = "x";
        
         this.co_effiecient = Integer.toString(coefficient2);
         this.exponent = Integer.toString(exponent2);
        
          
         this.term = co_effiecient +  "x^" + exponent;
            
         return (Returner());
    }
    
    public String Accessor() // out put coefficient and exponent
    {
        System.out.println(co_effiecient);
        System.out.println(exponent);
        return co_effiecient;
        
    }
    
    public  String Returner() // output both coeffiecient and exponent
    {
        
        String the_return;
        the_return = co_effiecient +   " x^ " +  exponent;
        
        return(the_return);
                
    }
    /*
     * to string method used to get output of value of private variables
     */
    
    public String toString(){
        
        return new String(term);
        
    }
}
