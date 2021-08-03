package bloodbank;

import java.io.IOException;
import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class need extends bank implements i1
{
	String needb;
	int ml;
	need() throws IOException
	{
		System.out.print("\n\t--->Which BloodGroup you need ?");
		needb=br.readLine();
		System.out.print("\n\t--->How much Blood you need(in ml) ?");
		ml=Integer.parseInt(br.readLine());
		BufferedReader b=new BufferedReader(new FileReader("blood.txt"));
		String s=b.readLine();
		String old="";
		while(s!=null) //check bloodgroup
		{
			if(s.equals(needb))
			{
				break;
			}
			old = old + s + System.lineSeparator();
			s=b.readLine();
			old = old + s + System.lineSeparator();
			s=b.readLine();
		}
		if(s==null)
		{
			System.out.println("Not avaliable");
			c=1;
		}
		else
		{
			old = old + s + System.lineSeparator();
			s=b.readLine();
			int x=Integer.parseInt(s);
			if(x>=ml)
			{
				x-=ml;
				s=s.replace(s,String.valueOf(x));
			}
			else
			{
				System.out.println("Not Avaliable");
				c=1;
			}
			while(s!=null) //check bloodgroup
			{
				old = old + s + System.lineSeparator();
				s=b.readLine();
			}
			FileWriter writer = new FileWriter("Blood.txt");
            writer.write(old);
            writer.close();
            b.close();
		}
	}
	public void print()
	{
		System.out.println("\n\t*************************************");
		System.out.println("\n\t    ***BILL GENERATION***\n");
		super.print();
		String ans="";
		try {
			 ans=ans+"name : "+name+"\n"+"age : "+age+"\n"+"phone : "+phone+"\n"+"weight : "+weight+"\n"+"BloodGroup : "+needb+"\n"
					 +"ML donate : "+ml+"\n\n";
			 BufferedWriter w = new BufferedWriter(new FileWriter("Needer DataBase.txt",true));
			 w.write(ans);
			 w.close();
		 }
		 catch (IOException e) {
	      }
		System.out.println("\t--->Blood Group Type :"+needb);
		System.out.println("\t--->Blood Granted :"+ml+" ml");
		System.out.println("\t--->Price to Pay : 1000$");
		System.out.println("\n\t*************************************");
		
		System.out.println("\n\n\n\n");
	}
}
