package Cyclos_Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Cyclos_RegisterReadConfig {
	Properties pro;
	public Cyclos_RegisterReadConfig()
	{
		File f=new File(System.getProperty("user.dir")+"\\Resources\\RegisterPage.properties");
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
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	public String getName()
	{
		String name=pro.getProperty("Name");
		return name;
	}
	public String getLoginName()
	{
		String login_name=pro.getProperty("LoginName");
		return login_name;
	}
	public String getEmail()
	{
		String email=pro.getProperty("Email");
		return email;
	}
	public String getPassword()
	{
		String password=pro.getProperty("Password");
		return password;
	}
	public String getConfirmPassword()
	{
		String confirmpassword=pro.getProperty("ConfirmPassword");
		return confirmpassword;
	}

}
