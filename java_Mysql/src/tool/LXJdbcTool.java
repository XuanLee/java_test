package tool;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import java_Mysql.Properties_main;

public class LXJdbcTool {
	private  LXJdbcTool(){};
	static Connection conn ;
	static String className;
	static String urlStr;
	static String userName;
	static String passworld;

	static{
		try{
			config();

			//通过反射把类加载到内存中
			Class.forName(className);
			//2.获得链接
			String url = urlStr;
			String username = userName;
			String password = passworld;
			 conn = DriverManager.getConnection(url, username, password);
			
		}catch (Exception e){
		System.out.println(e);	
		}	
	}
	
	public static Connection getConnection() throws IOException{
		return conn;
	}
	
	public static void config() throws IOException{
		InputStream in = LXJdbcTool.class.getClassLoader().getResourceAsStream("config.properties");
		Properties pr =new Properties();
		pr.load(in);
		 className = pr.getProperty("driverClass");
		 urlStr = pr.getProperty("url");
		 userName = pr.getProperty("username");
		 passworld = pr.getProperty("passworld");
	}
	
}
