/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.evidencia_final_java;

/**
 *
 * @author jorgejarajuarez
 */
import javax.swing.JOptionPane;


public class Doctor {

    private String id;
    private String nombre;
    private String apellidos;
    private String especialidad;

    public Doctor(String id, String nombre, String apellidos, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.especialidad = especialidad;
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * Muestra por panel todos los datos del doctor
     */
    public void mostrar() {
        String mensaje = "ID doctor: " + id + "\nNombre: " + nombre
                + "\nApellidos: " + apellidos + "\nEspecialidad: " + especialidad;
        JOptionPane.showMessageDialog(null, mensaje, "Mostrar doctor", JOptionPane.INFORMATION_MESSAGE);
    }

		
		public String generaLineaCSV() {
	    	  return String.format("%s;%s;%s;%s\n", id, nombre, apellidos);  
		}

}
