package Cyclos_Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Registration_ReadConfig {
	Properties pro;
	public Registration_ReadConfig() {
		File f=new File(System.getProperty("user.dir")+"\\Resources\\Registration.properties");
		 try {
			 FileInputStream fis=new FileInputStream(f);
			 pro=new Properties();
			 pro.load(fis);
			 
		 }catch(Exception e) {
			 System.out.println(e.getMessage());
		 }
	}
	public String ApplicationURL() {
		String url=pro.getProperty("baseURL");
		return url;
		

}
	public String Name() {
		String name=pro.getProperty("Name");
		return name;
	}
	public String LoginName() {
		String loginname=pro.getProperty("LoginName");
		return loginname;
	}
	public String EMail() {
		String email=pro.getProperty("EMail");
		return email;
	}
	public String Password() {
		String password=pro.getProperty("Password");
		return password;
	}
	public String ConformPassword() {
		String conformpassword=pro.getProperty("ConformPassword");
		return conformpassword;
	}
}
