create database urs;
use urs;
CREATE TABLE Product456 (     id INT,     name VARCHAR(20),     cost INT,     description VARCHAR(20) );
INSERT INTO Product456 (id, name, cost, description) VALUES    (1, 'Eyeshadow', 150 , 'very friendly'),     (2, 'Highlighter', 250 , 'very friendly'),     (3, 'Foundation', 200 , 'very friendly'),     (4, 'concealer', 170 , 'very friendly'),     (5, 'Blush', 300 , 'very friendly');
SELECT * FROM Product456;