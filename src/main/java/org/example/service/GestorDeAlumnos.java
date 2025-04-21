package org.example.service;

import org.example.model.Alumno;

import java.util.*;

public class GestorDeAlumnos implements IGestor {
    private Map<String, Alumno> alumnos = new HashMap<>();

    public List<Alumno> alumnosConPromedioMayorA(double limite){
        return alumnos.values().stream()
                .filter(a -> a.obtenerPromedio() > limite)
                .toList();
    }

    public long cantidadQueAprobaronMasDe(int cantidad){
        return  alumnos.values().stream().filter(
                a -> a.getMateriasAprobadas().size() > cantidad
                ).count();
    }

    public List<Alumno> top3Promedios(){
        return alumnos.values().stream().
                sorted(Comparator.comparing(Alumno::obtenerPromedio))
                .limit(3).toList();
    }

    public List<Alumno> nombresUnicosOrdenados(){
        return alumnos.values().stream()
                .distinct().sorted().toList();
    }

    @Override
    public Optional<Alumno> agregarAlumno(Alumno alumno) {
        if(alumnos.values().stream()
                .anyMatch(
                        a -> Boolean.parseBoolean(a.getDni())
                )){
            return Optional.empty();
        }
        alumnos.put(alumno.getDni(),alumno);
        return Optional.of(alumno);
    }

    @Override
    public Optional<Alumno> agregarNota(String dni, double nota) {
        return Optional.empty();
    }

    @Override
    public Optional<Alumno> agregarNotaAlumno(String dni) {
        return Optional.empty();
    }
}