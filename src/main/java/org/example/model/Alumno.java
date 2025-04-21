package org.example.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Alumno {
    //Nombre, dni, notas (list double), materias aprobadas(set string)
    private String nombre;
    private String dni;
    private List<Double> notas;
    private Set<String> materiasAprobadas;

    public Alumno(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
        this.notas = new ArrayList<>();
        this.materiasAprobadas = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Set<String> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void agregarNota(double nota){
        notas.add(nota);
    }

    public void aprobarMateria(String materia){
        materiasAprobadas.add(materia);
    }

    public double obtenerPromedio(){
        return notas.stream().mapToDouble(Double::doubleValue)
                .average().orElse(0.0);
    }

    @Override
    public String toString() {
        return String.format("""
                Alumno: {
                \tNombre: %s
                \tDNI: %s
                \tNotas: %s
                \tMaterias aprobadas: %s
                }""", nombre, dni, notas, materiasAprobadas);
    }
}