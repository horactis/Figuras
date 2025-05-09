package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Rectangulo;

class TestRectangulo {

	@Test
	void testPerimetro() {
		Rectangulo r = new Rectangulo(1,2);
		int perimetroEsperado = 6;
		int perimetroObtenido = r.perimetro();
		assertEquals(perimetroEsperado, perimetroObtenido);
	}

	@Test
	void testArea() {
		Rectangulo r = new Rectangulo(2,2);
		int areaEsperado = 4;
		int areaObtenido = r.area();
		assertEquals(areaEsperado, areaObtenido);
	}

}
