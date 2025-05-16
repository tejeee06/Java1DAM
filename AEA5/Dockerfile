# Usar una imagen base de Node.js
FROM node:20

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar package.json y package-lock.json (si existe)
COPY package*.json ./

# Instalar dependencias
RUN npm install

# Copiar el resto del código
COPY . .

# Exponer el puerto de Vite
EXPOSE 5173

# Comando para iniciar el proyecto en modo desarrollo
CMD ["npm", "run", "dev"]