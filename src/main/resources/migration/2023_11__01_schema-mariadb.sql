-- videojuegos.distribuidor definition
DROP TABLE IF EXISTS `distribuidor`;

CREATE TABLE `distribuidor`
(
    `id`          int(2) unsigned   NOT NULL AUTO_INCREMENT,
    `name`        varchar(200)      NOT NULL,
    `website_url` varchar(500)      NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;

INSERT INTO videojuegos.distribuidor (name, website_url)
VALUES ('Distribuidor 00', 'www.distribuidor_00.com'),
       ('Distribuidor 01', 'www.distribuidor_01.com'),
       ('Distribuidor 02', 'www.distribuidor_02.com'),
       ('Distribuidor 03', 'www.distribuidor_03.com'),
       ('Distribuidor 04', 'www.distribuidor_04.com'),
       ('Distribuidor 05', 'www.distribuidor_05.com'),
       ('Distribuidor 06', 'www.distribuidor_06.com'),
       ('Distribuidor 07', 'www.distribuidor_07.com');


-- videojuegos.videojuego definition
DROP TABLE IF EXISTS `videojuego`;

CREATE TABLE `videojuego`
(
    `id`          int(11) unsigned  NOT NULL AUTO_INCREMENT,
    `name`        varchar(200)      NOT NULL,
    `description` varchar(3000)     NOT NULL,
    `image_url`   varchar(500)      NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;

INSERT INTO videojuegos.videojuego (name, description, image_url)
VALUES ('Videojuego 00', 'Description 00', 'images/00.jpg'),
       ('Videojuego 01', 'Description 01', 'images/01.png'),
       ('Videojuego 02', 'Description 02', 'images/02.webp'),
       ('Videojuego 03', 'Description 03', 'images/03.jpg'),
       ('Videojuego 04', 'Description 04', 'images/04.jpg'),
       ('Videojuego 05', 'Description 05', 'images/05.jpg');

-- ALTER TABLE
ALTER TABLE videojuegos.videojuego ADD COLUMN distribuidor_id int(2) unsigned DEFAULT 1 NOT NULL;
ALTER TABLE videojuegos.videojuego ADD CONSTRAINT `fk_distribuidor_id` FOREIGN KEY (distribuidor_id) REFERENCES videojuegos.distribuidor(id) ON DELETE CASCADE ON UPDATE CASCADE;

-- UPDATE
UPDATE videojuego SET  distribuidor_id = 1 WHERE id in (1,5);
UPDATE videojuego SET  distribuidor_id = 2 WHERE id in (2);
UPDATE videojuego SET  distribuidor_id = 3 WHERE id in (3);
UPDATE videojuego SET  distribuidor_id = 4 WHERE id in (4);
UPDATE videojuego SET  distribuidor_id = 5 WHERE id in (5);
UPDATE videojuego SET  distribuidor_id = 6 WHERE id in (7);
UPDATE videojuego SET  distribuidor_id = 7 WHERE id in (8);