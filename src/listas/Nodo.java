package listas;

import java.util.ArrayList;
import java.util.Vector;

import common.Location;

//Clase gen�ria Nodo <T>
public class Nodo <T> implements Comparable{
	//NOTA: Agregar un puntero al padre
	private Nodo padre; 
	
	private Vector path;							//Cada nodo tendr� su propia direccion. 
	
	private T value;//contendr� el dato del Nodo
	private ArrayList<Nodo> hijos;//ser� un nodo N-ario(tiene (n) varios hijos)
	
	//Constructores
	public Nodo(T pValue) {
		Location valor = (Location)pValue;					//casteo pValue a Location para poder tomar el nombre del Valor y as� meterlo en path
		
		String nombre;										//nombre tendr� el nombre del lugar
		
		nombre = valor.getNombre();							//le asigna el nombre del lugar a variable nombre
		
		value = pValue;
		hijos = new ArrayList <Nodo>();
		padre = null;
		
		path = new Vector();								//inicializa la variable path
		
		path.add(nombre);									//agrega al path de este nodo su propio nombre de lugar
	}
	
	
	public Nodo(T pValue, Nodo pPadre) {
		value = pValue;
		padre = pPadre;
	}
	
	
	//setters
	public void setHijos(ArrayList<Nodo> pHijos) {
		hijos = pHijos;
	}
	
	//La direccion se va creando por  medio de los nombres de lugares que estan relacionados
	public void setPath(String pNombre) {
		
		path.add(pNombre);
	}
	
	public void setPadre(Nodo pPadre) {
		
		padre = pPadre;
	}
	//getters
	public T getValue() {
		return value;
	}
	
	public ArrayList<Nodo> getHijos(){
		return hijos;
	}
	
	public Nodo getPadre() {
		
		return padre;
	}
	
	public String getPath() {
		
		String direccion="";									//direccion ser� los nombres de los lugares concatenados
		
		int tama�o;											// tama�o del vector de path
		
		tama�o = path.size();
		
		//Ciclo para concatenar los lugares en la variable direccion
		for (int i = 0; i < tama�o ; i++) {
			
			direccion = direccion + path.get(i) + ",";
		}
		//direccion = 

		return direccion;
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		
		return 0;
	}
		
}
