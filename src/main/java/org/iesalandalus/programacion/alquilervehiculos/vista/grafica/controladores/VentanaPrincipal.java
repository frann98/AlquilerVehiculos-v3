package org.iesalandalus.programacion.alquilervehiculos.vista.grafica.controladores;

import org.iesalandalus.programacion.alquilervehiculos.vista.grafica.utilidades.Controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class VentanaPrincipal extends Controlador{

	@FXML
	private Button btPulsame;

	@FXML
	void saludar(ActionEvent event) {

		System.out.println("Hola");

	}

}
