# PuntoNegocioFacturasBackEnd
	En este repositorio se encuentra alojado el desarrollo del BackEnd para buscas todas las facturas
	o para buscar una factura en especial dependiendo el numero de factura y/o nit del cliente
	
## Comenzando 🚀
	Instrucciones generales de cómo correr el proyecto de forma local

### Pre-requisitos 📋
	En este repositorio se encuentra la capa del servidor para el desarrollo de la aplicación, por lo cual este proyecto no depende de la capa de frontEnd para tener un correcto funcionamiento. 

	La capa del cliente se encuentra en el siguiente repositorio:https://github.com/gustavoDevelopment/PruebaTecnicaCarvajal_1.0.git junto a sus instrucciones de instalación.
	La capa de BD esta virtualizada con H2

	Para poder ejecutar el proyecto de forma local se deben tener instalados los siguientes programas:

	1. Tener instalado Git para poder clonar le repositorio
	2. Tener instalado Gradle
	3. Tener Java-11
	4. Ubicar la carpeta raiz donde se clono el proyecto y ejecutar : gradle build
		
	Nota: Si quiere revisar el informe de jacoco de las pruebas unitarias puede ubicar esta carpeta : "prueba-tenica-carvajal/build/reports/jacoco/test/html/index.html",
	      y ademas el informe de pruebas los test "/prueba-tenica-carvajal/build/reports/tests/test/index.html"
	
### Despliegue 🔧

Asumiendo que se cuentan con los programas previamente mencionados para poder ejecutar esta parte del proyecto, el siguiente paso a paso describirá cómo poder desplegar el proyecto de forma local

	1. Ubicar la carpeta "\prueba-tenica-carvajal\build\libs" 
	2. Abrir una consola "cmd" en la raiz del punto 5 y ejecutar : "java -jar prueba-tenica-carvajal-0.0.1-SNAPSHOT.jar"

## Construido con 🛠️

* [Java 11]
* [Spring Boot 2.3.10.BUILD-SNAPSHOT](https://spring.io/learn)

## Versionado 📌
    No aplica

## Autores ✒️

* **Gustavo Adolfo Lopez Mendieta - Shark 426** - *Desarrrollados* - [Hackail](https://github.com/gustavoDevelopment)

---
⌨️ con ❤️ por [Shark426](https://github.com/gustavoDevelopment) 😊