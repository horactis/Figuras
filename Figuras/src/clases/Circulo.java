package clases;

public class Circulo {
	private int radio;
	/**
	 * Crea un circulo con un radio de 1 metro
	 */
	public Circulo() {
		this.radio = 1;
	}
	
	/**
	 * Crea un circulo con el radio especificado
	 * 
	 * @param radio		el radio en metros
	 */
	public Circulo(int radio) {
		this.radio = radio;
	}
	
	/**
	 * Calcula el area del circulo en metros
	 * 
	 * @return		el area en metros cuadrados
	 */
	public double area() {
		radio = radio*2;
		return (double) (Math.round(Math.PI*radio)* 100.0) /100.0;
	}
	
	/**
	 * Calcula el perimetro del circulo en metros
	 * 
	 * @return 		el perimetro en metros cuadrados
	 */
	public double perimetro() {
		return (double) (Math.round(2*Math.PI*radio)* 100.0) /100.0;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}
	
	
}
