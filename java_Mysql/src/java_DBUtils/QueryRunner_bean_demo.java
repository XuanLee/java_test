package java_DBUtils;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import java_domain.zhangwu;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import tool.LXJdbcTool;

public class QueryRunner_bean_demo {
public static void main(String[] args) throws Exception {
	
	BeanListHandler();
}

//	
/* 实类必须
 * 提供私有字段：private 类型 字段名;
 * 提供getter/setter方法：
 * 提供无参构造
 */
	private static void BeanListHandler() throws Exception {
		// TODO Auto-generated method stub
		QueryRunner qr = new QueryRunner();
		String sql = "select  *from zhangwu";
		Connection conn = LXJdbcTool.getConnection();
		// Object[] pars = {"1"};
		// List<Object[]> array = qr.query(conn, sql, pars, new
		// ArrayListHandler());
		// for (Object[] objects : array) {
		// for (Object object : objects) {
		// System.out.println(object);
		// }
		// }
		List<zhangwu> result = qr.query(conn, sql,
				new BeanListHandler<zhangwu>(zhangwu.class));
		for (zhangwu zhangwu : result) {
			System.out.println(zhangwu.toString());
		}
	}
}
