package org.iesalandalus.programacion.alquilervehiculos.controlador;

import java.util.List;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.alquilervehiculos.modelo.Modelo;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Alquiler;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Cliente;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Vehiculo;
import org.iesalandalus.programacion.alquilervehiculos.vista.Vista;
import org.iesalandalus.programacion.alquilervehiculos.vista.texto.Consola;

public class Controlador {

	private Modelo modelo;
	private Vista vista;

	public Controlador(Modelo modelo, Vista vista) {

		if (modelo == null) {

			throw new NullPointerException("El modelo no puede ser nulo");

		}

		this.modelo = modelo;

		if (vista == null) {

			throw new NullPointerException("La vista no puede ser nula");

		}

		this.vista = vista;
		vista.setControlador(this);

	}

	public void comenzar() {

		modelo.comenzar();
		vista.comenzar();

	}

	public void terminar() {

		modelo.terminar();
		vista.terminar();

	}

	public void insertarCliente() throws OperationNotSupportedException {

		modelo.insertar(Consola.leerCliente());

	}

	public void insertarVehiculo() throws OperationNotSupportedException {

		modelo.insertar(Consola.leerVehiculo());

	}

	public void insertarAlquiler() throws OperationNotSupportedException {

		modelo.insertar(Consola.leerAlquiler());

	}

	public Cliente buscarCliente(Cliente cliente) {

		return modelo.buscar(cliente);

	}

	public Vehiculo buscarVehiculo(Vehiculo vehiculo) {

		return modelo.buscar(vehiculo);

	}

	public Alquiler buscarAlquiler(Alquiler alquiler) {

		return modelo.buscar(alquiler);

	}

	public void modificarCliente() throws OperationNotSupportedException {

		modelo.modificar(Consola.leerClienteDni(), Consola.leerNombre(), Consola.leerTelefono());

	}

	public void devolverAlquilerCliente() throws OperationNotSupportedException {

		modelo.devolver(Consola.leerClienteDni(), Consola.leerFechaDevolucion());

	}

	public void devolverAlquilerVehiculo() throws OperationNotSupportedException {

		modelo.devolver(Consola.leerVehiculoMatricula(), Consola.leerFechaDevolucion());

	}

	public void borrarCliente() throws OperationNotSupportedException {

		modelo.borrar(Consola.leerClienteDni());

	}

	public void borrarVehiculo() throws OperationNotSupportedException {

		modelo.borrar(Consola.leerVehiculoMatricula());

	}

	public void borrarAlquiler() throws OperationNotSupportedException {

		modelo.borrar(Consola.leerAlquiler());

	}

	public List<Cliente> getClientes() {

		return modelo.getListaClientes();

	}

	public List<Vehiculo> getVehiculos() {

		return modelo.getListaVehiculos();

	}

	public List<Alquiler> getAlquileres() {

		return modelo.getListaAlquileres();

	}

	public List<Alquiler> getAlquileres(Cliente cliente) {

		return modelo.getListaAlquileres(cliente);

	}

	public List<Alquiler> getAlquileres(Vehiculo vehiculo) {

		return modelo.getListaAlquileres(vehiculo);

	}

}
