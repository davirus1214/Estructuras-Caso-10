package common;

public class Location implements Comparable{
	//atributos
	Territorio categoria; //Categoría almacenará ya sea si es un canton, distrito o barrio.
	
	String nombre;//nombre sería el nombre del pueblo o lugar
	
	double consumoBase; //Consumo base en centímetros cúbicos
	
	double consumoActual;//Consumo actual, guarda el consumo cada vez que el consumo base varía(cada 4 minutos, +-%) 
	
	double consumoHijos;							//Consumo total de sus hijos
	
	String path;									//"Distrito, Cantón, Barrio"	      dirección de un nodo							
	
	//Constructor que recibe 2 parámetros, el nombre del lugar, y tipo ya sea distrito, canton o provincia
	public Location(String pNombre, Territorio pCategoria, double pConsumoBase) {
		
		this.nombre = pNombre;
		
		categoria = pCategoria;
		
		consumoBase = pConsumoBase;
	}
	
	//Setters
	public void setNombre(String pNombre) {
		
		nombre = pNombre;
	}
	
	public void setCategoria(Territorio pCategoria) {
		
		categoria = pCategoria;
	}
	//Consumo del lugar en centímetros cubicos x minuto
	public void setConsumoBase(double pConsumoBase) {
		
		consumoBase = pConsumoBase;
	}
	
	public void setConsumoHijos(double pConsumoHijos) {
		
		consumoHijos = pConsumoHijos;
	}
	
	public void setPath(String pPath) {
		
		path = pPath;
	}
	
	//Getters
	public String getNombre() {
		
		return nombre;
	}
	
	public Territorio getCategoria() {
		
		return categoria;
		
	}
	
	public double getConsumoBase() {
		
		return consumoBase;
	}
	
	public double getConsumoHijos() {
		
		return consumoHijos;
	}

	public String getPath() {
		
		return path;
	}
	
	
	
	/*Al implementar en la clase la interfaz Comparable, estoy obligado a hacer el método compareTo
	*compareTo, compara este objeto con otro especificado, devuelve un 0 si es igual o un -1 en caso contrario
	* los objetos se comparan con los atributos nombre.
	*/
	@Override
	public int compareTo(Object pValue) {
		// TODO Auto-generated method stub
		//Location aComparar = (Location) pObjeto;// Casting a Location para así poder tomar el nombre del Objeto 
		
		return this.nombre.compareTo((String)pValue);
	}

	
}
