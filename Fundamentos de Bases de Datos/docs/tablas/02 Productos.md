# Tabla de productos
## Campos:
### id
* Tipo de dato: int
* Tamaño: 3 dígitos
* Llave primaria: si

### descripcion
* Tipo de dato: varchar
* Tamaño: 70 caracteres

### exixtencia
* Tipo de dato: int
* Tamaño: 5 dígitos

### costo
* Tipo de dato: decimal
* Tamaño: 7 dígitos, 2 decimales

### foto
* Tipo de dato: blob

## Creación de la tabla:
``` sql
CREATE TABLE `empresax`.`productos`
(
    `id`          INT(3) NOT NULL AUTO_INCREMENT,
    `descripcion` VARCHAR(50) NULL,
    `exixtencia`  INT(5) NULL,
    `costo`       DECIMAL(7, 2) NULL,
    `foto`        BLOB NULL,
    PRIMARY KEY (`id`)
);
```
[ver sql](./sql/05%20Almacen.sql)

## Contenido de la tabla:   
| id  | descripcion  | exixtencia | costo  | foto  |
|-----|--------------|------------|--------|-------|
| 001 | Producto 1   | 10         | 10.00  | NULL  |
| 002 | Producto 2   | 20         | 20.00  | NULL  |
| 003 | Producto 3   | 30         | 30.00  | NULL  |
| 004 | Producto 4   | 40         | 40.00  | NULL  |
| 005 | Producto 5   | 50         | 50.00  | NULL  |
| 006 | Producto 6   | 60         | 60.00  | NULL  |
| 007 | Producto 7   | 70         | 70.00  | NULL  |
| 008 | Producto 8   | 80         | 80.00  | NULL  |
| 009 | Producto 9   | 90         | 90.00  | NULL  |
| 010 | Producto 10  | 100        | 100.00 | NULL  |

[ver csv](./csv/02%20Productos.csv)

<p align="center">
    <a href="./01 Getting Started.md">Regresar</a> |
    <a href="../README.md">Inicio</a> |
    <a href="./03 Clientes.md">Siguiente</a>
</p>