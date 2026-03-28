SHOW DATABASES;
CREATE DATABASE springjdbc;
USE springjdbc;

CREATE TABLE student(
	id iNT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    city VARCHAR(200)    
);

SHOW TABLES;

INSERT INTO student(id,name,city) VALUES(222,"Durgesh","Delhi");

SELECT * FROM student;

DESCRIBE student;