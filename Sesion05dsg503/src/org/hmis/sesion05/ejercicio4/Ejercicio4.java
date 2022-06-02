package org.hmis.sesion05.ejercicio4;

import java.util.ArrayList;

public class Ejercicio4 {
	
	ArrayList<Double> notas = new ArrayList<Double>();
	ArrayList<String> calificaciones = new ArrayList<String>();

	public void calculaCalificaciones(ArrayList<String> notas) {
		for(int i = 0; i < notas.size(); i++) {	
			calificaciones.add(calificacion(Double.parseDouble(notas.get(i).replace(',', '.'))));
		}
	}

	public String calificacion(Double nota) {
		if (nota < 0 || nota > 10) {
			return new String("Error en la nota");
		}else if(nota <= 4.9) {
			return new String("Suspenso");
		}else if(nota <= 6.9) {
			return new String("Aprobado");
		}else if(nota <= 8.9) {
			return new String("Notable");
		}else if(nota <= 9.9) {
			return new String("Sobresaliente");
		}else{
			return new String("Matricula");
		}
	}

}
