package ResultSet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetClient_00 {

	public static void main(String[] args) throws SQLException {
		Connection connection = DBUtilResultSet_00.getConnection();
		if(connection != null)
			System.out.println("JDBC:connection is taken..");
		
		  Statement st = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);

		  //displaying data of id no 4
		  ResultSet rs = st.executeQuery("select * from c2tc_m_05");
		  rs.absolute(4);
		  System.out.println("\nID_NO = "+rs.getInt(1)+"\nUID = "+rs.getString(2)+"\nNAME = "+rs.getString(3)+"\nCITY ="+rs.getString(4)+"\nJOIN_DATE = "+rs.getDate(5)+"\nMOBILE = "+rs.getBigDecimal(6)+"\nAGE = "+rs.getInt(7)+"\nGENDER = "+rs.getString(8));
		  //displaying data of id no 2 by moving cursor 4-2
		  rs.relative(-2);
		  System.out.println("\nID_NO = "+rs.getInt(1)+"\nUID = "+rs.getString(2)+"\nNAME = "+rs.getString(3)+"\nCITY ="+rs.getString(4)+"\nJOIN_DATE = "+rs.getDate(5)+"\nMOBILE = "+rs.getBigDecimal(6)+"\nAGE = "+rs.getInt(7)+"\nGENDER = "+rs.getString(8));
		  //display data of id 3 by using next
		  rs.next();
		  System.out.println("\nID_NO = "+rs.getInt(1)+"\nUID = "+rs.getString(2)+"\nNAME = "+rs.getString(3)+"\nCITY ="+rs.getString(4)+"\nJOIN_DATE = "+rs.getDate(5)+"\nMOBILE = "+rs.getBigDecimal(6)+"\nAGE = "+rs.getInt(7)+"\nGENDER = "+rs.getString(8));
 	      //updating 1st record by putting cursor at postion 1
		  rs.absolute(1);
		  rs.updateString(4, "BANGLORE");
		  rs.updateRow();
		  System.out.println("\nTable Updated Successfully");
		  //taking cursor to id 4 and using prevous to print id 3 data
		  rs.absolute(4);
		  rs.previous();
		  System.out.println("\nID_NO = "+rs.getInt(1)+"\nUID = "+rs.getString(2)+"\nNAME = "+rs.getString(3)+"\nCITY ="+rs.getString(4)+"\nJOIN_DATE = "+rs.getDate(5)+"\nMOBILE = "+rs.getBigDecimal(6)+"\nAGE = "+rs.getInt(7)+"\nGENDER = "+rs.getString(8));
		  //printing first and last id data
		  rs.first();
		  System.out.println("\nID_NO = "+rs.getInt(1)+"\nUID = "+rs.getString(2)+"\nNAME = "+rs.getString(3)+"\nCITY ="+rs.getString(4)+"\nJOIN_DATE = "+rs.getDate(5)+"\nMOBILE = "+rs.getBigDecimal(6)+"\nAGE = "+rs.getInt(7)+"\nGENDER = "+rs.getString(8));
		  rs.last();
		  System.out.println("\nID_NO = "+rs.getInt(1)+"\nUID = "+rs.getString(2)+"\nNAME = "+rs.getString(3)+"\nCITY ="+rs.getString(4)+"\nJOIN_DATE = "+rs.getDate(5)+"\nMOBILE = "+rs.getBigDecimal(6)+"\nAGE = "+rs.getInt(7)+"\nGENDER = "+rs.getString(8));
          rs.absolute(1);
		  //deleting the last row
		  rs.last();
		  rs.deleteRow();
		  System.out.println("\nTable Updated Successfully");
		  try { 
			    connection.close(); 
				st.close();
		  } 
		  catch(Exception e) {
		      System.out.println(e); 
		}
	}
}