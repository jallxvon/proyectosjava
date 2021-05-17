package Get_set;

public class Arbitro 
{
	private String no_pasaporteA, nombre_arbitro, pais_origen, hotel, nombre_estadio; 
    
 //sets
    public void set_no_pasaporteA(String no_pasaporteA)
    {
    	this.no_pasaporteA = no_pasaporteA;
    }
    
    public void set_nombre_arbitro(String nombre_arbitro)
    {
    	this.nombre_arbitro = nombre_arbitro;
    }
    
    public void set_pais_origen(String pais_origen)
    {
    	this.pais_origen = pais_origen;
    }
    
    public void set_hotel(String hotel)
    {
    	this.hotel = hotel;
    }
    
    public void set_nombre_estadio(String nombre_estadio)
    {
    	this.nombre_estadio = nombre_estadio;
    }
    
  //gets
    public String get_pasaporte() 
    {
		return no_pasaporteA;
	}
	
	public String get_nombre_arbitro() 
    {
		return nombre_arbitro;
	}
	
	public String get_pais_origen() 
    {
		return pais_origen;
	}
	
	public String get_hotel() 
    {
		return hotel;
	}
	
	public String get_nombre_estadio() 
    {
		return nombre_estadio;
	}
}