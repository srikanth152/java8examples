package com.lambdas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MariaDBConnector {
	
	public static void main(String[] args) {
	    Connection conn = null;
	    Statement stmt = null;
	    try {
	        //STEP 2: Register JDBC driver
	        Class.forName("org.mariadb.jdbc.Driver");

	        //STEP 3: Open a connection
	        System.out.println("Connecting to a selected database...");
	        conn = DriverManager.getConnection(
	                "jdbc:mariadb:sequential://gam-affiliations-mariadb-load-replica-1.cch2jmarqtv7.us-east-1.rds.amazonaws.com:4001/WDW_AFF", "f-affiliationsapp", "Trus+No1");
	        System.out.println("Connected database successfully...");

	        //STEP 4: Execute a query
	        System.out.println("Creating table in given database...");
	        stmt = conn.createStatement();

	        String sql = "INSERT INTO guest_affiliation(GUEST_NATIVE_ID_TYPE,GUEST_NATIVE_ID_VALUE,AFFILIATION_TYPE_ID,ACTIVE,START_DATE,END_DATE,CREATE_USER_ID,"
	        		+ "CREATE_DATE,UPDATE_USER_ID,UPDATE_DATE) VALUES('swid','{1CE171A8-FA39-4337-AB53-8EE7E106E1E8}',1000026,1,now(),now(),'Test',now(),'Test',now())";
	        boolean rs = stmt.execute(sql);
	       
	        System.out.println("Created table in given database...");
	    } catch (SQLException se) {
	        //Handle errors for JDBC
	        se.printStackTrace();
	    } catch (Exception e) {
	        //Handle errors for Class.forName
	        e.printStackTrace();
	    } finally {
	        //finally block used to close resources
	        try {
	            if (stmt != null) {
	                conn.close();
	            }
	        } catch (SQLException se) {
	        }// do nothing
	        try {
	            if (conn != null) {
	                conn.close();
	            }
	        } catch (SQLException se) {
	            se.printStackTrace();
	        }//end finally try
	    }//end try
	    System.out.println("Goodbye!");
	}
}
