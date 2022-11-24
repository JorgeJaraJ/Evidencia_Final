/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.evidencia_final_java;

/**
 *
 * @author jorgejarajuarez
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public final class GestorPacientes {
	
	private ArrayList<Paciente> pacientes;
	
public void crearCSV() {
		
		File archivo = new File("C:/csv/pacientes.csv");
		
		try {
			//Si no existe archivo, intentamos crearlo
			if (!archivo.exists()) {
				File carpeta = archivo.getParentFile();
				carpeta.mkdirs();
				archivo.createNewFile();
			}
			
			FileWriter escritor = new FileWriter(archivo);
			//Cabecera para datos del CSV
			escritor.append("#ID;Nombre;Apellidos\n");
			
			//Datos de los pacientes
			for (Paciente doc: pacientes)
				escritor.append(doc.generaLineaCSV());//Insertamos linea CSV
			
			escritor.close();
		} catch (IOException e) {
			System.out.println("Error de acceso a: " + archivo.getAbsolutePath());
		}
	}

    void nuevoPaciente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void mostrarPacientes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    void borrarPaciente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void modificarPaciente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}