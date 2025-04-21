package org.example.service;

import org.example.model.Alumno;

import java.util.List;
import java.util.Optional;

public interface IGestor {

    Optional<Alumno> agregarAlumno(Alumno alumno);
    Optional<Alumno> agregarNota(String dni, double nota);
    Optional<Alumno> agregarNotaAlumno(String dni);
}
