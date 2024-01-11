package Cyclos_Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Registration_ReadConfig 
{
	Properties pro;
	public Registration_ReadConfig()
	{
		File f=new File(System.getProperty("user.dir")+"\\Resources\\Registration.properties");
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
			String url=pro.getProperty("BaseURL");
			return url;
		}
		public String Name()
		{
			String name=pro.getProperty("Name");
			return name;
		}
		public String LoginName()
		{
			String lname=pro.getProperty("LoginName");
			return lname;
		}
		public String Email()
		{
			String email=pro.getProperty("Email");
			return email;
		}
		public String Password()
		{
			String pwd=pro.getProperty("Password");
			return pwd;
		}
		public String ConfirmPassword()
		{
			String Cpwd=pro.getProperty("PasswordConfirmation");
			return Cpwd;
		}
	

}
