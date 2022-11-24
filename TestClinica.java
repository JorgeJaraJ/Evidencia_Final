/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.evidencia_final_java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class TestClinica {
	
	private static ArrayList<Administrador> administradores = new ArrayList<Administrador>();
	private static final Scanner teclado = new Scanner(System.in);
	static GestorPacientes pacientes = new GestorPacientes();
	static GestorCita citas = new GestorCita();
	static GestorDoctor doctores = new GestorDoctor();
	

	public static void main(String[] args) {
		
		crearAdmins();
		
		if (validarAcceso()) {
	         System.out.println("\nUsuario autorizado\n");
	         doctores.nuevoDoctor();
	         doctores.modificarDoctor();
	         doctores.mostrarDoctores();
	         pacientes.nuevoPaciente();
	         pacientes.mostrarPacientes();
	         pacientes.modificarPaciente();
	         pacientes.borrarPaciente();
	         citas.nuevoCita();
	         citas.mostrarCitas();
	         doctores.crearCSV();
	         citas.crearCSV();
	         pacientes.crearCSV();
	      }
	      else
	         System.out.println("\nUsuario no autorizado.");

	      System.out.println("\t\tFIN DE PROGRAMA");

	   }

    private static boolean validarAcceso() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void crearAdmins() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}