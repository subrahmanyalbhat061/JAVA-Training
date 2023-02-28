import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUpdateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   try {
	System.out.println("Drive Manager loading driver");
	DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());//DriverManager loads driver
	
	System.out.println("Connecting to database");
	Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/mysql","root","root123");//connecting to database mysql
    
	System.out.println("Creating Desired Statement");
	PreparedStatement s = conn.prepareStatement("delete from employee  where empno=?");//creating desired statement
	
	
	s.setInt(1, 102);
	s.executeUpdate();

    s.setInt(1, 103);
    s.executeUpdate();
   
  
    
      System.out.println("Closing Statement");
      s.close();//close statement
    
    
      System.out.println("Closing Conneection");
      conn.close();//close connection
         
         
	 
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   
	}

}
