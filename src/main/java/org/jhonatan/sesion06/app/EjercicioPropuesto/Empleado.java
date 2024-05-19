package org.jhonatan.sesion06.app.EjercicioPropuesto;

import javax.swing.JTextArea;

/**
 *
 * @author Jhonatan
 */
/*
 * Ejercicio:
 * Construya un programa que guarde en una lista simple enlazada, la siguiente
 * información de los empleados
 * de una Compañía: Código, Nombre, Tipo de Contrato (A plazo fijo, Servicios No
 * personales y Service),
 * sueldo, monto asignado por movilidad y minutos de tardanza y permita mostrar
 * la siguiente información:
 * 
 * a) Número de empleados con más de una 15 minutos de tardanzas.
 * b) Nombre del empleado con el mayor tiempo de tardanzas y que tenga un tipo
 * de contrato por Services.
 * c) El mayor monto de movilidad asignado a un empleado con contrato a Plazo
 * Fijo con un sueldo menor a 1500 soles.
 * 
 * Su programa también tendrá la opción de consultar, actualizar y eliminar
 * registros.
 */
public class Empleado {

    private int codigo;
    private String nombre;
    private String tipoContrato;
    private float sueldo;
    private float asigancionPorMovilidad;
    private int minutosTardanza;

    public Empleado(int codigo, String nombre, String tipoContrato, float sueldo, float asigancionPorMovilidad,
            int minutosTardanza) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipoContrato = tipoContrato;
        this.sueldo = sueldo;
        this.asigancionPorMovilidad = asigancionPorMovilidad;
        this.minutosTardanza = minutosTardanza;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public float getAsigancionPorMovilidad() {
        return asigancionPorMovilidad;
    }

    public void setAsigancionPorMovilidad(float asigancionPorMovilidad) {
        this.asigancionPorMovilidad = asigancionPorMovilidad;
    }

    public int getMinutosTardanza() {
        return minutosTardanza;
    }

    public void setMinutosTardanza(int minutosTardanza) {
        this.minutosTardanza = minutosTardanza;
    }
}
