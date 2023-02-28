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
    * Tabla foránea: [proveedores](04%20Proveedores.md)
    * Campo foránea: [id](04%20Proveedores.md#id)

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
## Ejemplo:
``` sql
INSERT INTO `empresax`.`factcprae` (`numfac`, `fecha`, `total`, `tipopago`, `cveprov`) VALUES ('1', '2023-02-20', '1000.00', 'E', '1');
```

<p align="center">
    <a href="./05 Almacen.md">Regresar</a> |
    <a href="../README.md">Inicio</a> |
    <a href="./07 Factura Compra Detalle.md">Siguiente</a>
</p>