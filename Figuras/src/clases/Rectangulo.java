package clases;

/**
 * Clase para crear el rectangulo
 * 
 * @author Alejandro
 */
public class Rectangulo {
	private int base;
	private int altura;
	
	/**	
	 * Crea un rectangulo con la base y la altura especificada
	 * 
	 * @param base		la base en metros{

	 * @param altura	la altura en metros
	 */
	public Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}
	/**
	 * Crea un rectangulo con una base y una altura de 1 metro
	 */
	public Rectangulo() {
		this.base = 1;
		this.altura = 1;
	}
	/**
	 * Calcula el perimetro del rectangulo en metros
	 * 
	 * @return		el perimetro en metros
	 */
	public int perimetro() {
		return 2*base + 2*altura;
	}
	
	/**
	 * Calcula el area del rectangulo en metros cuadrados
	 * 
	 * @return		el area en metros cuadrados
	 */
	public int area() {
		return base*altura;
	}
	
	public int getBase() {
		return base;
	}
	
	public void setBase(int base) {
		this.base = base;
	}
	
	public int getAltura() {
		return altura;
	}
	
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + "]";
	}
	
	
}
