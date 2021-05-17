package Get_set;
public class Pais 
{
	private String nombre_pais;
	private int cod_pais;
	
	public void set_nombre_pais(String nombre_pais)
	{
		this.nombre_pais = nombre_pais;
	}
	
	public void set_cod_pais(int cod_pais)
	{
		this.cod_pais = cod_pais;
	}
	
	public String get_nombre_pais() 
    {
		return nombre_pais;
	}
	
	public int get_cod_pais() 
    {
		return cod_pais;
	}
	
}