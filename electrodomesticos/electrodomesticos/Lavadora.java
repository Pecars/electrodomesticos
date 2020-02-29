package electrodomesticos;

public class Lavadora extends Electrodomestico {
	
	/**
	 * @author Paula Carrasco
	 *  version 1.0
	 * @param precioBase, peso, carga, color, consumoEnergetico, precioLavadora
	 */

	private int carga; 
	private final static int CARGA =5; 
	
	
	
	
	public Lavadora() {//constructor por defecto
		super(PRECIO_BASE, PESO, CONSUMO_ENERGETICO, COLOR);
		this.precioBase = PRECIO_BASE;
		this.peso = PESO;
		this.consumoEnergetico= super.CONSUMO_ENERGETICO;
		this.color = super.COLOR;
		this.carga = CARGA;
	}

	
	public Lavadora(double precioBase, double peso) {//constructor precio y peso, resto por defecto
		super(precioBase, peso);
		this.peso = peso; 
		this.precioBase = precioBase;
		this.consumoEnergetico= super.CONSUMO_ENERGETICO;
		this.color = super.COLOR;
		this.carga = CARGA;
		
		
		
	}
	
	public Lavadora(double precioBase, double peso, char consumoEnergetico, 
			String color, int carga) { //constructor con carga y resto de atributos
		super(precioBase, peso, consumoEnergetico, color);
		this.carga= carga;

	}
	
	public int getCarga() {
		return carga;
	}


	
	public double precioFinal() {
		
		double precioLavadora = super.precioFinal();
		
		if (carga > 30) {
			
			precioLavadora = precioLavadora + 50;
		}
		
		return precioLavadora;
		
		
	}
}
