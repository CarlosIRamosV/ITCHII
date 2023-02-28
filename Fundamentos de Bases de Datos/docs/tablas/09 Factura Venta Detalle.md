# Tabla de factura venta detalle
## Campos:
### numfac
* Tipo de dato: int
* Tamaño: 3 dígitos
* Llave primaria: si
* Llave foránea: si
    * Tabla foránea: [factvtae](./08%20Factura%20Venta%20Encabezado.md)
    * Campo foránea: [numfac](./08%20Factura%20Venta%20Encabezado.md#numfac)

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
CREATE TABLE `empresax`.`factvtad`
(
    `numfac`   INT(3)        NOT NULL,
    `idprod`   INT(3)        NOT NULL,
    `cantidad` INT(5)        NULL,
    `precio`   DECIMAL(7, 2) NULL,
    PRIMARY KEY (`numfac`, `idprod`),
    INDEX `numFac_idx` (`numfac` ASC) VISIBLE,
    INDEX `idProd_idx` (`idprod` ASC) VISIBLE,
    CONSTRAINT `numFacFactVtaD`
        FOREIGN KEY (`numfac`)
            REFERENCES `empresax`.`factvtae` (`numfac`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION,
    CONSTRAINT `idProdFactVtaD`
        FOREIGN KEY (`idprod`)
            REFERENCES `empresax`.`productos` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
);
```
[ver sql](./sql/09%20Factura%20Venta%20Detalle.sql)

## Contenido de la tabla:
| numfac | idprod | cantidad | precio |
|--------|--------|----------|--------|
| 1      | 1      | 10       | 100.00 |
| 1      | 2      | 20       | 200.00 |
| 1      | 3      | 30       | 300.00 |
| 2      | 1      | 10       | 100.00 |
| 2      | 2      | 20       | 200.00 |
| 2      | 3      | 30       | 300.00 |
| 3      | 1      | 10       | 100.00 |
| 3      | 2      | 20       | 200.00 |
| 3      | 3      | 30       | 300.00 |
| 4      | 1      | 10       | 100.00 |
| 4      | 2      | 20       | 200.00 |
| 4      | 3      | 30       | 300.00 |
| 5      | 1      | 10       | 100.00 |
| 5      | 2      | 20       | 200.00 |
| 5      | 3      | 30       | 300.00 |
[ver csv](./csv/09%20Factura%20Venta%20Detalle.csv)

<p align="center">
    <a href="./08 Factura Venta Encabezado.md">Regresar</a> |
    <a href="../README.md">Inicio</a> |
    <a href="./csv/01 Getting Started.md">Siguiente</a>
</p>