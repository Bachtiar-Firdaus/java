-- Membuat Database
CREATE DATABASE IF NOT EXISTS my_app;
USE my_app;

-- Membuat Tabel Todolist
CREATE TABLE todolist
(
id   INT          NOT NULL AUTO_INCREMENT,
todo VARCHAR(255) NOT NULL,
PRIMARY KEY (id)
) ENGINE = INNODB;