package org.hmis.sesion05.ejercicio4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class TestEjercicio4 {
	
	@ParameterizedTest
	@CsvFileSource(resources = "../../../../suspensos.csv", numLinesToSkip = 1, delimiter = ';')
	void testSuspensos(String nota) {
		// Arrange
		Ejercicio4 e4 = new Ejercicio4();
		ArrayList<String> notas = new ArrayList<String>();
		notas.add(nota);
		// Act
		e4.calculaCalificaciones(notas);
		// Assert
		assertEquals("Suspenso", e4.calificaciones.get(0));
	}
	
	@ParameterizedTest
	@CsvFileSource(resources = "../../../../aprobados.csv", numLinesToSkip = 1, delimiter = ';')
	void testAprobados(String nota) {
		// Arrange
		Ejercicio4 e4 = new Ejercicio4();
		ArrayList<String> notas = new ArrayList<String>();
		notas.add(nota);
		// Act
		e4.calculaCalificaciones(notas);
		// Assert
		assertEquals("Aprobado", e4.calificaciones.get(0));
	}
	
	@ParameterizedTest
	@CsvFileSource(resources = "../../../../notables.csv", numLinesToSkip = 1, delimiter = ';')
	void testNotables(String nota) {
		// Arrange
		Ejercicio4 e4 = new Ejercicio4();
		ArrayList<String> notas = new ArrayList<String>();
		notas.add(nota);
		// Act
		e4.calculaCalificaciones(notas);
		// Assert
		assertEquals("Notable", e4.calificaciones.get(0));
	}
	
	@ParameterizedTest
	@CsvFileSource(resources = "../../../../sobresalientes.csv", numLinesToSkip = 1, delimiter = ';')
	void testSobresalientes(String nota) {
		// Arrange
		Ejercicio4 e4 = new Ejercicio4();
		ArrayList<String> notas = new ArrayList<String>();
		notas.add(nota);
		// Act
		e4.calculaCalificaciones(notas);
		// Assert
		assertEquals("Sobresaliente", e4.calificaciones.get(0));
	}
	
	@ParameterizedTest
	@CsvFileSource(resources = "../../../../matriculas.csv", numLinesToSkip = 1, delimiter = ';')
	void testMatriculas(String nota) {
		// Arrange
		Ejercicio4 e4 = new Ejercicio4();
		ArrayList<String> notas = new ArrayList<String>();
		notas.add(nota);
		// Act
		e4.calculaCalificaciones(notas);
		// Assert
		assertEquals("Matricula", e4.calificaciones.get(0));
	}
	
	@ParameterizedTest
	@CsvFileSource(resources = "../../../../errores.csv", numLinesToSkip = 1, delimiter = ';')
	void testErrores(String nota) {
		// Arrange
		Ejercicio4 e4 = new Ejercicio4();
		ArrayList<String> notas = new ArrayList<String>();
		notas.add(nota);
		// Act
		e4.calculaCalificaciones(notas);
		// Assert
		assertEquals("Error en la nota", e4.calificaciones.get(0));
	}
	
	@ParameterizedTest
	@CsvFileSource(resources = "../../../../aleatorio.csv", numLinesToSkip = 1, delimiter = ';')
	void testAleatorio(String nota, String expected) {
		// Arrange
		Ejercicio4 e4 = new Ejercicio4();
		ArrayList<String> notas = new ArrayList<String>();
		notas.add(nota);
		// Act
		e4.calculaCalificaciones(notas);
		// Assert
		assertEquals(expected, e4.calificaciones.get(0));
	}
}
