-- Crear una base de datos.
CREATE DATABASE db_gymapp;
USE db_gymapp;


-- Crear la tabla de personas
CREATE TABLE tbl_Personas (
	id_Persona INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    documento VARCHAR(15) UNIQUE NOT NULL,
    nombre VARCHAR(30) NOT NULL,
    apellido VARCHAR(30) NOT NULL,
    correo VARCHAR(100),
    telefono VARCHAR(20) NOT NULL
);


-- Crear la tabla de contactos
CREATE TABLE tbl_Contactos (
	id_Contacto INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nombre VARCHAR(30) NOT NULL,
    apellido VARCHAR(30) NOT NULL,
    telefono VARCHAR(20) NOT NULL
);


-- Crear la tabla de usuarios
CREATE TABLE tbl_Usuarios (
	id_Usuario INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nombreUsuario VARCHAR(15) UNIQUE NOT NULL,
    passwordUsuario VARCHAR(30) NOT NULL,
    rol enum('Administrador','Usuario','Entrenador'),
    estado enum('Activo','Inactivo','Suspendido'), 
    membresia enum('Basica','Premium')
);


-- Crear la tabla del IMC
CREATE TABLE tbl_IMC (
	id_IMC INT PRIMARY KEY AUTO_INCREMENT NOT NULL, 
	peso FLOAT NOT NULL,
	altura FLOAT NOT NULL,
	imc FLOAT NOT NULL,
	fechaMuestra Date NOT NULL
);


-- Crear la tabla de clases
CREATE TABLE tbl_Clases (
	id_Clase INT PRIMARY KEY AUTO_INCREMENT NOT NULL, 
    nombre VARCHAR(30) NOT NULL,
	fecha Date NOT NULL,
	cupos INT NOT NULL
);


-- Crear la tabla de rutina
CREATE TABLE tbl_Rutina (
	id_Rutina INT PRIMARY KEY AUTO_INCREMENT NOT NULL, 
    nombre VARCHAR(30) NOT NULL,
	duracion INT NOT NULL
);


-- Crear la tabla de Ejercicio
CREATE TABLE tbl_Ejercicio (
	id_Ejercicio INT PRIMARY KEY AUTO_INCREMENT NOT NULL, 
    nombre VARCHAR(30) NOT NULL,
	duracion INT NOT NULL,
	serie INT NOT NULL
);


-- Normailizar: 3ra forma normal cada tabla

-- Agregar campos para llaves foráneas
ALTER TABLE tbl_rutina ADD id_Ejercicio INT;
ALTER TABLE tbl_Clases ADD id_Rutina INT;
ALTER TABLE tbl_Clases ADD id_Usuario INT;
ALTER TABLE tbl_Clases ADD id_Entrenador INT;
ALTER TABLE tbl_IMC ADD id_Usuario INT;
ALTER TABLE tbl_Usuarios ADD id_Persona INT;
ALTER TABLE tbl_Personas ADD id_Contacto INT;


-- Agregar Constrains de llaves foráneas
ALTER TABLE tbl_Rutina ADD FOREIGN KEY (id_Ejercicio) REFERENCES tbl_Ejercicio(id_Ejercicio);
ALTER TABLE tbl_Clases ADD FOREIGN KEY (id_Rutina) REFERENCES tbl_Rutina(id_Rutina);
ALTER TABLE tbl_Clases ADD FOREIGN KEY (id_Usuario) REFERENCES tbl_Usuarios(id_Usuario);
ALTER TABLE tbl_Clases ADD FOREIGN KEY (id_Entrenador) REFERENCES tbl_Usuarios(id_Usuario);
ALTER TABLE tbl_IMC ADD FOREIGN KEY (id_Usuario) REFERENCES tbl_Usuarios(id_Usuario);
ALTER TABLE tbl_Usuarios ADD FOREIGN KEY (id_Persona) REFERENCES tbl_Personas(id_Persona);
ALTER TABLE tbl_Personas ADD FOREIGN KEY (id_Contacto) REFERENCES tbl_Contactos(id_Contacto);

