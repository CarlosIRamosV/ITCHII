# Tabla de factura venta encabezado

## Campos:
### numfac
* Tipo de dato: int
* Tamaño: 3 dígitos
* Llave primaria: si

### fecha
* Tipo de dato: date

### total
* Tipo de dato: decimal
* Tamaño: 7 dígitos, 2 decimales

### tipopago
* Tipo de dato: varchar
* Tamaño: 1 carácter
* Posibles valores:
    * E: Efectivo
    * C: Credito

### cvecli
* Tipo de dato: int
* Tamaño: 3 dígitos
* Llave primaria: si
* Llave foránea: si
    * Tabla foránea: [clientes](./03%20Clientes.md)
    * Campo foránea: [id](./03%20Clientes.md#id)

## Creación de la tabla:
``` sql
CREATE TABLE `empresax`.`factvtae`
(
    `numfac`   INT(3)        NOT NULL AUTO_INCREMENT,
    `fecha`    DATE          NULL,
    `total`    DECIMAL(7, 2) NULL,
    `tipopago` VARCHAR(1)    NULL,
    `cvecli`   INT(3)        NULL,
    PRIMARY KEY (`numfac`, `cvecli`),
    INDEX `cveCli_idx` (`cvecli` ASC) VISIBLE,
    CONSTRAINT `cveCliFactVtaE`
        FOREIGN KEY (`cvecli`)
            REFERENCES `empresax`.`clientes` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
);
```
[ver sql](./sql/08%20Factura%20Venta%20Encabezado.sql)

## Contenido de la tabla:
| numfac | fecha      | total   | tipopago | cvecli |
|--------|------------|---------|----------|--------|
| 1      | 2023-01-01 | 1000.00 | E        | 1      |
| 2      | 2023-01-02 | 2000.00 | E        | 2      |
| 3      | 2023-01-03 | 3000.00 | E        | 3      |
| 4      | 2023-01-04 | 4000.00 | E        | 4      |
| 5      | 2023-01-05 | 5000.00 | E        | 5      |

[ver csv](./csv/08%20Factura%20Venta%20Encabezado.csv)

<p align="center">
    <a href="./07%20Almacen.md">Regresar</a> |
    <a href="../README.md">Inicio</a> |
    <a href="./09%20Factura%20Venta%20Detalle.md">Siguiente</a>
</p>