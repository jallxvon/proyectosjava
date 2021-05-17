class Comida 
{
	private String cod_menu;
	private String detalle;
	private int consumidos;
	private int total;
	
	String  get_cod_menu()
	{
		return cod_menu;
	}
	
	String get_detalle()
	{
		return detalle;
	}
	
    int get_consumidos()
	{
		return consumidos;
	}
	
    void set_cod_menu(String a)
	{
		this.cod_menu =a;
	}
	
	void set_detalle(String a)
	{
		this.detalle = a;
	}
    void set_consumidos(int a)
	{
		this.consumidos =a;
	}

	
	public int getTotal() {
		return (this.total); 
	}

	public void setTotal(int total) {
		this.total = total; 
	}
	
	
}
