package edu.itla.example;

public class Empleado extends Persona{
    private Integer id;
    private final String OCUPACION = "Empleado";

    public Empleado(){

    }

    public Empleado(String nombre, String apellido, int edad, Integer id) {
        super(nombre, apellido, edad);
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOcupacion() {
        return OCUPACION;
    }

    @Override
    public void ocupacion() {
        System.out.println(this.getNombre() + " es " + this.getOcupacion());
    }
}
