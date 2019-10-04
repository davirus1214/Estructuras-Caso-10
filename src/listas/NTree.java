package listas;

import java.util.ArrayList;

import common.Location;

//Clase arbol n-ario
public class NTree{
	//Atributos
	private Nodo raiz; 
	
	//Constructores
	public NTree() {
		
		raiz = null;
	}
	
	public NTree(Nodo pRaiz) {
		
		this.raiz = pRaiz;
	}
	
	
	public Nodo getRaiz() {
		
		return raiz;
	}
	
	//Crea un �rbol de ra�z
	/*public <T> Nodo newTree(T pValue) {
		
		return new Nodo(pValue);
	}*/
	
	//Estado del �rbol
	public boolean esVacio() {
		
		return raiz == null;
	}

	//Al agregar un hijo tiene que pasar por par�metros el nodo a agregar(hijo) y el padre al que pertenecer�a
	public void agregarHijo(Nodo pHijo ,Nodo pPadre) {
		
		ArrayList<Nodo> hPadre; 							//se pedir� la el arraylist del nodo padre, y se almacenar� en hPadre
		
		String padrePath;									//mas a delante se llamar� al m�todo que pide la direcci�n del padre, al llamarlo se guarda en la variable padrePath
		
		hPadre = pPadre.getHijos();//a la varable hPadre se copia el arrayList del padre
		
		hPadre.add(pHijo);// al arraylist hPadre le agrega el nodo pHijo, para que ahora el padre sepa que tiene un nuevo hijo
		
		pPadre.setHijos(hPadre);//"Actualiza" el arraylist de hijos del padre, ahora con el nuevo hijo incluido
		 
		
		/////////////////////////////
		//	new Nodo(pHijo, pPadre);        //me parece que no se tiene que crear un nuevo nodo, porque ya desde los parametros estoy pasando un nodo ya creado anteriormente
		/////////////////////////////
		
		pHijo.setPadre(pPadre);								//al hijo le indico su padre
		
		padrePath = pPadre.getPath();						//se asigna el path del padre a la variable padrePath
		
		pHijo.setPath(padrePath);							// al hijo le concateno el path del pap�
		
	}
	
	/*NOTA://Ver como hacer algo que concatene en caso de que me pasen:
	*nombre, Canton
	*nombre, Canton, Distrito 
	*nombre, canton, distrito, barrio
	*/
	//	String [] arreglo = pNombre.split(",");
	//pNombre ser�a el nombre de Cant�n, Distrito o barrio que se quiera quitar.
	public <T> Nodo quitarHijo(String pNombre, Nodo pPadre) {
		//valueFor: es el valor que toc� en el ciclo for
		T valueFor;	//guarda el valor por el que va en el ciclo for
		
		Comparable compValue;//guarda el valor por el que va en el ciclo for pero ahora siendo de tipo Comparable para poderlo comparar
		
		Nodo elemento = null;//elemento ser� el nodo que es eliminado el cu�l al finalizar lo retorna.
		
		ArrayList<Nodo> hijosPadre;								// hijosPadre guarda el arrayList del padre
		
		ArrayList<Nodo> toRemove = new ArrayList<Nodo> ();								//
		
		hijosPadre = pPadre.getHijos(); 	 					// recorre = pPadre.getHijos();
		
		for (Nodo nodo: hijosPadre) {							//ciclo forEach que recorre el ArrayList
	
			valueFor = (T) nodo.getValue();						//Al nodo por el que va el ciclo, tomo lo que contiene en value y lo almacena en valueFor.
			
			compValue = (Comparable)valueFor; 					//Casteo valueFor a Comparable y lo guardp en la variable compValue
			
			
			if(compValue.compareTo(pNombre) == 0) {				//.compareTo devuelve un entero. 0 si es igual, -1 si es menor, 1 si es mayor
			
				elemento = nodo;								//Antes de quitar el hijo, lo guardo en elemento para que lo retorne.
				
				toRemove.add(nodo);
				//nombreDelArrayList.remove(Object o) es un m�todo que retorna un booleano, donde true es que la lista si contiene el elemento
				//hijosPadre.remove(nodo);							//a la variable hijos le quita el elemento por el que iba el ciclo for(nodo), en caso de encontrarlo en el arraylist
 					
			}
			
		}
		hijosPadre.removeAll(toRemove);
		
		pPadre.setHijos(hijosPadre);								//Despues de borrarlo, actualizo al padre con los hijos pero sin el hijo que se acaba de eliminar
		
		
		
		//ahora tengo que hacer que los hijos del hijo borrado sean hijos del padre, y que el padre sea su padre
		
		
		
		return elemento;
	}
	
	
	//Pasandole el padre, busca a un hijo pasando el nombre del lugar
	public <T> Nodo buscarHijo(String pNombre, Nodo pPadre) {
				
		T valueFor;
		
		//Comparable compValue;									//guarda el valor por el que va en el ciclo for pero ahora siendo de tipo Comparable para poderlo comparar
				
		
		////////////////////
		
		Location valueLocation;
		
		String comp = "";
		///////////////////
		
		
		Nodo elemento = null;									//elemento ser� el nodo que es buscado el cu�l al finalizar lo retorna.
				
		ArrayList<Nodo> hijosPadre;								// hijosPadre guarda el arrayList del padre
				
		hijosPadre = pPadre.getHijos(); 	 					// recorre = pPadre.getHijos();
		
		
		for (Nodo nodo: hijosPadre) {							//ciclo forEach que recorre el ArrayList
			
			valueFor = (T)nodo.getValue();						//Al nodo por el que va el ciclo, tomo lo que contiene en value y lo almacena en valueFor.
			
			//compValue = (Comparable)nodo; 						//Casteo valueFor a Comparable y lo guardp en la variable compValue
		
			////////////////////////
			valueLocation = (Location)nodo.getValue();
			
			comp = valueLocation.getNombre();
			////////////////////////
			
			
			///////////
			//int numretorno =0;
			//numretorno = compValue.compareTo(pNombre);
			//System.out.println("N�mero de retorno" +numretorno);
			//////////
			
			if(comp.compareTo(pNombre) == 0) {
				elemento = nodo;
			}
			
			//if(compValue.compareTo(pNombre) == 0) {				//.compareTo devuelve un entero. 0 si es igual, -1 si es menor, 1 si es mayor
				
				//elemento = nodo;								//Antes de quitar el hijo, lo guardo en elemento para que lo retorne.
		//	}

		}
		
		return elemento;

	}
	 
	/*	
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//Estos m�todos de abajo estan bien si se trabaja directamente
		//con Object
		
		//Agrega un hijo. 	nombreDelArrayList.add() es un m�todo de ArrayList, sirve para a�adir cosas
		public void agregarHijo(Nodo pHijo) {
			
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
		}
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		*/
	
}
