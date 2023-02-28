CREATE TABLE `empresax`.`productos`
(
    `id`     INT(3)        NOT NULL AUTO_INCREMENT,
    `nombre` VARCHAR(50)   NULL,
    `precio` DECIMAL(7, 2) NULL,
    `stock`  INT(5)        NULL,
    `foto`   BLOB          NULL,
    PRIMARY KEY (`id`)
);