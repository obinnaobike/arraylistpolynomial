

import java.io.*
import java.util.*

public class main {
  public static void main(String args[]) 
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Integer> nums = new ArrayList<Integer>();
    ArrayList <Integer> num2array = new ArrayList<Integer>();
    ArrayList <Integer>  newarray = new ArrayList<Integer>();
    ArrayList <Integer>  newarray7 = new ArrayList<Integer>();
    Scanner scan = new Scanner (System.in);
    int value =10;
    int coefficient;
    int exponent;
    int b;
    int a = 0;
    int value1 = 8;
    int v;
    int p = 1;
    String g, m;
String file = "/Users/user/Documents/workspace/Polynomialarraylistproject/text.txt";
        File text = new File(file);
        Scanner in = new Scanner(text);
        while(in.hasNextLine()) {
          String line = in.nextLine();
          Scanner fromStr = new Scanner(line);
          while (fromStr.hasNextInt(
{newarray7.add(fromStr.nextInt())}
        in.close();
    while(value1 > 0)
    {System.out.println("would you like to add terms  to the polynomial")
      String input = scan.next(); 
      if(input.equals("yes"))
      {System.out.println("How many polynomials u want to enter");
                {int number2 = scan.nextInt();   System.out.println(" Enter how many terms u want in polynomial");                
int number = scan.nextInt();
int placeholder = number;
while(number1 > 0 )
                  {
                     while(number > 0)
                     {
                    System.out.println("Enter co efficient");
                    coef_number = scan.nextInt();
              
                      System.out.println(" Enter exponent");
                    expo_number = scan.nextInt();
      
                    nums.add(coefficent);
                    nums.add(exponent);
                   number--;
                    }
                    number = placeholder;
                    number1--;
                  }
             }
      }
             /*sorts the exponenets
              */
               
                 for(int i = 0; i < nums.size() ; i=i+1)
                 {
        
                   b = i%2;
      
                  if (a != b)
        
                  {
                    value1 = nums.get(i);
                    numarray.add(value1);}
                  Collections.sort(num2array);
      
    /*
     * adds it to array after being sorted
     */
    
                 for(int j = 0; j < num2array.size(); j=j+1)
                 {  
                   v = 1;
      
                  for(int z = v; z < nums.size() ; z=z+1)
                     {
                     if(num2array.get(j).equals ( nums.get(z)))
                   {
                    newarray.add(nums.get(z-1));
                    newarray.add(nums.get(z));
                 break;}
    
                 polynomial r = new polynomial(); //
    
                  Term t1 = new Term(newarray.get(0), newarray.get(1);
                  int track = newarray.size()*0.5;                   while( p < newarray.size()) 
                  {r.adder(t1.converter(newarray.get(p-1), newarray.get(p)), track); // adds all polynomials to the array list
       
                  p++;
p++;
                   }
    

               System.out.println("would you like to print  terms in array");// calls the insert to link function
        
              input = scan.next();
        
               if(input.equals("yes"))
               {
                  
                     r.print();
                  
           
               }
        
                      System.out.println("would you like to product of polynomial or polynomials");// calls the insert to link function
        
                input = scan.next();
        
                if(input.equals("yes"))
                {
                   
                      r.product();
                  
           
                }
System.out.println("would you like to delete item from polynomial")input = scan.next(
                if(input.equals("yes"))
                {System.out.println("enter value to delete");// calls the insert to link function
                  g = reader.readLine();
                  r.delete(g);
                         r.product();
                 }System.out.println("would you like to reverse items in polynomial        
                  input = scan.next();
        
                if(input.equals("yes"))
                {r.reverse();}System.out.println("would you like to exit");// calls the insert to link function
         
                input = scan.next();if(input.equals("yes")){break;}}}}
    

  