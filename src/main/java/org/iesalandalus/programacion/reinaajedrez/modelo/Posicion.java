package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Posicion {
	
	private int fila;
	private char columna;
	
	
	public int getFila() {
		return fila;
	}
	
	private void setFila(int fila) {
		if (fila >= 1 && fila <= 8) {
			this.fila = fila;
		} else {
			throw new IllegalArgumentException("El valor de la fila no esta permitido.");
		}
		
	}
	
	public char getColumna() {
		return columna;
	}
	
	private void setColumna(char columna) {
		if (columna <= 'a' && columna >= 'h') {
			this.columna = columna;
		} else {
			throw new IllegalArgumentException("El valor de la columna no esta permitido.");
		}
		
	}
	
	public Posicion(int fila, char columna) {
		
	}

}
