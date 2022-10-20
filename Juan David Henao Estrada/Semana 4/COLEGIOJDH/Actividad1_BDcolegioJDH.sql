/*Crear una base de datos para un colegio.

Crear la tabla de estudiantes
Crear la tabla de profesores
Crear la tabla de notas
Crear la tabla de clases 

Colocar al menos 2 registros en cada tabla.

Todo se debe realizar por medio de codigo (scripts)*/
-- ==============================================================================================================
-- Base de datos: colegio

-- se crea la base de datos colegio
CREATE DATABASE colegio;

-- se escoge la base de datos que se usará
USE colegio;


-- creamos la tabla estudiante con sus respectivos tipos de dato
CREATE TABLE estudiante(
  id int(10) UNSIGNED primary key auto_increment not null,
  tipoid varchar(11) not null,
  numeroid int(11) not null,
  nombre varchar(20) not null,
  direccion varchar(20) not null,
  celular varchar(20) not null,
  correo varchar(50) not null);

-- inserción de datos en la tabla estudiante
INSERT INTO estudiante (id, tipoid, numeroid, nombre, direccion, celular, correo) VALUES
(1, 'cedula', 71723402, 'Juan David', 'calle 67', '3002343344', 'juan@gmail.com'),
(2, 'pasaporte', 1082444555, 'Carlos', 'carrera 44', '3025556677', 'carlos@gmail.com');

-- =================================================================================================================
-- creamos la tabla profesor 
CREATE TABLE profesor (
  id int(11) UNSIGNED primary key auto_increment not null,
  tipoid varchar(11) not null,
  numeroidprof int(11) not nullL,
  nombresProf varchar(20) not nullL,
  direccionProf varchar(20) not null,
  celularProf varchar(20) not null,
  correoProf varchar(50) not null);

INSERT INTO profesor (id, tipoid, numeroidprof, nombresProf, direccionProf, celularProf, correoProf) VALUES
(1, 'cedula', 60555443, 'Jairo Camargo', 'avenida 33', '3028885566', 'jairo@gmail.com'),
(2, 'pasaporte', 1082444333, 'David Estrada', 'carrera 22', '3002226688', 'david@gmail.com');

-- ==================================================================================================================
-- creamos la tabla clases
CREATE TABLE clases (
  id int(11) UNSIGNED primary key auto_increment not null,
  nombreMateria varchar(20) not null,
  cantidadHoras int(11) not nullL,
  horario varchar(50) not null,
  salon varchar(6) not null);

INSERT INTO clases (id, nombreMateria, cantidadHoras, horario, salon) VALUES
(1, 'Matematicas', 40, 'Lunes y Miercoles', 'b1-102'),
(2, 'Sociales', 60, 'Martes y Jueves', 'b1-101');

-- ==================================================================================================================
-- creamos la tabla notas
CREATE TABLE notas(
  id int(11) UNSIGNED primary key auto_increment not null,
  nota1 double not null,
  nota2 double not null,
  nota3 double not null,
  nota4 double not null,
  notaFinal double not null);

INSERT INTO notas (id, nota1, nota2, nota3, nota4, notaFinal) VALUES
(1, 3.5, 4, 3.8, 3, 3.5),
(2, 2, 3.8, 3.9, 4, 3.4);

-- ==================================================================================================================
CREATE TABLE tipoid (
  id int(10) UNSIGNED primary key auto_increment not null,
  tipoid varchar(11) not null);

INSERT INTO tipoid (id, tipoid) VALUES
(1, 'cedula'),
(2, 'pasaporte');

-- ==================================================================================================================



ALTER TABLE `clases`
  ADD CONSTRAINT `clases_ibfk_1` FOREIGN KEY (`id`) REFERENCES `notas` (`id`);


ALTER TABLE `estudiante`
  ADD CONSTRAINT `estudiante_ibfk_1` FOREIGN KEY (`id`) REFERENCES `tipoid` (`id`);

ALTER TABLE `profesor`
  ADD CONSTRAINT `profesor_ibfk_1` FOREIGN KEY (`id`) REFERENCES `tipoid` (`id`);




