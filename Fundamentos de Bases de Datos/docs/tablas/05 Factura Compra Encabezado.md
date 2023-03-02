# Tabla de factura compra encabezado
## Campos:
### numfac
* Tipo de dato: int
* Tamaño: 3 dígitos
* Llave primaria: si

### fecha
* Tipo de dato: date

### tipopago
* Tipo de dato: varchar
* Tamaño: 1 carácter
* Posibles valores:
    * E: Efectivo
    * C: Credito

### cveprov
* Tipo de dato: int
* Tamaño: 3 dígitos
* Llave primaria: si
* Llave foránea: si
    * Tabla foránea: [proveedores](./04%20Proveedores.md)
    * Campo foránea: [id](./04%20Proveedores.md#id)

## Creación de la tabla:
``` sql
CREATE TABLE `empresax`.`factcprae`
(
    `numfac`   INT(3)        NOT NULL AUTO_INCREMENT,
    `fecha`    DATE          NULL,
    `total`    DECIMAL(7, 2) NULL,
    `tipopago` VARCHAR(1)    NULL,
    `cveprov`  INT(3)        NULL,
    PRIMARY KEY (`numfac`, `cveprov`),
    INDEX `cveProv_idx` (`cveprov` ASC) VISIBLE,
    CONSTRAINT `cveProvFactCpraE`
        FOREIGN KEY (`cveprov`)
            REFERENCES `empresax`.`proveedores` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
);
```
[ver sql](./sql/06%20Factura%20Compra%20Encabezado.sql)

## Contenido de la tabla:
| numfac | fecha      | total | tipopago | cveprov |
|--------|------------|-------|----------|---------|
| 001    | 2023-03-01 | 300   | E        | 1       |
| 002    | 2023-03-01 | 600   | E        | 1       |

[ver csv](./csv/06%20Factura%20Compra%20Encabezado.csv)

<p align="center">
    <a href="./04%20Proveedores.md">Regresar</a> |
    <a href="../README.md">Inicio</a> |
    <a href="./06%20Factura%20Compra%20Detalle.md">Siguiente</a>
</p>