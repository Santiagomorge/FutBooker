# Usar una imagen de Node.js para compilar la aplicación Angular
FROM node:18 AS build

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar el package.json y package-lock.json
COPY package*.json ./

# Instalar las dependencias
RUN npm install

# Copiar el resto del código
COPY . .

# Construir la aplicación Angular
RUN npm run build

# Usar una imagen de Nginx para servir la aplicación Angular
FROM nginx:alpine

# Copiar los archivos de la compilación de Angular a la carpeta predeterminada de Nginx
COPY --from=build "/app/dist/fut-booker/browser" /usr/share/nginx/html

# Exponer el puerto
EXPOSE 80

# comando para iniciar Nginx
CMD [ "nginx", "-g", "daemon off;" ]
