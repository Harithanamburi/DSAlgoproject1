package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

		public Properties prop;
		static String browser ="";

		public Properties init_prop() {

			prop = new Properties();
			try {

				FileInputStream ip = new FileInputStream("/Users/muvva/Desktop/new/DSAlgoproject1/src/test/resources/Config.properties/configproperties");

				prop.load(ip);								
			}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			catch (IOException e) {
				e.printStackTrace();
			}

			return prop;

		}

		public static void setBrowserType(String newbrowser) {
			browser = newbrowser;
		}
		
		public static String getBrowser() {
			return browser;
		}



	}
	
	
	

