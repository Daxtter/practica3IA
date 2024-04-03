package com.company.practica3a;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nunez
 */

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



/**
 *  Esta clase esta para facilitar el uso del archivo
 * @author nunez
 */
public class Archivo {
    String archivoPrueba;
    String archivoEntrenamiento;
    CSVReader reader;
    String si = "\"";
    //String archCSV;
    
    public Archivo() throws FileNotFoundException
    {
        archivoPrueba = System.getProperty("user.dir") + "\\src\\main\\java\\com\\company\\practica3a\\datosPruebacsv.csv";    
        archivoEntrenamiento = System.getProperty("user.dir") + "\\src\\main\\java\\com\\company\\practica3a\\datosEntrenamiento.csv";    
    } 
    
    
    
    public List<String[]> leerArchivoCSVPrueba() throws IOException
    {
        
        List<String[]>bancoDePalabras = new ArrayList<>();
        
        
        if(existeArchivo(archivoPrueba)){
            try {
           System.out.println("Se leyo");
         
         CSVReader lector = new CSVReader(new FileReader(archivoPrueba));
         bancoDePalabras = lector.readAll();
      } catch (IOException e) {
          e.printStackTrace();
          System.out.println("Error al leer ");
         
      } finally {
         if (null != reader) {
            reader.close();
         } 
      }
        }
        else
        {
            System.out.println("No existe");
        }
        return bancoDePalabras;
    }
    
    
    public List<String[]> leerArchivoCSVEntrenamiento() throws IOException
    {
        
        List<String[]>bancoDePalabras = new ArrayList<>();
        
        
        if(existeArchivo(archivoEntrenamiento)){
            try {
         CSVReader lector = new CSVReader(new FileReader(archivoEntrenamiento));
         bancoDePalabras = lector.readAll();
      } catch (IOException e) {
          e.printStackTrace();
          System.out.println("Error al leer ");
         
      } finally {
         if (null != reader) {
            reader.close();
         } 
      }
        }
        return bancoDePalabras;
    }
    
    
    
    
    public boolean existeArchivo(String ruta)
    {
        File archivo =  new File(ruta);
        return archivo.exists();
    
    
    }
    public void escribirArchivoCSV(String archCSV, List<String[]> valores, String[] cabecera) throws IOException
    {
        
        CSVWriter escribir = new CSVWriter(new FileWriter(archCSV));  
        escribir.writeNext(cabecera);
        escribir.writeAll(valores);
        escribir.close();
        //write all para esribir todo, write next pata arreglos
    
    }
    public void escribirArchivoCSVSinCabecera(String archCSV, List<String[]> valores) throws IOException
    {
        
        CSVWriter escribir = new CSVWriter(new FileWriter(archCSV));  
        //escribir.writeNext(cabecera);
        escribir.writeAll(valores);
        escribir.close();
        //write all para esribir todo, write next pata arreglos
    }
  
}

