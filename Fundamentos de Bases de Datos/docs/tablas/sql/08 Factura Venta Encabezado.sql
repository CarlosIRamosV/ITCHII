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