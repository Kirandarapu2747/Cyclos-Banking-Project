package Cyclos_Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Cyclos_ReadConfig {


	
	Properties pro;
	public Cyclos_ReadConfig() {
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

