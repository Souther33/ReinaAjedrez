package org.iesalandalus.programacion.reinaajedrez;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;

public class MainApp {
	
	private static Reina reina;
	
	public static void main(String[] args) {
		
		
		int opcionElegida;
		
		do {
			Consola.mostrarMenu();
				opcionElegida = Consola.elegirOpcionMenu();
				
				MainApp.ejecutarOpcion(opcionElegida);
			
		}while(opcionElegida != 0);
	}
	
	private static void ejecutarOpcion(int opcionElegida) {
		switch(opcionElegida) {
		
		case 1:
			MainApp.crearReinaDefecto();
			MainApp.mostrarReina();
			break;
		
		case 2:
			MainApp.crearReinaColor();
			MainApp.mostrarReina();
			break;
			
		case 3:
			MainApp.moverReina();
			MainApp.mostrarReina();
			break;
			
		case 4:
			Consola.despedirse();
			break;
		}
	}
	
	private static void crearReinaDefecto() {
		reina = new Reina();
	}
	
	private static void crearReinaColor() {
		reina = new Reina(Consola.elegirColor());
	}
	
	private static void moverReina() {
		try {
			Consola.mostrarMenuDirecciones();
			reina.mover(Consola.elegirDireccion(), Consola.elegirPasos());
		} catch(OperationNotSupportedException e) {
			e.printStackTrace();
		}
		
	}
	
	private static void mostrarReina() {
		System.out.println(reina.toString());
	}
}
