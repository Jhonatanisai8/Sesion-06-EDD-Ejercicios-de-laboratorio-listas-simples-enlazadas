package org.jhonatan.sesion06.app.EjercicioPropuesto;

import java.awt.Font;
import javax.swing.JTextArea;

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

    void encabezado(JTextArea txtReporte) {
        txtReporte.setFont(new Font("monospaced", Font.PLAIN, 12));
        txtReporte.setText("");
        txtReporte.append("");
        txtReporte.append("     Código      Nombre y Apellido       Tipo de Contrato        Sueldo      Mont. Movilidad     Minutos tardanza\n");
        txtReporte.append("-------------------------------------------------------------------------------------------------------------------\n");
    }

    public void mostrarLista(JTextArea txtReporte) {
        encabezado(txtReporte);
        String mensaje = "";
        //creamos un nodo auxiliar para recorrer la lista
        Nodo recorrer = inicio;
        while (recorrer != null) {
            mensaje += recorrer.getEmpleado().verDetalle();
            recorrer = recorrer.siguiente;
        }
        txtReporte.append(mensaje + "\n");
    }

    public Nodo buscarNodo(int codigo) {
        Nodo pos = inicio;
        while (pos != null && pos.getEmpleado().getCodigo() != codigo) {
            pos = pos.siguiente;
        }
        return pos;
    }

    /*Nombre del empleado con el mayor tiempo de tardanzas 
    y que tenga un tipo de contrato por Services.*/
    public Nodo empleadoMayorTardanzas() {
        Nodo pos = inicio;
        Nodo posicion = null;
        int mayor = -1;
        while (pos != null) {
            if (pos.getEmpleado().getTipoContrato().equalsIgnoreCase("Services")
                    && pos.getEmpleado().getMinutosTardanza() > mayor) {
                mayor = pos.getEmpleado().getMinutosTardanza();
                posicion = pos;
            }
            pos = pos.siguiente;
        }
        return posicion;
    }

    /*
      El mayor monto de movilidad asignado a un empleado con contrato a Plazo
      Fijo con un sueldo menor a 1500 soles.
     */
    public Nodo mayorMontoPorMovilidad() {
        Nodo pos = inicio;
        Nodo posicion = null;
        float montoMayorMovilidad = -1;
        while (pos != null) {
            if (pos.getEmpleado().getAsigancionPorMovilidad() > montoMayorMovilidad
                    && pos.getEmpleado().getTipoContrato().equalsIgnoreCase("Plazo Fijo")
                    && pos.getEmpleado().getSueldo() < 1500) {
                montoMayorMovilidad = pos.getEmpleado().getAsigancionPorMovilidad();
                posicion = pos;
            }
            pos = pos.siguiente;
        }
        return posicion;
    }

    //Número de empleados con más de una 15 minutos de tardanzas.
    public int empleadosConMasde15Tardanzas() {
        int contador = 0;
        Nodo recorrer = inicio;
        while (recorrer != null) {
            if (recorrer.getEmpleado().getMinutosTardanza() > 15) {
                contador++;
            }
            recorrer = recorrer.siguiente;
        }
        return contador;
    }

}
