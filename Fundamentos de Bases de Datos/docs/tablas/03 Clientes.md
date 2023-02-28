# Tabla de clientes
## Campos:
### id
* Tipo de dato: int
* Tamaño: 3 dígitos
* Llave primaria: si

### razonsocial
* Tipo de dato: varchar
* Tamaño: 50 caracteres

### rfc
* Tipo de dato: varchar
* Tamaño: 13 caracteres

### dirección
* Tipo de dato: varchar
* Tamaño: 50 caracteres

### teléfono
* Tipo de dato: varchar
* Tamaño: 9 caracteres

### email
* Tipo de dato: varchar
* Tamaño: 50 caracteres

## Creación de la tabla:
``` sql
CREATE TABLE `empresax`.`clientes`
(
    `id`          INT(3)      NOT NULL AUTO_INCREMENT,
    `razonsocial` VARCHAR(50) NULL,
    `rfc`         VARCHAR(13) NULL,
    `direccion`   VARCHAR(50) NULL,
    `telefono`    VARCHAR(9)  NULL,
    `email`       VARCHAR(50) NULL,
    PRIMARY KEY (`id`)
);
```

## Ejemplo:
``` sql
INSERT INTO `empresax`.`clientes` (`id`, `razonsocial`, `rfc`, `direccion`, `telefono`, `email`) VALUES ('001', 'Cliente 1', 'RFC1', 'Direccion 1', '123456789', 'cliente1@gmail.com');
```
<p align="center">
    <a href="./02 Productos.md">Regresar</a> |
    <a href="../README.md">Inicio</a> |
    <a href="./04 Proveedores.md">Siguiente</a>
</p>