# Tabla de factura compra detalle
## Campos:
### numfac
* Tipo de dato: int
* Tamaño: 3 dígitos
* Llave primaria: si
* Llave foránea: si
    * Tabla foránea: [factcprae](./06%20Factura%20Compra%20Encabezado.md)
    * Campo foránea: [numfac](./06%20Factura%20Compra%20Encabezado.md#numfac)

### idprod
* Tipo de dato: int
* Tamaño: 3 dígitos
* Llave primaria: si
* Llave foránea: si
    * Tabla foránea: [productos](./02%20Productos.md)
    * Campo foránea: [id](./02%20Productos.md#id)

### cantidad
* Tipo de dato: int
* Tamaño: 5 dígitos

### precio
* Tipo de dato: decimal
* Tamaño: 7 dígitos, 2 decimales

## Creación de la tabla:
``` sql
CREATE TABLE `empresax`.`factcprad`
(
    `numfac`   INT(3)        NOT NULL,
    `idprod`   INT(3)        NOT NULL,
    `cantidad` INT(5)        NULL,
    `precio`   DECIMAL(7, 2) NULL,
    PRIMARY KEY (`numfac`, `idprod`),
    INDEX `numFac_idx` (`numfac` ASC) VISIBLE,
    INDEX `idProd_idx` (`idprod` ASC) VISIBLE,
    CONSTRAINT `numFacFactCpraD`
        FOREIGN KEY (`numfac`)
            REFERENCES `empresax`.`factcprae` (`numfac`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION,
    CONSTRAINT `idProdFactCpraD`
        FOREIGN KEY (`idprod`)
            REFERENCES `empresax`.`productos` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
);
```
[ver sql](./sql/07%20Factura%20Compra%20Detalle.sql)

## Contenido de la tabla:
| numfac | idprod | cantidad | precio |
|--------|--------|----------|--------|
| 001    | 001    | 1        | 100    |
| 001    | 002    | 2        | 200    |
| 002    | 001    | 1        | 100    |
| 002    | 002    | 1        | 200    |
| 002    | 003    | 1        | 300    |

[ver csv](./csv/07%20Factura%20Compra%20Detalle.csv)

<p align="center">
    <a href="./05%20Factura%20Compra%20Encabezado.md">Regresar</a> |
    <a href="../README.md">Inicio</a> |
    <a href="./06%20Factura%20Compra%20Detalle.md">Siguiente</a>
</p>