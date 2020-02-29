package ejecutar;
/**
 * @autor Paula Carrasco
 * version 1.0
 * Clase main
 * @param sumaElectrodomestico, sumaLavadora, sumaTelevision
 */

import electrodomesticos.Electrodomestico;
import electrodomesticos.Lavadora;
import electrodomesticos.Television;

public class Ejecutar {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//crear array
		
		Electrodomestico arrayElectrodomesticos[]=new Electrodomestico[10];
		
		arrayElectrodomesticos[0]= new Electrodomestico(200, 40, 'C', "blanco");
		arrayElectrodomesticos[1]= new Lavadora();
		arrayElectrodomesticos[2]= new Television();
		arrayElectrodomesticos[3]= new Electrodomestico(30, 60);
		arrayElectrodomesticos[4]= new Electrodomestico();
		arrayElectrodomesticos[5]= new Lavadora(300, 30, 'A', "Gris", 10);
		arrayElectrodomesticos[6]= new Television(500, 50, 'B', "blanco", true, 50);
		arrayElectrodomesticos[7]= new Electrodomestico();
		arrayElectrodomesticos[8]= new Electrodomestico();
		arrayElectrodomesticos[9]= new Television();
		
		int sumaLavadora = 0;
		int sumaTelevision = 0; 
		int sumaElectrodomestico = 0;
		Lavadora L = new Lavadora();
		for(int i = 0; i < arrayElectrodomesticos.length; i++) {
			
			if(arrayElectrodomesticos[i] instanceof Lavadora){
				
				sumaLavadora += arrayElectrodomesticos[i].precioFinal();
			}
			
			if(arrayElectrodomesticos[i] instanceof Electrodomestico){
				
				sumaElectrodomestico += arrayElectrodomesticos[i].precioFinal();
			}
			
			if(arrayElectrodomesticos[i] instanceof Television){
				
				sumaTelevision += arrayElectrodomesticos[i].precioFinal();
			}
			
			
		}
		
		System.out.println("La suma precio televisores: " + sumaTelevision);
		System.out.println("La suma precio Lavadoras: " + sumaLavadora);
		System.out.println("La suma precio televisores: " + sumaElectrodomestico);
		
	}

}
