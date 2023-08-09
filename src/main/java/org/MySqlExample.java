package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MySqlExample
{
	  private static final Logger logger = LoggerFactory.getLogger(MySqlExample.class);

		public static void helloDatabase(String tableName, int start, int end) throws Exception 
		{
			 	final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
			   final String DB_URL = "jdbc:mysql://localhost/test";
			   final String USER = "root";
			   final String PASS = "";
			   Connection conn = null;
		       Statement stmt = null;
		       ResultSet rs=null;
		       
		       Class.forName("com.mysql.jdbc.Driver");
	            System.out.println("Connecting to database...");
	            conn = DriverManager.getConnection(DB_URL,USER,PASS);
               System.out.println("Creating statement...");
	            stmt = conn.createStatement(); 
	            
	            logger.info("MySqlExample - Creating statement");
	            
	            for(int i=start;i<end;i++)
	            {
	            	 String sql="Select * from "+tableName+" where ID="+i;
	            	 rs = stmt.executeQuery(sql);
	            	 if(rs.next())
	            	 {
	            		 String lastName =  rs.getString("LastName");
	            		  logger.info("last name "+lastName);
	            	 }
	            	 if(i%5==0) {
	            		 //mysqlRest(1l);
	            		RegexPerfTest.main(null);
	            	 }
	            	 rs.close();
	            }
		}
		public static void mysqlRest(long x) {
			try
			{
				Thread.sleep(x);
			}
			catch (Exception e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public static void main(String[] args) throws Exception
		{
			helloDatabase("Persons5", 1, 1000);
		}
}
