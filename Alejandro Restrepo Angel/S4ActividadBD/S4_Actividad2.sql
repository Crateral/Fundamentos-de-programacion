-- Crear una base de datos para un colegio.
CREATE DATABASE db_colegio;

-- Crear la tabla de estudiantes
CREATE TABLE Tbl_Estudiantes (
	Id_Estudiante INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    Documento VARCHAR(15) UNIQUE NOT NULL,
    Nombre VARCHAR(30) NOT NULL,
    Apellido VARCHAR(30) NOT NULL,
    Direccion VARCHAR(100),
    Telefono VARCHAR(20)
);

-- Crear la tabla de profesores
CREATE TABLE Tbl_Profesores (
	Id_Profesor INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    Documento VARCHAR(15) UNIQUE NOT NULL,
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

-- Normailizar: 3ra forma normal cada tabla

-- Agregar campos para llaves foráneas
ALTER TABLE Tbl_Notas ADD Id_Estudiante INT;
ALTER TABLE Tbl_Notas ADD Id_Clase INT;
ALTER TABLE Tbl_Clases ADD Id_Profesor INT;

-- Agregar Constrains de llaves foráneas
ALTER TABLE Tbl_Notas ADD FOREIGN KEY (Id_Estudiante) REFERENCES Tbl_Estudiantes(Id_Estudiante);
ALTER TABLE Tbl_Notas ADD FOREIGN KEY (Id_Clase) REFERENCES Tbl_Clases(Id_Clase);
ALTER TABLE Tbl_Clases ADD FOREIGN KEY (Id_Profesor) REFERENCES Tbl_Profesores(Id_Profesor);

-- Colocar al menos 2 registros en cada tabla.
INSERT INTO Tbl_Estudiantes (Documento, Nombre, Apellido, Direccion, Telefono) VALUES ('0001', 'Maria', 'Anders', 'Obere Str. 57', '4444444');
INSERT INTO Tbl_Estudiantes (Documento, Nombre, Apellido, Direccion, Telefono) VALUES ('0002', 'Ana', 'Trujillo', 'Avda. de la Constitución', '2222222');

INSERT INTO Tbl_Profesores (Documento, Nombre, Apellido, Direccion, Telefono, Facultad) VALUES ('0011', 'Thomas', 'Hardy', '120 Hanover Sq.', '4444444', 'Ciencias exactas');
INSERT INTO Tbl_Profesores (Documento, Nombre, Apellido, Direccion, Telefono, Facultad) VALUES ('0012', 'Christina', 'Berglund', 'Forsterstr. 57', '2222222', 'Informática');

INSERT INTO Tbl_Clases (Nombre, Hora, Aula, Bloque, Id_Profesor) VALUES ('Dibujo por computador', '10am', '202', '01',2);
INSERT INTO Tbl_Clases (Nombre, Hora, Aula, Bloque, Id_Profesor) VALUES ('Base de datos', '12m', '108', 'M1', 1);

INSERT INTO Tbl_Notas (Primer_Parcial, Segundo_Parcial, Tercer_Parcial, Trabajo_Final, Id_Estudiante, Id_Clase) VALUES (3.4, 4.2, 2.5, 3.7,1,2);
INSERT INTO Tbl_Notas (Primer_Parcial, Segundo_Parcial, Tercer_Parcial, Trabajo_Final,  Id_Estudiante, Id_Clase) VALUES (4.5, 4.0, 3.5, 4.1,2,1);

-- Todo se debe realizar por medio de codigo (scripts)
SELECT * FROM Tbl_Estudiantes;
SELECT * FROM Tbl_Profesores;
SELECT * FROM Tbl_Notas;
SELECT * FROM Tbl_Clases;
