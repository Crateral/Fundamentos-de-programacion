# Quiz:
---

1. **Defina con sus propias palabras que es:**

	- Una **clase**
		Las clases son *"plantillas"* o *"planos"* que utilizamos para crear distintos tipos de objetos. Por ejemplo, los planos de una casa, nos brindan las medidas y características, y de este podemos construir varias casas, y se diferencia por el color de las paredes o el tipo de baldosa.

	- Un **atributo**
		Son las *propiedades* o *características* de un objeto, nos brinda información de este. Por ejemplo, el color, la altura, entre otros.

	- Un **metodo**
		Son *funciones* o *comportamientos* de un objeto que modifican su estado. Por ejemplo, Una lavadora, puede estar encendida, apagada, lavando, centrifugando, entre otras funciones.

2. **Nombre, explique y de un ejemplo de 3 tipos de herencia**
	
	- **Herencia única**
		Una clase *"Hija"* que hereda de una sola clase *"Padre"*.

	    Ejemplo
		La clase principal o main de nuestro programa que solo tiene el método de ejecución del programa, así no se indique, está hereda de la clase **Object**, la cual es una *superclase* y todas las clases de Java heredan de esta.

	 - **Herencia Jerárquica**
		Una clase sirve como clase *"Padre"*, para varias clases *"Hijas"*.
		
        Ejemplo
		Podemos tener una clase *Padre* que sea *Persona*, y tres clases hijas que heredan de *Persona* que serían *Empleado*, *Contratista*, *Cliente*.
			
	- **Herencia Multinivel**
		Una clase que es *"Padre"* de una clase *"Hija"*, además, está clase *"Hija"* también es clase *"Padre"* de otra clase. Entonces tendríamos una clase *Padre/Abuelo*, una clase que sería *Hija/Padre*, y por último una clase *Hija*.

		Ejemplo
		Siguien el anterior ejemplo, Tenemos la clase *Padre* *Persona*, está tiene como *Hija* a la clase *Cliente*, quien a su vez, tiene una clase *Hija* que sea *Producto* que tendría todos los productos o servicios contratados por el cliente.

	- **Herencia Múltiple**
		Una clase *"Hija"* puede tener varias clases *"Padre"*. Este es un caso especial en Java, ya que el lenguaje no admite la *herencia múltiple*, lo que se hace es que se *"simula"* la herencia por medio de las interfaces.


3. **Cuales son los modificadores de acceso?**
	- Private
	- Protected
	- Default/Por defecto
	- Public

4. **Cuales son los tipos de datos primitivos?**
	- boolean
	- int
	- float
	- double
	- short
	- long
	- char
	- byte

    Estás inician en minúscula, para diferenciarse de las clases como ***Float*** o ***Double***.

5. **Realizar la creacion de las siguientes clases:**
    - 3.1 Planta
        - 3.1.1 Altura
		- 3.1.2 daFruto?
		- 3.1.3 tieneFlores?
	- 3.2 Hierbas
		- 3.2.1 cacularAltura
		- 3.2.2 crearFlor
		- 3.2.2 crearFruto
	- 3.3 Matas
		- 3.3.1 calcularAltura
	    - 3.3.2 crearFlor
		- 3.2.2 crearFruto
	- 3.4 Arbustos
		- 3.4.1 calcularAltura
		- 3.4.2 crearFlor
		- 3.2.2 crearFruto
	- 3.5 Arboles
		- 3.5.1 calcularAltura
		- 3.5.2 crearFlor
		- 3.2.2 crearFruto

    Definir la estructura correcta de herencia, asi mismo implementar metodos y atributos pertenecientes a cada clase. Se pueden adicionar metodos y atributos segun correspondan.
    Todos las plantas tiene un tiempo de vida estimado, se debe indicar cual es su tiempo de vida y simular que pasa ese tiempo e indicar cuando nace y fallece.
    OJO con los metodos repetidos, optimizar el codigo.
    
    ***Nota***
    El punto 5 se subirá en la carpeta correspondiente.

