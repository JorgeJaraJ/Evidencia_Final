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

public class Paciente {
	
		
		private String id;
		private String nombre;
		private String apellidos;
		
		public String generaLineaCSV() {
	    	  return String.format("%s;%s;%s;%s\n", id, nombre, apellidos);  
		}
		
		
		public Paciente(String id, String nombre, String apellidos) {
			this.id = id;
			this.nombre = nombre;
			this.apellidos = apellidos;

}
}
