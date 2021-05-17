/**
 * @(#)Opereaciones.java
 *
 *
 * @author 
 * @version 1.00 2018/6/27
 */
import java.sql.*;
import java.util.LinkedList;
public class Operaciones
{
	static private Statement stmt; // objeto que permite la manipulaciòn de sentencias SQL
	static private ResultSet recordset; // objeto que permite obtener resultados de la BD
	
	LinkedList <Pais> operacion1() throws Exception
	{
	Conexion obj1 = new Conexion();
	Connection cnn;
	LinkedList<Pais> pp = new LinkedList <Pais> ();
	try {
			cnn=obj1.establecer_conexion();
			stmt = cnn.createStatement();
    		recordset = stmt.executeQuery("select * from Pais order by Cod_Pais desc ");
    		while(recordset.next())
    		{
    			Pais pas = new Pais(); 
				pas.set_nombre_pais(recordset.getString("NombrePais"));
				pas.set_cod_pais(recordset.getInt("Cod_Pais"));
				pp.add(pas);
    		}
    	cnn.close();

	}
	catch(SQLException e){
    			throw new Exception ("\n"+e+"\nError");
	}
	catch(Exception e){
		   	System.out.print (e);  }
		 
  	return pp;	
	
	}
	
	LinkedList <Comida> operacion2() throws Exception
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
    			com.set_detalle(recordset.getString("Detalle"));
    			com.set_consumidos(recordset.getInt("Consumidos"));
				//s += recordset.getString("Detalle")+ " "+recordset.getString("Consumidos")+ "\n";
				cm.add(com);
				
    		}
    		Comida com = new Comida();
    		recordset = stmt.executeQuery("select SUM(Consumidos) as Total from Comida");
    		if(recordset.next())
    		{
    		    com.set_detalle("TOTAL CONSUMIDAS");
    			com.set_consumidos(recordset.getInt("Total"));
    
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
	

	
	LinkedList<Jugadores> operaciones3() throws Exception
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
				j.set_nombre(recordset.getString("NombreJugador"));
				j.peso(recordset.getInt("Peso"));
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
	
		LinkedList<Arbitro> operaciones4(String a)throws Exception
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
		
		LinkedList <Estadio_entrenamiento> operaciones5 ()throws Exception
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
						ee.set_nombre_E(recordset.getString("Nombre_Ent"));
						ee.set_nombre_pais(recordset.getString("NombrePais"));
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
		
		LinkedList<Jugadores> operaciones6 () throws Exception
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
						ju.set_nombre(recordset.getString("NombreJugador"));
						ju.set_apellido(recordset.getString("ApellidoJugador"));
						ju.set_posicion(recordset.getString("Posicion"));
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
		
		LinkedList<Jugadores> operaciones7 () throws Exception
		{
			Connection cnn;
			Conexion obj1 = new Conexion();
			LinkedList<Jugadores> ju_posicion = new LinkedList<Jugadores>();
			try
			{
				cnn = obj1.establecer_conexion();
				stmt = cnn.createStatement();
				recordset = stmt.executeQuery("select NombreJugador, ApellidoJugador, Posicion from Jugadores where cod_pais = '507' order by Posicion asc");
				
				while(recordset.next())
					{
						Jugadores ju = new Jugadores();
						ju.set_nombre(recordset.getString("NombreJugador"));
						ju.set_apellido(recordset.getString("ApellidoJugador"));
						ju.set_posicion(recordset.getString("Posicion"));
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
		
		LinkedList <Estadio_juego> operaciones8()throws Exception 
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
					esta.set_horario(recordset.getString("Horario_juego"));
					esta.set_nombre_E(recordset.getString("Estadio"));
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
}
