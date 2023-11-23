-- videojuegos.videojuego definition
DROP TABLE IF EXISTS `videojuego`;

CREATE TABLE `videojuego`
(
    `id`          int(11)       NOT NULL AUTO_INCREMENT,
    `name`        varchar(200)  NOT NULL,
    `description` varchar(3000) NOT NULL,
    `image_url`   varchar(500)  NOT NULL,
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
