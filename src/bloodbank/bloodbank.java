package bloodbank;
import java.util.*;
import java.io.*;
interface i1 
{
	void print();
}
class bank implements i1
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String name;
	int c=0;
	int age;
	int weight;
	String phone;
	bank() throws IOException
	{
		System.out.println("\t*************************************");
		System.out.print("\t--->Enter Your name :");
		name=br.readLine();
		System.out.print("\n\t--->Enter Your Age :");
		age=Integer.parseInt(br.readLine());
		System.out.print("\n\t--->Enter Your Phone number :");
		String p=(br.readLine());
		while(p.length()!=10)
		{
			System.out.println("--->Enter Valid 10 digit Phone Number to proces Further");
			System.out.print("\n\t--->Enter Your Phone number :");
			p=(br.readLine());
		}
		phone=p;
		System.out.print("\n\t--->Enter Your weight(in Kg) :");
		weight=Integer.parseInt(br.readLine());	
		System.out.println();
	}
	 public void print()
	 {
		 System.out.println("\t--->Your name : "+name);
		 System.out.println("\t--->Your Age : "+age);
		 System.out.println("\t--->Your Phone number : "+phone);
		 System.out.println("\t--->Your weight(in Kg) : "+weight);
	 }	
}
public class bloodbank {

	public static void main(String[] args) throws IOException, InterruptedException{
		// TODO Auto-generated method stub
		while(1==1)
	    {
		 System.out.println("\t*************************************");
		 System.out.println("\t*        Welcome to Bloodbank       *");
		    System.out.println("\t*************************************");
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    int x;
		    
		    	System.out.println("\t*\t                            *");
		    	System.out.println("\t*\t1.Need blood ?              *");
		    	System.out.println("\t*\t                            *");
		    	System.out.println("\t*\t2.Wants to Donate Blood ?   *");
		    	System.out.println("\t*\t                            *");
		    	System.out.println("\t*\t3.Exit ?                    *");
		    	System.out.println("\t*\t                            *");
		    	System.out.println("\t*************************************");
		    	System.out.print("\n\t--->Enter Choice :");
		    	x=Integer.parseInt(br.readLine());
		    	if(x==1)
		    	{
		    		need n=new need();
		    		if(n.c==0)
		    			n.print();
		    	}
		    	if(x==2)
		    	{  
		    		donor d=new donor();
		    	    System.out.flush(); 
		    		if(d.c==0)
		    			d.print();
		    	}
		    	if(x==3)
		    	{
		    		break;
		    	}
		    }

	}

}
