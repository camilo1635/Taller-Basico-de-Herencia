/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerherencia;

/**
 *
 * @author Estudiante
 */
public class Medico extends PersonalMedico {

    private String nombreHospital;
    private int horasDeTurno;

    public Medico() {
        super(3000000, 15, 2000000);
    }

    public void CalcularSueldoTotal() {
        double sueldoTotal = 0;

        sueldoTotal = sueldoBase + (añosDeExperiencia * 1000);
        System.out.println("El sueldo total es: " + sueldoTotal+"$");
    }

    public void CalcularDiasVacaciones() {
        int VacacionesTotales = 0;

        VacacionesTotales = diasVacacionesBase + (añosDeExperiencia / 3);
        System.out.println("Las Vacaciones totales son: " + VacacionesTotales+" días");
    }

    public void CalcularValorPension() {
        double valorPensionTotal = 0;

        if (edad > 60) {
            valorPensionTotal = valorPensionBase + (añosDeExperiencia * 100);
        } else {
            valorPensionTotal = valorPensionBase;
        }

        System.out.println("La pension total es: " + valorPensionTotal+"$");

    }

    void haceroperación() {
        System.out.println(Nombre + " operación exitosa");
    }
    

    public String getNombreHospital() {
        return nombreHospital;
    }

    public void setNombreHospital(String nombreHospital) {
        this.nombreHospital = nombreHospital;
    }

    public int getHorasDeTurno() {
        return horasDeTurno;
    }

    public void setHorasDeTurno(int horasDeTurno) {
        this.horasDeTurno = horasDeTurno;
    }

}
