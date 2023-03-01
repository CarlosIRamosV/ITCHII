CREATE TABLE `empresax`.`productos`
(
    `id`          INT(3) NOT NULL AUTO_INCREMENT,
    `descripcion` VARCHAR(50) NULL,
    `exixtencia`  INT(5) NULL,
    `costo`       DECIMAL(7, 2) NULL,
    `foto`        BLOB NULL,
    PRIMARY KEY (`id`)
);