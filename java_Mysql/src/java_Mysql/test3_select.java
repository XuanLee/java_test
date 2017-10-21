package java_Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class test3_select {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/myDB1";
	String user="root";
	String password="123456";
	Connection con = DriverManager.getConnection(url, user, password);
	
	String sql = "select name,money from zhangwu where money>? ORDER BY money";
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setObject(1, "500");
	ResultSet set = ps.executeQuery();
	/*
	 * ResultSet实际上就是一张二维的表格，我们可以调用其boolean next()方法指向某行记录，
	 * 当第一次调用next()方法时，便指向第一行记录的位置，
	 * 这时就可以使用ResultSet提供的getXXX(int col)方法
	 * (与索引从0开始不同个，列从1开始)来获取指定列的数据：
	 */
	while(set.next()){
		System.out.println(set.getString(1) +" "+ set.getInt(2));
	}
	con.close();ps.close();
}
}
