# Tabla de proveedores
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

### saldo
* Tipo de dato: decimal
* Tamaño: 7 dígitos, 2 decimales

## Creación de la tabla:
``` sql
CREATE TABLE `empresax`.`proveedores`
(
    `id`          INT(3)        NOT NULL AUTO_INCREMENT,
    `razonsocial` VARCHAR(50)   NULL,
    `rfc`         VARCHAR(13)   NULL,
    `direccion`   VARCHAR(50)   NULL,
    `telefono`    VARCHAR(9)    NULL,
    `email`       VARCHAR(50)   NULL,
    `saldo`       DECIMAL(7, 2) NULL,
    PRIMARY KEY (`id`)
);
```

## Ejemplo:
``` sql
INSERT INTO `empresax`.`proveedores` (`id`, `razonsocial`, `rfc`, `direccion`, `telefono`, `email`, `saldo`) VALUES ('001', 'Proveedor 1', 'RFC1', 'Direccion 1', '123456789', 'proveedor1@gmail.com', '1000.00');
```
<p align="center">
    <a href="./03 Clientes.md">Regresar</a> |
    <a href="../README.md">Inicio</a> |
    <a href="./05 Almacen.md">Siguiente</a>
</p>