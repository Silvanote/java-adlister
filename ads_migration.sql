CREATE DATABASE IF NOT EXISTS adlister_db;

CREATE USER 'juan'@'localhost' IDENTIFIED BY 'password';

GRANT ALL ON adlister_db.* TO 'juan'@'localhost';

USE adlister_db;

SELECT database();

DROP TABLE users;

CREATE TABLE if not exists users (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    username VARCHAR(50) DEFAULT 'NONE',
    email  VARCHAR(100) NOT NULL,
    password TEXT NOT NULL,
    PRIMARY KEY (id)
     );
DROP TABLE ads;

CREATE TABLE IF NOT EXISTS ads (
        id INT UNSIGNED NOT NULL AUTO_INCREMENT,
        user_id INT UNSIGNED NOT NULL,
        title VARCHAR(50) NOT NULL,
        description TEXT NOT NULL,
        PRIMARY KEY (id),
        FOREIGN KEY (user_id) REFERENCES users (id)
        );
