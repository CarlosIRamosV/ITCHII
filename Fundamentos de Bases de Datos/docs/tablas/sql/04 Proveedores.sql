CREATE TABLE `empresax`.`proveedores`
(
    `id`          INT(3)        NOT NULL AUTO_INCREMENT,
    `razonsocial` VARCHAR(50)   NULL,
    `rfc`         VARCHAR(13)   NULL,
    `direccion`   VARCHAR(50)   NULL,
    `telefono`    VARCHAR(9)    NULL,
    `email`       VARCHAR(50)   NULL,
    `saldo`       DECIMAL(7, 2) NULL,
    PRIMARY KEY (`id`)
);