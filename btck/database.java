/*
package btck;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.sql.Statement;

public class database {

	public static void main(String[] args) {
		Connection con = null;
		String url = "jdbc:sqlserver://localhost:1433;databasename=CuaHang_Bancay";
		String username = "Administrator";
		String password = "0307";
		try {
		//load driver
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		//connect
		con = DriverManager.getConnection(url, username, password);
		System.out.println("ket noi thanh cong!");
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} 
	}

}
 
*/