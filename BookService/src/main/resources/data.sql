DROP TABLE IF EXISTS book;


CREATE TABLE book(
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  author VARCHAR(250) NOT NULL,
  price VARCHAR(250) DEFAULT NULL
);

insert into book (name,author,price) Values ('Physics','Ramesh','100'),('Chemistry','Raju','1000');
