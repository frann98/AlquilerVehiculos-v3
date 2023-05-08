package org.iesalandalus.programacion.alquilervehiculos.vista.grafica;

import org.iesalandalus.programacion.alquilervehiculos.vista.Vista;

public class VistaGrafica extends Vista {

	// private Controlador controlador;

	private static final VistaGrafica instancia = new VistaGrafica();

	private VistaGrafica() {

	}

	public static VistaGrafica getInstancia() {

		return instancia;

	}

	@Override
	public void comenzar() {
		LanzadorPrincipal.comenzar();

	}

	@Override
	public void terminar() {
		System.out.println("Adios!");

	}

}
