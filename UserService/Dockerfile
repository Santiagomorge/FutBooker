# Usar la imagen oficial de OpenJDK 17 como base
FROM openjdk:17-jdk-slim

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar el archivo JAR del proyecto al contenedor
COPY target/UserService-0.0.1-SNAPSHOT.jar app.jar

# Exponer el puerto en el que tu aplicación está configurada (ajústalo según tu microservicio)
EXPOSE 8760

# Comando para ejecutar el archivo JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
