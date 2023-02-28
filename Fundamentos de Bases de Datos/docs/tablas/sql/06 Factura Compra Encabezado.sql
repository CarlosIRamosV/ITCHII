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