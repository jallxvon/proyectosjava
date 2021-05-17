

public class Estadio_entrenamiento 
{
     private String nombre_E, horario, nombre_Pais;
     
     void set_nombre_E(String nombre_E)
     {
     	this.nombre_E = nombre_E;
     }
     void set_horario(String horario)
     {
     	this.horario = horario;
     }
     String get_nombre_E()
     {
     	return nombre_E;
     }
     String get_horario()
     {
     	return horario;
     }
     
	public String get_nombre_pais() {
		return (this.nombre_Pais); 
	}

	public void set_nombre_pais(String nombre_Pais) {
		this.nombre_Pais = nombre_Pais; 
	}
      

}
