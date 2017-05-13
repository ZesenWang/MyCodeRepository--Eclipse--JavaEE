import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectMySQL {
	
	
	public static void main(String[] args){
		//ConnectMySQL instance = new ConnectMySQL();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test?"+
			"user=root&password=7458");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM test2");
			
			while(rs.next()){
				System.out.println(rs.getString(2));
				System.out.println(rs.getInt(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(rs != null){
				try{
					rs.close();
				}catch(SQLException e){}
				
				rs = null;
			}
			if(stmt != null){
				try{
					stmt.close();
				}catch(SQLException e){}
				
				stmt = null;
			}
		}
		//ConnectMySQL.main(null);
	}
}
