/**
 * @(#)Opereaciones.java
 *
 *
 * @author DIAZ, PENAGOS, GOMEZ, GARCIA, VALENTIN, PEREZ
 * @version 1.00 2018/6/27
 */
package Operaciones;
import java.sql.*;
import java.util.LinkedList;
import Conexion.*;
import Get_set.*;

public class Operaciones
{
	static private Statement stmt; // objeto que permite la manipulaciòn de sentencias SQL
	static private ResultSet recordset; // objeto que permite obtener resultados de la BD
	
public LinkedList <Pais> operacion1() throws Exception
	{
	Conexion obj1 = new Conexion();
	Connection cnn;
	LinkedList<Pais> pp = new LinkedList <Pais> (); 
	try {
			cnn=obj1.establecer_conexion(); //ESTABLECIENDO CONEXION CON LA BD
			stmt = cnn.createStatement(); //CREAR EL OBJ STMT CON LA CONEXION DE LA BD PARA HACER CONSULTAS EN SQL
    		recordset = stmt.executeQuery("select * from Pais order by Cod_Pais desc ");//OBTENER RESULTADOS DE LAS CONSULTAS HECHAS A LA BD LA BD
    		while(recordset.next()) //RECORRER TUPLAS DE LA TABLA( DEVUELVE BOOLEAN)
    		{
    			Pais pas = new Pais(); //CREAMOS OBJETO TIPO PAIS
				pas.set_nombre_pais(recordset.getString("NombrePais"));//EXTRAEMOS EL DATO DE LA COLUMNA NOMBRE_PAIS Y SE LE ASIGNA A UN ATRIBUTO DE LA CLASE PAIS
				pas.set_cod_pais(recordset.getInt("Cod_Pais"));//EXTRAEMOS EL DATO DE LA COLUMNA CODIGO_PAIS
				pp.add(pas);//ADICIONAMOS A LA LISTA UN OBJETO QUE CONTIENE LA INFORMACION 
    		}
    	cnn.close();//CERRAMOS  LA CONEXION

	}
	catch(SQLException e){ //CONEXION MAL ESTABLECIDA O SENTENCIA EQUIVOCADA
    			throw new Exception ("\n"+e+"\nError");
	}
	catch(Exception e){ 
		   	System.out.print (e);  }
		 
  	return pp;	//RETORNAMOS LA LISTA
	
	}
	
public LinkedList <Comida> operacion2() throws Exception
	{
		Conexion obj1 = new Conexion();
		Connection cnn;
		LinkedList <Comida> cm = new LinkedList <Comida> ();
		try {
				cnn=obj1.establecer_conexion();
				stmt = cnn.createStatement();
	    		recordset = stmt.executeQuery("select * from Comida");
	    		while(recordset.next())
	    		{
	    			Comida com = new Comida();
	    			com.setDetalle(recordset.getString("Detalle"));
	    			com.setConsumidos(recordset.getInt("Consumidos"));
				
					cm.add(com);
					
	    		}
	    		Comida com = new Comida();
	    		recordset = stmt.executeQuery("select SUM(Consumidos) as Total from Comida");
	    		if(recordset.next())
	    		{
	    		    com.setDetalle("TOTAL CONSUMIDAS");
	    			com.setConsumidos(recordset.getInt("Total"));
	    
	    			cm.add(com);
	    		}
    	cnn.close();

	}
	catch(SQLException e){
    			throw new Exception ("\n"+e+"\nError");
	}
	catch(Exception e){
		   	System.out.print (e);  }
		 
  	return cm;
	
		
	}
	

	
 public	LinkedList<Jugadores> operaciones3() throws Exception
	{
		LinkedList<Jugadores> jugadorpesao = new LinkedList<Jugadores>();
		Connection cnn ;
		Conexion obj1 = new  Conexion();
		try
		{
			cnn = obj1.establecer_conexion();
			stmt = cnn.createStatement();
			recordset = stmt.executeQuery("select NombreJugador,Peso from Jugadores where Peso>=81 AND  Peso<=91");
			while(recordset.next())
			{
				Jugadores j = new Jugadores();
				j.setNombre(recordset.getString("NombreJugador"));
				j.setPeso(recordset.getInt("Peso"));
				jugadorpesao.add(j);
			}
		}
		catch(SQLException e)
		{
			System.out.println("Error de SQL: "+e);
		}
		catch(Exception e)
		{
			throw e;
		}
		return jugadorpesao;
	}
	
	public	LinkedList<Arbitro> operaciones4(String a)throws Exception
		{
			Connection cnn ;
			Conexion obj1 = new  Conexion();
			LinkedList <Arbitro> nombre_arbitro  = new LinkedList<Arbitro>();
			
			try
			{
				cnn = obj1.establecer_conexion();
				stmt = cnn.createStatement();
				recordset = stmt.executeQuery("select NombreArbitro from Arbitro where Nombre_juego = '"+a+"' or Nombre_juego1 = '"+a+"'");
				while(recordset.next())
				{
					Arbitro ar = new Arbitro();
					ar.set_nombre_arbitro(recordset.getString("NombreArbitro"));
					nombre_arbitro.add(ar);
				}
				cnn.close();
			}
	catch(SQLException e)
			{
				System.out.println("Error de SQL: "+e);
			}
			
			catch(Exception e)
			{
				throw e;
			}
			return (nombre_arbitro);
		}
		
	public	LinkedList <Estadio_entrenamiento> operaciones5 ()throws Exception
		{
			Connection cnn;
			Conexion obj1 = new Conexion();
			LinkedList < Estadio_entrenamiento> nombre_estadio = new LinkedList <Estadio_entrenamiento>();
			
			try
			{
				cnn = obj1.establecer_conexion();
				stmt = cnn.createStatement();
				recordset = stmt.executeQuery("Select Nombre_Ent, NombrePais from Estadio_Entrenamiento E inner join Pais p on p.Cod_Pais = E.Cod_Pais   ");
					while(recordset.next())
					{
						Estadio_entrenamiento ee = new Estadio_entrenamiento();
						ee.setNombre_E(recordset.getString("Nombre_Ent"));
						ee.setNombre_Pais(recordset.getString("NombrePais"));
						nombre_estadio.add(ee);
					}
					cnn.close();
			}
			catch(SQLException e)
			{
				System.out.println("Error de SQL: "+e);
			}
			catch(Exception e)
			{
				throw e;
			}
			return nombre_estadio;
		}	
		
	public	LinkedList<Jugadores> operaciones6 () throws Exception
		{
			Connection cnn;
			Conexion obj1 = new Conexion();
			LinkedList<Jugadores> posicion = new LinkedList<Jugadores>();
			try
			{
				cnn = obj1.establecer_conexion();
				stmt = cnn.createStatement();
				recordset = stmt.executeQuery("Select NombreJugador,ApellidoJugador, Posicion from Jugadores where  ApellidoJugador like 'G%z' ");
				while(recordset.next())
					{
						Jugadores ju = new Jugadores();
						ju.setNombre(recordset.getString("NombreJugador"));
						ju.setApellido(recordset.getString("ApellidoJugador"));
						ju.setPosicion(recordset.getString("Posicion"));
						posicion.add(ju);
					}
					cnn.close();
			}
			catch(SQLException e)
			{
				System.out.println("Error de SQL: "+e);
			}
			catch(Exception e)
			{
				throw e;
			}
			return posicion;
		}
	
	public	LinkedList<Jugadores> operaciones7 () throws Exception
		{
			Connection cnn;
			Conexion obj1 = new Conexion();
			LinkedList<Jugadores> ju_posicion = new LinkedList<Jugadores>();
			try
			{
				cnn = obj1.establecer_conexion();
				stmt = cnn.createStatement();
				recordset = stmt.executeQuery("exec pa_Jugadores_Panama");
				
				while(recordset.next())
					{
						Jugadores ju = new Jugadores();
						ju.setNombre(recordset.getString("NombreJugador"));
						ju.setApellido(recordset.getString("ApellidoJugador"));
						ju.setPosicion(recordset.getString("Posicion"));
						ju_posicion.add(ju);
					}
					cnn.close();
			}
			catch(SQLException e)
			{
				System.out.println("Error de SQL: "+e);
			}
			catch(Exception e)
			{
				throw e;
			}
			return ju_posicion;
		}
		
	public	LinkedList <Estadio_juego> operaciones8()throws Exception 
		{
			Connection cnn;
			Conexion obj1 = new Conexion();
			LinkedList <Estadio_juego> estadio_juego = new LinkedList<Estadio_juego>();
			try
			{
				cnn = obj1.establecer_conexion();
				stmt = cnn.createStatement();
				recordset = stmt.executeQuery("select Nombre_juego, Horario_juego,Estadio from Estadio_Juegos");
				while(recordset.next())
				{
					Estadio_juego esta = new Estadio_juego();
					esta.setNombre_J(recordset.getString("Nombre_juego"));
					esta.setHorario(recordset.getString("Horario_juego"));
					esta.setNombre_E(recordset.getString("Estadio"));
					estadio_juego.add(esta);
				}
				cnn.close();
				
			}
			catch(SQLException e)
			{
				System.out.println("Error de SQL: "+e);
			}
			catch(Exception e)
			{
				throw e;
			}
			return estadio_juego;
		}
	
	public boolean exit (String nom)throws Exception
	{
		String Cadsql;
		Connection cnn;
		Conexion obj1 = new Conexion();
		try
		{
			cnn = obj1.establecer_conexion();
			Cadsql="select Cód_Menu from Comida where Cód_menu='"+nom+"'";
			recordset = stmt.executeQuery(Cadsql);
			cnn.close();
			return(recordset.next());
		}
		catch(SQLException e)
		{
			throw e;
		}
		
	}
	
	
	public void insercion(Connection cnn,String cod,String det,String cons)throws Exception 
	{
		String cadsql;
		try
		{
			stmt = cnn.createStatement();
			cadsql= "Insert into Comida(Cód_Menu,Detalle,Consumidos) values ('"+cod+"','"+det+"','"+cons+"')";
		    stmt.executeUpdate(cadsql);
			cnn.close();
		}	
			catch(SQLException e)
			{
				throw e;
			}
	}
	
	public void eliminar(String cod)throws Exception
	{
		Connection cnn;
		Conexion obj1 = new Conexion();
		String Cadsql;
		try
		{
			cnn=obj1.establecer_conexion();
			stmt = cnn.createStatement();
			Cadsql= "Delete from Comida where Cód_menu ='"+cod+"'";
		    stmt.executeUpdate(Cadsql);
			cnn.close();
		}	
			catch(SQLException e)
			{
				throw e;
			}
	}
	
	public void modificar(Connection cnn,String cod,String det,String cons)throws Exception 
	{
		String Cadsql;
		try
		{
			stmt = cnn.createStatement();
			Cadsql= "Update Comida set Cód_Menu ='"+cod+"',Detalle='"+det+"',Consumidos='"+cons+"'where Cód_Menu='"+cod+"'";
		    stmt.executeUpdate(Cadsql);
			cnn.close();
		}	
			catch(SQLException e)
			{
				throw e;
			}
		
	}
	
	public LinkedList<Comida> comida1 () throws Exception 
	{
		Conexion obj1 = new Conexion();
		Connection cnn;
		LinkedList <Comida> cm = new LinkedList <Comida> ();
		try {
				cnn=obj1.establecer_conexion();
				stmt = cnn.createStatement();
	    		recordset = stmt.executeQuery("select * from Comida");
	    		while(recordset.next())
	    		{
	    			Comida com = new Comida();
	    			com.setCod_menu(recordset.getString("Cód_Menu"));
	    			com.setDetalle(recordset.getString("Detalle"));
	    			com.setConsumidos(recordset.getInt("Consumidos"));
				
					cm.add(com);
					
	    		}

	    		cnn.close();
	    		return(cm);
    			
    		}
		catch(SQLException e)
		{
			throw e;
		}
	}
	
}
