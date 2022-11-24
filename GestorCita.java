/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.evidencia_final_java;

/**
 *
 * @author jorgejarajuarez
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class GestorCita {

    private ArrayList<Cita> citas;

    //Referencias a las instancias de los gestores de doctores y pacientes
    private GestorDoctor doctores;
    private GestorPacientes pacientes;

    public GestorCita(GestorDoctor gestDoc, GestorPacientes gestPaci) {
        citas = new ArrayList<Cita>();
        doctores = gestDoc;
        pacientes = gestPaci;
    }

    GestorCita() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean nuevoCita() {
        String id = JOptionPane.showInputDialog(null, "Introduzca Identificador:", "Nuevo Cita", JOptionPane.QUESTION_MESSAGE);
        String fecha = JOptionPane.showInputDialog(null, "Fecha:", "Nuevo Fecha", JOptionPane.QUESTION_MESSAGE);
        String hora = JOptionPane.showInputDialog(null, "Hora:", "Nuevo Hora", JOptionPane.QUESTION_MESSAGE);
        String motivo = JOptionPane.showInputDialog(null, "Motivo:", "Nuevo Motivo", JOptionPane.QUESTION_MESSAGE);
        String iDdoctor = JOptionPane.showInputDialog(null, "ID del Doctor:", "Nuevo Doctor", JOptionPane.QUESTION_MESSAGE);
        String iDpaciente = JOptionPane.showInputDialog(null, "ID del Paciente:", "Nuevo Paciente", JOptionPane.QUESTION_MESSAGE);

        //Pedimos los datos a los gestores que tenemos referenciados
        //Doctor doctor = doctores.crearCSV(iDdoctor);
        //Paciente paciente = pacientes.getPaciente(iDpaciente);

        Cita nuevoCita = new Cita(id, fecha, hora);
        return citas.add(nuevoCita);
        //Devuelve TRUE si se insertó correctamente, FALSE si no se pudo insertar
    }

    void mostrarCitas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void crearCSV() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
