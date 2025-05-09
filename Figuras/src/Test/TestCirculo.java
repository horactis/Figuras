package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Circulo;

class TestCirculo {

	@Test
	void testArea() {
		Circulo c = new Circulo(2);
		double areaEsperado = 12.57;
		double areaObtenido = c.area();
		
	}

	@Test
	void testPerimetro() {
		Circulo c = new Circulo(2);
		double perimetroEsperado = 12.57;
		double perimetroObtenido = c.perimetro();
	}

}
