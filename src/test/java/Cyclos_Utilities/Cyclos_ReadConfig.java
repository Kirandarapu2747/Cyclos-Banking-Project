package Cyclos_Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

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
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	
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

}
