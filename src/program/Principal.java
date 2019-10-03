package program;

import common.Location;
import common.Territorio;

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
			
		
	}

}
