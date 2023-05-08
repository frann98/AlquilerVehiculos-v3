package org.iesalandalus.programacion.alquilervehiculos.vista.grafica.controladores;

import org.iesalandalus.programacion.alquilervehiculos.vista.grafica.utilidades.Controlador;
import org.iesalandalus.programacion.alquilervehiculos.vista.grafica.utilidades.Controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MenuPrincipal extends Controlador {

	@FXML
	private Button btBuscarAlquiler;

	@FXML
	private Button btBuscarCliente;

	@FXML
	private Button btBuscarVehiculo;

	@FXML
	private Button btEliminarAlquiler;

	@FXML
	private Button btEliminarCliente;

	@FXML
	private Button btEliminarVehiculo;

	@FXML
	private Button btInsertCliente;

	@FXML
	private Button btInsertarAlquiler;

	@FXML
	private Button btInsertarVehiculo;

	@FXML
	private Button btListarAlquiler;

	@FXML
	private Button btListarClientes;

	@FXML
	private Button btListarVehiculo;

	@FXML
	private Button btModificarCliente;

	@FXML
	private Button btMostrarEstadisticas;

	@FXML
	void buscarAlquiler(ActionEvent event) {

	}

	@FXML
	void buscarCliente(ActionEvent event) {

	}

	@FXML
	void buscarVehiculo(ActionEvent event) {

	}

	@FXML
	void eliminarAlquiler(ActionEvent event) {

	}

	@FXML
	void eliminarCliente(ActionEvent event) {

	}

	@FXML
	void eliminarVehiculo(ActionEvent event) {

	}

	@FXML
	void insertarAlquiler(ActionEvent event) {

	}

	@FXML
	void insertarCliente(ActionEvent event) {

		System.out.println("Aqui se insertarían clientes");

	}

	@FXML
	void insertarVehiculo(ActionEvent event) {

	}

	@FXML
	void listarAlquiler(ActionEvent event) {

	}

	@FXML
	void listarCliente(ActionEvent event) {

	}

	@FXML
	void listarVehiculos(ActionEvent event) {

	}

	@FXML
	void modificarCliente(ActionEvent event) {

	}

	@FXML
	void mostrarEstadisticasMensuales(ActionEvent event) {

	}

	@FXML
	void mostrarInfoAutor(ActionEvent event) {

		AcercaDe mp = (AcercaDe) Controladores.get("vistas/AcercaDe.fxml", "Informacion del autor", null);

		mp.getEscenario().show();

	}

	@FXML
	void salir(ActionEvent event) {

	}

}
