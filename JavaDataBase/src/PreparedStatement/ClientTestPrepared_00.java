package PreparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import CallableStatement.DBUtilCallable_00;

public class ClientTestPrepared_00 {
	
	/* String name, gender, city, uid;
	 * int age;
	 * long mobile;
	 * public void getData(Scanner sc) { try {
	 * System.out.println("Enter Your Name: "); name = sc.nextLine();
	 * System.out.println("Enter Your Gender: "); gender = sc.nextLine();
	 * System.out.println("Enter Your City: "); city = sc.nextLine();
	 * System.out.println("Enter Your Age: "); age = sc.nextInt(); if(age < 18 &&
	 * age > 25){ throw new Exception("You are not eligible"); }
	 * System.out.println("Enter Your Mobile: "); mobile = sc.nextLong();
	 * sc.nextLine(); System.out.println("Enter Your UID number: "); uid =
	 * sc.nextLine(); if(uid.length() > 10){ throw new
	 * Exception("Please enter valid 10 digit UID number"); } }catch(Exception e) {
	 * System.out.println(e); } }
	 * 
	 * public void putDataIntoSQLite() throws SQLException { Connection connection =
	 * DBUtilCallable_00.getConnection(); if(connection != null) {
	 * System.out.println("JDBC:connection is taken..."); } //inserting new rows
	 * String insert_row0 =
	 * "INSERT INTO C2TC_M_05(UID,NAME,CITY,MOBILE,AGE,GENDER) VALUES(uid,name,city,mobile,age,gender)"
	 * ; PreparedStatement pst = connection.prepareStatement(insert_row0);
	 * pst.executeUpdate(); System.out.println("Table Altered Successfully"); }
	 */
	public void createTable() throws SQLException {
		
		Connection connection = DBUtilCallable_00.getConnection();
		if(connection != null) {
			System.out.println("JDBC:connection is taken...");
		}
		
		String create_table = "CREATE TABLE IF NOT EXISTS C2TC_M05("
				+ "ID_NO INT AUTO_INCREMENT PRIMARY KEY, "
				+ "UID VARCHAR(10) NOT NULL, "
				+ "FULL_NAME VARCHAR(30), "
				+ "CITY VARCHAR(20) DEFAULT 'MUMBAI', "
				+ "JOIN_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP, "
				+ "MOBILE BIGINT(10))";
		PreparedStatement ps = connection.prepareStatement(create_table);
		ps.executeUpdate();
		System.out.println("Table Created Successfully");		
	}
	
	public void alterTable() throws SQLException {
		Connection connection = DBUtilCallable_00.getConnection();
		if(connection != null) {
			System.out.println("JDBC:connection is taken...");
		}
		//adding a new column
		String alter_table = "ALTER TABLE C2TC_M05  ADD AGE INT CHECK(AGE > 18 AND AGE < 25) NOT NULL";
		PreparedStatement ps = connection.prepareStatement(alter_table);
		ps.executeUpdate();
		System.out.println("Table Altered Successfully");
		//deleting the column
		String alter_table0 = "ALTER TABLE C2TC_M05 DROP AGE";
		PreparedStatement ps0 = connection.prepareStatement(alter_table0);
		ps0.executeUpdate();
		System.out.println("Table Altered Successfully");
		//adding new columns
		String alter_table1 = "ALTER TABLE C2TC_M05  ADD AGE INT CHECK(AGE > 18 AND AGE < 25) NOT NULL, "
				+ "ADD GENDER VARCHAR(1) ";
		PreparedStatement ps1 = connection.prepareStatement(alter_table1);
		ps1.executeUpdate();
		System.out.println("Table Altered Successfully");
		//modifying column definition
		String alter_table2 = "ALTER TABLE C2TC_M05  MODIFY GENDER VARCHAR(1) NOT NULL CHECK(GENDER='M' OR GENDER='F' OR GENDER='O')";
		PreparedStatement ps2 = connection.prepareStatement(alter_table2);
		ps2.executeUpdate();
		System.out.println("Table Altered Successfully");
		//modifying column definition
		String alter_table3 = "ALTER TABLE C2TC_M05  CHANGE COLUMN FULL_NAME NAME VARCHAR(20) NOT NULL";
		PreparedStatement ps3 = connection.prepareStatement(alter_table3);
		ps3.executeUpdate();
		System.out.println("Table Altered Successfully");
		//modifying table definition
		String alter_table4 = "ALTER TABLE C2TC_M05  RENAME TO C2TC_M_05";
		PreparedStatement ps4 = connection.prepareStatement(alter_table4);
		ps4.executeUpdate();
		System.out.println("Table Altered Successfully");
	}
	
	public void insertData() throws SQLException {
		
		Connection connection = DBUtilCallable_00.getConnection();
		if(connection != null) {
			System.out.println("JDBC:connection is taken...");
		}
		
		//inserting new rows
		String insert_row = "INSERT INTO C2TC_M_05(UID,NAME,CITY,MOBILE,AGE,GENDER) VALUES('CAP2110412','GOVIND RAMA PARAB','MUMBAI',9076223151,21,'M')";
		PreparedStatement ps5 = connection.prepareStatement(insert_row);
		ps5.executeUpdate();
		System.out.println("Table Altered Successfully");
		//inserting new rows
		String insert_rowS = "INSERT INTO C2TC_M_05(UID,NAME,CITY,MOBILE,AGE,GENDER) "
				+ "VALUES"
				+ "('CAP2110406','ANKITA KALE','MUMBAI',9326505784,21,'F'), "
				+ "('CAP2110469','TOUHID SAYED','BANGLORE',9082694372,22,'M'), "
				+ "('CAP2110463','SURAJ PRAJAPATI','DELHI',9082132785,21,'M')";
		PreparedStatement ps6 = connection.prepareStatement(insert_rowS);
		ps6.executeUpdate();
		System.out.println("Table Altered Successfully");
		
	}
	
	public void updateData() throws SQLException {
		
		Connection connection = DBUtilCallable_00.getConnection();
		if(connection != null) {
			System.out.println("JDBC:connection is taken...");
		}
		
		//updating rows
		String update_row = "UPDATE c2tc_m_05 SET CITY='MUMBAI' WHERE CITY NOT IN('MUMBAI')";
		PreparedStatement ps7 = connection.prepareStatement(update_row);
		ps7.executeUpdate();
		System.out.println("Table Altered Successfully");
	}
	
	
	public void deleteData() throws SQLException {
		
		Connection connection = DBUtilCallable_00.getConnection();
		if(connection != null) {
			System.out.println("JDBC:connection is taken...");
		}
		//deleting rows
		String delete_row = "DELETE FROM c2tc_m_05 WHERE UID = 'CAP2110402'";
		PreparedStatement ps9 = connection.prepareStatement(delete_row);
		ps9.executeUpdate();
		System.out.println("Table Altered Successfully");
	}

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		ClientTestPrepared_00 ct = new ClientTestPrepared_00();
		//ct.createTable();
		//ct.alterTable();
		//ct.insertData();
		//ct.updateData();
		//ct.deleteData();
	}
}
