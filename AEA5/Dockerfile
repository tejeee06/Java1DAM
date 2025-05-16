# Usar Node.js 18
FROM node:18

# Crear y establecer el directorio de trabajo
RUN mkdir -p /aea5
WORKDIR /aea5

# Verificar WORKDIR
RUN pwd && ls -la

# Copiar package.json y package-lock.json
COPY package.json package-lock.json ./

# Instalar dependencias
RUN npm install

# Verificar node_modules
RUN ls -la node_modules | head -n 10

# Copiar el resto del código
COPY . .

# Verificar archivos copiados
RUN ls -la

# Exponer el puerto de Vite (cambiamos a 5174)
EXPOSE 5174

# Comando por defecto (desarrollo)
CMD ["npm", "run", "dev"]