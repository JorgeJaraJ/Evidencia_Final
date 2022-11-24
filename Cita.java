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

public final class Cita {

	private String id;
	private String fecha;
	private String hora;
	private String motivo;
	private Doctor doctor;
	private Paciente paciente;

    Cita(String id, String fecha, String hora) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
	
	public String generaLineaCSV() {
  	  return String.format("%s;%s;%s;%s;%s;%s\n", id, fecha, hora, motivo, doctor, paciente);  
	}
	
	public Cita(String id, String fecha, String hora, String motivo, Doctor doctor, Paciente paciente) {
		this.id = id;
		this.fecha = fecha;
		this.hora = hora;
		this.motivo = motivo;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	
	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	
	/**
	 * Muestra por panel todos los datos de la cita
	 */
	public void mostrar() {
		String mensaje = "\nid cita: " + id + "\nFecha: " + fecha
				+ "\nHora: " + hora + "\nMotivo: " + motivo;
		JOptionPane.showMessageDialog(null, mensaje, "Mostrar Cita", JOptionPane.INFORMATION_MESSAGE);
	}
}
