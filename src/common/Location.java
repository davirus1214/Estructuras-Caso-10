package common;

public class Location {
	//atributos
	Territorio categoria; //Categoría almacenará ya sea si es un canton, distrito o barrio.
	
	String nombre;//nombre sería el nombre del pueblo o lugar
	
	double consumo; //Consumo en centímetros cúbicos
	
	//Constructor que recibe 2 parámetros, el nombre del lugar, y tipo ya sea distrito, canton o provincia
	public Location(String pNombre, Territorio pCategoria, double pConsumo) {
		
		this.nombre = pNombre;
		
		categoria = pCategoria;
		
		consumo = pConsumo;
	}
	
	//Setters
	public void setNombre(String pNombre) {
		
		nombre = pNombre;
	}
	
	public void setCategoria(Territorio pCategoria) {
		
		categoria = pCategoria;
	}
	//Consumo del lugar en centímetros cubicos x minuto
	public void setConsumo(double pConsumo) {
		
		consumo = pConsumo;
	}
	
	//Getters
	public String getNombre() {
		
		return nombre;
	}
	
	public Territorio getCategoria() {
		
		System.out.println(categoria);
		
		return categoria;
		
	}
	
	public double getConsumo() {
		
		return consumo;
	}

}
