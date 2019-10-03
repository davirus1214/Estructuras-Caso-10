package listas;

import java.util.ArrayList;

import common.Location;

//Clase genéria Nodo <T>
public class Nodo <T>{
	//NOTA: Agregar un puntero al padre
	private Nodo padre; 
	
	private T value;//contendrá el dato del Nodo
	private ArrayList<Nodo> hijos;//será un nodo N-ario(tiene (n) varios hijos)
	
	//Constructor
	public Nodo(T pValue) {
		value = pValue;
		hijos = new ArrayList <Nodo>();
		padre = null;
	}
	
	//getter
	public T getValue() {
		return value;
	}
	

	//El usuario cuando: mete, remueve y busca los nodos , él lo hace x nombre(Canton, distrito, o barrio)
	public void agregarHijo(Nodo pHijo, Nodo pPadre) {
		//Al agregar un nodo(Location) lo pongo a apuntar al padre de él para poder devolverme
		padre = pPadre;
		
		hijos.add(pHijo);
	}
		
	//pNombre sería el nombre de Cantón, Distrito o barrio que se quiera quitar.
	public Nodo quitarHijo(String pNombre) {
		//Ver como hacer algo que concatene en caso de que me pasen:
		/*nombre, Canton
		 *nombre, Canton, Distrito 
		 *nombre, canton, distrito, barrio
		 */
	//	String [] arreglo = pNombre.split(",");
	///////////////////////////////////////////////////////////////////////////////////////	

		
		//valueFor: es el valor que tocó en el ciclo for
		T valueFor;	//guarda el valor por el que va en el ciclo for
		
		//compValue: Compara valor que posee value
		Location compValue; //guarda el valor por el que va en el ciclo for pero ahora siendo de tipo Location
		
		Nodo elemento = null;//elemento será el nodo que es eliminado el cuál al finalizar lo retorna.
		
		for (Nodo nodo: hijos) {//ciclo forEach que recorre el ArrayList 
			
			valueFor = (T) nodo.getValue(); //Al nodo por el que va el ciclo, tomo lo que contiene en value y lo almacena en valueFor.
			
			compValue = (Location)valueFor; //teniendo ya el value del nodo actual(valueFor) entonces se castea a Location para poder acceder a sus métodos; guardandolo en la variable compValue;
			
			if (compValue.getNombre().equals(pNombre)) {//Si lo encontró
				
				elemento = nodo;	//Antes de quitar el hijo, lo guardo en elemento para que lo retorne.
				
				//nombreDelArrayList.remove(Object o) es un método que retorna un booleano, donde true es que la lista si contiene el elemento
				hijos.remove(nodo);	 //a la variable hijos le quita el elemento por el que iba el ciclo for(nodo), en caso de encontrarlo en el arraylist
			}
		}
		
		return elemento;//retorna el nodo que se quitó de hijos
	}
	
	
	//busca un hijo por medio del nombre del lugar
	public Nodo buscarHijo(String pNombre) {
		T valueFor; //el nodo casteado al tipo T guarda el atributo value en la variable valueFor
		
		Location compValue; // valueFor se castea a Location para ser guardada en campValue
		
		Nodo elemento = null; //elemento se usará para retornar el nodo en caso de ser encontrado
		
		for (Nodo nodo: hijos) {
			
			valueFor = (T) nodo.getValue(); //guarda en la variable el atributo del nodo value, pero casteado al tipo T.
			
			compValue = (Location)valueFor; //guarda en la variable compValue el valor del nodo casteado a Location
			
			if(compValue.getNombre().equals(pNombre)) {
				
				elemento  = nodo; //elemento ahora tendrá el nodo para poder mostrarlo o retornarlo.
			}
			
		}
		
		return elemento;//retorna el nodo si lo encontró y si no lo encontró retorna nulo
		
	}
	
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Estos métodos de abajo estan bien si se trabaja directamente
	//con Object
	
	
	
	//Agrega un hijo. 	nombreDelArrayList.add() es un método de ArrayList, sirve para añadir cosas
	/*public void agregarHijo(Nodo pHijo) {
		
		hijos.add(pHijo);		//a la variable hijos le agrega el parámetro pHijo.

	}
	
	//Quitar un hijo.  nombreDelArrayList.remove(Object o) es un método que retorna un booleano, donde true es que la lista si contiene el elemento
	public void quitarHijo(Object pElemento) {
		
		hijos.remove(pElemento);//a la variable hijos le quita el elemento que se puso como parámetro, en caso de encontrarlo en el arraylist
		
	}
	//Buscar un hijo, que si lo encontrara entonces retorna el nodo que fué buscado
	//Supongo que se buscará por nombre de Cantón o distrito. 
	public Nodo buscarHijo (T pElemento) {
	//	boolean encontrado = false;
		Nodo elemento = null;
		
	//	encontrado = hijos.contains(pElemento);//el elemento .contains(Object o) si encuentra el elemento entonces retorna true. 
		
	//	if (encontrado == true) {
			for (Nodo nodo: hijos) {//Ciclo forEach especial para los ArrayList
				if (nodo.getValue().equals(pElemento)){//si la variable value del nodo es igual al parámetro de entrada.
					return nodo; //devuelve el nodo encontrado
				}
			}
		//}
			return elemento; //devuelve nulo si no lo encontró.
	}*/
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	
}
