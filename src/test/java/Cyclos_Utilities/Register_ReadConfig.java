package Cyclos_Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Register_ReadConfig {


	Properties pro;
	public Register_ReadConfig() {
		
		//configuration of properties file
		File f=new File(System.getProperty("user.dir")+"\\src\\test\\java\\Resources\\Register.properties");
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
	
public String getname() {
		
		String nam=pro.getProperty("name");
		return nam;
	}
public String getlgnm() {
	
	String lgnm=pro.getProperty("loginname");
	return lgnm;
}
public String getemail() {
	
	String email=pro.getProperty("Email");
	return email;
}
	
	
	
}
