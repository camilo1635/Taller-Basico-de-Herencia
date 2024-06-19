/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerherencia;

/**
 *
 * @author usuario
 */
public class PersonalDeAseo extends PersonalMedico {

    private String zonaAsignada;

    public PersonalDeAseo() {
        super(800000, 8, 500000);
    }

    public void CalcularSueldoTotal() {
        double sueldoTotal = 0;

        sueldoTotal = sueldoBase + (añosDeExperiencia * 200);
        System.out.println("El sueldo total es: " + sueldoTotal+"$");
    }

    public void CalcularDiasVacaciones() {
        int VacacionesTotales = 0;

        VacacionesTotales = diasVacacionesBase + (añosDeExperiencia / 4);
        System.out.println("Las Vacaciones totales son: " + VacacionesTotales+" días");

    }

    public void CalcularValorPension() {
        double valorPensionTotal = 0;

        if (edad > 65) {
            valorPensionTotal = valorPensionBase + (añosDeExperiencia * 25);
        } else {
            valorPensionTotal = valorPensionBase;
        }
        System.out.println("La pension total es: " + valorPensionTotal+"$");
    }

}
