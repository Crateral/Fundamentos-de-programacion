/*Actividad 2 Base de Datos

Crear un SP de calculadora donde contenga las funciones de suma, resta, multiplicacion y division.

Crear las funciones mencionadas anteriormente.*/ 

delimiter // 

create function fnc_suma ()
RETURN INTEGER 
	
	DECLARE @num1	smallint,
	DECLARE @num2	smallint,
	
	
	IS
	num3 INTEGER(9);	
		
	Begin
		
		num3 :=num1+num2;
		RETURN num3;
		
	end; 
	
create function fnc_resta ()
RETURN INTEGER 
	
	DECLARE @num1	smallint,
	DECLARE @num2	smallint,
	
	
	IS
	num3 INTEGER(9);	
		
	Begin
		
		num3 :=num1+num2;
		RETURN num3;
		
	end;
	
create function fnc_multi ()
RETURN INTEGER 
	
	DECLARE @num1	smallint,
	DECLARE @num2	smallint,
	
	
	IS
	num3 INTEGER(9);	
		
	Begin
		
		num3 :=num1+num2;
		RETURN num3;
		
	end;
	
create function fnc_division ()
RETURN INTEGER 
	
	DECLARE @num1	smallint,
	DECLARE @num2	smallint,
	
	
	IS
	num3 INTEGER(9);	
		
	Begin
		
		num3 :=num1+num2;
		RETURN num3;
		
	end;
	
	
create procedure sp_calculadora ()
	
	
	DECLARE @suma	VARCHAR(10) OUT,
	DECLARE @resta	VARCHAR(10)OUT,
	DECLARE @multi	VARCHAR(30)OUT,
	DECLARE @division VARCHAR(10)OUT,
	
	
		
	begin 
		
		IS
		SET @suma =fnc_suma;
		SET @resta =fnc_resta;
		SET @multi =fnc_multi;
		SET @division =fnc_division;
			
			
	end; // 
GO
		
		