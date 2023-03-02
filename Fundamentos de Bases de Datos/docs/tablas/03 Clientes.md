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
| id  | razonsocial | rfc  | direccion | telefono   | email              |
|-----|-------------|------|-----------|------------|--------------------|
| 1   | cliente1    | rfc1 | dir1      | 1234567890 | cliente1@gmail.com |
| 2   | cliente2    | rfc2 | dir2      | 1234567890 | cliente2@gmail.com |
| 3   | cliente3    | rfc3 | dir3      | 1234567890 | cliente3@gmail.com |
| 4   | cliente4    | rfc4 | dir4      | 1234567890 | cliente4@gmail.com |
| 5   | cliente5    | rfc5 | dir5      | 1234567890 | cliente5@gmail.com |

[ver csv](./csv/03%20Clientes.csv)

<p align="center">
    <a href="./02%20Productos.md">Regresar</a> |
    <a href="../README.md">Inicio</a> |
    <a href="./04%20Proveedores.md">Siguiente</a>
</p>