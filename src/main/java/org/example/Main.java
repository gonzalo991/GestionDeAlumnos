package org.example;

import org.example.model.Alumno;
import org.example.service.GestorDeAlumnos;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GestorDeAlumnos gestor = new GestorDeAlumnos();
        List<Alumno> topPromedios = new ArrayList<>();
        List<String> nombresUnicos = new ArrayList<>();
        List<Alumno> promedioMayorA = new ArrayList<>();

        Alumno alumno = new Alumno("Gonzalo Araya", "35912768");
        alumno.aprobarMateria("Matematicas");
        alumno.aprobarMateria("Lengua");
        alumno.aprobarMateria("Ingles");
        alumno.aprobarMateria("Ciencias naturales");
        alumno.aprobarMateria("Ciencias sociales");
        alumno.aprobarMateria("Tecnologia");
        alumno.aprobarMateria("Fisica");
        alumno.aprobarMateria("Quimica");

        Alumno alumno1 = new Alumno("Juan Perez", "12345678");
        alumno1.aprobarMateria("Matematicas");
        alumno1.aprobarMateria("Lengua");
        alumno1.aprobarMateria("Ingles");
        alumno1.aprobarMateria("Ciencias naturales");
        alumno1.aprobarMateria("Ciencias sociales");
        alumno1.aprobarMateria("Tecnologia");

        Alumno alumno2 = new Alumno("Armando Paredes","23456789");
        alumno2.aprobarMateria("Matematicas");
        alumno2.aprobarMateria("Lengua");
        alumno2.aprobarMateria("Ingles");
        alumno2.aprobarMateria("Ciencias naturales");

        Alumno alumno3 = new Alumno("Elsa Pato","98765432");
        alumno3.aprobarMateria("Matematicas");
        alumno3.aprobarMateria("Lengua");
        alumno3.aprobarMateria("Ingles");
        alumno3.aprobarMateria("Ciencias naturales");
        alumno3.aprobarMateria("Ciencias sociales");
        alumno3.aprobarMateria("Tecnologia");

        Alumno alumno4 = new Alumno("Pancho Villa","32425467");
        alumno4.aprobarMateria("Matematicas");
        alumno4.aprobarMateria("Lengua");
        alumno4.aprobarMateria("Ingles");


        gestor.agregarAlumno(alumno);
        gestor.agregarAlumno(alumno1);
        gestor.agregarAlumno(alumno2);
        gestor.agregarAlumno(alumno3);
        gestor.agregarAlumno(alumno4);

        gestor.agregarNota("12345678",10);
        gestor.agregarNota("12345678",7);
        gestor.agregarNota("12345678",9);
        gestor.agregarNota("12345678",8);
        gestor.agregarNota("12345678",9);
        gestor.agregarNota("12345678",7);
        gestor.agregarNota("12345678",10);
        gestor.agregarNota("12345678",8);
        gestor.agregarNota("12345678",9);

        gestor.agregarNota("23456789",5);
        gestor.agregarNota("23456789",3);
        gestor.agregarNota("23456789",8);
        gestor.agregarNota("23456789",6);
        gestor.agregarNota("23456789",7);
        gestor.agregarNota("23456789",7);
        gestor.agregarNota("23456789",10);
        gestor.agregarNota("23456789",8);
        gestor.agregarNota("23456789",9);

        gestor.agregarNota("98765432",2);
        gestor.agregarNota("98765432",5);
        gestor.agregarNota("98765432",4);
        gestor.agregarNota("98765432",8);
        gestor.agregarNota("98765432",9);
        gestor.agregarNota("98765432",7);
        gestor.agregarNota("98765432",10);
        gestor.agregarNota("98765432",9);
        gestor.agregarNota("98765432",7);

        gestor.agregarNota("32425467",9);
        gestor.agregarNota("32425467",8);
        gestor.agregarNota("32425467",9);
        gestor.agregarNota("32425467",10);
        gestor.agregarNota("32425467",4);
        gestor.agregarNota("32425467",2);
        gestor.agregarNota("32425467",6);
        gestor.agregarNota("32425467",6);
        gestor.agregarNota("32425467",9);

        gestor.agregarNota("35912768",10);
        gestor.agregarNota("35912768",7);
        gestor.agregarNota("35912768",9);
        gestor.agregarNota("35912768",8);
        gestor.agregarNota("35912768",9);
        gestor.agregarNota("35912768",7);
        gestor.agregarNota("35912768",10);
        gestor.agregarNota("35912768",8);
        gestor.agregarNota("35912768",9);


        topPromedios = gestor.top3Promedios();
        promedioMayorA = gestor.alumnosConPromedioMayorA(6);
        long aprobaronMasDeX = gestor.cantidadQueAprobaronMasDe(5);
        nombresUnicos = gestor.nombresUnicosOrdenados();

        System.out.println("--------------Busqueda por dni----------------\n");
        Optional<Alumno> al = gestor.buscarPorDni("35912768");
        Optional<Alumno> al2 = gestor.buscarPorDni("12345678");
        Optional<Alumno> al3 = gestor.buscarPorDni("23456789");

        System.out.println(al.toString());
        System.out.println(al2.toString());
        System.out.println(al3.toString());

        System.out.println("\n------------- Top promedios ----------");
        topPromedios.forEach(System.out::println);
        System.out.println("\n------------- Nombres Unicos ---------------");
        nombresUnicos.forEach(System.out::println);
        System.out.println("\n-------------- Aprobaron x materias -------------");
        System.out.println(aprobaronMasDeX);
        System.out.println("\n-------------- Tienen promedio mayor a X ------------");
        promedioMayorA.forEach(System.out::println);
        }
}