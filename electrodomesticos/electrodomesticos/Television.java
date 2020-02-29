package electrodomesticos;

/**
 * @author Paula Carrasco
 *  version 1.0
 * @param resolucion, precioBase, peso, color, sintonizador
 */

public class Television extends Electrodomestico {
	
	private final static double RESOLUCION = 20;
	private final static boolean SINTONIZADOR = false;
	double resolucion;
	boolean sintonizador;
	
	
	public Television() { // Constructor por defecto
		super(PRECIO_BASE, PESO, CONSUMO_ENERGETICO, COLOR);
		
		this.precioBase = super.PRECIO_BASE;
		this.peso = super.PESO;
		this.consumoEnergetico= super.CONSUMO_ENERGETICO;
		this.color = super.COLOR;
		this.sintonizador = SINTONIZADOR;
		this.resolucion = RESOLUCION;
		
		
	}
	
	
	public Television(double precioBase, double peso, char consumoEnergetico, String color, boolean sintonizador, double resolucion) {//constructor precio y peso, resto por defecto
		super(precioBase, peso);
		this.precioBase = precioBase;
		this.peso = peso;
		this.consumoEnergetico= super.CONSUMO_ENERGETICO;
		this.color = super.COLOR;
		this.sintonizador = SINTONIZADOR;
		this.resolucion = RESOLUCION;
		
	}
	
	public Television(boolean sintonizador, double resolucion) {//constructor con sintonizador y resolucion, resto heredado
		super(PRECIO_BASE, PESO, CONSUMO_ENERGETICO, COLOR);
		
		this.precioBase = super.PRECIO_BASE;
		this.peso = super.PESO;
		this.consumoEnergetico= super.CONSUMO_ENERGETICO;
		this.color = super.COLOR;
		this.sintonizador = sintonizador;
		this.resolucion = resolucion;
		
		
			
	}

	public double getResolucion() {
		return resolucion;
	}

	public boolean isSintonizador() {
		return sintonizador;
	}
	
	public double precioFinal() {
		
		double precioTelevision = super.precioFinal();
		
		if (resolucion > 40) {
			
	
			double porcentajeIncremento = 0.3;
			precioTelevision = precioTelevision * porcentajeIncremento;
						
			if (sintonizador == true) {
				
				precioTelevision = precioTelevision + 50;
			}
		}
		
		return precioTelevision;
			
	}
	
	
		

		
}
