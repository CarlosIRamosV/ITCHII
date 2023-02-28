# Tabla de productos
## Campos:
### id
* Tipo de dato: int
* Tamaño: 3 dígitos
* Llave primaria: si

### nombre
* Tipo de dato: varchar
* Tamaño: 50 caracteres

### precio
* Tipo de dato: decimal
* Tamaño: 7 dígitos, 2 decimales

### stock
* Tipo de dato: int
* Tamaño: 5 dígitos

### foto
* Tipo de dato: blob

## Creación de la tabla:
``` sql
CREATE TABLE `empresaX`.`productos`
(
    `id`     INT(3)        NOT NULL AUTO_INCREMENT,
    `nombre` VARCHAR(50)   NULL,
    `precio` DECIMAL(7, 2) NULL,
    `stock`  INT(5)        NULL,
    `foto`   BLOB          NULL,
    PRIMARY KEY (`id`)
);
```

## Ejemplo:
``` sql
INSERT INTO `empresax`.`productos` (`id`, `nombre`, `precio`, `stock`, `foto`) VALUES ('001', 'Producto 1', '100.00', '10', NULL);
INSERT INTO `empresax`.`productos` (`id`, `nombre`, `precio`, `stock`, `foto`) VALUES ('002', 'Producto 2', '200.00', '20', NULL);
INSERT INTO `empresax`.`productos` (`id`, `nombre`, `precio`, `stock`, `foto`) VALUES ('003', 'Producto 3', '300.00', '30', NULL);
INSERT INTO `empresax`.`productos` (`id`, `nombre`, `precio`, `stock`, `foto`) VALUES ('004', 'Producto 4', '400.00', '40', NULL);
INSERT INTO `empresax`.`productos` (`id`, `nombre`, `precio`, `stock`, `foto`) VALUES ('005', 'Producto 5', '500.00', '50', NULL);
INSERT INTO `empresax`.`productos` (`id`, `nombre`, `precio`, `stock`, `foto`) VALUES ('006', 'Producto 6', '600.00', '60', NULL);
INSERT INTO `empresax`.`productos` (`id`, `nombre`, `precio`, `stock`, `foto`) VALUES ('007', 'Producto 7', '700.00', '70', NULL);
INSERT INTO `empresax`.`productos` (`id`, `nombre`, `precio`, `stock`, `foto`) VALUES ('008', 'Producto 8', '800.00', '80', NULL);
INSERT INTO `empresax`.`productos` (`id`, `nombre`, `precio`, `stock`, `foto`) VALUES ('009', 'Producto 9', '900.00', '90', NULL);
INSERT INTO `empresax`.`productos` (`id`, `nombre`, `precio`, `stock`, `foto`) VALUES ('010', 'Producto 10', '1000.00', '100', NULL);
```

<p align="center">
    <a href="./01 Getting Started.md">Regresar</a> |
    <a href="../README.md">Inicio</a> |
    <a href="./03 Clientes.md">Siguiente</a>
</p>