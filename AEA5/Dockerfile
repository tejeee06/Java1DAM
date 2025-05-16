# Usar Node.js 18 (compatible con package.json)
FROM node:18

# Crear y establecer el directorio de trabajo
RUN mkdir -p /aea5
WORKDIR /aea5

# Verificar WORKDIR (depuración)
RUN pwd && ls -la

# Copiar package.json y package-lock.json
COPY package.json package-lock.json ./

# Instalar dependencias (descarga node_modules)
RUN npm install

# Verificar node_modules (depuración)
RUN ls -la node_modules | head -n 10

# Copiar el resto del código
COPY . .

# Verificar archivos copiados (depuración)
RUN ls -la

# Exponer el puerto de Vite
EXPOSE 5173

# Comando por defecto (desarrollo)
CMD ["npm", "run", "dev"]