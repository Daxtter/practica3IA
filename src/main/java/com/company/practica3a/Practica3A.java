/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.company.practica3a;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nunez
 */
public class Practica3A {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
       BaseDeDatos dataset = new BaseDeDatos();
       dataset.imprimirDatosEntrenamiento();
       dataset.imprimirDatosPrueba();
        
        
    }
}
