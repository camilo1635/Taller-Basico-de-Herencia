/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerherencia;

/**
 *
 * @author usuario
 */
public class PersonalMedico {

    protected String Nombre;
    protected int edad;
    protected String especialidad;
    protected int añosDeExperiencia;
    protected double sueldoBase;
    protected int diasVacacionesBase;
    protected double valorPensionBase;

    public PersonalMedico(double sueldoBase, int diasVacacionesBase, double valorPensionBase) {
        this.sueldoBase = sueldoBase;
        this.diasVacacionesBase = diasVacacionesBase;
        this.valorPensionBase = valorPensionBase;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getAñosDeExperiencia() {
        return añosDeExperiencia;
    }

    public void setAñosDeExperiencia(int añosDeExperiencia) {
        this.añosDeExperiencia = añosDeExperiencia;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getDiasVacacionesBase() {
        return diasVacacionesBase;
    }

    public void setDiasVacacionesBase(int diasVacacionesBase) {
        this.diasVacacionesBase = diasVacacionesBase;
    }

    public double getValorPension() {
        return valorPensionBase;
    }

    public void setValorPension(int valorPension) {
        this.valorPensionBase = valorPension;
    }

    public void CalcularSueldoTotal() {
        return;
    }

    public void CalcularDiasVacaciones() {
        return;
    }

    public void CalcularValorPension() {
        return;
    }
}
