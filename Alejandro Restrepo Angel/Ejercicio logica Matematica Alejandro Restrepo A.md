# Ejercicio lógica matemática
---
### EJERCICIOS:

1.**El número 10 es un entero par**
>P: El número 10 es un entero par

|P|
|-|
|1|
|0|


2.**Si no hace frio me pondre pantalones cortos**
>P:  Si hace frío 
>P': Si no hace frío
>Q:  Me pondré pantalones cortos

|P|P'|Q|P' --> Q|
|-|-|-|:-:|
|1|0|1|1|
|1|0|0|1|
|0|1|1|1|
|0|1|0|0|


3.**Si voy a cine a las 10pm, entonces podria acostarme tarde**
>P: Si voy a cine a las 10pm
>Q: Entonces podría acostarme tarde

|P|Q|P --> Q|
|-|-|:-:|
|1|1|1|
|1|0|0|
|0|1|1|
|0|0|1|


4.**Llegare a tiempo a la cita medica, si y solo si, me levanto temprano y desayuno bien**
>P: Llegaré a tiempo a la cita medica
>Q: Me levanto temprano
>R: Desayuno bien

|P|Q|R|Q ^ R|P <--> ( Q ^ R )|
|-|-|-|:-:|:-:|
|1|1|1|1|1|
|1|1|0|0|0|
|1|0|1|0|0|
|1|0|0|0|0|
|0|1|1|1|0|
|0|1|0|0|1|
|0|0|1|0|1|
|0|0|0|0|1|


5.**Si monto bici y como saludable bajere de peso**
>P: Si monto bici
>Q: Si como saludable
>R: Bajaré de peso

|P|Q|R|P ^ Q|R|( P ^ Q ) --> R|
|-|-|-|:-:|-|:-:|
|1|1|1|1|1|1|
|1|1|0|1|0|0|
|1|0|1|0|1|1|
|1|0|0|0|0|1|
|0|1|1|0|1|1|
|0|1|0|0|0|1|
|0|0|1|0|1|1|
|0|0|0|0|0|1|


6.**Para ir a Santa Marta puedo tomar la ruta del sol o tomar carretera entre pueblos**
>P: Para ir a Santa Marta puedo tomar la ruta del sol
>Q: Tomar carretera entre pueblos

|P|Q|P v Q|
|-|-|:-:|
|1|1|1|
|0|1|1|
|1|0|1|
|0|0|0|


7.**Puedo ver la pelicula de terror, si y solo si, si no soy menor de edad**
>P: Puedo ver la pelicula de terror
>Q: Si soy menor de edad
>Q': Si no soy menor de edad

|P|Q|Q'|P <--> Q'|
|-|-|-|:-:|
|1|1|0|0|
|1|0|1|1|
|0|1|0|1|
|0|0|1|0|


8.**Si no pago la luz, entonces me contaran la energia. Y si pago la luz, entonces me quedare sin plata o pedire prestado**
>P:  Si pago la luz
>P': Si no pago la luz
>Q:  Me contarán la energía
>R:	 Me quedaré sin plata
>S:  Pediré prestado

|P|P'|Q|R|S|P' --> Q|R v S|P -->(R v S)|(P' -->Q) ^ (P --> (R v S))|
|-|-|-|-|-|:-:|:-:|:-:|:-:|
|1|0|1|1|1|1|1|1|1|
|1|0|1|1|0|1|1|1|1|
|1|0|1|0|1|1|1|1|1|
|1|0|1|0|0|1|0|0|0|
|1|0|0|1|1|1|1|1|1|
|1|0|0|1|0|1|1|1|1|
|1|0|0|0|1|1|1|1|1|
|1|0|0|0|0|1|0|0|0|
|0|1|1|1|1|1|1|1|1|
|0|1|1|1|0|1|1|1|1|
|0|1|1|0|1|1|1|1|1|
|0|1|1|0|0|1|0|1|1|
|0|1|0|1|1|0|1|1|0|
|0|1|0|1|0|0|1|1|0|
|0|1|0|0|1|0|1|1|0|
|0|1|0|0|0|0|0|1|0|


9.**Si ahorro podre comprarme el carro de mis sueños**
>P: Si ahorro 
>Q: Podré comprarme el carro de mis sueños

|P|Q|P --> Q|
|-|-|:-:|
|1|1|1|
|1|0|0|
|0|1|1|
|0|0|1|


10.**Si salgo con la chica que me gusta sere feliz**
>P: Si salgo con la chica que me gusta
>Q: Seré feliz

|P|Q|P --> Q|
|-|-|:-:|
|1|1|1|
|1|0|0|
|0|1|1|
|0|0|1|
