package Cyclos_Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Cyclos_ReadConfig {


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
	
	
	
	
}
