package com.mycompany.tallerherencia;

import java.util.Scanner;

public class TallerHerencia {

    public static void main(String[] args) {
        boolean bandera = true;
        Scanner entrada = new Scanner(System.in);

        do {
            int menu;
            System.out.println("Bienvenido, digite '1' para Medico, '2' para Enfermero, '3' para personal de aseo o '4' para salir del menú:");
            menu = entrada.nextInt(); 

            switch (menu) {
                case 1:
                    
                    Medico medico = new Medico();
                    capturarDatosPersona(entrada, medico); 
                    medico.CalcularSueldoTotal();
                    medico.CalcularDiasVacaciones();
                    medico.CalcularValorPension();
                    medico.haceroperación();

                    System.out.println("Datos del Medico:");
                    mostrarDatosPersona(medico); 
                    break;

                case 2:
                    
                    Enfermero enfermero = new Enfermero();
                    capturarDatosPersona(entrada, enfermero); 
                    enfermero.CalcularSueldoTotal();
                    enfermero.CalcularDiasVacaciones();
                    enfermero.CalcularValorPension();
                    enfermero.aplicarmedicamentos();

                    System.out.println("Datos del Enfermero:");
                    mostrarDatosPersona(enfermero); 
                    break;

                case 3:

                    PersonalDeAseo personal = new PersonalDeAseo();
                    capturarDatosPersona(entrada, personal);
                    personal.CalcularSueldoTotal();
                    personal.CalcularDiasVacaciones();
                    personal.CalcularValorPension();

                    System.out.println("Datos del Personal de Aseo:");
                    mostrarDatosPersona(personal);
                    break;

                case 4:
                    System.out.println("Saliendo del menú...");
                    bandera = false;
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
        } while (bandera);

        entrada.close();
    }

    private static void capturarDatosPersona(Scanner entrada, PersonalMedico persona) {
        System.out.println("Digite el nombre:");
        persona.setNombre(entrada.next());

        System.out.println("Escriba la especialización:");
        persona.setEspecialidad(entrada.next());

        System.out.println("Digite los años de experiencia:");
        persona.setAñosDeExperiencia(entrada.nextInt());

        System.out.println("Digite la edad:");
        persona.setEdad(entrada.nextInt());
    }

    private static void mostrarDatosPersona(PersonalMedico persona) {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Especialidad: " + persona.getEspecialidad());
        System.out.println("Años de experiencia: " + persona.getAñosDeExperiencia());
        System.out.println("Edad: " + persona.getEdad() + " Años");
    }
}
