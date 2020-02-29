package electrodomesticos;

import java.util.*;

public class Electrodomestico { //constructor por defecto
	/**
	 * @autor Paula Carrasco
	 * version 1.0
	 * Clase padre
	 * @param precioBase, color, consumoEnergetico, peso
	 */
	
	protected final static double PRECIO_BASE = 100000; //constante precio
	protected final static String COLOR = "blanco";
	protected final static char CONSUMO_ENERGETICO = 'F';
	protected final static double PESO = 5;
	
	protected double precioBase; // en pesos
	protected String color; 
	protected char consumoEnergetico; // categoría eficiencia energética
	protected double peso; //en kg
	
	/**
	 * constructores por defecto, con precio y peso, con parámetros
	 */
	

	
	public Electrodomestico() {//constructor por defecto
		this.precioBase = PRECIO_BASE;
		this.peso = PESO;
		this.consumoEnergetico= CONSUMO_ENERGETICO;
		this.color = COLOR;
	}
	
	public Electrodomestico(double precioBase, double peso) { //constructor con precio y peso, el resto por defecto
		
		this.precioBase = precioBase; 
		this.peso = peso; 
		this.color= COLOR; 
		this.consumoEnergetico= CONSUMO_ENERGETICO; 
		
		//para asignar el resto de elementos por defecto
	}
	
	
	public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color) {
		
		comprobarConsumoEnergetico(consumoEnergetico);
		comprobarColor(color);
		this.precioBase = precioBase; 
		this.peso = peso;
	
		
	}

	public double getPrecioBase() { //métodos get de los atributos
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}
	
	public void comprobarConsumoEnergetico(char consumoEnergetico) { // método compuebra consumo energético
		
			
		if (consumoEnergetico == 'A' && consumoEnergetico == 'B' &&
				consumoEnergetico == 'C' && consumoEnergetico == 'D'
				&& consumoEnergetico == 'E' && consumoEnergetico == 'F'){
			
			this.consumoEnergetico = consumoEnergetico; 
			
			
		}else {
			
			consumoEnergetico = CONSUMO_ENERGETICO; 
			
		}
		
		
		
	}
	
	public void comprobarColor(String color) {

	String colorProbado;
	
	colorProbado= color.toUpperCase();
	
	switch(colorProbado) {
	
		case "BLANCO":
			this.color = color;
			break; 
			
		case "NEGRO":
			this.color = color; 
			break;
			
		case "ROJO":
			this.color = color; 
			break;	
			
		case "AZUL":
			this.color = color; 
			break;
			
		case "GRIS":
			this.color = color; 
			break;
			
		default:
		    this.color = COLOR;
		}
			
			
	}	
			

	public double precioFinal() { //según el consumo energético  y el tamaño aumenta el precio
		
		double deltaPeso = 0; 
		
		if (peso <= 0 && peso <= 19) {
		
			deltaPeso = 10; 
								
		}else if(peso <= 20 && peso <= 49){
			
			deltaPeso = 50;
			
		}else if(peso <= 50 && peso <= 79){
			
			deltaPeso = 80; 
			
		}else if(peso <= 80){
			
			deltaPeso = 100; 
			
		}
		
		double deltaConsumo = 0; //incremento de precio por tipo de consumo energético
		
		
		switch(consumoEnergetico) { 
		  case 'A':
			deltaConsumo = 100;
		    break;
		  case 'B':
			deltaConsumo = 80;
		    break;
		  case 'C':
			deltaConsumo = 60;
			break;
		  case 'D':
			deltaConsumo = 50;
			break;
		  case 'E':
			deltaConsumo = 30;
			break;
		  case 'F':
			deltaConsumo = 10;
			break;
		  default:
		}
		
		
		
		//calcula final
			
		double precioFinal = precioBase + deltaPeso + deltaConsumo; 
		
	
		return precioFinal; 
		
		
				
	}
	
}
