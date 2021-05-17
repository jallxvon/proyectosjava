public class Estadio_juego
{
     private String nombre_E, horario,nombre_J;
     
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

	
	public String getNombre_J() {
		return (this.nombre_J); 
	}

	public void setNombre_J(String nombre_J) {
		this.nombre_J = nombre_J; 
	}
      

}
