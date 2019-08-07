package com.transformedge.app.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfigurations {
	
	private final static String HOST_NAME = "192.168.1.100";
	private final static int PORT_NUMBER = 1521;
	private final static String USER_NAME = "apps";
	private final static String PASSWORD = "apps";
	private final static String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	private static final String SERVICE_NAME = "TEDEVDB";

	private static Connection con = null;
	
	static {
		try{  
			Class.forName(DRIVER_NAME);  
			System.out.println("Driver Loaded!!!");
		    con = DriverManager.getConnection(  
					"jdbc:oracle:thin:@"+HOST_NAME+":"+PORT_NUMBER+":"+SERVICE_NAME,
					USER_NAME,
					PASSWORD);
		    if(con != null) {
		    	System.out.println("Database Connected!!!");
		    }
		}catch(SQLException | ClassNotFoundException e) {
			System.out.println(e);	
		}
	}
	
	public static Connection getConnectionInstance() {
		return con;
	}
}