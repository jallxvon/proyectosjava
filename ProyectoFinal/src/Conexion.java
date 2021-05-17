
import java.sql.*;

class Conexion {

		private String connectionUrl = "jdbc:sqlserver://localhost:1433; database=Mundial ;integratedSecurity=true;";
		// Declare the JDBC objects.
		private Connection con = null;

		public Connection establecer_conexion() throws Exception {
        	try {
        		// Establish the connection.
        		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            	con = DriverManager.getConnection(connectionUrl);
            	return con;
        		}
			catch(ClassNotFoundException e)
			{
    			throw new Exception ("\nPara el programador: "+e+
    			                 "\nPara el usuario: Error No se pudo cargar el driver puente Jdbc_Odbc");
        	}
        	catch (SQLException e){
    			throw new Exception ("\n"+e+"\nError No se pudo establecer la conexion con la base de dato");
    		}

	}
}