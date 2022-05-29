package DataBaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbconnection {
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");//Register the driver class - Step 1
		System.out.println("Register the Driver Class!");
		
		Connection con;
		
		con = DriverManager.getConnection("jdbc:mysql://localhost:3307/ems_db","root","Pcm@1998#wdpcm");//Creating connection - Step 2
		System.out.println("Creating the connection!");
		
		
		System.out.println("Connected To RPPC Garment Database.");
				
		//java.sql.Statement st = con.createStatement();//Creating Statements - Strep 3
		
		//String str = "insert into emp_info values('E417', 'chanu', 20 )";
		
		//st.executeUpdate(str);//Executing Queries
		
		//System.out.println("Data is inserted");
		
		//String str2 = "select * from emp_info";
		
		//ResultSet rs = st.executeQuery(str2);
		
		//while(rs.next()) {
		//	System.out.println("Emp_No: "+rs.getString("Emp_No")+"  Name: "+rs.getString("name")+"  Age: "+rs.getInt("Age"));
		//}
		
		//st.close();
		//con.close();
		
		//System.out.println("Connection Closed!.");
		return con;
				
		
	}


}
