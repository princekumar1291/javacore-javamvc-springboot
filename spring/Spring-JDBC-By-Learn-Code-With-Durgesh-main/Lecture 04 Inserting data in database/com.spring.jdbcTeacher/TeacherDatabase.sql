SHOW DATABASES;
CREATE DATABASE springjdbc;
USE springjdbc;

CREATE TABLE Teacher(
	id iNT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    subject VARCHAR(200)    
);

SHOW TABLES;

INSERT INTO Teacher(id,name,subject) VALUES(1,"Anuprash","Physics");

SELECT * FROM Teacher;

DESCRIBE Teacher;