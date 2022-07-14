package com.xmen.servicio;

import org.springframework.stereotype.Component;

@Component
public class Operacion {

	public int conteoSecuencia(String[] dna) {
		int axu_f2 = 0;
		int fila_array = 0;
		int cont_secuencias = 0;

		int cont_L1 = 0;
		int cont_L2 = 0;
		int cont_L3 = 0;
		int cont_L4 = 0;

		int cont1 = 0;
		int cont2 = 0;
		int cont3 = 0;
		int cont4 = 0;

		int cont_c1 = 0;
		int cont_c2 = 0;

		for (String fila : dna) {
			for (int col_array = 0; col_array < fila.length(); col_array++) {
				for (String array_copia : dna) {

					if (axu_f2 >= fila_array) {

						for (int col_dna = 0; col_dna < array_copia.length(); col_dna++) {

							// HORIZONTAL
							if ((fila.charAt(col_array) == 'A' && array_copia.charAt(col_dna) == 'A') || (fila.charAt(col_array) == 'C' && array_copia.charAt(col_dna) == 'C') || (fila.charAt(col_array) == 'T' && array_copia.charAt(col_dna) == 'T') || (fila.charAt(col_array) == 'G' && array_copia.charAt(col_dna) == 'G')) {
								if (fila_array == axu_f2 && col_array == col_dna) {
									cont_L1 = 1;
									cont1 = col_array + 1;
								} else if (fila_array == axu_f2 && cont1 == col_dna) {
									cont_L1++;
									cont1++;
								}
								
								if (cont_L1 == 4) {
									cont_L1 = 0;
									cont1 = 0;
									cont_secuencias++;
								}
							}

							// VERTICAL
							if (fila.charAt(col_array) == 'G' && array_copia.charAt(col_dna) == 'G') {
								if (fila_array == axu_f2 && col_array == col_dna) {
									cont_L2 = 1;
									cont2 = axu_f2 + 1;
								}

								if (col_array == col_dna && cont2 == axu_f2) {
									cont_L2++;
									cont2++;
								}
								
								if (cont_L2 == 4) {
									cont_L2 = 0;
									cont2 = 0;
									cont_secuencias++;
								}
							}

							// DIAGONAL DERECHA
							if (fila.charAt(col_array) == 'A' && array_copia.charAt(col_dna) == 'A') {
								if (fila_array == axu_f2 && col_array == col_dna) {
									cont_L3 = 1;
									cont3 = axu_f2 + 1;
									cont_c1 = col_dna + 1;
								}

								if (cont_c1 == col_dna && cont3 == axu_f2) {
									cont_L3++;
									cont3++;
									cont_c1++;
								}
								
								if (cont_L3 == 4) {
									cont_L3 = 0;
									cont3 = 0;
									cont_c1 = 0;
									cont_secuencias++;
								}
							}

							// DIAGONAL IZQUIERDA
							if (fila.charAt(col_array) == 'T' && array_copia.charAt(col_dna) == 'T') {
								if (fila_array == axu_f2 && col_array == col_dna) {
									cont_L4 = 1;
									cont4 = axu_f2 + 1;
									cont_c2 = col_dna - 1;
								}

								if (cont_c2 == col_dna && cont4 == axu_f2 && cont4 > -1 && cont_c2 > -1) {
									cont_L4++;
									cont4++;
									cont_c2--;
								}
								
								if (cont_L4 == 4) {
									cont_L4 = 0;
									cont4 = 0;
									cont_c2 = 0;
									cont_secuencias++;
								}

							}
						}

					}
					axu_f2++;
				}
				axu_f2 = 0;
			}
			fila_array++;
		}

		return cont_secuencias;
	}

}
