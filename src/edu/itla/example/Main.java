package edu.itla.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Objetos Estudiante
        Estudiante junior = new Estudiante("Junior", "Calvo", 22, "2022-0125");
        Estudiante jose = new Estudiante("Jose", "Canelo", 23, "2022-0254");
        Estudiante susan = new Estudiante("Susan", "Liriano", 18, "2022-2258");

        //Objetos Empleado
        Empleado juan = new Empleado("Juan", "Soto", 44, 0023);
        Empleado bismark = new Empleado("Bismark", "Montero", 35, 0024);
        Empleado leandro = new Empleado("Leandro", "Fondeur", 55, 0025);

        //Lista Persona
        List<Persona> personas = new ArrayList<>();

        personas.add(junior);
        personas.add(jose);
        personas.add(susan);
        personas.add(juan);
        personas.add(bismark);
        personas.add(leandro);

        //Empleando Polimorfismo
        for (Persona persona : personas){
            persona.ocupacion();
        }
    }
}
