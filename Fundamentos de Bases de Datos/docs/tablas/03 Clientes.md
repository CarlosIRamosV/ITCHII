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
[ver sql](./sql/03%20Clientes.sql)

## Contenido de la tabla:
| id  | razonsocial | rfc  | direccion   | telefono  | email                |
|-----|-------------|------|-------------|-----------|----------------------|
| 001 | Cliente 1   | RFC1 | Direccion 1 | 123456789 | Cliente001@gmail.com |
| 002 | Cliente 2   | RFC2 | Direccion 2 | 123456789 | Cliente002@gmail.com |
| 003 | Cliente 3   | RFC3 | Direccion 3 | 123456789 | Cliente003@gmail.com |
| 004 | Cliente 4   | RFC4 | Direccion 4 | 123456789 | Cliente004@gmail.com |
| 005 | Cliente 5   | RFC5 | Direccion 5 | 123456789 | Cliente005@gmail.com |

[ver csv](./csv/03%20Clientes.csv)

<p align="center">
    <a href="./02 Productos.md">Regresar</a> |
    <a href="../README.md">Inicio</a> |
    <a href="./04 Proveedores.md">Siguiente</a>
</p>