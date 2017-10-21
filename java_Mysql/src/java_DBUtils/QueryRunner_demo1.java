package java_DBUtils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.management.Query;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;

import tool.LXJdbcTool;

/* 以下类实现ResultSetHandler接口 
 * 处理查询结果
 * ArrayHandler
 ArrayListHandler
 BeanHandler
 BeanListHandler
 ColumnListHandler
 ScalarHandler
 MapHandler
 MapListHandler
 */
public class QueryRunner_demo1 {
public static void main(String[] args) throws Exception {
	
		// insert();
		// update();
		// ArraylistHandler();
		// MapListHandler();
		// MapListHandler();
		//ColumnListHandler();
		//ScalarHandler();
	}

	//返回单数据计算结果
	private static void ScalarHandler() throws Exception {
		QueryRunner qr = new QueryRunner();
		String sql = "select count(*) from zhangwu";
		Connection conn = LXJdbcTool.getConnection();
		Object sc = qr.query(conn, sql, new org.apache.commons.dbutils.handlers.ScalarHandler<Object>());
		System.out.println(sc);
}

	//返回每一列的计算结果
	private static void ColumnListHandler() throws Exception {
		QueryRunner qr = new QueryRunner();
		String sql = "select * from zhangwu where money>?";
		Connection conn = LXJdbcTool.getConnection();
		Object[] param = {"500"};
		List<Object> col = qr.query(conn, sql, param, new ColumnListHandler<Object>(2));
		for (Object object : col) {
			System.out.println(object);
		}
}

	//返回list map
	private static void MapListHandler() throws Exception {
		QueryRunner qr = new QueryRunner();
		String sql = "select * from zhangwu where money>?";
		Connection conn = LXJdbcTool.getConnection();
		Object[] param = {"500"};
		List<Map<String, Object>> map = qr.query(conn, sql, param, new MapListHandler());
		for (Map<String, Object> map2 : map) {
			for(String key : map2.keySet()){
				System.out.print(key + " : " + map2.get(key));
			}
			System.out.println();
		}		
}

	private static void MapListHandler1() throws Exception {
		QueryRunner qr = new QueryRunner();
		String sql = "select * from zhangwu where money>?";
		Connection conn = LXJdbcTool.getConnection();
		Object[] param = {"500"};
		  Map<String, Object> map = qr.query(conn, sql, param, new MapHandler());
		  for(String key : map.keySet()){
			  System.out.println(key + "" + map.get(key));
		  }
}

	private static void ArraylistHandler() throws Exception {
		QueryRunner qr = new QueryRunner();
		String sql = "select * from zhangwu where money>?";
		Connection conn = LXJdbcTool.getConnection();
		Object[] params = { "500" };
		List<Object[]> result = qr.query(conn, sql, params,new ArrayListHandler());
		for (Object[] objects : result) {
			for (Object object : objects) {
				System.out.print(object + " ");
			}
			System.out.println();
		}
}

	private static void update() throws Exception {
			QueryRunner qu = new QueryRunner();
			String sql = "update zhangwu set money = 1000 where name = ? ";
			Connection conn = LXJdbcTool.getConnection();
			Object[] params = {"jiayou"};
			int row = qu.update(conn, sql, params);
			System.out.println(row);
	}

	private static void insert() throws Exception {
		// TODO Auto-generated method stub
		// 1.创建QueryRunner对象
		QueryRunner qu = new QueryRunner();
		String sql = "insert into zhangwu (name,money) values(?,?)";
		Connection conn = LXJdbcTool.getConnection();
		Object[] params = { "吃饭", "200" };
		int row = qu.update(conn, sql, params);
		System.out.println(row);
	}
}
