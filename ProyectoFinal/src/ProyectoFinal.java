/**
 * @(#)ProyectoFinal.java
 * ProyectoFinal application
 * @author DANIEL DIAZ, GABRIELA PENAGOS, ERNESTO CHAN, DIANA GARCIA, RAUL GOMEZ
 * @version 1.00 2018/6/27
 */
 import java.io.*;
 import java.util.LinkedList;
public class ProyectoFinal {
    
    public static void main(String[] args) throws Exception
    {
    	InputStreamReader isr = new InputStreamReader(System.in);
    	BufferedReader br = new BufferedReader(isr);
    	//LISTAS Y OBJETOS 
    	Operaciones obj = new Operaciones();
    	LinkedList<Jugadores> jp;
    	LinkedList<Arbitro> arbi;
    	LinkedList<Estadio_entrenamiento> estadio ;
		LinkedList<Jugadores> jug ;
		LinkedList<Jugadores> ju_pos; 	
		LinkedList <Estadio_juego> esta;
		LinkedList <Pais> pp;
		LinkedList <Comida> com ;
		//VARIABLES
		int opc=1,i,op=1;
    	
    	while(opc!=9)
    	{
    	System.out.println("\n\t\t*****************************");
    	System.out.println("\t\t*****FIFA WORLD CUP 2018*****");
    	System.out.println("\t\t*****************************");
    	System.out.println("\n  1. Nombre y codigo de pais de cada seleccion.");
    	System.out.println("  2. Total de menu solicitado.");
    	System.out.println("  3. Jugadores mas pesados del torneo (180-200)");
    	System.out.println("  4. Arbitros que participan en los juegos.");
    	System.out.println("  5. Estadios de practica segun seleccion.");
    	System.out.println("  6. Posicion del jugador de Panama G/z.");
    	System.out.println("  7. Jugadores de Panama segun su posicion.");
    	System.out.println("  8. Juego y estadio.");
    	System.out.println("  9. Salir.");
    	//FOR QUE CONTROLA LA EXCEPCION AL ELEGIR UNA OPCION EQUIVOCADA Y NO SE DETENGA LA EJECUCION 
    	for(i=0;i<1;i++)
    	{
    		try{
    			System.out.print("Elija una de las opciones:");
    			opc = Integer.parseInt(br.readLine());
    		}
    		catch(NumberFormatException e)
    		{
    			System.out.println("Error de conversion.");i--;
    		}
    		catch(IOException e)
    		{
    			System.out.println("Error de entrada");i--;
    		}
    	}
    	
    	switch(opc)
    	{
    		case 1 :
    			
    			pp = obj.operacion1();
    			System.out.println("------------------------------------");
    			System.out.println("  PAISES          CODIGO");
    			for(Pais a  : pp)
    			{
    				System.out.println("> "+a.get_nombre_pais()+ "       "+ a.get_cod_pais());
    			}
    			System.out.println("------------------------------------");
    			break;
    			
    		case 2 :
    			com = obj.operacion2();
    			System.out.println("------------------------------------");
    			for(Comida a :  com)
    			{
    				System.out.println("\t"+a.get_detalle()+ " " +a.get_consumidos());
    			}
    		//	System.out.println(a.getTotal());
    		System.out.print("------------------------------------");
    			break;
    			
    		case 3 :
    			jp = obj.operaciones3();
    			System.out.println("------------------------------------");
    			for(Jugadores a : jp)
    			{
    				System.out.println(" >>  "+a.get_nombre()+" "+a.get_peso());
    				
    			}
    			System.out.println("------------------------------------");
    			break;
    		case 4:
    			System.out.println("------------------------------------");
    			System.out.println("*****ELIJA UN JUEGO*****");
    			System.out.println("\n1.BELGICA VS PANAMA");
    			System.out.println("2.INGLATERRA VS TUNEZ");
    			System.out.println("3.PANAMA VS INGLATERRA");
    			System.out.println("4.BELGICA VS TUNEZ");
    			System.out.println("5.PANAMA VS TUNEZ");
    			System.out.println("6.BELGICA VS INGLATERRA");
    			op = Integer.parseInt(br.readLine());
    			System.out.println("------------------------------------");
    			switch (op)
    			{
    				case 1:
    					arbi= obj.operaciones4("BELvsPAN");
    				break;
    				case 2:
    					arbi= obj.operaciones4("INGvsTUN");
    				break;
    				case 3:
    					arbi= obj.operaciones4("INGvsPAN");
    				break;
    				case 4:
    					arbi= obj.operaciones4("BELvsTUN");
    				break;
    				case 5:
    					arbi= obj.operaciones4("PANvsTUN");
    				break;
    				case 6:
    					arbi= obj.operaciones4("INGvsBEL");
    				break;
    				default:
    					System.out.print("Elija unaa opcion valida");
    					arbi = obj.operaciones4("");
    						
    			}
    			//System.out.println("\n\n");
    			System.out.println("------------------------------------");
    			for (Arbitro a : arbi )
    			{
    				System.out.println(">> "+a.get_nombre_arbitro());
    			}
    			System.out.println("------------------------------------");
    			break;
    			
    		case 5:
    			estadio = obj.operaciones5();
    			System.out.println("------------------------------------");
    			for(Estadio_entrenamiento a : estadio )
    			{
    				System.out.println(">> "+a.get_nombre_pais()+" Entrena en "+a.get_nombre_E());
    			}
    			System.out.println("------------------------------------");
    			break;
    		case 6:
    			jug = obj.operaciones6();
    			System.out.println("------------------------------------------------------------");
    			for(Jugadores j : jug)
    			{
    				System.out.println(j.get_nombre()+" "+j.get_apellido()+" Juega en la Posicion: "+j.get_posicion());
    			}
    			System.out.println("------------------------------------------------------------");
    			break;
    		case 7:
    			ju_pos = obj.operaciones7();
    			System.out.println("----------------------------------------");
    			System.out.println("\n\t JUGADORES DE LA SELECCION DE PANAMA:");
    			System.out.println("\t****************************************");
    			for(Jugadores ju : ju_pos)
    			{
    				System.out.println(" >> "+ju.get_nombre()+" "+ju.get_apellido()+" "+ju.get_posicion());
    			}
    			System.out.println("----------------------------------------------");
    			break;
    		case 8:
    			esta= obj.operaciones8();
    			System.out.println("GABY ARREGLALO :y");
    			System.out.println("------------------------------------------------------------------");
    			System.out.println("\t\tPARTIDOS QUE SERAN DISPUTADOS EN EL GRUPO G");
    			System.out.println("***JUGARAN*************HORARIO*************ESTADIO*****");
    			System.out.println("------------------------------------------------------------------");
    			for (Estadio_juego a : esta)
    			{
    				System.out.println(">> "+a.getNombre_J()+" | "+a.get_horario()+" | "+a.get_nombre_E());
    			}
    			System.out.println("------------------------------------------------------------------");
    			
    		
    	}
    	}
    }
}
