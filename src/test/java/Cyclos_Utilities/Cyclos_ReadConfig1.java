package Cyclos_Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Cyclos_ReadConfig1 {
	Properties pro;
	public Cyclos_ReadConfig1() {
		//configuration of properties
		File f=new File(System.getProperty("user.dir")+"\\resources1\\testing1.properties");
		try {
			FileInputStream fis=new FileInputStream(f);
		     pro=new Properties();
		     pro.load(fis);
	        }
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public String getApplication() {
		String URL=pro.getProperty("baseURL");// https://demo.cyclos.org/ui/home
		return URL;
	}
	  public String getName() {
		   String name=pro.getProperty("name");
	       return name;
	  }
	  public String getLogin() {
		   String login=pro.getProperty("login");
	       return login;
	  }
	  public String getEmail() {
		   String email=pro.getProperty("email");
	       return email;
	  }
	  public String getpassword() {
		  String password=pro.getProperty("password");
		  return password;
	  }
	  public String getrepassword() {
		  String repassword=pro.getProperty("repassword");
		  return repassword;
	 
	  }
	  
}
