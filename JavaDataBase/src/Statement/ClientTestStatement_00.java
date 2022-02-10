package Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClientTestStatement_00 {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = DBUtilStatement_00.getConnection();
		if(connection != null) {
			System.out.println("JDBC:connection is taken...");
		}
		
		Statement st = connection.createStatement();
		
		 //Inserting single row
		 String query = "INSERT INTO C2TC_M_05(UID,NAME,CITY,MOBILE,AGE,GENDER) VALUES('CAP2110473','ADITYA YADAV','MUMBAI',9082409469,21,'M')";
		 st.executeUpdate(query);
		 
		
		 //Updating Single row
		 String query0 ="UPDATE C2TC_M_05 SET ID_NO = 7 WHERE ID_NO = 9";
		 st.executeUpdate(query0);
		
		 //Deleting Single row
		  String query1 = "DELETE FROM C2TC_M_05 WHERE NAME = 'ADITYA YADAV'";
		  st.executeUpdate(query1);
		  
		 //Inserting single row
	      String query2 = "INSERT INTO C2TC_M_05(UID,NAME,CITY,MOBILE,AGE,GENDER) VALUES('CAP2110473','ADITYA YADAV','MUMBAI',9082409469,21,'M')";
          st.executeUpdate(query2);
		 
		
		String sql = "select * from c2tc_m_05";
		ResultSet rs = st.executeQuery(sql);
		
		System.out.println("Displaying the all data from table c2tc_m_05 of techno_serve database");
		while(rs.next()) {
			System.out.println("\nID_NO = "+rs.getInt(1)+"\nUID = "+rs.getString(2)+"\nNAME = "+rs.getString(3)+"\nCITY ="+rs.getString(4)+"\nJOIN_DATE = "+rs.getDate(5)+"\nMOBILE = "+rs.getBigDecimal(6)+"\nAGE = "+rs.getInt(7)+"\nGENDER = "+rs.getString(8));
			System.out.println("\n**************************************************************");
		}
		
		try {
			connection.close();
			st.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
