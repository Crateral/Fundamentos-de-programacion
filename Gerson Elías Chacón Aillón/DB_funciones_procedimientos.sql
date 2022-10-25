CREATE DATABASE db_operaciones;

USE db_operaciones


CREATE TABLE tbl_valor
(
	vrA FLOAT NOT NULL,
	vrB FLOAT NOT NULL
);

INSERT INTO tbl_valor (vrA, vrB) VALUES (16, 4);



CREATE FUNCTION fnc_calcularSuma()
DECLARE @valorA FLOAT
DECLARE @valorB FLOAT
RETURNS FLOAT

BEGIN
		
	DECLARE @resultado FLOAT;
	
	SET @valorA = SELECT vrA FROM tbl_valor;
	SET @valorB = SELECT vrB FROM tbl_valor;
	
	SET @resultado = @valorA + @valorB;
	RETURN @resultado;
	
END



CREATE FUNCTION fnc_calcularResta()
DECLARE @valorA FLOAT
DECLARE @valorB FLOAT
RETURNS FLOAT

BEGIN
	
	DECLARE @resultado FLOAT;
	
	SET @valorA = SELECT vrA FROM tbl_valor;
	SET @valorB = SELECT vrB FROM tbl_valor;
	
	SET @resultado = @valorA - @valorB;
	RETURN @resultado;
	
END



CREATE FUNCTION fnc_calcularMultiplicacion()
DECLARE @valorA FLOAT
DECLARE @valorB FLOAT
RETURNS FLOAT

BEGIN

	DECLARE @resultado FLOAT;
	
	SET @valorA = SELECT vrA FROM tbl_valor;
	SET @valorB = SELECT vrB FROM tbl_valor;
	
	SET @resultado = @valorA * @valorB;
	RETURN @resultado;
	
END



CREATE FUNCTION fnc_calcularDivision()
DECLARE @valorA FLOAT
DECLARE @valorB FLOAT
RETURNS FLOAT

BEGIN

	DECLARE @resultado FLOAT;
	
	SET @valorA = SELECT vrA FROM tbl_valor;
	SET @valorB = SELECT vrB FROM tbl_valor;
	
	IF (@valorB = 0) 
		print 'No se puede dividir por 0';
		RETURN @resultado = -5;           
	ELSE	
		SET @resultado = @valorA / @valorB;
		RETURN @resultado;	
		
END



CREATE PROCEDURE sp_calcularResultados   
BEGIN
	DECLARE @resSuma FLOAT;
	DECLARE @resResta FLOAT;
	DECLARE @resMultiplicacion FLOAT;
	DECLARE @resDivision FLOAT;
	
	SET @resSuma = fnc_calcularSuma();
	SET @resResta = fnc_calcularResta();
	SET @resMultiplicacion = fnc_calcularMultiplicacion();
	SET @resDivision = fnc_calcularDivision();
	
END
