package org.hmis.sesion05.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TestEjercicio1 {
	
	@ParameterizedTest  (name = "{index} => Transformar {0} da {1}")
	@CsvSource({"4, 1",
				"9, 1",
				"25, 1"})
	
	void test1(int input, int expected) {
		// Arrange
		Ejercicio1 e1 = new Ejercicio1();
		// Act
		int resultado = e1.transformar(input);
		// Assert
		assertEquals(expected, resultado);
	}
	
}