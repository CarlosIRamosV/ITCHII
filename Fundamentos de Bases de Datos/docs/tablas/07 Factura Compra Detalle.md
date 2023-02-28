# Tabla de factura compra detalle
## Campos:
### numfac
* Tipo de dato: int
* Tamaño: 3 dígitos
* Llave primaria: si
* Llave foránea: si
    * Tabla foránea: [factcprae](06%20Factura%20Compra%20Encabezado.mdo.md)
    * Campo foránea: [numfac](06%20Factura%20Compra%20Encabezado.mdo.md#numfac)

### idprod
* Tipo de dato: int
* Tamaño: 3 dígitos
* Llave primaria: si
* Llave foránea: si
    * Tabla foránea: [productos](02%20Productos.md)
    * Campo foránea: [id](02%20Productos.md#id)

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

## Ejemplo:
``` sql
INSERT INTO `empresax`.`factcprad` (`numfac`, `idprod`, `cantidad`, `precio`) VALUES ('1', '1', '10', '100.00');
INSERT INTO `empresax`.`factcprad` (`numfac`, `idprod`, `cantidad`, `precio`) VALUES ('1', '2', '20', '50.00');
```

<p align="center">
    <a href="./06 Factura Compra Encabezado.md">Regresar</a> |
    <a href="../README.md">Inicio</a> |
    <a href="./08 Factura Venta Encabezado.md">Siguiente</a>
</p>