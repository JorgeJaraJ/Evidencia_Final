/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.evidencia_final_java;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author jorgejarajuarez
 */
public class GestorDoctor {


    private ArrayList<Doctor> doctores;

    public void crearCSV() {

        File archivo = new File("C:\\Users\\Emeth.Paredes\\IdeaProjects\\EvidenciaFinal\\src");

        try {
            //Si no existe archivo, intentamos crearlo
            boolean primeraVez = false;
            if (!archivo.exists()) {
                File carpeta = archivo.getParentFile();
                carpeta.mkdirs();
                archivo.createNewFile();
                primeraVez = true; //Primera vez que trabajamos en este archivo
            }

            FileWriter escritor = new FileWriter(archivo, true);
            //Cabecera para datos del CSV, solo si es la primera vez
            if (primeraVez)
                escritor.append("#ID;Nombre;Apellidos;Especialidad\n");

            //Datos del último Doctor registrado
            int ultimo = doctores.size() - 1;
            escritor.append(doctores.get(ultimo).generaLineaCSV());//Insertamos linea CSV

            escritor.close();
        } catch (IOException e) {
            System.out.println("Error de acceso a: " + archivo.getAbsolutePath());
        }
    }

    void nuevoDoctor() {
       Scanner teclado = new Scanner(System.in);
        System.out.println("\nALTA NUEVO DOCTOR");
        System.out.println("---- ----- ------\n");
        System.out.print("ID: ");
        String id = teclado.nextLine();
        System.out.print("Nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Apellidos: ");
        String apell = teclado.nextLine();
        System.out.print("Especialidad: ");
        String espe = teclado.nextLine();

        doctores.add(new Doctor(id, nombre, apell, espe));
        crearCSV(); //Añadimos nueva línea CSV al archivo en disco
    }    

    void modificarDoctor() {
       Scanner teclado = new Scanner(System.in);
        System.out.println("\nALTA NUEVO DOCTOR");
        System.out.println("---- ----- ------\n");
        System.out.print("ID: ");
        String id = teclado.nextLine();
        System.out.print("Nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Apellidos: ");
        String apell = teclado.nextLine();
        System.out.print("Especialidad: ");
        String espe = teclado.nextLine();
    }

    void mostrarDoctores() {
               Scanner teclado = new Scanner(System.in);
        System.out.println("\nALTA NUEVO DOCTOR");
        System.out.println("---- ----- ------\n");
        System.out.print("ID: ");
        String id = teclado.nextLine();
        System.out.print("Nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Apellidos: ");
        String apell = teclado.nextLine();
        System.out.print("Especialidad: ");
        String espe = teclado.nextLine();
    }
}
