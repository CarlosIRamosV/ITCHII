### Tabla de almacén
#### Campos:
##### numfac
* Tipo de dato: int
* Tamaño: 3 dígitos
* Llave primaria: si
* Llave foránea: si
    * Tabla foránea: [factura compra encabezado](./06%20Factura%20Compra%20Encabezado.md)
    * Campo foráneo: [numfac](./06%20Factura%20Compra%20Encabezado.md#numfac)

##### tipomov
* Tipo de dato: varchar
* Tamaño: 1 carácter
* Posibles valores:
    * E: Entrada
    * S: Salida

##### fecha
* Tipo de dato: date

##### idprod
* Tipo de dato: int
* Tamaño: 3 dígitos
* Llave primaria: si
* Llave foránea: si
    * Tabla foránea: [productos](./02%20Productos.md)
    * Campo foráneo: [id](./02%20Productos.md#id)

##### cantidad
* Tipo de dato: int
* Tamaño: 5 dígitos

##### precio
* Tipo de dato: decimal
* Tamaño: 7 dígitos, 2 decimales

#### Creación de la tabla:
``` sql
CREATE TABLE `empresax`.`almacen`
(
    `numfac`   INT(3)        NOT NULL AUTO_INCREMENT,
    `tipomov`  VARCHAR(1)    NULL,
    `fecha`    DATE          NULL,
    `idprod`   INT(3)        NOT NULL,
    `cantidad` INT(5)        NULL,
    `precio`   DECIMAL(7, 2) NULL,
    PRIMARY KEY (`numfac`, `idprod`),
    INDEX `numfac_idx` (`numfac` ASC) VISIBLE,
    INDEX `idProd_idx` (`idprod` ASC) VISIBLE,
    CONSTRAINT `numfacAlmacen`
        FOREIGN KEY (`numfac`)
            REFERENCES `empresax`.`factcprae` (`numfac`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION,
    CONSTRAINT `idProdAlmacen`
        FOREIGN KEY (`idprod`)
            REFERENCES `empresax`.`productos` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
);
```
[ver sql](../sql/05%20Almacen.sql)

### Contenido de la tabla:
| numfac | tipomov | fecha      | idprod | cantidad | precio |
|--------|---------|------------|--------|----------|--------|
| 001    | E       | 2023-02-21 | 001    | 10       | 100.00 |
| 002    | E       | 2023-02-21 | 002    | 10       | 100.00 |
| 003    | E       | 2023-02-21 | 003    | 10       | 100.00 |
| 004    | E       | 2023-02-21 | 004    | 10       | 100.00 |
[ver datos](../csv/05%20Almacen.csv)

<p align="center">
    <a href="./04 Proveedores.md">Regresar</a> |
    <a href="../README.md">Inicio</a> |
    <a href="./06 Factura Compra Encabezado.md">Siguiente</a>
</p>