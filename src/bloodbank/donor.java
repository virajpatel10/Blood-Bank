package bloodbank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class donor extends bank implements i1{
	String bloodgroup;
	int donate;
	int flag=0;
	int bgg;
	String or="Don't Want To Donate";
	donor() throws IOException
	{
		System.out.print("\t--->Wants to Donate Organ too ? (Y/N) :");
		String sb=br.readLine();
		if(sb.equals("Y") || sb.equals("y"))
		{
			System.out.print("\n\t--->Enter Organs You want to Donate :");
			or=br.readLine();
		}
		try
		{
			if(age>=18 && weight>=45)
			{
				System.out.println("\t--->You are able to donate blood");
			}
			else
			{
				c=1;
				if(age<18)
					throw new BloodException("\t--->According to rules of government,\nyou are below 18,\n");
				if(weight<45)
					throw new BloodException("\t--->According to rules of government,\nyour weigth below 45,\nso You can't donate blood");
			}
		}
		catch(BloodException e)
		{
			System.out.println(e.getMessage());
		}
		try
		{
			if(age>=18 && weight>=45)
			{
				System.out.print("\t--->Enter Your bloodGroup :");
				bloodgroup=br.readLine();
				System.out.print("\n\t--->Enter Your blood in ml :");
				donate=Integer.parseInt(br.readLine());
				bgg=donate;
				if(checkblood(bloodgroup))
				{
					flag=1;
				}
				else
				{
					System.out.println("\t--->Kindly Check your Bloodgroup");
					flag=0;
					c=1;
				}
			}
			else
			{
				throw new BloodException("So Not able to donate blood\n");
			}
		}
		catch(BloodException e)
		{
			System.out.println(e.getMessage());
		}
		if(flag==1)
		{
			flag=0;
			int x=0;
			try {
				 BufferedWriter w = new BufferedWriter(new FileWriter("Blood.txt",true));
				 w.close();
			 }
			 catch (IOException e) {
		      }
			BufferedReader b=new BufferedReader(new FileReader("Blood.txt"));
			String old="";
			String line = b.readLine();
            while (line != null) 
            {
                if(line.equals(bloodgroup))
                {
                	old = old + line + System.lineSeparator();
	                line = b.readLine();
	                x=Integer.parseInt(line);
	                donate=donate+x;
	                line=line.replace(line,String.valueOf(donate));
	                flag=1;
                }
                old = old + line + System.lineSeparator();
                line = b.readLine();
            }
            //String newContent = old.replaceAll(String.valueOf(x),String.valueOf(donate));
            FileWriter writer = new FileWriter("Blood.txt");
            writer.write(old);
            if(flag==0)
            {
            	System.out.println("\t-->Sorry ,Your needed Blood Group isn't available in this branch");
            	writer.write(bloodgroup);
            	writer.write("\n");
            	writer.write(String.valueOf(donate));
            }
            writer.close();
            b.close();
		}
	}
	boolean checkblood(String s)
	{
		if(s.contains("A+"))
		{
			return true;
		}
		else if(s.contains("A-"))
		{
			return true;
		}
		else if(s.contains("AB+"))
		{
			return true;
		}
		else if(s.contains("AB-"))
		{
			return true;
		}
		else if(s.contains("B+"))
		{
			return true;
		}
		else if(s.contains("B-"))
		{
			return true;
		}
		else if(s.contains("O+"))
		{
			return true;
		}
		else if(s.contains("O-"))
		{
			return true;
		}
		return false;
	}
	public void print()
	{
		System.out.println("\n\n");
		System.out.println("\n\t*************************************");
		System.out.println("\n\t    ***BILL GENERATION***\n");
		super.print();
		String ans="";
		try {
			 ans=ans+"name : "+name+"\n"+"age : "+age+"\n"+"phone : "+phone+"\n"+"weight : "+weight+"\n"+"BloodGroup : "+bloodgroup+"\n"
					 +"ML donate : "+donate+"\n"+"Organ : "+or+"\n\n";
			 BufferedWriter w = new BufferedWriter(new FileWriter("Donor DataBase.txt",true));
			 w.write(ans);
			 w.close();
		 }
		 catch (IOException e) {
	      }
		System.out.println("\t--->Blood Group Type :"+bloodgroup);
		System.out.println("\t--->Blood Donated :"+bgg+" ml");
		System.out.println("\t--->Thank you for donating blood..!");
		System.out.println("\t--->You owe many lives..!");
		System.out.println("\t--->Have a great Fortune..!");
		System.out.println("\n\t*************************************");
		System.out.println("\n\n\n\n");
	}
}
