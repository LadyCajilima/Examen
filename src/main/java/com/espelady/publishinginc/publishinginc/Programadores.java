/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espelady.publishinginc.publishinginc;

/**
 *
 * @author Usuario iTC
 */
public class Programadores extends Empleados {
   private String Nombre;
   private String Cargo;
   private String IdEmpleado;
   private int Edad;
   private String Email;
   private String Telefono;

    public Programadores(String Nombre, String Cargo, String IdEmpleado, int Edad, String Email, String Telefono) {
        this.Nombre = Nombre;
        this.Cargo = Cargo;
        this.IdEmpleado = IdEmpleado;
        this.Edad = Edad;
        this.Email = Email;
        this.Telefono = Telefono;
   }
 }

