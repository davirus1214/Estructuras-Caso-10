package listas;

import java.util.ArrayList;

import common.Location;

//Clase gen�ria Nodo <T>
public class Nodo <T>{
	//NOTA: Agregar un puntero al padre
	private Nodo padre; 
	
	private T value;//contendr� el dato del Nodo
	private ArrayList<Nodo> hijos;//ser� un nodo N-ario(tiene (n) varios hijos)
	
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
	

	//El usuario cuando: mete, remueve y busca los nodos , �l lo hace x nombre(Canton, distrito, o barrio)
	public void agregarHijo(Nodo pHijo, Nodo pPadre) {
		//Al agregar un nodo(Location) lo pongo a apuntar al padre de �l para poder devolverme
		padre = pPadre;
		
		hijos.add(pHijo);
	}
		
	//pNombre ser�a el nombre de Cant�n, Distrito o barrio que se quiera quitar.
	public Nodo quitarHijo(String pNombre) {
		//Ver como hacer algo que concatene en caso de que me pasen:
		/*nombre, Canton
		 *nombre, Canton, Distrito 
		 *nombre, canton, distrito, barrio
		 */
	//	String [] arreglo = pNombre.split(",");
	///////////////////////////////////////////////////////////////////////////////////////	

		
		//valueFor: es el valor que toc� en el ciclo for
		T valueFor;	//guarda el valor por el que va en el ciclo for
		
		//compValue: Compara valor que posee value
		Location compValue; //guarda el valor por el que va en el ciclo for pero ahora siendo de tipo Location
		
		Nodo elemento = null;//elemento ser� el nodo que es eliminado el cu�l al finalizar lo retorna.
		
		for (Nodo nodo: hijos) {//ciclo forEach que recorre el ArrayList 
			
			valueFor = (T) nodo.getValue(); //Al nodo por el que va el ciclo, tomo lo que contiene en value y lo almacena en valueFor.
			
			compValue = (Location)valueFor; //teniendo ya el value del nodo actual(valueFor) entonces se castea a Location para poder acceder a sus m�todos; guardandolo en la variable compValue;
			
			if (compValue.getNombre().equals(pNombre)) {//Si lo encontr�
				
				elemento = nodo;	//Antes de quitar el hijo, lo guardo en elemento para que lo retorne.
				
				//nombreDelArrayList.remove(Object o) es un m�todo que retorna un booleano, donde true es que la lista si contiene el elemento
				hijos.remove(nodo);	 //a la variable hijos le quita el elemento por el que iba el ciclo for(nodo), en caso de encontrarlo en el arraylist
			}
		}
		
		return elemento;//retorna el nodo que se quit� de hijos
	}
	
	
	//busca un hijo por medio del nombre del lugar
	public Nodo buscarHijo(String pNombre) {
		T valueFor; //el nodo casteado al tipo T guarda el atributo value en la variable valueFor
		
		Location compValue; // valueFor se castea a Location para ser guardada en campValue
		
		Nodo elemento = null; //elemento se usar� para retornar el nodo en caso de ser encontrado
		
		for (Nodo nodo: hijos) {
			
			valueFor = (T) nodo.getValue(); //guarda en la variable el atributo del nodo value, pero casteado al tipo T.
			
			compValue = (Location)valueFor; //guarda en la variable compValue el valor del nodo casteado a Location
			
			if(compValue.getNombre().equals(pNombre)) {
				
				elemento  = nodo; //elemento ahora tendr� el nodo para poder mostrarlo o retornarlo.
			}
			
		}
		
		return elemento;//retorna el nodo si lo encontr� y si no lo encontr� retorna nulo
		
	}
	
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Estos m�todos de abajo estan bien si se trabaja directamente
	//con Object
	
	
	
	//Agrega un hijo. 	nombreDelArrayList.add() es un m�todo de ArrayList, sirve para a�adir cosas
	/*public void agregarHijo(Nodo pHijo) {
		
		hijos.add(pHijo);		//a la variable hijos le agrega el par�metro pHijo.

	}
	
	//Quitar un hijo.  nombreDelArrayList.remove(Object o) es un m�todo que retorna un booleano, donde true es que la lista si contiene el elemento
	public void quitarHijo(Object pElemento) {
		
		hijos.remove(pElemento);//a la variable hijos le quita el elemento que se puso como par�metro, en caso de encontrarlo en el arraylist
		
	}
	//Buscar un hijo, que si lo encontrara entonces retorna el nodo que fu� buscado
	//Supongo que se buscar� por nombre de Cant�n o distrito. 
	public Nodo buscarHijo (T pElemento) {
	//	boolean encontrado = false;
		Nodo elemento = null;
		
	//	encontrado = hijos.contains(pElemento);//el elemento .contains(Object o) si encuentra el elemento entonces retorna true. 
		
	//	if (encontrado == true) {
			for (Nodo nodo: hijos) {//Ciclo forEach especial para los ArrayList
				if (nodo.getValue().equals(pElemento)){//si la variable value del nodo es igual al par�metro de entrada.
					return nodo; //devuelve el nodo encontrado
				}
			}
		//}
			return elemento; //devuelve nulo si no lo encontr�.
	}*/
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	
}
