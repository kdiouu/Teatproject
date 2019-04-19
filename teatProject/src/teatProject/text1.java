package teatProject;


import java.applet.Applet;
import java.awt.Graphics;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
public class text1{
	public static void main(String[] args) throws Exception {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;database=java", "sa", "passw0rd");
		PreparedStatement pstmt = conn.prepareStatement("select * from customer");
		ResultSet rs = pstmt.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		StringBuffer data = new StringBuffer();
		while(rs.next()) {
			
			
			data.append(rsmd.getColumnName(1) +" = "+rs.getString(rsmd.getColumnName(1))+"\n");
			
			
			String psw1 = rs.getString(rsmd.getColumnName(2));
			char[] chars = psw1.toCharArray();
			System.out.println(chars);
			

			data.append(rsmd.getColumnName(2) +" = "+String.valueOf(chars)+"\n");
			data.append(rsmd.getColumnName(3) +" = "+rs.getString(rsmd.getColumnName(3))+"\n");
			data.append(rsmd.getColumnName(4) +" = "+rs.getString(rsmd.getColumnName(4))+"\n");
			data.append("----------------------------"+"\n");
		}
		System.out.println(data);
	}
}

