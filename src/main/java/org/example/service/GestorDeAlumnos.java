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

    public List<Alumno> top3Promedios() {
        return alumnos.values().stream()
                .sorted(Comparator.comparing(Alumno::obtenerPromedio).reversed())
                .limit(3)
                .toList();
    }

    public List<String> nombresUnicosOrdenados(){
        return alumnos.values().stream()
                .map(Alumno::getNombre)
                .distinct()
                .sorted().toList();
    }

    public Optional<Alumno> buscarPorDni(String dni){
        return Optional.ofNullable(alumnos.get(dni));
    }

    @Override
    public Optional<Alumno> agregarAlumno(Alumno alumno) {
        return Optional.ofNullable(alumnos.put(alumno.getDni(),alumno));
    }

    @Override
    public Optional<Alumno> agregarNota(String dni, double nota) {
        return buscarPorDni(dni).map(a -> {
            a.agregarNota(nota);
            return a;
        });
    }
}