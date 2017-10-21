package java_DBUtils;

import java.sql.SQLException;
import java.util.List;

import java_domain.zhangwu;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import tool.LXDBCPTool;

public class QueryRunner_dataSource {

	static QueryRunner qr =new QueryRunner(LXDBCPTool.getDataSource());
public static void main(String[] args) throws Exception {
	
	String sql = "select * from zhangwu";
	List<zhangwu> resqult = qr.query(sql, new BeanListHandler<zhangwu>(zhangwu.class));
	for (zhangwu zhangwu : resqult) {
		System.out.println(zhangwu.toString());
	}
}
}
