package Base_de_Datos;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class conexionAccess {
	
	static Connection con = null;
	static String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
	static String url = "jdbc:ucanaccess://C:\\Users\\diana\\Documents\\LoginBD.accdb";
	
	
	public static Connection obtenerConexion()
	{
		try
		{
			if(con==null) {
				Class.forName(driver);
				con = DriverManager.getConnection(url);
				JOptionPane.showMessageDialog(null, "Conexion correcta");
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
			con = null;
		}
		
		return con;
	}
	public static void main(String[] args) {
		
		Connection cn = conexionAccess.obtenerConexion();
	}
}
