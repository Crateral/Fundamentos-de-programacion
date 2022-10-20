-- Crear una base de datos para un colegio.
CREATE DATABASE db_colegio;

-- Crear la tabla de estudiantes
CREATE TABLE Tbl_Estudiantes (
    Documento INT PRIMARY KEY NOT NULL,
    Nombre VARCHAR(30) NOT NULL,
    Apellido VARCHAR(30) NOT NULL,
    Direccion VARCHAR(100),
    Telefono VARCHAR(20)
);

-- Crear la tabla de profesores
CREATE TABLE Tbl_Profesores (
    Documento INT PRIMARY KEY NOT NULL,
    Nombre VARCHAR(30) NOT NULL,
    Apellido VARCHAR(30) NOT NULL,
    Direccion VARCHAR(100),
    Telefono VARCHAR(20),
    Facultad VARCHAR(30)
);

-- Crear la tabla de notas
CREATE TABLE Tbl_Notas (
	Id_Nota INT PRIMARY KEY AUTO_INCREMENT NOT NULL, 
	Primer_Parcial FLOAT,
	Segundo_Parcial FLOAT,
	Tercer_Parcial FLOAT,
	Trabajo_Final FLOAT
);

-- Crear la tabla de clases
CREATE TABLE Tbl_Clases (
	Id_Clase INT PRIMARY KEY AUTO_INCREMENT NOT NULL, 
    Nombre VARCHAR(30) NOT NULL,
	Hora VARCHAR(10),
    Aula VARCHAR(10),
    Bloque VARCHAR(10)
);

-- Colocar al menos 2 registros en cada tabla.
INSERT INTO Tbl_Estudiantes VALUES (0001, 'Maria', 'Anders', 'Obere Str. 57', '4444444');
INSERT INTO Tbl_Estudiantes VALUES (0002, 'Ana', 'Trujillo', 'Avda. de la Constitución', '2222222');

INSERT INTO Tbl_Profesores VALUES (0011, 'Thomas', 'Hardy', '120 Hanover Sq.', '4444444', 'Ciencias exactas');
INSERT INTO Tbl_Profesores VALUES (0012, 'Christina', 'Berglund', 'Forsterstr. 57', '2222222', 'Informática');

INSERT INTO Tbl_Notas (Primer_Parcial, Segundo_Parcial, Tercer_Parcial, Trabajo_Final) VALUES (3.4, 4.2, 2.5, 3.7);
INSERT INTO Tbl_Notas (Primer_Parcial, Segundo_Parcial, Tercer_Parcial, Trabajo_Final) VALUES (4.5, 4.0, 3.5, 4.1);

INSERT INTO Tbl_Clases (Nombre, Hora, Aula, Bloque) VALUES ('Dibujo por computador', '10am', '202', '01');
INSERT INTO Tbl_Clases (Nombre, Hora, Aula, Bloque) VALUES ('Base de datos', '12m', '108', 'M1');

-- Todo se debe realizar por medio de codigo (scripts)
SELECT * FROM Tbl_Estudiantes;
SELECT * FROM Tbl_Profesores;
SELECT * FROM Tbl_Notas;
SELECT * FROM Tbl_Clases;
