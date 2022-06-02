package org.hmis.sesion05.ejercicio5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Ejercicio5 {
	public ArrayList<String> listaOrdenadaEstudiantes(ArrayList<String> A1, ArrayList<String> A2) {
		if (A1 == null || A1.isEmpty()) {
			if (A2 == null || A2.isEmpty()) {
				return new ArrayList<String>();
			}else {
				return A2;
			}
		}else{
			if (A2 == null || A2.isEmpty()) {
				return A1;
			}else {
				A1.addAll(A2);
				Set<String> set = new HashSet<>(A1);
				A1.clear();
				A1.addAll(set);
				A1.sort(null);
				return A1;
			}
		}
	}
}
