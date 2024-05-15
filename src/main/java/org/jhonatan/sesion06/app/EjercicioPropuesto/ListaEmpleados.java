package org.jhonatan.sesion06.app.EjercicioPropuesto;

/**
 *
 * @author Jhonatan
 */
public class ListaEmpleados {

    //punteros
    protected Nodo inicio, fin;

    //constructor
    public ListaEmpleados() {
        this.inicio = null;
        this.fin = null;
    }

    //metodo para agregar al inicio;
    public void agregarInicio(Empleado empleado) {
        inicio = new Nodo(empleado, inicio);
        if (fin == null) {
            fin = inicio;
        }
        System.out.println("Registrado");
    }

    public boolean estaVacia() {
        return inicio == null;
    }

    public boolean eliminarEmpleadoEspecifico(String nombre) {

        boolean encontrado = false;
        if (!estaVacia()) {
            //cuando hay un solo nodo
            if (inicio == fin && nombre.equals(inicio.getEmpleado().getNombre())) {
                inicio = null;
                fin = null;
                encontrado = true;
            } else if (nombre.equals(inicio.getEmpleado().getNombre())) { // minimo tenemos dos nodos
                inicio = inicio.siguiente;
                encontrado = true;
            } else {
                //tenemos mas de dos nodos
                Nodo anterior, temporal;
                anterior = inicio;
                temporal = inicio.siguiente;

                while (temporal != null && !temporal.getEmpleado().getNombre().equals(nombre)) {
                    anterior = anterior.siguiente;
                    temporal = temporal.siguiente;
                }

                if (temporal != null) {
                    anterior.siguiente = temporal.siguiente;
                    if (temporal == fin) {
                        fin = anterior;
                    }
                    encontrado = true;
                }
            }
        }
        return encontrado;
    }

    
}
