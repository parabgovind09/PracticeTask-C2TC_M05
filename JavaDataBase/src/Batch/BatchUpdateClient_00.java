package Batch;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchUpdateClient_00 {

	public static void main(String[] args) throws SQLException {

		Connection connection = DBUtilBatch.getConnection();
		if(connection != null)
			System.out.println("JDBC:connection is taken..");
		
		  Statement st=connection.createStatement();
		
		  String sql1="INSERT INTO C2TC_M_05(UID,NAME,CITY,MOBILE,AGE,GENDER) "
				+ "VALUES"
				+ "('CAP2110411','DISHA SAWANT','MUMBAI',9657773021,22,'F'), "
				+ "('CAP2110472','VISHAL GUPTA','BANGLORE',8691810708,21,'M'), "
				+ "('CAP2110496','SANIKA RAUT','DELHI',9892093453,21,'F')";
		  
		  st.addBatch(sql1);
		  
		  String sql2= "UPDATE c2tc_m_05 SET AGE=22 WHERE NAME = 'VISHAL GUPTA'";
		  st.addBatch(sql2);
		  
		String sql3= "DELETE FROM c2tc_m_05 WHERE CITY = 'BANGLORE'";
		st.addBatch(sql3);
		
		int i[]=st.executeBatch();
		for(int j=0;j<i.length;j++)
		{
			System.out.println(j);
			System.out.println("Table Updated Sccessfully");
		}
		try { 
			  connection.close(); 
			  st.close(); } 
		  catch(Exception e) {
		      System.out.println(); 
		 }
	}
}