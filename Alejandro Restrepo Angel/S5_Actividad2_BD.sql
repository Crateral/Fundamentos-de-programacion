-- Actividad 2 Base de Datos

-- Crear las funciones mencionadas anteriormente.
DELIMITER $$
DROP FUNCTION IF EXISTS fnc_sumar$$
CREATE FUNCTION fnc_sumar(numero1 INT, numero2 INT)
RETURNS INT READS SQL DATA
BEGIN
    DECLARE suma INT;
    SET suma = numero1 + numero2;
    RETURN suma;
END$$
DELIMITER ;

DELIMITER $$
DROP FUNCTION IF EXISTS fnc_restar$$
CREATE FUNCTION fnc_restar(numero1 INT, numero2 INT) 
RETURNS INT READS SQL DATA
BEGIN
    DECLARE resta INT;
    SET resta = numero1 - numero2;
    RETURN resta;
END$$
DELIMITER ;

DELIMITER $$
DROP FUNCTION IF EXISTS fnc_multiplicar$$
CREATE FUNCTION fnc_multiplicar(numero1 INT, numero2 INT) 
RETURNS INT READS SQL DATA
BEGIN
    DECLARE multiplicar INT;
    SET multiplicar = numero1 * numero2;
    RETURN multiplicar;
END$$
DELIMITER ;

DELIMITER $$
DROP FUNCTION IF EXISTS fnc_dividir$$
CREATE FUNCTION fnc_dividir(numero1 INT, numero2 INT) 
RETURNS INT READS SQL DATA
BEGIN
    DECLARE division INT;
   	IF numero2 != 0 THEN
		SET division = numero1 / numero2;
	ELSE
		SET division = NULL;
	END IF;
    
    RETURN division;
END$$
DELIMITER ;

-- Crear un SP de calculadora donde contenga las funciones de suma, resta, multiplicacion y division.
DELIMITER $$
DROP PROCEDURE IF EXISTS sp_calculadora$$
CREATE PROCEDURE sp_calculadora (OUT suma INT, OUT resta INT, OUT multiplicacion INT, OUT division INT)
BEGIN
  	SET suma = (SELECT fnc_sumar(20,2));
	SET resta = (SELECT fnc_restar(20,2));
	SET multiplicacion = (SELECT fnc_multiplicar(20,2));
	SET division = (SELECT fnc_dividir(20,0));
END$$
DELIMITER ;
CALL sp_calculadora(@suma, @resta, @multiplicacion, @division);
SELECT @suma, @resta, @multiplicacion, @division;
