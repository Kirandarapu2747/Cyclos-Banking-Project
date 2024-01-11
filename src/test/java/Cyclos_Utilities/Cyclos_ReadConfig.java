package Cyclos_Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

 Naveen

 Bhavana
public class Cyclos_ReadConfig 
{
	Properties pro;
	public Cyclos_ReadConfig()
	{
	
		File f=new File(System.getProperty("user.dir")+"\\Resources\\Testing.properties");
	    try 
	    {
	    	FileInputStream fis=new FileInputStream(f);
	        pro=new Properties();
		    pro.load(fis);
	    }
	    catch(Exception e)
	    {
		 System.out.println(e.getMessage());
	    }
	}
	
	public String OpenApplication() 

 master
public class Cyclos_ReadConfig {
	Properties pro;
PrabhavathiMallepally
	public Cyclos_ReadConfig()
	{
		File f=new File(System.getProperty("user.dir")+"\\Resources\\Testing.properties");
		try
		{
			FileInputStream fis=new FileInputStream(f);
			pro=new Properties();
			pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public String getApplicationURL()
 master
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
 Bhavana
	
	public String Username() 
	{
		String user=pro.getProperty("username");
		return user;
	}
	
	public String Password() 
	{
		String pwd=pro.getProperty("password");
		return pwd;
	}

	public String getUsername()
	{
		String username=pro.getProperty("username");
		return username;
	}
	public String getPassword()
	{
		String password=pro.getProperty("password");
		return password;
	}

	public Cyclos_ReadConfig() {
 varalasrijitha
		//configuration of properties
		File f=new File(System.getProperty("user.dir")+"\\resources\\testing.properties");
		try {
			FileInputStream fis=new FileInputStream(f);
		     pro=new Properties();
		     pro.load(fis);
	        }
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	  
		//create correspondind methods
		public String getApplication() {
			String URL=pro.getProperty("baseURL");// https://demo.cyclos.org/ui/home
			return URL;
		}
	   public String getUsername() {
		   String Username=pro.getProperty("username");
	       return Username;

}
	   public String getPassword() {
		   String Password=pro.getProperty("password");
		   return Password;
	   }
}



	File f=new File(System.getProperty("user.dir")+"\\Resources\\Testng.properties");
 try {
	 FileInputStream fis=new FileInputStream(f);
	 pro=new Properties();
	 pro.load(fis);
	 
 }catch(Exception e) {
	 System.out.println(e.getMessage());
 }

 Naveen

	Properties pro;
	public Cyclos_ReadConfig() {
		
		//configuration of properties file
		File f=new File(System.getProperty("user.dir")+"\\src\\test\\java\\Resources\\Test.properties");
		try {
			
			FileInputStream fis=new FileInputStream(f);
			pro=new Properties();
			pro.load(fis);
			
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	}
	public String getapplicationurl() {
		
		String url=pro.getProperty("baseURL");
		return url;
	}
	
public String getusername() {
		
		String uname=pro.getProperty("username");
		return uname;
	}
public String getpassword() {
	
	String pwrd=pro.getProperty("password");
	return pwrd;
}
	
	
	
	

master

}


public String ApplicationURL() {
	String url=pro.getProperty("baseURL");
	return url;
	
}

public String Username() {
	String user=pro.getProperty("username");
	return user;
}

public String Password() {
	String pwd=pro.getProperty("password");
	return pwd;
master

}
 master
}
 master
