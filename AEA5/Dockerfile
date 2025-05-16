# Usar Node.js 18 (compatible con package.json)
FROM node:18

# Crear y establecer el directorio de trabajo
RUN mkdir -p /app
WORKDIR /app

# Verificar WORKDIR (depuración)
RUN pwd && ls -la

# Copiar package.json y package-lock.json
COPY package.json package-lock.json /app/

# Instalar dependencias
RUN npm install

# Copiar el resto del código
COPY src/ /app/src/
COPY index.html main.js vite.config.js /app/

# Verificar archivos copiados (depuración)
RUN ls -la /app

# Exponer el puerto de Vite
EXPOSE 5173

# Comando por defecto (desarrollo)
CMD ["npm", "run", "dev"]