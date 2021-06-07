package com.java1234.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {
	private String dbUrl="jdbc:sqlserver://tc.godever.xyz:1436;DatabaseName=db_food";
	private String dbUserName="SA";
	private String dbPassword="Wuyy9527";
	private String jdbcName="com.microsoft.sqlserver.jdbc.SQLServerDriver";

	public Connection getCon() throws Exception{
		Class.forName(jdbcName);
		Connection con=DriverManager.getConnection(dbUrl,dbUserName,dbPassword);
		return con;
	}
	

	public void closeCon(Connection con) throws Exception{
		if(con!=null){
			con.close();
		}
	}

	public static void main(String[] args) {
		DbUtil dbUtil=new DbUtil();
		try {
			dbUtil.getCon();
			System.out.println("锟斤拷锟捷匡拷锟斤拷锟接成癸拷");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("锟斤拷锟捷匡拷锟斤拷锟斤拷失锟斤拷");
		}
		
	}
}
