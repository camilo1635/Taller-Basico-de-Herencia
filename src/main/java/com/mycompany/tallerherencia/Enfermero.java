/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerherencia;

/**
 *
 * @author usuario
 */
public class Enfermero extends PersonalMedico {

    private int numeroTarjetaProfesional;
    private String areaServicio;

    public Enfermero() {
        super(1500000, 10, 1000000);
    }

    public void CalcularSueldoTotal() {
        double sueldoTotal = 0;

        sueldoTotal = sueldoBase + (añosDeExperiencia * 500);
        System.out.println("El sueldo total es: " + sueldoTotal+"$");

    }

    public void CalcularDiasVacaciones() {
        int VacacionesTotales = 0;

        VacacionesTotales = diasVacacionesBase + (añosDeExperiencia / 2);
        System.out.println("Las Vacaciones totales son: " + VacacionesTotales+" días");

    }

    public void CalcularValorPension() {
        double valorPensionTotal = 0;

        if (edad > 62) {
            valorPensionTotal = valorPensionBase + (añosDeExperiencia * 50);
        } else {
            valorPensionTotal = valorPensionBase;
        }
        System.out.println("La pension total es: " + valorPensionTotal+"$");

    }

    void aplicarmedicamentos() {
        System.out.println(Nombre + " Medicamentos asignados");
    }

}
