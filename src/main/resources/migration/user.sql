CREATE USER 'db_user_videojuegos'@'%';
GRANT Alter ON videojuegos.videojuego TO 'db_user_videojuegos'@'%';
GRANT Create ON videojuegos.videojuego TO 'db_user_videojuegos'@'%';
GRANT Create view ON videojuegos.videojuego TO 'db_user_videojuegos'@'%';
GRANT Delete ON videojuegos.videojuego TO 'db_user_videojuegos'@'%';
GRANT Delete history ON videojuegos.videojuego TO 'db_user_videojuegos'@'%';
GRANT Drop ON videojuegos.videojuego TO 'db_user_videojuegos'@'%' WITH GRANT OPTION;
GRANT Index ON videojuegos.videojuego TO 'db_user_videojuegos'@'%';
GRANT Insert ON videojuegos.videojuego TO 'db_user_videojuegos'@'%';
GRANT References ON videojuegos.videojuego TO 'db_user_videojuegos'@'%';
GRANT Select ON videojuegos.videojuego TO 'db_user_videojuegos'@'%';
GRANT Show view ON videojuegos.videojuego TO 'db_user_videojuegos'@'%';
GRANT Trigger ON videojuegos.videojuego TO 'db_user_videojuegos'@'%';
GRANT Update ON videojuegos.videojuego TO 'db_user_videojuegos'@'%';
ALTER USER 'db_user_videojuegos'@'%' IDENTIFIED BY '2wdt20d#L4^vMq';
