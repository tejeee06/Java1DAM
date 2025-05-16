# Usar una imagen base de Node.js (versión 20, compatible con Electron 36.2.0)
FROM node:20

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar package.json y package-lock.json (si existe) para instalar dependencias
COPY package.json ./
COPY package-lock.json* ./

# Instalar dependencias
RUN npm install

# Copiar el resto del código del proyecto
COPY . .

# Exponer el puerto que usa Vite (5173 por defecto)
EXPOSE 5173

# Comando para ejecutar la aplicación en modo desarrollo
CMD ["npm", "run", "dev"]