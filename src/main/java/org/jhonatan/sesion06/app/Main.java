package org.jhonatan.sesion06.app;

import org.jhonatan.sesion06.app.Ejercicio01RegistroEmpleados.frmEmpleados;
import org.jhonatan.sesion06.app.EjercicioPropuesto.frmRegistro;

/**
 *
 * @author Jhonatan
 */
public class Main {

    /*
    Ejercicio 01:
    Construya una aplicación que permita realizar el registro de empleados
    donde se podrá guardar, mostrar, consultar, actualizar 
    y eliminar el registro de empleado. Para todas estas 
    operaciones considere el ingreso del código del empleado
     */
    public static void main(String[] args) {
        System.out.println("Hola Java!");
        //ejercicioEmpleados();
        ejercicioPropuesto();
    }

    public static void ejercicioEmpleados() {
        frmEmpleados ventana = new frmEmpleados();
        ventana.setVisible(true);
    }

    public static void ejercicioPropuesto() {
        frmRegistro O = new frmRegistro();
        O.setVisible(true);
    }
}
