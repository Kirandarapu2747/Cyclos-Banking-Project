package Cyclos_Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Cyclos_Registration_ReadConfig {
	
	Properties pro;
	public Cyclos_Registration_ReadConfig(){
		File f=new File(System.getProperty("user.dir")+"\\Resources\\Registration.properties");
		try {
		FileInputStream fis=new FileInputStream(f);
		pro=new Properties();
		pro.load(fis);
		
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public String Openapplication() {
		String app=pro.getProperty("baseurl");
		return app;
	}
	public String getName() {
		String name=pro.getProperty("Name");
		return name;	
	}
	public String Loginname() {
		String Lname=pro.getProperty("Loginname");
		return Lname;
	}
	public String E_mail() {
		String email=pro.getProperty("E_mail");
		return email;
	}
	public String Website() {
		String website=pro.getProperty("Website");
		return website;
	}
	public String Mobilephone() {
		String mobileno=pro.getProperty("Mobilephone");
		return mobileno;
	}
	public String Land_linephone() {
		String landlineno=pro.getProperty("Land_linephone");
		return landlineno;
	}
	public String Password() {
		String pword=pro.getProperty("Password");
		return pword;
	}
	public String Passwordconfirmation() {
		String confirmpword=pro.getProperty("Passwordconfirmation");
		return confirmpword;
	}
	
}
