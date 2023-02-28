import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class JDBCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   try {
	System.out.println("Drive Manager loading driver");
	DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());//DriverManager loads driver
	
	System.out.println("Connecting to database");
	Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/mysql","root","root123");//connecting to database mysql
    
	System.out.println("Creating Desired Statement");
	Statement statement = conn.createStatement();//creating desired statement
	
	System.out.println("Getting the desired Result");
    ResultSet result =statement.executeQuery("select *from employee");//running statement and getting result
    
    System.out.println("Processing Result set");
    while(result.next()) {//processing the result
        	 System.out.println("Employee Id :"+result.getInt(1));
        	 System.out.println("Employee name :"+result.getString(2));
        	 System.out.println("Employee role:"+result.getString(3));
        	 System.out.println("Employee salary :"+result.getInt(4));
        	 System.out.println("-----------------------");
        	 
         }
    System.out.println("Closing Result Set");
      //close connection in stack manner
      result.close();//close result
      
    System.out.println("Closing Statement");
      statement.close();//close statement
    
    System.out.println("Closing Conneection");
      conn.close();//close connection
         
         
	 
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   
	}

}
