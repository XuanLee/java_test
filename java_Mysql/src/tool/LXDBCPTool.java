package tool;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

import com.mysql.jdbc.Connection;

public class LXDBCPTool {
	static 	BasicDataSource dataSource = new BasicDataSource();

	static{
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/myDB1");
		dataSource.setPassword("123456");
		dataSource.setUsername("root");
		
		//选配
		dataSource.setInitialSize(10);//初始化连接数
		dataSource.setMaxActive(8);//最多连接数
		dataSource.setMaxIdle(8);//最大空闲数
		dataSource.setMinIdle(1);//最小空闲数
		
	}
	
	public static DataSource getDataSource() {
		return dataSource;
	}
}
