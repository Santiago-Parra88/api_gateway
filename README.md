Base datos:
CREATE SCHEMA `integracionEmpresarial`;
USE integracionEmpresarial;

-- Tabla Auto
CREATE TABLE auto (
    auto_id INT NOT NULL AUTO_INCREMENT,
    auto_marca VARCHAR(150) NOT NULL,
    auto_modelo VARCHAR(20) NOT NULL,
    auto_anio VARCHAR(100) NOT NULL,
    PRIMARY KEY (auto_id)
);

Comandos utilizados

 mvn spring-boot:run  local mente
 
docker-compose up --build ejecutar docker

docker-compose down      borrar contenedores

conectarse a la base mysql dockerizada
docker exec -it nombre_contenedor bash
#mysql -u root -p
- compiar los comandos para crear la tabla
