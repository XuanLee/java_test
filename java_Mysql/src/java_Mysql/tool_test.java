package java_Mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import tool.LXJdbcTool;

public class tool_test {
public static void main(String[] args) throws Exception {

	Connection conn = LXJdbcTool.getConnection();
	System.out.println(conn);
	String sql= "select name,money from zhangwu where money>? ORDER BY money";
	PreparedStatement ps = conn.prepareStatement(sql);
	ps.setObject(1, "500");
	ResultSet set = ps.executeQuery();
	while(set.next()){	
		System.out.println(set.getString(1)+" " + set.getInt(2));
	}
	conn.close();
	ps.close();
	
}
}
