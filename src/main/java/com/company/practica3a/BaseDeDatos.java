/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.practica3a;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nunez
 */
public class BaseDeDatos {
    private List<AtencionVisual> datosPrueba;
    private List<AtencionVisual> datoseEntrenamiento;
    private Archivo archivo;

    public BaseDeDatos() throws FileNotFoundException, IOException {
        datosPrueba = new ArrayList<>();
        datoseEntrenamiento = new ArrayList<>();
        archivo = new Archivo();
        inicializarDatos();
    }
    private void inicializarDatos() throws IOException{
        
        List<String[]> prueba;
        List<String[]> entrenamiento;
        prueba = archivo.leerArchivoCSVPrueba();
        entrenamiento = archivo.leerArchivoCSVEntrenamiento();
        
        for (int i = 1; i <prueba.size(); i++) {
            datosPrueba.add(new AtencionVisual(Float.parseFloat(prueba.get(i)[0]), Float.parseFloat(prueba.get(i)[1]), Float.parseFloat(prueba.get(i)[2]), Float.parseFloat(prueba.get(i)[3]), Integer.parseInt(prueba.get(i)[4])));
        }
        for (int i = 1; i <entrenamiento.size(); i++) {
            datoseEntrenamiento.add(new AtencionVisual(Float.parseFloat(entrenamiento.get(i)[0]), Float.parseFloat(entrenamiento.get(i)[1]), Float.parseFloat(entrenamiento.get(i)[2]), Float.parseFloat(entrenamiento.get(i)[3]), Integer.parseInt(entrenamiento.get(i)[4])));
        }
        
    }

    public List<AtencionVisual> getDatosPrueba() {
        return datosPrueba;
    }

    public List<AtencionVisual> getDatoseEntrenamiento() {
        return datoseEntrenamiento;
    }

    
    public void imprimirDatosPrueba(){
        System.out.println("Datos prueba");
        for (AtencionVisual dp : datosPrueba) {
            System.out.println(""+dp);
        }
    }
    public void imprimirDatosEntrenamiento(){
        System.out.println("Datos de entrenamiento");
        for (AtencionVisual de : datoseEntrenamiento) {
            System.out.println(""+de);
        }
    }
}
