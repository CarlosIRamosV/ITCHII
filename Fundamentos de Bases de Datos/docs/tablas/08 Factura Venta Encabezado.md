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
    * Tabla foránea: [clientes](03%20Clientes.md)
    * Campo foránea: [id](03%20Clientes.md#id)

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

## Ejemplo:
``` sql
INSERT INTO `empresax`.`factvtae` (`numfac`, `fecha`, `total`, `tipopago`, `cvecli`) VALUES ('001', '2023-02-20', '1000.00', 'E', '001');
```

<p align="center">
    <a href="./07 Factura Compra Detalle.md">Regresar</a> |
    <a href="../README.md">Inicio</a> |
    <a href="./09 Factura Venta Detalle.md">Siguiente</a>
</p>