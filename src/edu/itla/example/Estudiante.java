package edu.itla.example;

public class Estudiante extends Persona {

    private String matricula;
    private final String OCUPACION = "Estudiante";

    public Estudiante(){

    }

    public Estudiante(String nombre, String apellido, int edad, String matricula){
        super(nombre, apellido, edad);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getOcupacion() {
        return OCUPACION;
    }

    @Override
    public void ocupacion() {
        System.out.println(this.getNombre() + " es " + this.getOcupacion());
    }
}
