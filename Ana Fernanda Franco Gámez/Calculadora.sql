
-- base de datos creada con el nombre calculadora 

CREATE DATABASE calculadora;

-- Funcion Restar

USE `calculadora`;
DROP function IF EXISTS `restar`;

DELIMITER $$
USE `calculadora`$$
CREATE FUNCTION restar (nu1 int, nu2 int)
RETURNS INT

BEGIN
 declare resu int;
 set resu = nu1- nu2;

RETURN resu;

END$$

DELIMITER ;

-- Funcion Sumar

USE `calculadora`;
DROP function IF EXISTS `sumar`;

DELIMITER $$
USE `calculadora`$$
CREATE FUNCTION sumar (num1 int, num2 int)
RETURNS INT

BEGIN
 declare resultSuma int;
 set resultSuma = num1 + num2;

RETURN resultSuma;

END$$

DELIMITER ;

-- Funcion Multiplicar

USE `calculadora`;
DROP function IF EXISTS `multiplicar`;

DELIMITER $$
USE `calculadora`$$
CREATE FUNCTION multiplicar (nume1 int, nume2 int)
RETURNS INT

BEGIN
 declare resultMult int;
 set resultMult = nume1 * nume2;

RETURN resultMult;

END$$

DELIMITER ;

-- Funcion Dividir

USE `calculadora`;
DROP function IF EXISTS `dividir`;

DELIMITER $$
USE `calculadora`$$
CREATE FUNCTION dividir ( dividendo int, divisor int)
RETURNS INT

BEGIN
 declare resultado int;
 set resultado = dividendo / divisor;

RETURN resultado;

END$$

DELIMITER ;


-- Ejecutando las funciones

SELECT sumar(12,8);
SELECT restar(40,5);
SELECT multiplicar(10,2);
SELECT dividir (122,12);

-- procedimientos 

USE `calculadora`;
DROP procedure IF EXISTS `calculadora`;

DELIMITER $$
USE `calculadora`$$
CREATE procedure operaciones( num1 int, num2 int)

BEGIN
declare suma int;
declare resta int;
declare multiplicacion int;
declare division int; 

set suma= num1+num2;
set resta= num1-num2;
set multiplicacion= num1*num2;
set division= num1 / num2;

END$$

DELIMITER ;

