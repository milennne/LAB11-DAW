INSERT INTO cursos (nombre,creditos) VALUES ('Programmer', 5);
INSERT INTO cursos (nombre,creditos) VALUES ('Developer', 5);
INSERT INTO cursos (nombre,creditos) VALUES ('Expert', 5);

INSERT INTO users (username, password, enabled) VALUES ('milene', '$2a$10$3s1H9clD8qgvYj1xE5qzl.vuzw48d8ipy4ygG4orkov8jEAnbmc2y',1 );
INSERT INTO users (username, password, enabled) VALUES ('admin', '$2a$10$Zxdq/nbnCmskux90bXVDhegGSVMja0qUqhN1.POaDlvQvuwXhHp9e', 1);

INSERT INTO authorities (user_id, authority) VALUES (1, 'ROLE_USER');
INSERT INTO authorities (user_id, authority) VALUES (2, 'ROLE_ADMIN');
INSERT INTO authorities (user_id, authority) VALUES (2, 'ROLE_USER');