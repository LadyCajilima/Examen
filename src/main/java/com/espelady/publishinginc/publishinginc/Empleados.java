/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espelady.publishinginc.publishinginc;

/**
 *
 * @author Usuario iTC
 */
public abstract class Empleados {
    public String lista;
    private String Nombre;
    private String Cargo;
    private String IdEmpleado;
    private int Edad;
    private String Email;
    private String Telefono;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(String IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    public void mostrarinformacionEmpleado(){
        System.out.println("Ingresa Nombre "+ Nombre);
        System.out.println("Ingresa Cargo "+ Cargo);
        System.out.println("Ingresa IdEmpleado "+ IdEmpleado);
        System.out.println("Ingresa Edad "+ Edad);
        System.out.println("Ingresa Email "+ Email);
        System.out.println("Ingresa Telefono "+ Telefono);
    }
    
    
            
    
}
