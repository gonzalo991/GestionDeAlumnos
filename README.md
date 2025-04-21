# 🎓 Proyecto: Sistema de Gestión de Alumnos

Este proyecto es una aplicación de consola escrita en Java para gestionar información académica de alumnos, materias y calificaciones. Está diseñado con buenas prácticas de programación orientada a objetos, y hace uso intensivo de colecciones, lambdas, `Optional`, y streams.

---

## ✅ Tecnologías utilizadas

- Java 17+
- Java Collections (`List`, `Set`, `Map`)
- Optional
- Lambdas y Streams
- `LocalDate`

---

## 📦 Estructura del proyecto

```text
src/
├── model/
│   ├── Alumno.java
│   ├── Materia.java
│   └── Nota.java
├── service/
│   ├── IGestorAlumnos.java
│   └── GestorAlumnos.java
└── Main.java
```

# 📋 Funcionalidades principales

- Registrar alumnos con su información básica.

- Registrar materias con su código, nombre y carga horaria.

- Asignar notas a alumnos en materias específicas.

- Calcular el promedio general de un alumno.

- Obtener las materias aprobadas de un alumno.

- Buscar alumno por nombre, email o DNI usando Optional.

- Filtrar alumnos que tengan promedio mayor a un valor específico.

- Mostrar ranking de alumnos según promedio.

- Listar todas las materias cursadas por un alumno ordenadas por nota.

- Mostrar los 3 mejores promedios.

- Agrupar alumnos por condición: Aprobado, Desaprobado, Regular.

# 🧪 Ejecución

Compilar y ejecutar Main.java. Allí se crean algunos alumnos, materias y notas de prueba para verificar las funcionalidades del sistema.

# 📌 Aprendizajes clave
1. Aplicación de principios de diseño orientado a objetos (encapsulamiento, cohesión).


2. Uso de Map, List, y Set para organizar los datos.


3. Streams y expresiones lambda para filtrar, ordenar, y mapear datos.


4. Uso de Optional para evitar errores de null.


5. Métodos separados para lógica de negocio reutilizable.

# ✍️ Autor
Desarrollado por *Oscar Gonzalo Araya* (**ArgoDev**)