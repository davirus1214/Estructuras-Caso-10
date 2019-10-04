package program;

import java.util.ArrayList;
import java.util.Vector;

import common.Location;
import common.Territorio;
import listas.NTree;
import listas.Nodo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Territorio categoria = null;
		
		
		
		//toda la info viene en un Json file
		
	//	Location l1 = new Location("Central", categoria.DISTRITO);
	//	l1.getCategoria();
		
	
		
		//.split
		String buscar = "Los Angeles, Central, La Puebla";
		
		String[] arreglo = buscar.split(",");
		
		System.out.println(arreglo[0] + arreglo[2] + arreglo[1]);
			
		
		
		////////CONCATENANDO STRINGS //////
		
		String a1 = "Moravia";
		String a2 = "San Blas";
		String a3 = "barrio";
		
		String respuesta;
		
		respuesta = a1 +","+ a2 +","+ a3;
		System.out.println(respuesta);
		
		
		
		/////////////////////////////////////VECTOR
		System.out.println("///////////////////////////PROBANDO VECTOR//////////////////");
		Vector lista = new Vector();
		
		lista.add("Hola");
		lista.add("Azul");
		lista.add("Rojo");
		
		int tamaño;
		tamaño = lista.size();
		String h = lista.toString();
		String g = "";
		
		System.out.println(lista);
		System.out.println(lista.get(0));
		System.out.println(lista.get(1));
		System.out.println("Tamaño del vector: " + tamaño);
		System.out.println(h + "hola");
		
		for(int i = 0; i < tamaño; i++) {
			g = g + ","+(lista.get(i));
		}
		
		System.out.println(g);
		
		/////////////////////////////////Probando los árboles
		System.out.println("//////////////////////////////////PROBADO ARBOL TUBERIAS");
		Territorio territorio = null;

		System.out.println("CREACION DE pueblo1");
		System.out.println("");
		
		Location pueblo1 = new Location("Limon", territorio.CANTON, 25);
		System.out.println("Datos del pueblo1: ");
		System.out.println("Nombre: " + pueblo1.getNombre());
		System.out.println("Categoria: " + pueblo1.getCategoria());
		System.out.println("Consumo Base: " + pueblo1.getConsumoBase());
		
		System.out.println(".................................");
		System.out.println("CREACION DE nodo1");
		System.out.println("");
		
		Nodo nodo1 = new Nodo(pueblo1);
		System.out.println("Datos del nodo1:");
		System.out.println("value: " + nodo1.getValue());
		System.out.println("hijos: " + nodo1.getHijos());
		System.out.println("padre: " + nodo1.getPadre());
		System.out.println("path: " + nodo1.getPath());
		
		System.out.println(".................................");
		System.out.println("CREACION DE arbol");
		System.out.println("");
		
		NTree arbol = new NTree(nodo1);
		System.out.println("raiz: " + arbol.getRaiz());
		
		System.out.println("..................................");
		
		System.out.println("Es vacío: " + arbol.esVacio());
		
		System.out.println("CREACION DE pueblo2");
		System.out.println("");
		
		System.out.println(".........................................");
		
		Location pueblo2 = new Location("Matama", territorio.DISTRITO, 2);
		System.out.println("Datos del pueblo2: ");
		System.out.println("");
		System.out.println("Nombre: " + pueblo2.getNombre());
		System.out.println("Categoria: " + pueblo2.getCategoria());
		System.out.println("Consumo Base: " + pueblo2.getConsumoBase());
		
		System.out.println(".................................");
		System.out.println("CREACION DE nodo2");
		System.out.println("");
		
		Nodo nodo2 = new Nodo(pueblo2);
		System.out.println("Datos del nodo2:");
		System.out.println("value: " + nodo2.getValue());
		System.out.println("hijos: " + nodo2.getHijos());
		System.out.println("padre: " + nodo2.getPadre());
		System.out.println("path: " + nodo2.getPath());
		System.out.println("");
		
		System.out.println("AGREGANDO UN HIJO, hijo:nodo2  padre: nodo1,   el metodo está en NTree ");
		System.out.println("");
		
		arbol.agregarHijo(nodo2, nodo1);
		
		
		
		Nodo nodo3;
		nodo3 = (Nodo) nodo1.getHijos().get(0);
		System.out.println("Hijos del padre: " + nodo3.getValue());
		System.out.println("El padre del hijo: " + nodo3.getPadre().getValue());
		System.out.println("Direccion del hijo: " + nodo3.getPath());
		System.out.println("");
		System.out.println("....................................");
		
		
		Location pueblo3 = new Location("Aguas Zarcas", territorio.BARRIO, 1);
		System.out.println("Datos del pueblo3: ");
		System.out.println("");
		System.out.println("Nombre: " + pueblo3.getNombre());
		System.out.println("Categoria: " + pueblo3.getCategoria());
		System.out.println("Consumo Base: " + pueblo3.getConsumoBase());
		
		System.out.println(".................................");
		System.out.println("CREACION DE nodo4");
		System.out.println("");
		
		Nodo nodo4 = new Nodo(pueblo3);
		System.out.println("Datos del nodo4:");
		System.out.println("value: " + nodo4.getValue());
		System.out.println("hijos: " + nodo4.getHijos());
		System.out.println("padre: " + nodo4.getPadre());
		System.out.println("path: " + nodo4.getPath());
		System.out.println("");
		
		System.out.println("AGREGANDO UN HIJO, hijo:nodo4  padre: nodo2,   el metodo está en NTree ");
		System.out.println("");
		
		arbol.agregarHijo(nodo4, nodo2);
		
		
		
		Nodo nodo5;
		nodo5 = (Nodo) nodo2.getHijos().get(0);
		System.out.println("Hijos del padre: " + nodo5.getValue());
		System.out.println("El padre del hijo: " + nodo5.getPadre().getValue());
		System.out.println("Direccion del hijo: " + nodo5.getPath());
		System.out.println("");
		
		System.out.println("..............................................");
		System.out.println("ELIMINAR UN HIJO,    hijo: Matama     padre: nodo1");
		
		
		
		Nodo nodo6;
		nodo6 = arbol.quitarHijo("Matama", nodo1);
		System.out.println("Hijos del padre: " + nodo1.getHijos());
		
		
	}

}
