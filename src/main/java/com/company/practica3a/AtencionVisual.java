/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.practica3a;

/**
 *
 * @author nunez
 */
public class AtencionVisual {
    private float X_IMU;
    private float Y_IMU;
    private float Y_FR;
    private float Z_FR;
    private int clase;

    public AtencionVisual(float X_IMU, float Y_IMU, float Y_FR, float Z_FR, int clase) {
        this.X_IMU = X_IMU;
        this.Y_IMU = Y_IMU;
        this.Y_FR = Y_FR;
        this.Z_FR = Z_FR;
        this.clase = clase;
    }

    @Override
    public String toString() {
        return "{" + "X_IMU=" + X_IMU + ", Y_IMU=" + Y_IMU + ", Y_FR=" + Y_FR + ", Z_FR=" + Z_FR + ", clase=" + clase + '}';
    }
    
}
