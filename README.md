# CRUD Parcial1

¡Bienvenido! Aquí encontrará instrucciones para ejecutar el proyecto tanto localmente como en Docker.

## Ejecución Local

### Configurar ambiente

Tener Java y Maven instalados en la computadora.Para PostgreSQL u otra base de datos, también asegurarse de tener instalada las extensiones.

### Clona el proyecto

Descarga el proyecto desde GitHub.

### Construye y ejecuta

Abre una terminal en la carpeta del proyecto y ejecuta ` mvn clean package -DskipTest` para construirlo.

Luego, ejecutar el proyecto.

Acceder en el navegador o en una herramienta de prueba.

## Ejecución en Docker

### Instalar Docker

Es importante tener instalado Docker Desktop en la computadora.

### Ejecutar comando para Detener y eliminar contenedores 
`docker system prune -a`

### Ejecutar un ultimo comando para cache o imagines sin utilizar 
`docker system prune -a`

### Ejecutar comando para levantar contenedores con el proyecto actual
`docker-compose up -d`


### Ejecutar proyecto

Acceder en el navegador o en una herramienta de prueba.

##### Integrantes: 
#####  Alexis Alfonso Alvarenga Alvarenga (AA22044)
#####  Katherine Alexandra Santos Gamez (SG21038)
