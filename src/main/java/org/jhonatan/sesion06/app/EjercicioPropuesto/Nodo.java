package org.jhonatan.sesion06.app.EjercicioPropuesto;

/**
 *
 * @author Jhonatan
 */
public class Nodo {

    private Empleado empleado;
    public Nodo siguiente;

    //constructor para insertar al inicio
    public Nodo(Empleado empleado, Nodo nodo) {
        this.empleado = empleado;
        siguiente = nodo;
    }

    public Empleado getEmpleado() {
        return empleado;
    }
}
