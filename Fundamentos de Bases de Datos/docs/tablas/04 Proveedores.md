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
[ver sql](./sql/04%20Proveedores.sql)

## Contenido de la tabla:
| id  | razonsocial | rfc  | direccion   | telefono  | email                | saldo |
|-----|-------------|------|-------------|-----------|----------------------|-------|
| 001 | Proveedor 1 | RFC1 | Direccion 1 | 123456789 | Proveedor1@gmail.com | 1000  |
| 002 | Proveedor 2 | RFC2 | Direccion 2 | 123456789 | Proveedor2@gmail.com | 2000  |
| 003 | Proveedor 3 | RFC3 | Direccion 3 | 123456789 | Proveedor3@gmail.com | 3000  |
| 004 | Proveedor 4 | RFC4 | Direccion 4 | 123456789 | Proveedor4@gmail.com | 4000  |
| 005 | Proveedor 5 | RFC5 | Direccion 5 | 123456789 | Proveedor5@gmail.com | 5000  |

[ver csv](./csv/04%20Proveedores.csv)

<p align="center">
    <a href="./03%20Clientes.md">Regresar</a> |
    <a href="../README.md">Inicio</a> |
    <a href="./05%20Factura%20Compra%20Encabezado.md">Siguiente</a>
</p>