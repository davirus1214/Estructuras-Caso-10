package common;

public class Location {
	//atributos
	Territorio categoria; //Categor�a almacenar� ya sea si es un canton, distrito o barrio.
	
	String nombre;//nombre ser�a el nombre del pueblo o lugar
	
	double consumo; //Consumo en cent�metros c�bicos
	
	//Constructor que recibe 2 par�metros, el nombre del lugar, y tipo ya sea distrito, canton o provincia
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
	//Consumo del lugar en cent�metros cubicos x minuto
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
