public class Jugadores 
{
    private String pasaporte, nombre, apellido, alergia, tipo_s, posicion;
    private int cod_pais, peso;
    
    //sets
    void set_pasaporte(String pasaporte)
    {
    	this.pasaporte = pasaporte;
    }
    
    void set_nombre(String nombre)
    {
    	this.nombre = nombre;
    }
    
    void set_apellido(String apellido)
    {
    	this.apellido = apellido;
    }
    
    void set_alergia(String alergia)
    {
    	this.alergia = alergia;
    }
    
    void set_tipos(String tipo_s)
    {
    	this.tipo_s= tipo_s;
    }
    
    void set_posicion(String posicion)
    {
    	this.posicion = posicion;
    }
    
    void cod_pais(int cod_pais)
    {
    	this.cod_pais = cod_pais;
    }
    
    void peso(int peso)
    {
    	this.peso= peso;
    }
    
    //gets
    String get_pasaporte()
    {
    	return pasaporte;
    }
    
    String get_nombre()
    {
    	return nombre;
    }
    
    String get_apellido()
    {
    	return apellido;
    }
    
    String get_alergia()
    {
    	return alergia;
    }
    
    String get_tipo_s()
    {
    	return tipo_s;
    }
    
    String get_posicion()
    {
    	return posicion;
    }
    
    int get_cod_pais()
    {
    	return cod_pais;
    }
    
    int get_peso()
    {
    	return peso;
    }
    
}
