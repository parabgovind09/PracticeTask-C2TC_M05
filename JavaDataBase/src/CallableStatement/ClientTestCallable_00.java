package CallableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ClientTestCallable_00 {
	
	static CallableStatement cs=null;
	static Statement st=null;
	
	public void procedure1() {
		Connection connection = DBUtilCallable_00.getConnection();
		if(connection != null)
			System.out.println("JDBC:connection is taken..");
		
		try {
			String procedure_statatement1="CREATE PROCEDURE `p1`() "
					+ "BEGIN "
					+ "INSERT INTO C2TC_M_05(UID,NAME,CITY,MOBILE,AGE,GENDER) VALUES('CAP2110443','SACHIN SONI','MUMBAI',7039844546,21,'M'); "
					+ "INSERT INTO C2TC_M_05(UID,NAME,CITY,MOBILE,AGE,GENDER) VALUES('CAP2110416','ISHA DANGRE','DELHI',9136535275,20,'F'); "
					+ "INSERT INTO C2TC_M_05(UID,NAME,CITY,MOBILE,AGE,GENDER) VALUES('CAP2110402','ADITI GOVEKAR','MUMBAI',9321998502,21,'F'); "
					+ "END";
			
			  st=connection.createStatement();
			  int i=st.executeUpdate(procedure_statatement1);
			 
			cs=(CallableStatement) connection.prepareCall("{call p1()}");
			int i1=cs.executeUpdate();
			System.out.println(i1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
		  try { 
			  connection.close(); 
			  cs.close(); 
			  } 
		  catch(Exception e) {
		  System.out.println(e); }
		}

	public static void main(String[] args) {
		ClientTestCallable_00 ctc = new ClientTestCallable_00();
		ctc.procedure1();
	}
}
